package com.fatec.teste.controller;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

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
	
    
    public void idade() {
		
		ArrayList<Cliente> idades=new ArrayList<Cliente>();
		ModelAndView mv3=new ModelAndView("listaIdade");
		List<Cliente> pessoa=pr.findAll();
		for(int i=0;i<pessoa.size();++i) {
			Cliente pi=pessoa.get(i);
			LocalDate aniversario=pi.getNascimento();
			LocalDate agora= LocalDate.now();
			int anoNascimento=aniversario.getYear();
			int ii=agora.getYear();
			int idade=ii-anoNascimento;
			pi.setIdade(idade);
		}
		
	}
	
	
    @GetMapping("/cadastrar")
	public String iniv() {
		return "cadastro";
	}

    
    @PostMapping("/cadastrar")
  	public String iniv(Cliente c, Telefone t) {
    	c.getTelefones().add(t);
    	
    	//c.getServM().add(sm);
    	//c.getServF().add(sf);
    	
    	pr.save(c);
    	
    	idade();
    	pr.save(c);
    	
  		return "cadastro";
  	}
    
    
   /* public String ida() {
    	List<Cliente> pessoa=pr.findAll();
    	for(int i=0;i<pessoa.size();++i) {
    		Cliente c1=pessoa.get(i);
    		idade();
    		pr.saveAll(c1);
    	}
    	
    	return "";
    }*/
}
