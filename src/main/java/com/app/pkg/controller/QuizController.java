package com.app.pkg.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.app.pkg.entity.Quiz;
import com.app.pkg.service.QuizService;

@RestController
public class QuizController {

    @Autowired
    private QuizService service;

    @PostMapping("/quiz/add")
    public Quiz addQuiz(@RequestBody Quiz quiz) {
        return service.saveQuiz(quiz);
    }

    @GetMapping("/quizzes")
    public List<Quiz> findAllQuizzes() {
        return service.getQuizzes();
    }

    @GetMapping("/quiz/{id}")
    public Quiz findQuizById(@PathVariable int id) {
        return service.getQuizById(id);
    }

    @DeleteMapping("/quiz/delete/{id}")
    public String deleteQuiz(@PathVariable int id) {
        return service.deleteQuiz(id);
    }

    @PutMapping("/quiz/update")
    public Quiz updateQuiz(@RequestBody Quiz quiz) {
        return service.updateQuiz(quiz);
    }
}
