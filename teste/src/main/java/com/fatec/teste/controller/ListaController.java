package com.fatec.teste.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

import com.fatec.teste.db.PessoaRepository;
import com.fatec.teste.model.Pessoa;

@Controller
public class ListaController {
	@Autowired
	private PessoaRepository pr;

	@GetMapping("/listar-clientes")
	public ModelAndView listarPessoas() {
		List<Pessoa> pessoas = pr.findAll();
		ModelAndView mv= new ModelAndView("listar");
		
		mv.addObject("pessoas",pessoas);
		return mv;
	}
}
