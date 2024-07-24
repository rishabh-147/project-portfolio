package com.rishabh.main.domain;

import java.time.LocalDateTime;

public class Skill {
    private Long skillId;
    private Long userId;
    private String name;
    private String proficiency;
    private LocalDateTime createdAt;
    private LocalDateTime updatedAt;

    public Skill() {
		// TODO Auto-generated constructor stub
	}

	public Skill(Long skillId, Long userId, String name, String proficiency, LocalDateTime createdAt,
			LocalDateTime updatedAt) {
		super();
		this.skillId = skillId;
		this.userId = userId;
		this.name = name;
		this.proficiency = proficiency;
		this.createdAt = createdAt;
		this.updatedAt = updatedAt;
	}
	
	

	public Long getSkillId() {
		return skillId;
	}

	public void setSkillId(Long skillId) {
		this.skillId = skillId;
	}

	public Long getUserId() {
		return userId;
	}

	public void setUserId(Long userId) {
		this.userId = userId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getProficiency() {
		return proficiency;
	}

	public void setProficiency(String proficiency) {
		this.proficiency = proficiency;
	}

	public LocalDateTime getCreatedAt() {
		return createdAt;
	}

	public void setCreatedAt(LocalDateTime createdAt) {
		this.createdAt = createdAt;
	}

	public LocalDateTime getUpdatedAt() {
		return updatedAt;
	}

	public void setUpdatedAt(LocalDateTime updatedAt) {
		this.updatedAt = updatedAt;
	}

	@Override
	public String toString() {
		return "Skill [skillId=" + skillId + ", userId=" + userId + ", name=" + name + ", proficiency=" + proficiency
				+ ", createdAt=" + createdAt + ", updatedAt=" + updatedAt + "]";
	}
    
    
    // Getters and Setters (omitted for brevity)
    
}

