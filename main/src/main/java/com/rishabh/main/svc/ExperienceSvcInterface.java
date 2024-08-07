package com.rishabh.main.svc;

import java.util.List;

import org.springframework.http.ResponseEntity;

import com.rishabh.main.domain.Experience;

public interface ExperienceSvcInterface {
	public ResponseEntity<?> getAll(int userId);
	public ResponseEntity<?> getExpByCompany(String companyName);
}
