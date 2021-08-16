package com.springrest.domain.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.springrest.domain.model.Entrega;

@Repository
public interface EntregaRepository extends JpaRepository<Entrega, Long> {

}
