package com.destinocerto.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.destinocerto.model.Cliente;

public interface ClienteRepository extends JpaRepository<Cliente, Long> {

}
