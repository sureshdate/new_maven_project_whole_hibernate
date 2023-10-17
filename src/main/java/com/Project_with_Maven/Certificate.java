package com.Project_with_Maven;

import jakarta.persistence.Embeddable;

@Embeddable //if u want to add this field into student table then use @embeddable
public class Certificate {
	private String course;
	private String duration;
	
	
	
	
	public Certificate() {
		super();
		// TODO Auto-generated constructor stub
	}

   public Certificate(String course, String duration) {
		super();
		this.course = course;
		this.duration = duration;
	}

public String getCourse() {
	return course;
}

public void setCourse(String course) {
	this.course = course;
}

public String getDuration() {
	return duration;
}

public void setDuration(String duration) {
	this.duration = duration;
}
    
   
}
