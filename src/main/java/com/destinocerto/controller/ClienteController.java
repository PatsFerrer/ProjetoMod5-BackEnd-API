package com.destinocerto.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.destinocerto.model.Cliente;
import com.destinocerto.repository.ClienteRepository;

// @CrossOrigin(origins = "http://localhost:3000")

@RestController
public class ClienteController {

	@Autowired
	public ClienteRepository clienteRepository;

	// get all clients, busca no banco
	@GetMapping("/clientes")
	public List<Cliente> getAllClients() {
		return clienteRepository.findAll();
	}

	// get client by id Rest API
	@GetMapping("/clientes/{id}")
	public Cliente getClienteById(@PathVariable Long id) {
		return clienteRepository.findById(id).get();
	}

	// create cliente Rest API
	@PostMapping("/clientes")
	public Cliente createCliente(@RequestBody Cliente cliente) {
		return clienteRepository.save(cliente);
	}

	// update client rest api
	@PutMapping("/clientes/{id}")
	public Cliente updateCliente(@PathVariable Long id, @RequestBody Cliente clienteDetails) {
		Cliente cliente = clienteRepository.findById(id).get();

		cliente.setNome(clienteDetails.getNome());
		cliente.setEmail(clienteDetails.getEmail());
		cliente.setCpf(clienteDetails.getCpf());
		cliente.setDataNascimento(clienteDetails.getDataNascimento());
		cliente.setSenha(clienteDetails.getSenha());
		cliente.setTelefone(clienteDetails.getTelefone());

		return clienteRepository.save(cliente);
	}

	// delete client rest api
	@DeleteMapping("/clientes/{id}")
	public void deleteCliente(@PathVariable Long id) {
		clienteRepository.deleteById(id);
	}

}
