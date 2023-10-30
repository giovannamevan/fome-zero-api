package com.fomezero.api.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.fomezero.api.entities.DoadorEntity;

@Repository
public interface CadastroDoadorRepository extends JpaRepository<DoadorEntity, Long> {

}
