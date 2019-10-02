package com.jlcindia.spring.mvc;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service
//@Qualifier("contactServiceIml")
public class ContactServiceImpl implements ContactService{

@Autowired
ContactDAO contactDAO;
public boolean addContact(ContactTO cto) {

	return contactDAO.addContact(cto);
	}

	
	public List<ContactTO> getAllContacts() {
		
		return contactDAO.getAllContacts();
	}

}
