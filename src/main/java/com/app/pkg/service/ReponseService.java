package com.app.pkg.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.app.pkg.entity.Reponse;
import com.app.pkg.repository.ReponseRepository;

@Service
public class ReponseService {
    @Autowired
    private ReponseRepository repository;

    public Reponse saveReponse(Reponse reponse) {
        return repository.save(reponse);
    }

    public java.util.List<Reponse> getReponses() {
        return repository.findAll();
    }

    public Reponse getReponseById(int id) {
        return repository.findById(id).orElse(null);
    }

    public String deleteReponse(int id) {
        repository.deleteById(id);
        return "Reponse removed !! " + id;
    }

    public Reponse updateReponse(Reponse reponse) {
        Reponse existingReponse = repository.findById(reponse.getId()).orElse(null);
        // Update other fields as needed

        return repository.save(existingReponse);
    }
}
