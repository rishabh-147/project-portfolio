package com.rishabh.main.domain;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class Publication {
    private Long publicationId;
    private Long userId;
    private String title;
    private String authors;
    private String journal;
    private LocalDate publicationDate;
    private String url;
    private LocalDateTime createdAt;
    private LocalDateTime updatedAt;

    // Getters and Setters (omitted for brevity)
    public Publication() {
		// TODO Auto-generated constructor stub
	}

	public Publication(Long publicationId, Long userId, String title, String authors, String journal,
			LocalDate publicationDate, String url, LocalDateTime createdAt, LocalDateTime updatedAt) {
		super();
		this.publicationId = publicationId;
		this.userId = userId;
		this.title = title;
		this.authors = authors;
		this.journal = journal;
		this.publicationDate = publicationDate;
		this.url = url;
		this.createdAt = createdAt;
		this.updatedAt = updatedAt;
	}

	public Long getPublicationId() {
		return publicationId;
	}

	public void setPublicationId(Long publicationId) {
		this.publicationId = publicationId;
	}

	public Long getUserId() {
		return userId;
	}

	public void setUserId(Long userId) {
		this.userId = userId;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getAuthors() {
		return authors;
	}

	public void setAuthors(String authors) {
		this.authors = authors;
	}

	public String getJournal() {
		return journal;
	}

	public void setJournal(String journal) {
		this.journal = journal;
	}

	public LocalDate getPublicationDate() {
		return publicationDate;
	}

	public void setPublicationDate(LocalDate publicationDate) {
		this.publicationDate = publicationDate;
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
		return "Publication [publicationId=" + publicationId + ", userId=" + userId + ", title=" + title + ", authors="
				+ authors + ", journal=" + journal + ", publicationDate=" + publicationDate + ", url=" + url
				+ ", createdAt=" + createdAt + ", updatedAt=" + updatedAt + "]";
	}
    
    
}

