package com.rishabh.main.svc;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.rishabh.main.domain.ProjectSkillJunction;
import com.rishabh.main.repo.ProjectSkillRepo;
import com.rishabh.main.repo.ProjectSkillRepoInterface;

@Service
public class ProjectSkillSvcImpl implements ProjectSkillSvcInterface{
	
	@Autowired
	ProjectSkillRepoInterface projectSkillRepo;

	@Override
	public ResponseEntity<?> getByProject(int projectId) {
		
		return new ResponseEntity<List<ProjectSkillJunction>>(projectSkillRepo.getByProject(projectId), HttpStatusCode.valueOf(200));
	}

}
