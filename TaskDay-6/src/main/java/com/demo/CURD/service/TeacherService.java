package com.demo.CURD.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.demo.CURD.entity.Student;
import com.demo.CURD.entity.Teacher;
import com.demo.CURD.repository.TeacherRepository;

@Service
public class TeacherService {
	private TeacherRepository teacherRepository;

	public List<Teacher> getallTeachers() {
		return teacherRepository.findAll();
	}

	public Teacher saveTeacher(Teacher teacher) {
		return teacherRepository.save(teacher);
	}

	public Teacher updateTeacher(Long id, Teacher teacher) {
		teacher.setId(id);
		return teacherRepository.save(teacher);
	}

	public void deleteTeacher(Long id) {
		teacherRepository.deleteById(id);
	}

	public Teacher getTeacherBy(Long id) {
		return teacherRepository.findById(id).orElse(null);
	}

}
