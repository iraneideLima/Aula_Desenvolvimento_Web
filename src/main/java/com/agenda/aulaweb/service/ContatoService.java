package com.agenda.aulaweb.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;

import com.agenda.aulaweb.model.Contato;
import com.agenda.aulaweb.repository.ContatoRepository;

@Service
public class ContatoService {
	@Autowired
	private ContatoRepository contatoRepository;
	
	public void salvarContato(Contato contato) {
		contatoRepository.save(contato);
	}
	
	public ResponseEntity<Contato> buscarContatoById(@PathVariable("id") Contato contato){
		return new ResponseEntity<Contato>(contato, HttpStatus.OK);
	}
	public void excluirContato(Long id) {
		contatoRepository.deleteById(id);
	}
}
