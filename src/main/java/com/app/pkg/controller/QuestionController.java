package com.app.pkg.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.app.pkg.entity.Question;
import com.app.pkg.service.QuestionService;

@RestController
public class QuestionController {

    @Autowired
    private QuestionService service;

    @PostMapping("/question/add")
    public Question addQuestion(@RequestBody Question question) {
        return service.saveQuestion(question);
    }

    @GetMapping("/questions")
    public List<Question> findAllQuestions() {
        return service.getQuestions();
    }

    @GetMapping("/question/{id}")
    public Question findQuestionById(@PathVariable int id) {
        return service.getQuestionById(id);
    }

    @DeleteMapping("/question/delete/{id}")
    public String deleteQuestion(@PathVariable int id) {
        return service.deleteQuestion(id);
    }

    @PutMapping("/question/update")
    public Question updateQuestion(@RequestBody Question question) {
        return service.updateQuestion(question);
    }
}
