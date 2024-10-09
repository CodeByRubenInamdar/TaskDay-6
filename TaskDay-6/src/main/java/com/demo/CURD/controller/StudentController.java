package com.demo.CURD.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.demo.CURD.entity.Student;
import com.demo.CURD.service.StudentService;

@RestController
@RequestMapping("api/students")
public class StudentController {
	@Autowired
	private StudentService studentService;

	@GetMapping
	List<Student> getAllStudents() {
		return studentService.getallStudents();
	}

	@GetMapping("/{id}")
	public Student getStudentById(@PathVariable Long id) {
		return studentService.getStudentBy(id);
	}

	@PutMapping
	public Student createStudent(@RequestBody Student student) {
		return studentService.saveStudent(student);
	}

	public Student updateStudent(@PathVariable Long id, @RequestBody Student student) {
		return studentService.updateStudent(id, student);
	}

	@DeleteMapping("/{id}")
	public void deleteStudent(@PathVariable Long id) {
		studentService.deleteStudent(id);
	}
}
