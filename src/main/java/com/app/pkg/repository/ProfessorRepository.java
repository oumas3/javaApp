package com.app.pkg.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.app.pkg.entity.Professor;

public interface ProfessorRepository extends JpaRepository<Professor,Integer> {
    Professor findByName(String name);

}
