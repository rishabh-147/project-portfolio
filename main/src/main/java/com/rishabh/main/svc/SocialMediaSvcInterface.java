package com.rishabh.main.svc;

import java.util.List;

import org.springframework.http.ResponseEntity;


public interface SocialMediaSvcInterface {
	
	public ResponseEntity<?> getByPlatform(String platform);
	public ResponseEntity<?>gettAllSM(Integer userId);
}
