package com.rishabh.main.repo;

import java.util.List;

import com.rishabh.main.domain.Education;

public interface EducationRepoInterface {
	public List<Education> getAllEdu(int userId);
}
