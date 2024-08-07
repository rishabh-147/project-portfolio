package com.rishabh.main.repo;

import java.util.List;

import com.rishabh.main.domain.Experience;

public interface ExperienceRepoInterface {
	public List<Experience> getAll(int userId);
	public List<Experience> getExpByCompany(String companyName);
}
