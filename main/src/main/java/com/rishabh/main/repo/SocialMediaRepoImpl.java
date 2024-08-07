package com.rishabh.main.repo;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

import com.rishabh.main.domain.SocialMedia;
import com.rishabh.main.util.QueryConstants;

public class SocialMediaRepoImpl implements SocialMediaRepoInterface {

	@Autowired
	JdbcTemplate jdbcTemplate;
	
	@Override
	public SocialMedia getByPlatform(String platform) {
		return jdbcTemplate.queryForObject(QueryConstants.GET_SOCIALMEDIA_By_Platform_DETAILS, new RowMapper<SocialMedia> () {
		    
			@Override
			public SocialMedia mapRow(ResultSet rs, int rowNum) throws SQLException {
			SocialMedia socialMedia = new SocialMedia();
			socialMedia.setSocialMediaId(rs.getLong("socialMediaId"));
			socialMedia.setUserId(rs.getLong("userId"));
			socialMedia.setPlatform(rs.getString("platform"));
			socialMedia.setUrl(rs.getString("url"));
			socialMedia.setCreatedAt(rs.getObject("createdAt", LocalDateTime.class));
			socialMedia.setUpdatedAt(rs.getObject("updatedAt", LocalDateTime.class));
							
								
				return socialMedia;
			}
			
		},platform);	
	}

	@Override
	public List<SocialMedia> getAllSM(Integer userId) {
		return jdbcTemplate.query(QueryConstants.GET_SOCIALMEDIA_DETAILS, new RowMapper<SocialMedia> () {

			@Override
			public SocialMedia mapRow(ResultSet rs, int rowNum) throws SQLException {
			SocialMedia socialMedia = new SocialMedia();
			socialMedia.setSocialMediaId(rs.getLong("socialMediaId"));
			socialMedia.setUserId(rs.getLong("userId"));
			socialMedia.setPlatform(rs.getString("platform"));
			socialMedia.setUrl(rs.getString("url"));
			socialMedia.setCreatedAt(rs.getObject("createdAt", LocalDateTime.class));
			socialMedia.setUpdatedAt(rs.getObject("updatedAt", LocalDateTime.class));
							
								
				return socialMedia;
			}
			
		},userId);	
	}

}
