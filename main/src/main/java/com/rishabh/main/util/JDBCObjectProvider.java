package com.rishabh.main.util;

import org.springframework.jdbc.core.JdbcTemplate;

public class JDBCObjectProvider {
	
	public static JdbcTemplate getJdbcObj() {
		return new JdbcTemplate();
	}

}
