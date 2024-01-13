package com.app.pkg.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.app.pkg.entity.Quiz;

public interface QuizRepository extends JpaRepository<Quiz, Integer> {
    
}
