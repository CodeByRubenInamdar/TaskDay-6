package com.demo.CURD.repository;



import org.springframework.data.jpa.repository.JpaRepository;
import com.demo.CURD.entity.Student;

public interface StudentRepository extends JpaRepository<Student, Long> {

}
