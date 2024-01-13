package com.app.pkg.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.app.pkg.entity.Option;
import com.app.pkg.service.OptionService;


@RestController
@RequestMapping("/option")
public class OptionController {

    @Autowired
    private OptionService service;

    @PostMapping("/add")
    public Option addOption(@RequestBody Option option) {
        return service.saveOption(option);
    }

    @GetMapping("/all")
    public List<Option> findAllOptions() {
        return service.getOptions();
    }

    @GetMapping("/{id}")
    public Option findOptionById(@PathVariable int id) {
        return service.getOptionById(id);
    }

    @DeleteMapping("/delete/{id}")
    public String deleteOption(@PathVariable int id) {
        return service.deleteOption(id);
    }

    @PutMapping("/update")
    public Option updateOption(@RequestBody Option option) {
        return service.updateOption(option);
    }
}
