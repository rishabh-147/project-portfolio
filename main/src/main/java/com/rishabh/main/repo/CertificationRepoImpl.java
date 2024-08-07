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

import com.rishabh.main.domain.Certification;
import com.rishabh.main.util.QueryConstants;
@Repository
public class CertificationRepoImpl implements CertificationRepoInterface {

	@Autowired
	JdbcTemplate jdbcTemplate;
	@Override
	public List<Certification> getAll(int userId) {
		
		return jdbcTemplate.query(QueryConstants.GET_CERTIFICATION_DETAILS, new RowMapper<Certification> () {

			@Override
			public Certification mapRow(ResultSet rs, int rowNum) throws SQLException {
				Certification certification = new Certification();
				certification.setCertificationId(rs.getInt("certificationId"));
				certification.setUserId(rs.getInt("userId"));
				certification.setName(rs.getString("name"));
				certification.setAuthority(rs.getString("authority"));
				certification.setLicenseNumber(rs.getString("licenseNumber"));
				certification.setStartDate(rs.getObject("start_date", LocalDate.class));
				certification.setEndDate(rs.getObject("end_date", LocalDate.class));
				certification.setUrl(rs.getString("url"));
				certification.setCreatedAt(rs.getObject("created_at", LocalDateTime.class));
				certification.setUpdatedAt(rs.getObject("updated_at", LocalDateTime.class));
								
				return certification;
			}
			
		},userId);
	}
	
}
