package com.rishabh.main.svc;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.rishabh.main.domain.Experience;
import com.rishabh.main.repo.ExperienceRepoInterface;

@Service
public class ExperienceSvcImpl implements ExperienceSvcInterface {
	
	@Autowired
	private ExperienceRepoInterface experienceRepo;

	@Override
	public ResponseEntity<?> getExpByCompany(String companyName) {
		
		return new ResponseEntity<List<Experience>>(experienceRepo.getExpByCompany(companyName), HttpStatusCode.valueOf(200));
	}

	@Override
	public ResponseEntity<?> getAll(int userId) {
		// TODO Auto-generated method stub
		return new ResponseEntity<List<Experience>>(experienceRepo.getAll(userId), HttpStatusCode.valueOf(200));
	}

}
