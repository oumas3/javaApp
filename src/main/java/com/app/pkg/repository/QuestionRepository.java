package com.app.pkg.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.app.pkg.entity.Question;



public interface QuestionRepository extends JpaRepository<Question, Integer>{
 

}
