package com.rishabh.main.domain;

import java.time.LocalDateTime;

public class SocialMedia {
    private Long socialMediaId;
    private Long userId;
    private String platform;
    private String url;
    private LocalDateTime createdAt;
    private LocalDateTime updatedAt;
    
    public SocialMedia() {
		// TODO Auto-generated constructor stub
	}
    
	public SocialMedia(Long socialMediaId, Long userId, String platform, String url, LocalDateTime createdAt,
			LocalDateTime updatedAt) {
		super();
		this.socialMediaId = socialMediaId;
		this.userId = userId;
		this.platform = platform;
		this.url = url;
		this.createdAt = createdAt;
		this.updatedAt = updatedAt;
	}

	public Long getSocialMediaId() {
		return socialMediaId;
	}

	public void setSocialMediaId(Long socialMediaId) {
		this.socialMediaId = socialMediaId;
	}

	public Long getUserId() {
		return userId;
	}

	public void setUserId(Long userId) {
		this.userId = userId;
	}

	public String getPlatform() {
		return platform;
	}

	public void setPlatform(String platform) {
		this.platform = platform;
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
		return "SocialMedia [socialMediaId=" + socialMediaId + ", userId=" + userId + ", platform=" + platform
				+ ", url=" + url + ", createdAt=" + createdAt + ", updatedAt=" + updatedAt + "]";
	}
	
	
	
	

    
}

