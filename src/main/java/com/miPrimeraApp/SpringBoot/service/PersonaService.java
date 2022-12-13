
package com.miPrimeraApp.SpringBoot.service;

import com.miPrimeraApp.SpringBoot.model.Persona;
import com.miPrimeraApp.SpringBoot.repository.PersonaRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PersonaService implements IPersonaService{
    
    @Autowired
    public PersonaRepository persoRepo;

    @Override
    public List<Persona> verPersona() {
        return persoRepo.findAll();
    }

    @Override
    public void crearPersona(Persona pers) {
        persoRepo.save(pers);
        }

    @Override
    public void borrarPersona(Long id) {
        persoRepo.deleteById(id);
        }

    @Override
    public Persona buscarPersona(Long id) {
        return persoRepo.findById(id).orElse(null);
    }
    
}
