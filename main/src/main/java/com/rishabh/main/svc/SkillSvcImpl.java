package com.rishabh.main.svc;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;

import com.rishabh.main.repo.SkillRepoInterface;

public class SkillSvcImpl implements SkillSvcInterface{
	
	@Autowired
	private SkillRepoInterface skillRepo;

	@Override
	public ResponseEntity<?> getAll(int userId) {
		
		return null;
	}

	
}
