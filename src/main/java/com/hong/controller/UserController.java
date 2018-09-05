package com.hong.controller;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.hong.domain.Student;
import com.hong.service.StudentService;

@Controller("userController")
@RequestMapping("/User")
public class UserController {

	@Resource(name="studentService")
	StudentService studentService;
	
	@RequestMapping("/login")
	public String login(String name, String pass){
		System.out.println("name#pass:"+name+","+pass);
		Student student = studentService.getStudentById(1);
		System.out.println("student:"+student);
		return "success";
	}
	
}
