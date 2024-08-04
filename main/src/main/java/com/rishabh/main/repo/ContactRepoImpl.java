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

import com.rishabh.main.domain.Contact;
import com.rishabh.main.util.QueryConstants;
@Repository
public class ContactRepoImpl implements ContactRepoInterface {

	@Autowired
	JdbcTemplate jdbcTemplate;
	

	@Override
	public List<Contact> getAllContact(int userId) {
		return jdbcTemplate.query(QueryConstants.GET_CONTACT_DETAILS, new RowMapper<Contact> () {

			@Override
			public Contact mapRow(ResultSet rs, int rowNum) throws SQLException {
			Contact contact  = new Contact();
			contact.setContactId(rs.getInt("contactId"));
			contact.setUserId(rs.getInt("userId"));
			contact.setType(rs.getString("type"));
			contact.setValue(rs.getString("value"));
			contact.setCreatedAt(rs.getObject("created_at", LocalDateTime.class));
			contact.setUpdatedAt(rs.getObject("updated_at", LocalDateTime.class));
							
								
				return contact;
			}
			
		},userId);		
		}

}
