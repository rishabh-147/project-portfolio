package com.rishabh.main.svc;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

@Service
public interface ProjectSkillSvcInterface {
	public ResponseEntity<?> getByProject(int projectId);
}
