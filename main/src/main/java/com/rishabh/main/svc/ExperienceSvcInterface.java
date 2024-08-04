package com.rishabh.main.svc;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
@Service
public interface ExperienceSvcInterface {

	public ResponseEntity<?> getExpByCompany(String companyName);
}
