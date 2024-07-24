package com.rishabh.main.domain;

import java.time.LocalDateTime;

public class Contact {
    private Long contactId;
    private Long userId;
    private String type;
    private String value;
    private LocalDateTime createdAt;
    private LocalDateTime updatedAt;
    
    
    public Contact() {
		// TODO Auto-generated constructor stub
	}
    
    
	public Contact(Long contactId, Long userId, String type, String value, LocalDateTime createdAt,
			LocalDateTime updatedAt) {
		super();
		this.contactId = contactId;
		this.userId = userId;
		this.type = type;
		this.value = value;
		this.createdAt = createdAt;
		this.updatedAt = updatedAt;
	}


	public Long getContactId() {
		return contactId;
	}


	public void setContactId(Long contactId) {
		this.contactId = contactId;
	}


	public Long getUserId() {
		return userId;
	}


	public void setUserId(Long userId) {
		this.userId = userId;
	}


	public String getType() {
		return type;
	}


	public void setType(String type) {
		this.type = type;
	}


	public String getValue() {
		return value;
	}


	public void setValue(String value) {
		this.value = value;
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
		return "Contact [contactId=" + contactId + ", userId=" + userId + ", type=" + type + ", value=" + value
				+ ", createdAt=" + createdAt + ", updatedAt=" + updatedAt + "]";
	}

    // Getters and Setters (omitted for brevity)
    
}
