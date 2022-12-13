
package com.miPrimeraApp.SpringBoot.service;

import com.miPrimeraApp.SpringBoot.model.Persona;
import java.util.List;


public interface IPersonaService {
    
    
    public List<Persona> verPersona();
    public void crearPersona(Persona pers);
    public void borrarPersona(Long id);
    public Persona buscarPersona(Long id);
    
}
