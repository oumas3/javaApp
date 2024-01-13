package com.app.pkg.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.app.pkg.entity.Quiz;
import com.app.pkg.repository.QuizRepository;

@Service
public class QuizService {
    @Autowired
    private QuizRepository repository;

    public Quiz saveQuiz(Quiz quiz) {
        return repository.save(quiz);
    }

    public java.util.List<Quiz> getQuizzes() {
        return repository.findAll();
    }

    public Quiz getQuizById(int id) {
        return repository.findById(id).orElse(null);
    }

    public String deleteQuiz(int id) {
        repository.deleteById(id);
        return "Quiz removed !! " + id;
    }

    public Quiz updateQuiz(Quiz quiz) {
        Quiz existingQuiz = repository.findById(quiz.getId()).orElse(null);
        existingQuiz.setTitle(quiz.getTitle());

        return repository.save(existingQuiz);
    }
}
