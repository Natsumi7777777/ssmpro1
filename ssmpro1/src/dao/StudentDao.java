package dao;


import org.apache.ibatis.annotations.Insert;

import entity.Student;

public interface StudentDao {
	
	@Insert("insert into student(name,age) values(#{name},#{age})")
	public void insertStudent(Student student);

}
