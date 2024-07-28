package com.rishabh.main.repo;

import java.util.List;

import com.rishabh.main.domain.SocialMedia;

public interface SocialMediaRepoInterface {

	public SocialMedia getByPlatform(String platform);
	public List<SocialMedia> getAllSM(Integer userId);
}
