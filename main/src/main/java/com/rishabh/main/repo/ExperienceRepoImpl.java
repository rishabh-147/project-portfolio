package com.rishabh.main.repo;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import com.rishabh.main.domain.Education;
import com.rishabh.main.domain.Experience;
import com.rishabh.main.util.QueryConstants;
@Repository
public class ExperienceRepoImpl implements ExperienceRepoInterface {

	@Autowired
	JdbcTemplate jdbcTemplate;
	
	@Override
	public List<Experience> getExpByCompany(String companyName) {
		return jdbcTemplate.query(QueryConstants.GET_EXPERIENCE_DETAILS, new RowMapper<Experience> () {

			@Override
			public Experience mapRow(ResultSet rs, int rowNum) throws SQLException {
			Experience experience = new Experience();
			experience.setExperienceId(rs.getLong("experienceId"));
			experience.setUserId(rs.getLong("userId"));
			experience.setTitle(rs.getString("title"));;
			experience.setCompany(rs.getString("company"));
			experience.setLocation(rs.getString("location"));
			experience.setStartDate(rs.getObject("startDate", LocalDate.class));
			experience.setEndDate(rs.getObject("endDate", LocalDate.class));
			experience.setDescription(rs.getString("description"));
			experience.setCurrentlyWorking(rs.getBoolean("currentlyWorking"));
			experience.setCreatedAt(rs.getObject("createdAt", LocalDateTime.class));
			experience.setUpdatedAt(rs.getObject("updatedAt", LocalDateTime.class));
							
								
				return experience;
			}
			
		},companyName);	
	}

}
