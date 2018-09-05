package com.hong.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.hong.dao.StudentDao;
import com.hong.domain.Student;

@Service("studentService")
public class StudentService {

	@Autowired
	StudentDao studentDao;
	@Transactional(readOnly=true)
	public Student getStudentById(int id){
		return studentDao.getStudentById(id);
	}
}
