package com.fatec.teste.db;

import java.util.List;
import java.util.Optional;

import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.repository.JpaRepository;

import com.fatec.teste.model.Pessoa;

public interface PessoaRepository extends JpaRepository<Pessoa, Long>{

	



}
