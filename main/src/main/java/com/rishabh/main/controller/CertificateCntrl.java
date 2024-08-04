package com.rishabh.main.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.rishabh.main.svc.CertificationSvcInterface;

@RestController

@RequestMapping("certificate")
public class CertificateCntrl {

	@Autowired
	private CertificationSvcInterface certificationSvc;
	
	@GetMapping("all/{userId}")
	public ResponseEntity<?> getAllCert(@PathVariable("userId") int userId){
		return certificationSvc.getAll(userId);		
	}
}
