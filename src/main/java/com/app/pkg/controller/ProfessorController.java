package com.app.pkg.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.app.pkg.entity.Professor;
import com.app.pkg.service.ProfessorService;

@RestController
@RequestMapping("/professor")
public class ProfessorController {

    @Autowired
    private ProfessorService service;

    @PostMapping("/add")
    public Professor addProfessor(@RequestBody Professor prof) {
        return service.saveProfessor(prof);
    }

    @GetMapping("/all")
    public List<Professor> findAllProfessors() {
        return service.getProfessors();
    }

    @GetMapping("/{id}")
    public Professor findProfessorById(@PathVariable int id) {
          return service.getProfessorById(id);

        
    }

    @PutMapping("/update")
    public Professor updateProfessor(@RequestBody Professor prof) {
        return service.updateProfessor(prof);
    }

    @DeleteMapping("/delete/{id}")
    public String deleteProfessor(@PathVariable int id) {
        return service.deleteProfessor(id);
    }
}
