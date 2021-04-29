package com.fatec.beleza.beleza.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.fatec.beleza.beleza.model.Cliente;

public interface ClienteRepository extends JpaRepository<Cliente, Long> {

}
