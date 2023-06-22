package com.southwind.repository;

import java.util.Collection;
import java.util.HashMap;
import org.springframework.stereotype.Repository;

import com.southwind.entity.Student;
//dao層

@Repository
public class StudentRepositoryImpl implements StudentRepository {

	private static HashMap<Integer,Student> studentMap;

	static {
		studentMap = new HashMap<>();
//		Student st = new Student();  正規寫法
//		st.setAge(33);
//		st.setId(1);
//		st.setName("力維");
		studentMap.put(1, new Student(1,"力維",33));
		studentMap.put(2, new Student(2,"瑞隆",33));
		studentMap.put(3, new Student(3,"禹祐",30));
		
	}
	
	@Override
	public Collection<Student> findAll() {
		return studentMap.values();
	}

	@Override
	public Student findById(Integer id) {
		return studentMap.get(id);
	}

	@Override
	public void save(Student student) {
		studentMap.put(student.getId(),student);
	}

	@Override
	public void update(Student student) {
		studentMap.put(student.getId(),student);
	}

	@Override
	public void deleteById(Integer id) {
		studentMap.remove(id);
	}

}
