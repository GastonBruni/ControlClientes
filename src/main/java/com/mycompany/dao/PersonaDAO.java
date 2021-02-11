package com.mycompany.dao;

import com.mycompany.domain.Persona;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PersonaDAO extends JpaRepository<Persona, Long>{
    
}
