package com.rishabh.main.svc;

import org.springframework.http.ResponseEntity;

public interface EducationSvcInterface {

	public ResponseEntity<?> getAllEdu(int userId);
} 
