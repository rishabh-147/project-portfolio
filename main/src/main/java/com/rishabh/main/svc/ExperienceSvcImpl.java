package com.rishabh.main.svc;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;

import com.rishabh.main.domain.Experience;
import com.rishabh.main.repo.ExperienceRepoInterface;

public class ExperienceSvcImpl implements ExperienceSvcInterface {
	
	@Autowired
	ExperienceRepoInterface experienceRepo;

	@Override
	public ResponseEntity<?> getExpByCompany(String companyName) {
		
		return new ResponseEntity<List<Experience>>(experienceRepo.getExpByCompany(companyName), HttpStatusCode.valueOf(200));
	}

}
