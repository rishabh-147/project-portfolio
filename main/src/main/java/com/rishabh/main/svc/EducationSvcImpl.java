package com.rishabh.main.svc;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import com.rishabh.main.domain.Education;
import com.rishabh.main.repo.EducationRepoInterface;

@Service
public class EducationSvcImpl implements EducationSvcInterface {
	
	@Autowired
	private EducationRepoInterface educationRepo;

	@Override
	public ResponseEntity<?> getAllEdu(int userId) {
		
		return new ResponseEntity<List<Education>>(educationRepo.getAllEdu(userId), HttpStatusCode.valueOf(200));
	}

}
