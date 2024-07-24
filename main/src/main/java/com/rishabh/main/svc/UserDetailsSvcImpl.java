package com.rishabh.main.svc;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.rishabh.main.domain.UserDetails;
import com.rishabh.main.repo.UserDetailsRepoInterface;

@Service
public class UserDetailsSvcImpl implements UserDetailsSvcInterface{
	
	@Autowired
	UserDetailsRepoInterface userDetailsRepo ;

	@Override
	public ResponseEntity<?> getUserDetails(int userId) {
		
		UserDetails res = userDetailsRepo.getUserDetails(userId);
		
		return new ResponseEntity<UserDetails>(res, HttpStatusCode.valueOf(200));
	}

}
