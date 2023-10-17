package com_map_many_to_many;

import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToMany;

@Entity
public class Project {
 
 @Id	
 private int pid;
 @Column(name="project_name")
 private String name;
 
 @ManyToMany(mappedBy="projects")//mapped by kiya to project_emp table nahi create hoga but mapped by nahi kiya to hoga
 
 private List<Emp> emps;
 
public Project() {
	super();
	
}

public Project(int pid, String name, List<Emp> emps) {
	super();
	this.pid = pid;
	this.name = name;
	this.emps = emps;
}

public int getPid() {
	return pid;
}

public void setPid(int pid) {
	this.pid = pid;
}

public String getName() {
	return name;
}

public void setName(String name) {
	this.name = name;
}

public List<Emp> getEmps() {
	return emps;
}

public void setEmps(List<Emp> emps) {
	this.emps = emps;
}

 
 
}
