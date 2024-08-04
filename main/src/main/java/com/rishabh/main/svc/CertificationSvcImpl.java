package com.rishabh.main.svc;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.rishabh.main.domain.Certification;
import com.rishabh.main.repo.CertificationRepoInterface;

@Service
public class CertificationSvcImpl implements CertificationSvcInterface{

	@Autowired
	private CertificationRepoInterface certificationRepo;
	
	@Override
	public ResponseEntity<?> getAll(int userId) {
		
		return new ResponseEntity<List<Certification>>(certificationRepo.getAll(userId), HttpStatusCode.valueOf(userId));
	}

}

