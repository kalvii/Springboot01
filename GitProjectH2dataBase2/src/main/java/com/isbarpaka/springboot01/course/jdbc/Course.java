package com.isbarpaka.springboot01.course.jdbc;

import org.springframework.stereotype.Component;

@Component
public class Course {
	private long id;
	private String name;
	private String Auther;
	
	
	
	
	public Course() {
		
	}
	
	public Course(long id, String name, String auther) {
		super();
		this.id = id;
		this.name = name;
		Auther = auther;
	}

	public long getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public String getAuther() {
		return Auther;
	}
	public void setId(long id) {
		this.id = id;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setAuther(String auther) {
		Auther = auther;
	}


	@Override
	public String toString() {
		return "Course [id=" + id + ", name=" + name + ", Auther=" + Auther + "]";
	}
	
	

}
