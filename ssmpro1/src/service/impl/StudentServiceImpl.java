package service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import dao.StudentDao;
import entity.Student;
import service.StudentService;

@Service("studentService")
public class StudentServiceImpl implements StudentService {
	
	@Autowired
	private StudentDao dao;
	
	@Transactional
	@Override
	public void insertStudent(Student student) {
		
		dao.insertStudent(student);
		
	}
	
}
