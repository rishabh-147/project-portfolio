package com.rishabh.main.svc;

import org.springframework.http.ResponseEntity;

public interface CertificationSvcInterface {

	public ResponseEntity<?> getAll(int userId);
}
