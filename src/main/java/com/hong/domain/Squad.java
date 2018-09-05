package com.hong.domain;

import java.util.List;

public class Squad {
/*
 * `id` int(11) NOT NULL AUTO_INCREMENT,
  `sqName` varchar(32) DEFAULT NULL,
 */
	private int id;
	private String sqName;
	private List<Student> students;
	public Squad() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Squad(int id, String sqName) {
		super();
		this.id = id;
		this.sqName = sqName;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getSqName() {
		return sqName;
	}
	public void setSqName(String sqName) {
		this.sqName = sqName;
	}
	public List<Student> getStudents() {
		return students;
	}
	public void setStudents(List<Student> students) {
		this.students = students;
	}
	
}
