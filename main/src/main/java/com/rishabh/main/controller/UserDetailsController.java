package com.rishabh.main.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.rishabh.main.svc.UserDetailsSvcInterface;

@RestController
@RequestMapping("user-details")
public class UserDetailsController {
	
	@Autowired
	UserDetailsSvcInterface userDetailsSvc ;
	
	@GetMapping("getUser")
	public ResponseEntity<?> getUser(@PathVariable("userName") String userName){
		return userDetailsSvc.getUserDetails(userName);
	}
}
