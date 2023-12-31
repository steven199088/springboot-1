package com.southwind.controller;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.southwind.entity.Student;
import com.southwind.repository.StudentRepository;

@RestController
@RequestMapping("/student")
public class StudentController {
	
	@Autowired
	private StudentRepository studentRepository;
	
	@GetMapping("/findAll")
	public Collection<Student> findAll(){
		return studentRepository.findAll(); 
	}
	
	@GetMapping("/findById/{id}")
	public Student findById(@PathVariable("id")Integer id) {
		return studentRepository.findById(id);
	}
	
	@PostMapping("/save")
	public void save(@RequestBody Student student) {
		studentRepository.save(student);
		
	}
	
	@PutMapping("/update")
	public void update(@RequestBody Student student) {
		studentRepository.update(student);
	}
	
	@DeleteMapping("/deleteById/{id}")
	public void deleteById(@PathVariable("id")Integer id) {
		studentRepository.deleteById(id);
	}
	
}
