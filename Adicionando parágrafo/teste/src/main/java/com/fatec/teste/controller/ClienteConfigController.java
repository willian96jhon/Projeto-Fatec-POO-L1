package com.fatec.teste.controller;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

import com.fatec.teste.db.PessoaRepository;
import com.fatec.teste.model.Cliente;
import com.fatec.teste.model.Pessoa;
import com.fatec.teste.model.ServicosMasculinos;

@Controller
public class ClienteConfigController {
	@Autowired
	private PessoaRepository pr;
	
    
	
	
	
	@GetMapping("/config")
	public ModelAndView servicos() {
		ArrayList<Cliente> homens=new ArrayList<Cliente>();
		int a=0;
		ModelAndView mv= new ModelAndView("configuracoes");
		List<Cliente> pessoa = pr.findAll();
		for(int i=0;i<pessoa.size();++i) {
		Cliente hh = pessoa.get(i);
		if(hh.getGenero().equals("Masculino")) {
			a=1;
			
			homens.add(hh);
			
			mv.addObject("homens", homens);
			
		}}
		
		
	
		
		//if(a==1) {
		return mv;
		
	//	}
		//else {return null;}
	
	}
		
		
		
        
		
		
		
	
	
	
	

}
