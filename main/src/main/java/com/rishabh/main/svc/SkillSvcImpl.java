package com.rishabh.main.svc;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.rishabh.main.repo.SkillRepoInterface;

@Service
public class SkillSvcImpl implements SkillSvcInterface{
	
	@Autowired
	private SkillRepoInterface skillRepo;

	@Override
	public ResponseEntity<?> getAll(int userId) {
		
		return null;
	}

	
}
