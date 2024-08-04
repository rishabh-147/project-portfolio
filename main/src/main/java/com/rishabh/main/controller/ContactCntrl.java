package com.rishabh.main.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.rishabh.main.svc.ContactSvcInterface;

@RestController
@RequestMapping("contact")
public class ContactCntrl {

	@Autowired
	private ContactSvcInterface contactSvc;

	@GetMapping("all/{userId}") 
	public ResponseEntity<?> getAll(@PathVariable("userId") int userId) {
		return contactSvc.getAllContact(userId);
	}

}
