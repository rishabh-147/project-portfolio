package com.rishabh.main.svc;

import org.springframework.http.ResponseEntity;

public interface ContactSvcInterface {

	public ResponseEntity<?> getAllContact(int userId) ;
}
