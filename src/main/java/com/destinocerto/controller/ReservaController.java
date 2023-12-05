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

import com.destinocerto.model.Reserva;
import com.destinocerto.repository.ReservaRepository;

@CrossOrigin(origins = "http://localhost:3000")

@RestController
@RequestMapping("reservas")
public class ReservaController {
	
	@Autowired
	public ReservaRepository reservaRepository;
	
	@GetMapping
	public List<Reserva> getAllReservas(){
		return reservaRepository.findAll();
	}
	
	@GetMapping("/{id}")
	public Reserva getReservaById(@PathVariable Long id) {
		return reservaRepository.findById(id).get();
	}
	
	@PostMapping
	public Reserva createReserva(@RequestBody Reserva reserva) {
		return reservaRepository.save(reserva);
	}
	
	@PutMapping("/{id}")
	public Reserva updateReserva(@PathVariable Long id, @RequestBody Reserva reservaDetails) {
		Reserva reserva = reservaRepository.findById(id).get();
		
		reserva.setCliente(reservaDetails.getCliente());
		reserva.setDestino(reservaDetails.getDestino());
		reserva.setData(reservaDetails.getData());
		
		return reservaRepository.save(reserva);
	}
	
	@DeleteMapping("/{id}")
	public void deleteReserva(@PathVariable Long id) {
		reservaRepository.deleteById(id);
	}

}
