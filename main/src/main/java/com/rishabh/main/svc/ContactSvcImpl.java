package com.rishabh.main.svc;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.rishabh.main.domain.Contact;
import com.rishabh.main.repo.ContactRepoInterface;

@Service
public class ContactSvcImpl implements ContactSvcInterface {
	
	@Autowired
	private ContactRepoInterface contactRepo;

	@Override
	public ResponseEntity<?> getAllContact(int userId) {

		return new ResponseEntity<List<Contact>>(contactRepo.getAllContact(userId), HttpStatusCode.valueOf(200));
	}

}
