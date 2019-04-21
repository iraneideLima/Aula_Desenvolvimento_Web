package com.agenda.aulaweb.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.agenda.aulaweb.model.Contato;
import com.agenda.aulaweb.service.ContatoService;

@RestController
@RequestMapping("/contato")
public class ContatoController {
	@Autowired
	private ContatoService contatoService;
	
	
	@PostMapping
	public ResponseEntity<Contato> salvar(@RequestBody Contato contato){
		contatoService.salvarContato(contato);
		return new ResponseEntity<>(HttpStatus.OK);
	}
	@GetMapping("/bucar/{id")
	public ResponseEntity<Contato> buscarPorId(@PathVariable("id") Contato contato){
		return new ResponseEntity<Contato>(contato, HttpStatus.OK);
	}
	@DeleteMapping("/id")
	public ResponseEntity<?> excluirContato(@PathVariable("id") Contato contato){
		contatoService.excluirContato(contato.getId());
		return new ResponseEntity<>(HttpStatus.OK); 
	}
	
	
	
}
