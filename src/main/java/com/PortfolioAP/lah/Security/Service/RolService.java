package com.PortfolioAP.lah.Security.Service;

import com.PortfolioAP.lah.Security.Entity.Rol;
import com.PortfolioAP.lah.Security.Enums.RolNombre;
import com.PortfolioAP.lah.Security.Repository.iRolRepository;
import java.util.Optional;
import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author Leo
 */
@Service
@Transactional
public class RolService {
    @Autowired
    iRolRepository irolRepository;
    
    public Optional<Rol> getByRolNombre(RolNombre rolNombre){
        return irolRepository.findByRolNombre(rolNombre);
    }
    
    public void save(Rol rol){
        irolRepository.save(rol);
    }
}
