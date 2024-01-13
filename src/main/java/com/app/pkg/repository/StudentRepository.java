package com.app.pkg.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.app.pkg.entity.Student;

public interface StudentRepository extends JpaRepository<Student, Integer> {
    Student findByName(String name);
   
}
