package com.southwind.repository;

import java.util.Collection;


import com.southwind.entity.Student;

public interface StudentRepository {

	public Collection<Student> findAll();
	public Student findById(Integer id);
	public void save(Student student);
	public void update(Student student);
	public void deleteById(Integer id);
	
	
}
