package com.hong.dao;

import java.util.List;

import com.hong.domain.Student;

public interface StudentDao {

	Student getStudentById(int id);
	List<Student> getAllStudent();
}
