package com.rishabh.main.domain;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class Project {
    private int projectId;
    private int userId;
    private String title;
    private String description;
    private LocalDate startDate;
    private LocalDate endDate;
    private String url;
    private LocalDateTime createdAt;
    private LocalDateTime updatedAt;

    public Project() {
		// TODO Auto-generated constructor stub
	}

	public Project(int projectId, int userId, String title, String description, LocalDate startDate, LocalDate endDate,
			String url, LocalDateTime createdAt, LocalDateTime updatedAt) {
		super();
		this.projectId = projectId;
		this.userId = userId;
		this.title = title;
		this.description = description;
		this.startDate = startDate;
		this.endDate = endDate;
		this.url = url;
		this.createdAt = createdAt;
		this.updatedAt = updatedAt;
	}

	public int getProjectId() {
		return projectId;
	}

	public void setProjectId(int projectId) {
		this.projectId = projectId;
	}

	public int getUserId() {
		return userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
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

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
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
		return "Project [projectId=" + projectId + ", userId=" + userId + ", title=" + title + ", description="
				+ description + ", startDate=" + startDate + ", endDate=" + endDate + ", url=" + url + ", createdAt="
				+ createdAt + ", updatedAt=" + updatedAt + "]";
	}

    
}

