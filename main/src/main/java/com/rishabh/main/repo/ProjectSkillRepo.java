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
public class ProjectSkillRepo {
		
	@Autowired
	JdbcTemplate jdbcTemplate;
	public List<ProjectSkillJunction> getByProject(int projectId) {
		List<ProjectSkillJunction> res =  jdbcTemplate.query(QueryConstants.GET_PROJECTSKILL_DETAILS, new RowMapper<ProjectSkillJunction>() {

			@Override
			public ProjectSkillJunction mapRow(ResultSet rs, int rowNum) throws SQLException {
				
				 // Create a Project object
		        Project project = new Project();
		        project.setP_projectID(rs.getInt("project_id"));
		        project.setP_userID(rs.getInt("user_id")); // Assuming this is in the result set
		        project.setP_title(rs.getString("title"));
		        project.setP_description(rs.getString("description"));
		        project.setP_startDate(rs.getObject("start_date", LocalDate.class));
		        project.setP_endDate(rs.getObject("end_date", LocalDate.class));
		        project.setP_url(rs.getString("url"));
		        project.setP_createdAt(rs.getObject("created_at", LocalDateTime.class));
		        project.setP_updatedAt(rs.getObject("updated_at", LocalDateTime.class));

		        // Create a Skill object
		        Skill skill = new Skill();
		        skill.setSkillID(rs.getInt("skill_id"));
		        skill.setName(rs.getString("name"));
		        skill.setProficiency(rs.getString("proficiency"));

		        // Create and populate a ProjectSkill object
		        ProjectSkillJunction projectSkill = new ProjectSkillJunction();
		        projectSkill.setProjectSkillId(rs.getInt("project_skill_id"));
		        projectSkill.setProject(project);
		        projectSkill.setSkill(skill);

		        return projectSkill;
			}
			
		}, projectId);
		
		return res;
	}
}
