package com_map_many_to_many;

import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;



@Entity
public class Emp {
	@Id
	private int eid;
	private String name;
	
	@ManyToMany//if i use @joinTable or @JoinColumn then we cannot use mapped by.
	@JoinTable
	(name="emp_learn",
	 joinColumns = {@JoinColumn(name="eid")},
	 inverseJoinColumns= {@JoinColumn(name="pid")}
	)
	
	private List<Project> projects;
	
	public Emp() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Emp(int eid, String name, List<Project> projects) {
		super();
		this.eid = eid;
		this.name = name;
		this.projects = projects;
	}

	public int getEid() {
		return eid;
	}

	public void setEid(int eid) {
		this.eid = eid;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<Project> getProjects() {
		return projects;
	}

	public void setProjects(List<Project> projects) {
		this.projects = projects;
	}
	
	
	
	
	

}
