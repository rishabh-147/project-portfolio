package com.rishabh.main.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.rishabh.main.svc.ProjectSkillSvcInterface;

@RestController
@RequestMapping("getProjects")
public class ProjectSkillController {
	
	@Autowired
	private ProjectSkillSvcInterface projectSkillSvc;
	
	
	// http://localhost:8080/getProjects/getDetails/1
	@GetMapping("getDetails/{projectId}")
	public ResponseEntity<?> getProejctDetails(@PathVariable("projectId") int projectId){
		return projectSkillSvc.getByProject(projectId);
	}

}
