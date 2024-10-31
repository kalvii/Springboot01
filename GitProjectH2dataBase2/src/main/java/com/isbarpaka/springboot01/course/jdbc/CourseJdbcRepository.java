package com.isbarpaka.springboot01.course.jdbc;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;
@Repository
public class CourseJdbcRepository {
	@Autowired
	private JdbcTemplate jdbcTemplate;
	private static String INSERT_QUERY="""
			insert into course(id,name,auther)
			values(?,?,?)
			""";
	private static String DELETE_QUERY=
			"""
			DELETE FROM COURSE WHERE ID=?
			""";
	private static String QUERY_DATA=
			"""
			SELECT *FROM COURSE WHERE ID=?
			""";
	
	
	public void insert(Course course) {
		jdbcTemplate.update(INSERT_QUERY,course.getId(),course.getName(),course.getAuther());
		
		
	}
	
	public void deleteByid(long id) {
		jdbcTemplate.update(DELETE_QUERY,id);
	}
	public Course showData(long id) {
		return jdbcTemplate.queryForObject(QUERY_DATA,new BeanPropertyRowMapper<>(Course.class),id);
	}

}
