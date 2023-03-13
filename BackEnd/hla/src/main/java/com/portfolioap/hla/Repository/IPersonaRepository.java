package com.portfolioap.hla.Repository;

import com.portfolioap.hla.Entity.Persona;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 *
 * @author Leo
 */
@Repository
public interface IPersonaRepository extends JpaRepository<Persona,Long> {

}
