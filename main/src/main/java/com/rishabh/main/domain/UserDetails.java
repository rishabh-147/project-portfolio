package com.rishabh.main.domain;

import java.sql.Date;

public class UserDetails {

	private int userId;
	private String userName;
	private String pwdHash;
	private String emailId;
	private String fullName;
	private String bio;
	private String avatarURL;
	private Date createdOn;

	public UserDetails() {
		// TODO Auto-generated constructor stub
	}

	public UserDetails(int userId, String userName, String pwdHash, String emailId, String fullName, String bio,
			String avatarURL, Date createdOn) {
		super();
		this.userId = userId;
		this.userName = userName;
		this.pwdHash = pwdHash;
		this.emailId = emailId;
		this.fullName = fullName;
		this.bio = bio;
		this.avatarURL = avatarURL;
		this.createdOn = createdOn;
	}

	public int getUserId() {
		return userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getPwdHash() {
		return pwdHash;
	}

	public void setPwdHash(String pwdHash) {
		this.pwdHash = pwdHash;
	}

	public String getEmailId() {
		return emailId;
	}

	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}

	public String getFullName() {
		return fullName;
	}

	public void setFullName(String fullName) {
		this.fullName = fullName;
	}

	public String getBio() {
		return bio;
	}

	public void setBio(String bio) {
		this.bio = bio;
	}

	public String getAvatarURL() {
		return avatarURL;
	}

	public void setAvatarURL(String avatarURL) {
		this.avatarURL = avatarURL;
	}

	public Date getCreatedOn() {
		return createdOn;
	}

	public void setCreatedOn(Date createdOn) {
		this.createdOn = createdOn;
	}

	@Override
	public String toString() {
		return "UserDetails [userId=" + userId + ", userName=" + userName + ", pwdHash=" + pwdHash + ", emailId="
				+ emailId + ", fullName=" + fullName + ", bio=" + bio + ", avatarURL=" + avatarURL + ", createdOn="
				+ createdOn + "]";
	}

}
