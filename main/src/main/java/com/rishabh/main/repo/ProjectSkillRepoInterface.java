package com.rishabh.main.repo;

import java.util.List;

import com.rishabh.main.domain.ProjectSkillJunction;

public interface ProjectSkillRepoInterface {
	public List<ProjectSkillJunction> getByProject(int projectId);
}
