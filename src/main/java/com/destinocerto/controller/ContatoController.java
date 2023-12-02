package com.destinocerto.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.destinocerto.model.Contato;
import com.destinocerto.repository.ContatoRepository;

@CrossOrigin(origins = "http://localhost:3000")

@RestController
@RequestMapping("contatos")
public class ContatoController {
	
	@Autowired
	public ContatoRepository contatoRepository;
	
	@GetMapping
	public List<Contato> getAllContatos(){
		return contatoRepository.findAll();
	}
	
	@GetMapping("/{id}")
	public Contato getContatoById(@PathVariable Long id) {
		return contatoRepository.findById(id).get();
	}
	
	@PostMapping
	public Contato createContato(@RequestBody Contato contato) {
		return contatoRepository.save(contato);
	}
	
	@PutMapping("/{id}")
	public Contato updateContato(@PathVariable Long id, @RequestBody Contato contatoDetails) {
		Contato contato = contatoRepository.findById(id).get();
		
		contato.setNome(contatoDetails.getNome());
		contato.setEmail(contatoDetails.getEmail());
		contato.setMensagem(contatoDetails.getMensagem());
		
		return contatoRepository.save(contato);
	}
	
	@DeleteMapping("/{id}")
	public void deleteContato(@PathVariable Long id) {
		contatoRepository.deleteById(id);
	}

}
