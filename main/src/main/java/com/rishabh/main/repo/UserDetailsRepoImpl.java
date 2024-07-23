package com.rishabh.main.repo;

import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.rishabh.main.domain.UserDetails;
import com.rishabh.main.util.JDBCObjectProvider;
import com.rishabh.main.util.QueryConstants;

@Repository
public class UserDetailsRepoImpl implements UserDetailsRepoInterface{
	
//	getting JDBC Template object
	JdbcTemplate jdbcTemplate = JDBCObjectProvider.getJdbcObj();

	@Override
	public UserDetails getUserDetails(String userName) {
		
		Object[] args = {userName};
		return jdbcTemplate.queryForObject(QueryConstants.GET_USER_DETAILS, args,BeanPropertyRowMapper.newInstance(UserDetails.class));
	}
	
}
