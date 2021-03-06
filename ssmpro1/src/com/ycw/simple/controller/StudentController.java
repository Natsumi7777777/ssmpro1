package com.ycw.simple.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.ycw.simple.entity.Student;
import com.ycw.simple.service.StudentService;

@Controller
public class StudentController{
	
	@Autowired
	private StudentService service;
	
	public void setService(StudentService service){
		this.service=service;
	}

	@RequestMapping("/reqister")
	public String doReqister(String name,int age){
		Student student = new Student(name,age);
		service.insertStudent(student);
		return "welcome";
	}
	
}
