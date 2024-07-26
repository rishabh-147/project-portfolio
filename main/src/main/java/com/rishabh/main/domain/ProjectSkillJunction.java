package com.rishabh.main.domain;

public class ProjectSkillJunction {
	
	private int projectSkillId;
	private int projectId; 
	private Project project;
	private int skillId;
	private Skill skill;
	
	public ProjectSkillJunction() {
		// TODO Auto-generated constructor stub
	}

	public ProjectSkillJunction(int projectSkillId, int projectId, Project project, int skillId, Skill skill) {
		super();
		this.projectSkillId = projectSkillId;
		this.projectId = projectId;
		this.project = project;
		this.skillId = skillId;
		this.skill = skill;
	}

	public int getProjectSkillId() {
		return projectSkillId;
	}

	public void setProjectSkillId(int projectSkillId) {
		this.projectSkillId = projectSkillId;
	}

	public int getProjectId() {
		return projectId;
	}

	public void setProjectId(int projectId) {
		this.projectId = projectId;
	}

	public Project getProject() {
		return project;
	}

	public void setProject(Project project) {
		this.project = project;
	}

	public int getSkillId() {
		return skillId;
	}

	public void setSkillId(int skillId) {
		this.skillId = skillId;
	}

	public Skill getSkill() {
		return skill;
	}

	public void setSkill(Skill skill) {
		this.skill = skill;
	}

	@Override
	public String toString() {
		return "ProjectSkillJunction [projectSkillId=" + projectSkillId + ", projectId=" + projectId + ", project="
				+ project + ", skillId=" + skillId + ", skill=" + skill + "]";
	}

	
	
}
