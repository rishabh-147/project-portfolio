package com.rishabh.main.repo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.rishabh.main.domain.UserDetails;
import com.rishabh.main.util.QueryConstants;

@Repository
public class UserDetailsRepoImpl implements UserDetailsRepoInterface{
	
//	getting JDBC Template object
	@Autowired
	JdbcTemplate jdbcTemplate;

	@Override
	public UserDetails getUserDetails(int userId) {
		
		
		return jdbcTemplate.queryForObject(QueryConstants.GET_USER_DETAILS, BeanPropertyRowMapper.newInstance(UserDetails.class), userId);
//		return jdbcTemplate.queryForObject(QueryConstants.GET_USER_DETAILS, args,BeanPropertyRowMapper.newInstance(UserDetails.class));
	}
	
}
