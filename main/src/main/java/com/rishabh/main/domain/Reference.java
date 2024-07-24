package com.rishabh.main.domain;

import java.time.LocalDateTime;

public class Reference {
    private Long referenceId;
    private Long userId;
    private String name;
    private String position;
    private String company;
    private String contactInfo;
    private LocalDateTime createdAt;
    private LocalDateTime updatedAt;

    // Getters and Setters (omitted for brevity)
    
    public Reference() {
		// TODO Auto-generated constructor stub
	}

	public Reference(Long referenceId, Long userId, String name, String position, String company, String contactInfo,
			LocalDateTime createdAt, LocalDateTime updatedAt) {
		super();
		this.referenceId = referenceId;
		this.userId = userId;
		this.name = name;
		this.position = position;
		this.company = company;
		this.contactInfo = contactInfo;
		this.createdAt = createdAt;
		this.updatedAt = updatedAt;
	}

	public Long getReferenceId() {
		return referenceId;
	}

	public void setReferenceId(Long referenceId) {
		this.referenceId = referenceId;
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

	public String getPosition() {
		return position;
	}

	public void setPosition(String position) {
		this.position = position;
	}

	public String getCompany() {
		return company;
	}

	public void setCompany(String company) {
		this.company = company;
	}

	public String getContactInfo() {
		return contactInfo;
	}

	public void setContactInfo(String contactInfo) {
		this.contactInfo = contactInfo;
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
		return "Reference [referenceId=" + referenceId + ", userId=" + userId + ", name=" + name + ", position="
				+ position + ", company=" + company + ", contactInfo=" + contactInfo + ", createdAt=" + createdAt
				+ ", updatedAt=" + updatedAt + "]";
	}
    
    
}
