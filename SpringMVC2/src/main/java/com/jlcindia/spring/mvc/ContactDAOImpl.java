package com.jlcindia.spring.mvc;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Repository
@Transactional
public class ContactDAOImpl implements ContactDAO {

	@Autowired
	HibernateTemplate hTemp;
	
	public boolean addContact(ContactTO cto) {
		Contact contact=new Contact();
		contact.setContactName(cto.getContactEmail());
		contact.setContactEmail(cto.getContactName());
		contact.setContactPhone(cto.getContactPhone());
		hTemp.save(contact);
		return true;
	}

	@Override
	public List<ContactTO> getAllContacts() {
		List<ContactTO> cList=null;
		List<Contact> list=(List<Contact>) hTemp.find("from Contact c");
		if (list.size()>0) {
			cList=new ArrayList<ContactTO>();
			
			
			for (Contact c:list) {
			ContactTO cto=new ContactTO();
			cto.setContactId(c.getContactId());
			cto.setContactName(c.getContactName());
			cto.setContactEmail(c.getContactEmail());
			cto.setContactPhone(c.getContactPhone());
			cList.add(cto);
				
			}
		}
		return null;
	}

}
