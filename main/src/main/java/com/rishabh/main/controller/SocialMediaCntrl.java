package com.rishabh.main.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.rishabh.main.svc.SocialMediaSvcInterface;

@RestController
@RequestMapping("socialmedia")
public class SocialMediaCntrl {

	@Autowired
	private SocialMediaSvcInterface socialMediaSvc;
	
	@GetMapping("platform/{platformName}")
	private ResponseEntity<?> getByPlatform(@PathVariable("platformName") String platformName){
		return socialMediaSvc.getByPlatform(platformName);
	}
	
	@GetMapping("all/{userId}")
	private ResponseEntity<?> getAllSM(@PathVariable("userId") int userId){
		return socialMediaSvc.gettAllSM(userId);
	}
}
