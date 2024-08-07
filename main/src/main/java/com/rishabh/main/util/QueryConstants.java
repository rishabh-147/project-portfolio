package com.rishabh.main.util;

public class QueryConstants {
	
	public static final String GET_USER_DETAILS = "SELECT * FROM user_details where user_id = ?";
	public static final String GET_PROJECTSKILL_DETAILS = "SELECT * FROM JUNC_PROJECTSKILL jps INNER JOIN Project p ON jps.project_id = p.project_id INNER JOIN Skill s ON jps.skill_id = s.skill_id WHERE p.project_id = ?";
	public static final String GET_CERTIFICATION_DETAILS = "SELECT * FROM CERTIFICATION WHERE user_id = ? ";
	public static final String GET_CONTACT_DETAILS = "SELECT * FROM CONTACT WHERE user_id = ? ";
	public static final String GET_EDUCATION_DETAILS = "SELECT * FROM EDUCATION WHERE user_id = ?";
	public static final String GET_EXPERIENCE_DETAILS = "SELECT * FROM EXPERIENCE WHERE user_id = ?";
	public static final String GET_EXPERIENCE_BY_Company_DETAILS = "SELECT * FROM EXPERIENCE WHERE company = ?";
	public static final String GET_SOCIALMEDIA_DETAILS = "SELECT * FROM SOCIALMEDIA WHERE user_id = ?";
	public static final String GET_SOCIALMEDIA_By_Platform_DETAILS = "SELECT * FROM SOCIALMEDIA WHERE Platform = ?";
	public static final String GET_SKILL_DETAILS = "SELECT * FROM SKILL WHERE user_id = ? ";
}
