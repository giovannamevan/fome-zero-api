package com.fomezero.api.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.fomezero.api.entities.OngEntity;

@Repository
public interface CadastroOngRepository extends JpaRepository<OngEntity, Long> {

}
