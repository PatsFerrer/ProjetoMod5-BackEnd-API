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

import com.destinocerto.model.Destino;
import com.destinocerto.repository.DestinoRepository;

@CrossOrigin(origins = "http://localhost:3000")

@RestController
@RequestMapping("destinos")
public class DestinoController {
	
	@Autowired
	DestinoRepository destinoRepository;
	
	@GetMapping
	public List<Destino> getAllDestinos(){
		return destinoRepository.findAll();
	}
	
	@GetMapping("/{id}")
	public Destino getDestinoById(@PathVariable Long id) {
		return destinoRepository.findById(id).get();
	}
	
	@PostMapping
	public Destino createDestino(@RequestBody Destino destino) {
		return destinoRepository.save(destino);
	}
	
	@PutMapping("/{id}")
	public Destino updateDestino(@PathVariable Long id, @RequestBody Destino destinoDetails) {
		Destino destino = destinoRepository.findById(id).get();
		
		destino.setNome(destinoDetails.getNome());
		destino.setDescricao(destinoDetails.getDescricao());
		destino.setImagem(destinoDetails.getImagem());
		destino.setValor(destinoDetails.getValor());
		
		return destinoRepository.save(destino);
	}
	
	@DeleteMapping("/{id}")
	public void deleteDestino(@PathVariable Long id) {
		destinoRepository.deleteById(id);
	}
	
	
	
	
	
	
	
	

}
