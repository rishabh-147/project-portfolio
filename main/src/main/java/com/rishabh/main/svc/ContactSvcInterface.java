package com.rishabh.main.svc;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

@Service
public interface ContactSvcInterface {

	public ResponseEntity<?> getAllContact(int userId) ;
}
