
package com.miPrimeraApp.SpringBoot.repository;

import com.miPrimeraApp.SpringBoot.model.Persona;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface PersonaRepository extends JpaRepository <Persona, Long>{
        
}
