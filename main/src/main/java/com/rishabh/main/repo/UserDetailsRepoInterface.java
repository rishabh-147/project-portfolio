package com.rishabh.main.repo;

import org.springframework.stereotype.Repository;

import com.rishabh.main.domain.UserDetails;

@Repository
public interface UserDetailsRepoInterface {

	public UserDetails getUserDetails(int userId);
}
