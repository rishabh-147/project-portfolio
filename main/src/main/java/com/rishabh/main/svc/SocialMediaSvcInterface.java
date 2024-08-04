package com.rishabh.main.svc;

import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

@Service
public interface SocialMediaSvcInterface {
	
	public ResponseEntity<?> getByPlatform(String platform);
	public ResponseEntity<?>gettAllSM(Integer userId);
}
