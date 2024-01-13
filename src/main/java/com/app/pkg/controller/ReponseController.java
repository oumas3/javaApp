package com.app.pkg.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.app.pkg.entity.Reponse;
import com.app.pkg.service.ReponseService;

@RestController
@RequestMapping("/reponse")
public class ReponseController {

    @Autowired
    private ReponseService service;

    @PostMapping("/add")
    public Reponse addReponse(@RequestBody Reponse reponse) {
        return service.saveReponse(reponse);
    }

    @GetMapping("/all")
    public List<Reponse> findAllReponses() {
        return service.getReponses();
    }

    @GetMapping("/{id}")
    public Reponse findReponseById(@PathVariable int id) {
        return service.getReponseById(id);
    }

    @DeleteMapping("/delete/{id}")
    public String deleteReponse(@PathVariable int id) {
        return service.deleteReponse(id);
    }

    @PutMapping("/update")
    public Reponse updateReponse(@RequestBody Reponse reponse) {
        return service.updateReponse(reponse);
    }
}
