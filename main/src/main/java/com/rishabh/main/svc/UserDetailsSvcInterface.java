package com.rishabh.main.svc;

import org.springframework.http.ResponseEntity;

public interface UserDetailsSvcInterface {
	
	public ResponseEntity<?> getUserDetails(String userName);
}
