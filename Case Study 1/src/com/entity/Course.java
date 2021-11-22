package com.entity;

public class Course {
	int course_id;
	String course_name;
	String course_duration;
	int course_fees;
	public Course(int course_id, String course_name, String course_duration, int course_fees) {
		super();
		this.course_id = course_id;
		this.course_name = course_name;
		this.course_duration = course_duration;
		this.course_fees = course_fees;
	}
	 
 public Course() {
	// TODO Auto-generated constructor stub
}
}
