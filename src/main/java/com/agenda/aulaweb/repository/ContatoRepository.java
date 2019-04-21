package com.agenda.aulaweb.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.agenda.aulaweb.model.Contato;

@Repository
public interface ContatoRepository extends JpaRepository<Contato, Long>{


	}
