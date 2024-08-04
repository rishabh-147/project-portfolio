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
import com.rishabh.main.util.QueryConstants;
@Repository
public class EducationRepoImpl implements EducationRepoInterface {
	
	@Autowired
	JdbcTemplate jdbcTemplate;

	@Override
	public List<Education> getAllEdu(int userId) {
		return jdbcTemplate.query(QueryConstants.GET_EDUCATION_DETAILS, new RowMapper<Education> () {

			@Override
			public Education mapRow(ResultSet rs, int rowNum) throws SQLException {
			Education education = new Education();
			education.setEducationId(rs.getInt("educationId"));
			education.setUserId(rs.getInt("userId"));
			education.setInstitution(rs.getString("institution"));
			education.setDegree(rs.getString("degree"));
			education.setFieldOfStudy(rs.getString("fieldOfStudy"));
			education.setStartDate(rs.getObject("start_date", LocalDate.class));
			education.setEndDate(rs.getObject("end_date", LocalDate.class));
			education.setDescription(rs.getString("description"));
			education.setCreatedAt(rs.getObject("created_at", LocalDateTime.class));
			education.setUpdatedAt(rs.getObject("updated_at", LocalDateTime.class));
							
								
				return education;
			}
			
		},userId);		
	}

}
