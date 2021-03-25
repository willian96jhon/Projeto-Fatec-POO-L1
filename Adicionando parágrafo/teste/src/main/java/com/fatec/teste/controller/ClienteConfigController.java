package com.fatec.teste.controller;

import java.time.LocalDate;
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
	
	/*@GetMapping("/listagemIdade")
	public ModelAndView idadeOrdenada() {
		int anos=0;
		
		ArrayList<Cliente> ordemIdades=new ArrayList<Cliente>();
		ModelAndView mv4=new ModelAndView("listaIdade2");
		List<Cliente> pessoa=pr.findAll();
		int idadesOrd[]=new int[pessoa.size()];
		
		//Adicionando as idades dentro da lista
		for(int i=0;i<pessoa.size();++i) {
			Cliente pi2=pessoa.get(i);
			idadesOrd[i]=pi2.getIdade();
		}
		
		//Colocando em ordem Crescente
		for(int i=0;i<idadesOrd.length;++i) {
			for(int j=0;j<idadesOrd.length-1;++j) {
				if(idadesOrd[j]<idadesOrd[j+1]) {
					int k=idadesOrd[j];
					idadesOrd[j]=idadesOrd[j+1];
					idadesOrd[j+1]=k;
				}}}
		
		//Adicionando os clientes no Array de acordo com as idades e no ModelAndView também
		
		for(int i=0;i<pessoa.size();++i) {
			
			for(int j=0;j<pessoa.size();++j) {
				Cliente pi2=pessoa.get(j);
				if(idadesOrd[i]==pi2.getIdade()) {
					ordemIdades.add(pi2);
					mv4.addObject("ordemIdades", ordemIdades);
				}
			}
			
			
		}
		return mv4;
		}*/
					
					
					
				
			
			
			
		
		
		
	
	
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
	
	
	@GetMapping("/config2")
	public ModelAndView listaF() {
		ArrayList<Cliente> mulheres=new ArrayList<Cliente>();
		ModelAndView mv2=new ModelAndView("listaM");
		List<Cliente> pessoa=pr.findAll();
		for(int i=0;i<pessoa.size();++i) {
			Cliente mm=pessoa.get(i);
			if(mm.getGenero().equals("Feminino")) {
				mulheres.add(mm);
				mv2.addObject("mulheres", mulheres);
				idade();
			}
		}
		
		
		return mv2;
	}
	
    
	
	
	
	@GetMapping("/config")
	public ModelAndView listaH() {
		ArrayList<Cliente> homens=new ArrayList<Cliente>();
		int a=0;
		ModelAndView mv= new ModelAndView("listaH");
		List<Cliente> pessoa = pr.findAll();
		for(int i=0;i<pessoa.size();++i) {
		Cliente hh = pessoa.get(i);
		if(hh.getGenero().equals("Masculino")) {
			a=1;
			
			homens.add(hh);
			
			mv.addObject("homens", homens);
			idade();
			
		}}
		
		
	
		
		
		return mv;
		

	
	}
	
	@GetMapping("/listagemIdade")
	public ModelAndView idadeOrdenada() {
		int anos=0;
		
		ArrayList<Cliente> ordemIdades=new ArrayList<Cliente>();
		ModelAndView mv4=new ModelAndView("listaIdade2");
		List<Cliente> pessoa=pr.findAll();
		int idadesOrd[]=new int[pessoa.size()];
		
		//Adicionando as idades dentro da lista
		for(int i=0;i<pessoa.size();++i) {
			Cliente pi2=pessoa.get(i);
			idade();
			idadesOrd[i]=pi2.getIdade();
		}
		
		//Colocando em ordem Crescente
		for(int i=0;i<idadesOrd.length;++i) {
			for(int j=0;j<idadesOrd.length-1;++j) {
				if(idadesOrd[j]<idadesOrd[j+1]) {
					int k=idadesOrd[j];
					idadesOrd[j]=idadesOrd[j+1];
					idadesOrd[j+1]=k;
				}}}
		
		//Adicionando os clientes no Array de acordo com as idades e no ModelAndView também
		
		for(int i=0;i<pessoa.size();++i) {
			
			for(int j=0;j<pessoa.size();++j) {
				Cliente pi2=pessoa.get(j);
				if(idadesOrd[i]==pi2.getIdade()) {
					ordemIdades.add(pi2);
					mv4.addObject("ordemIdades", ordemIdades);
				}
			}
			
			
		}
		return mv4;
		}
		
		
		
        
		
		
		
	
	
	
	

}
