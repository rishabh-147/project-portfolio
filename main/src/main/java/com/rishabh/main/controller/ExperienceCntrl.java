package com.rishabh.main.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.rishabh.main.svc.ExperienceSvcInterface;

@RestController
@RequestMapping("exp")
public class ExperienceCntrl {

	@Autowired
	private ExperienceSvcInterface experienceSvc;
	
	@GetMapping("filtered/{companyName}")
	public ResponseEntity<?> getfilteredExp(@PathVariable("companyName") String companyName){
		return experienceSvc.getExpByCompany(companyName);
	}
	
	
	@GetMapping("all/{userId}")
	public ResponseEntity<?> getAll(@PathVariable("userId") int userId){
		return experienceSvc.getAll(userId);
	}
}
