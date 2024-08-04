package com.rishabh.main.repo;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.LocalDateTime;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import com.rishabh.main.domain.Skill;
import com.rishabh.main.util.QueryConstants;
@Repository
public class SkillRepoImpl implements SkillRepoInterface {

	@Autowired
	JdbcTemplate jdbcTemplate;
	
	@Override
	public List<Skill> getAll(int userId) {
		return jdbcTemplate.query(QueryConstants.GET_SKILL_DETAILS, new RowMapper<Skill> () {
			  
			@Override
			public Skill mapRow(ResultSet rs, int rowNum) throws SQLException {
			Skill skill = new Skill();
			skill.setSkillId(rs.getInt("skillId"));;
			skill.setUserId(rs.getInt("userId"));;
			skill.setName(rs.getString("name"));
			skill.setProficiency(rs.getString("proficiency"));
			skill.setCreatedAt(rs.getObject("createdAt", LocalDateTime.class));
			skill.setUpdatedAt(rs.getObject("updatedAt", LocalDateTime.class));
			
			return skill;
			}
			
		},userId);	
	}

}
