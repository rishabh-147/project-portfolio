package com.rishabh.main.svc;

import org.springframework.http.ResponseEntity;

public interface SkillSvcInterface {

	public ResponseEntity<?> getAll(int userId);
}
