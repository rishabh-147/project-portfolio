package com.rishabh.main.svc;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.rishabh.main.domain.SocialMedia;
import com.rishabh.main.repo.SocialMediaRepoInterface;

@Service
public class SocialMediaSvcImpl implements SocialMediaSvcInterface{
	
	@Autowired
	private SocialMediaRepoInterface socialMediaRepo;

	@Override
	public ResponseEntity<?> getByPlatform(String platform) {
		
		return new ResponseEntity<SocialMedia> (socialMediaRepo.getByPlatform(platform), HttpStatusCode.valueOf(200));
	}

	@Override
	public ResponseEntity<?> gettAllSM(Integer userId) {
		// TODO Auto-generated method stub
		return new ResponseEntity<List<SocialMedia>>(socialMediaRepo.getAllSM(userId), HttpStatusCode.valueOf(200));
	}

}
