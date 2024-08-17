package com.rishabh.main.svc;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;


public interface CertificationSvcInterface {

	public ResponseEntity<?> getAll(int userId);
}
