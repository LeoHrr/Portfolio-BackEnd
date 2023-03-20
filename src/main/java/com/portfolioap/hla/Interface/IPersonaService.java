package com.portfolioap.hla.Interface;

import com.portfolioap.hla.Entity.Persona;
import java.util.List;

/**
 *
 * @author Leo
 */
public interface IPersonaService {
    public List<Persona> getPersona();
    
    public void savePersona(Persona persona);
    
    public void deletePersona(Long id);
    
    public Persona findPersona(Long id);
    
}
