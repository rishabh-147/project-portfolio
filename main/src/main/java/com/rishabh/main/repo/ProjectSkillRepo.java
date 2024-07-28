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

import com.rishabh.main.domain.Project;
import com.rishabh.main.domain.ProjectSkillJunction;
import com.rishabh.main.domain.Skill;
import com.rishabh.main.util.QueryConstants;

@Repository
public class ProjectSkillRepo implements ProjectSkillRepoInterface{
		
	@Autowired
	JdbcTemplate jdbcTemplate;
	public List<ProjectSkillJunction> getByProject(int projectId) {
		List<ProjectSkillJunction> res =  jdbcTemplate.query(QueryConstants.GET_PROJECTSKILL_DETAILS, new RowMapper<ProjectSkillJunction>() {

			@Override
			public ProjectSkillJunction mapRow(ResultSet rs, int rowNum) throws SQLException {
			    // Create and populate a Project object
			    Project project = new Project();
			    project.setProjectId(rs.getInt("project_id"));
			    project.setTitle(rs.getString("title"));
			    project.setDescription(rs.getString("description"));
			    project.setStartDate(rs.getObject("start_date", LocalDate.class));
			    project.setEndDate(rs.getObject("end_date", LocalDate.class));
			    project.setUrl(rs.getString("url"));
			    project.setCreatedAt(rs.getObject("created_at", LocalDateTime.class));
			    project.setUpdatedAt(rs.getObject("updated_at", LocalDateTime.class));
			    
			    // Create and populate a Skill object
			    Skill skill = new Skill();
			    skill.setSkillId(rs.getInt("skill_id"));
			    skill.setName(rs.getString("name"));
			    skill.setProficiency(rs.getString("proficiency"));

			    // Create and populate a ProjectSkillJunction object
			    ProjectSkillJunction projectSkill = new ProjectSkillJunction();
			    projectSkill.setProjectSkillId(rs.getInt("projectskill_id")); 
			    projectSkill.setProjectId(project.getProjectId());
			    projectSkill.setProject(project);
			    projectSkill.setSkillId(skill.getSkillId());
			    projectSkill.setSkill(skill);

			    return projectSkill;
			}

			
		}, projectId);
		
		return res;
	}
}
