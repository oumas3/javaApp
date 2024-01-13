package com.app.pkg.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestMapping;

import com.app.pkg.entity.Professor;
import com.app.pkg.repository.ProfessorRepository;

@Service

public class ProfessorService {
	@Autowired
	private ProfessorRepository repository;
	
	public Professor saveProfessor(Professor prof) {
		return repository.save(prof);
	}
    public List<Professor> getProfessors() {
        return repository.findAll();
    }

    public Professor getProfessorById(int id) {
        return repository.findById(id).orElse(null);
    }

   

    public String deleteProfessor(int id) {
        repository.deleteById(id);
        return "Professor removed !! " + id;
    }

    public Professor updateProfessor(Professor prof) {
    	Professor existingProf = repository.findById(prof.getId()).orElse(null);
        existingProf.setName(prof.getName());
       
        return repository.save(existingProf);
    }
}
