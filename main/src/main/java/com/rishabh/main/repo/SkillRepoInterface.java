package com.rishabh.main.repo;

import java.util.List;

import com.rishabh.main.domain.Skill;

public interface SkillRepoInterface {
	
	public List<Skill> getAll(int userId);
}
