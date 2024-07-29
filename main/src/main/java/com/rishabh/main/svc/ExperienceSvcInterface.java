package com.rishabh.main.svc;

import org.springframework.http.ResponseEntity;

public interface ExperienceSvcInterface {

	public ResponseEntity<?> getExpByCompany(String companyName);
}
