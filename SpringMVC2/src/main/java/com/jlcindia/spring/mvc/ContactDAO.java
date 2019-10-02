package com.jlcindia.spring.mvc;

import java.util.List;

public interface ContactDAO {
	public boolean addContact(ContactTO cto);
	public List<ContactTO>getAllContacts();

}
