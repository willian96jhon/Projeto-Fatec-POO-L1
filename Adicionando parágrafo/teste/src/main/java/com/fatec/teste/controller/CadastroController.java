package com.fatec.teste.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import com.fatec.teste.db.PessoaRepository;
import com.fatec.teste.model.Cliente;
import com.fatec.teste.model.Pessoa;
import com.fatec.teste.model.ServicosFemininos;
import com.fatec.teste.model.ServicosMasculinos;
import com.fatec.teste.model.Telefone;

@Controller
public class CadastroController {
	
	@Autowired
	private PessoaRepository pr;
	
    @GetMapping("/cadastrar")
	public String iniv() {
		return "cadastro";
	}

    
    @PostMapping("/cadastrar")
  	public String iniv(Cliente c, Telefone t, ServicosFemininos sf, ServicosMasculinos sm) {
    	c.getTelefones().add(t);
    	c.getServMulher().add(sf);
    	c.getServHomem().add(sm);
    	
    	//Condicionais Femininos
    	if(sf.getServicos().equals("Design")){
    		sf.addDesignCejas();
    	}
    	
    	if(sf.getServicos().equals("Maanutenção de Cabelos")) {
    		sf.addManutCabelo();
    	}
    	
    	if(sf.getServicos().equals("Serviços de Pele")) {
    		sf.addServicosPele();
    	}
    	
    	if(sf.getServicos().equals("Botox")) {
    		sf.addBotox();
    	}
    	
    	if(sf.getServicos().equals("Emagrecimento") || sf.getServicos().equals("Redução de Medidas")) {
    		sf.addCorporal();
    	}
    	//Condicionais Masculinos
    	
    	if(sm.getServicosMasculinos().equals("Corte de Cabelo")) {
    		sm.addCorteCabelo();
    	}
    	
    	if(sm.getServicosMasculinos().equals("Modelagem de Barba")) {
    		sm.addModelagemBarba();
    	}
    	
    	if(sm.getServicosMasculinos().equals("Tratamento de Quedas")) {
    		sm.addTratamentoQuedas();
    	}
    	pr.save(c);
    	
    	System.out.println(c.getGenero() + c.getNascimento() );
  		return "cadastro";
  	}
}
