package com.jlcindia.spring.mvc;

import java.util.List;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;


public interface ContactService {
public boolean addContact(ContactTO cto);
	public List<ContactTO>getAllContacts();

}
