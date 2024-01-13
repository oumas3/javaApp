package com.app.pkg.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.app.pkg.entity.Option;

public interface OptionRepository extends JpaRepository<Option, Integer> {
    
   
}
