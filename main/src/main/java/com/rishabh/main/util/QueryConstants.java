package com.rishabh.main.util;

public class QueryConstants {
	
	public static final String GET_USER_DETAILS = "SELECT * FROM user_details where user_id = ?";
	public static final String GET_PROJECTSKILL_DETAILS = "SELECT * FROM JUNC_PROJECTSKILL jps INNER JOIN Project p ON jps.project_id = p.project_id INNER JOIN Skill s ON jps.skill_id = s.skill_id WHERE p.project_id = ?";

}
