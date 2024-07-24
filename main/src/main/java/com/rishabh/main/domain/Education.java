package com.rishabh.main.domain;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class Education {
    private Long educationId;
    private Long userId;
    private String institution;
    private String degree;
    private String fieldOfStudy;
    private LocalDate startDate;
    private LocalDate endDate;
    private String description;
    private LocalDateTime createdAt;
    private LocalDateTime updatedAt;
    
    public Education() {
		// TODO Auto-generated constructor stub
	}
    
    
	public Education(Long educationId, Long userId, String institution, String degree, String fieldOfStudy,
			LocalDate startDate, LocalDate endDate, String description, LocalDateTime createdAt,
			LocalDateTime updatedAt) {
		super();
		this.educationId = educationId;
		this.userId = userId;
		this.institution = institution;
		this.degree = degree;
		this.fieldOfStudy = fieldOfStudy;
		this.startDate = startDate;
		this.endDate = endDate;
		this.description = description;
		this.createdAt = createdAt;
		this.updatedAt = updatedAt;
	}

	
	

	public Long getEducationId() {
		return educationId;
	}


	public void setEducationId(Long educationId) {
		this.educationId = educationId;
	}


	public Long getUserId() {
		return userId;
	}


	public void setUserId(Long userId) {
		this.userId = userId;
	}


	public String getInstitution() {
		return institution;
	}


	public void setInstitution(String institution) {
		this.institution = institution;
	}


	public String getDegree() {
		return degree;
	}


	public void setDegree(String degree) {
		this.degree = degree;
	}


	public String getFieldOfStudy() {
		return fieldOfStudy;
	}


	public void setFieldOfStudy(String fieldOfStudy) {
		this.fieldOfStudy = fieldOfStudy;
	}


	public LocalDate getStartDate() {
		return startDate;
	}


	public void setStartDate(LocalDate startDate) {
		this.startDate = startDate;
	}


	public LocalDate getEndDate() {
		return endDate;
	}


	public void setEndDate(LocalDate endDate) {
		this.endDate = endDate;
	}


	public String getDescription() {
		return description;
	}


	public void setDescription(String description) {
		this.description = description;
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
		return "Education [educationId=" + educationId + ", userId=" + userId + ", institution=" + institution
				+ ", degree=" + degree + ", fieldOfStudy=" + fieldOfStudy + ", startDate=" + startDate + ", endDate="
				+ endDate + ", description=" + description + ", createdAt=" + createdAt + ", updatedAt=" + updatedAt
				+ "]";
	}

    // Getters and Setters (omitted for brevity)
}

