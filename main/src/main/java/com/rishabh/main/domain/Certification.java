package com.rishabh.main.domain;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class Certification {
    private int certificationId;
    private int userId;
    private String name;
    private String authority;
    private String licenseNumber;
    private LocalDate startDate;
    private LocalDate endDate;
    private String url;
    private LocalDateTime createdAt;
    private LocalDateTime updatedAt;

    public Certification() {
		// TODO Auto-generated constructor stub
	}

    
	public Certification(int certificationId, int userId, String name, String authority, String licenseNumber,
			LocalDate startDate, LocalDate endDate, String url, LocalDateTime createdAt, LocalDateTime updatedAt) {
		super();
		this.certificationId = certificationId;
		this.userId = userId;
		this.name = name;
		this.authority = authority;
		this.licenseNumber = licenseNumber;
		this.startDate = startDate;
		this.endDate = endDate;
		this.url = url;
		this.createdAt = createdAt;
		this.updatedAt = updatedAt;
	}


	public int getCertificationId() {
		return certificationId;
	}


	public void setCertificationId(int certificationId) {
		this.certificationId = certificationId;
	}


	public int getUserId() {
		return userId;
	}


	public void setUserId(int userId) {
		this.userId = userId;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getAuthority() {
		return authority;
	}


	public void setAuthority(String authority) {
		this.authority = authority;
	}


	public String getLicenseNumber() {
		return licenseNumber;
	}


	public void setLicenseNumber(String licenseNumber) {
		this.licenseNumber = licenseNumber;
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
		return "Certification [certificationId=" + certificationId + ", userId=" + userId + ", name=" + name
				+ ", authority=" + authority + ", licenseNumber=" + licenseNumber + ", startDate=" + startDate
				+ ", endDate=" + endDate + ", url=" + url + ", createdAt=" + createdAt + ", updatedAt=" + updatedAt
				+ "]";
	}
    
    
    // Getters and Setters (omitted for brevity)
}
