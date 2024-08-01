package com.rishabh.main.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.rishabh.main.domain.Contact;
import com.rishabh.main.svc.ContactSvcInterface;

@RestController
@RequestMapping("contact")
public class ContactCntrl {

	@Autowired
	private ContactSvcInterface contactSvc;

	public ResponseEntity<?> getAll(int userId) {
		return contactSvc.getAllContact(userId);
	}

}
