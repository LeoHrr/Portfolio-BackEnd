
package com.PortfolioAP.lah.Interface;

import com.PortfolioAP.lah.Entity.Persona;
import java.util.List;

/**
 *
 * @author Leo
 */
public interface IPersonaService {
    public List<Persona> getPersona();
    
    public void savePersona(Persona persona);
    
    public void deletePersona(int id);
    
    public Persona findPersona(int id);
}
