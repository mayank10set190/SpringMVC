package com.jlcindia.spring.mvc;

import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;


@Controller
public class ContactController {
	@Autowired
	ContactService  cs;
	
@RequestMapping(value={"/showaddcontact.jlc"})
	protected String showContactPage(Map<String, ContactCommand> map) throws Exception{
	System.out.println("showContactPage");
	ContactCommand c=new ContactCommand();
	map.put("contact", c);
	return "contact";	
	}

@RequestMapping(value={"/addcontact.jlc"},method=RequestMethod.POST)
protected String addContact(
		@ModelAttribute(value="contact") ContactCommand contact,
		HttpServletRequest req) throws Exception {
	System.out.println("addContact");
	
	String name=contact.getContactName();
	String email=contact.getContactEmail();
	String phone=contact.getContactPhone();
	
	ContactTO cto=new ContactTO();
	cto.setContactName(name);
	cto.setContactEmail(email);
    cto.setContactPhone(phone);	
    boolean added=cs.addContact(cto); 
    if (added) {
    	req.setAttribute("MSG", "contact added successfully");
		
	}else {
		req.setAttribute("MSG", "error while adding Contact");
	}
    List<ContactTO> cList=cs.getAllContacts();
    if (cList !=null && cList.size()>0)
		req.setAttribute("CLIST", cList);
		contact.setContactName("");
		contact.setContactEmail("");
		contact.setContactPhone("");

	
	return "contact";
	
}
}

