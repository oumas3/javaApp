package com.app.pkg.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.app.pkg.entity.Question;
import com.app.pkg.repository.QuestionRepository;

@Service
public class QuestionService {
    @Autowired
    private QuestionRepository repository;

    public Question saveQuestion(Question question) {
        return repository.save(question);
    }

    public java.util.List<Question> getQuestions() {
        return repository.findAll();
    }

    public Question getQuestionById(int id) {
        return repository.findById(id).orElse(null);
    }

    public String deleteQuestion(int id) {
        repository.deleteById(id);
        return "Question removed !! " + id;
    }

    public Question updateQuestion(Question question) {
        Question existingQuestion = repository.findById(question.getId()).orElse(null);
        existingQuestion.setText(question.getText());

        return repository.save(existingQuestion);
    }
}
