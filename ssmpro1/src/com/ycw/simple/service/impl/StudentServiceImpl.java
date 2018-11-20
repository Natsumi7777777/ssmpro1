package com.ycw.simple.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.ycw.simple.dao.StudentDao;
import com.ycw.simple.entity.Student;
import com.ycw.simple.service.StudentService;

@Service("studentService")
public class StudentServiceImpl implements StudentService {
	
	@Autowired
	private StudentDao dao;
	
	@Transactional
	@Override
	public void insertStudent(Student student) {
		
		int i = 9;
		
		dao.insertStudent(student);
		
	}
	
}
