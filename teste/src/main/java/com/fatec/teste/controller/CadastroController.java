package com.fatec.teste.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import com.fatec.teste.db.PessoaRepository;
import com.fatec.teste.model.Pessoa;

@Controller
public class CadastroController {
	
	@Autowired
	private PessoaRepository pr;
	
    @GetMapping("/cadastrar")
	public String iniv() {
		return "cadastro";
	}

    
    @PostMapping("/cadastrar")
  	public String iniv(Pessoa p) {
    	pr.save(p);
    	
  		return "cadastro";
  	}
}
