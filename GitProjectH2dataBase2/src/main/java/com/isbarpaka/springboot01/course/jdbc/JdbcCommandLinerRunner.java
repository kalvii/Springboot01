package com.isbarpaka.springboot01.course.jdbc;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class JdbcCommandLinerRunner implements CommandLineRunner {
	@Autowired
	private CourseJdbcRepository courseRepos;

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		courseRepos.insert(new Course(1,"ReactJs","Kalvi"));
		courseRepos.insert(new Course(2,"MongoDB","Satya"));
		courseRepos.insert(new Course(3,"Spring","Kalvi"));
		courseRepos.deleteByid(1);
		System.out.println(courseRepos.showData(2));
		
		
	}

}
