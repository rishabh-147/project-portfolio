package com.rishabh.main.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.rishabh.main.svc.ExperienceSvcInterface;

@RestController
@RequestMapping("exp")
public class ExperienceCntrl {

	@Autowired
	private ExperienceSvcInterface experienceSvc;
	
	public ResponseEntity<?> getAll(String companyName){
		return experienceSvc.getExpByCompany(companyName);
	}
}
