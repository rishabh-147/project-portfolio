package com.rishabh.main.svc;

import org.springframework.http.ResponseEntity;


public interface ProjectSkillSvcInterface {
	public ResponseEntity<?> getByProject(int projectId);
}
