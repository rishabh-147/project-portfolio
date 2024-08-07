package com.rishabh.main.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.rishabh.main.svc.EducationSvcInterface;

@RestController
@RequestMapping("edu")
public class EducationCntrl {

	@Autowired
	private EducationSvcInterface educationSvc;
	
	@GetMapping("all/{userId}")
	public ResponseEntity<?> getAll(@PathVariable("userId") int userId){
		return educationSvc.getAllEdu(userId);
	}
}
