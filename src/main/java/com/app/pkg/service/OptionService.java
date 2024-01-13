package com.app.pkg.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.app.pkg.entity.Option;
import com.app.pkg.repository.OptionRepository;

@Service
public class OptionService {
    @Autowired
    private OptionRepository repository;

    public Option saveOption(Option option) {
        return repository.save(option);
    }

    public java.util.List<Option> getOptions() {
        return repository.findAll();
    }

    public Option getOptionById(int id) {
        return repository.findById(id).orElse(null);
    }

    public String deleteOption(int id) {
        repository.deleteById(id);
        return "Option removed !! " + id;
    }

    public Option updateOption(Option option) {
        Option existingOption = repository.findById(option.getId()).orElse(null);
        existingOption.setText(option.getText());
        existingOption.setCorrect(option.isCorrect());

        return repository.save(existingOption);
    }
}
