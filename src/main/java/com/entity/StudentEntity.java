package com.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name ="student_entity")
public class StudentEntity 
{
	@Id
	@GeneratedValue
	private Integer sid;
	
	@Column(name = "s_name")
	private String name;
	
	@Column(name = "s_email")
	private String email;
	
	@Column(name = "s_gender")
	private String gender;
	
	@Column(name = "s_course")
	private String course;
	
	@Column(name = "s_timings")
	private String timings;

	public StudentEntity()
	{
		
	}
	public Integer getSid() {
		return sid;
	}

	public void setSid(Integer sid) {
		this.sid = sid;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getCourse() {
		return course;
	}

	public void setCourse(String course) {
		this.course = course;
	}

	public String getTimings() {
		return timings;
	}

	public void setTimings(String timings) {
		this.timings = timings;
	}

	@Override
	public String toString() {
		return "StudentEntity [sid=" + sid + ", name=" + name + ", email=" + email + ", gender=" + gender + ", course="
				+ course + ", timings=" + timings + "]";
	}
	
	
	

}
