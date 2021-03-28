package com.fatec.teste.controller;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.SortedSet;
import java.util.TreeSet;

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
		ArrayList<Cliente> pessoas= new ArrayList<Cliente>();
		ArrayList<Cliente> pessoas3= new ArrayList<Cliente>();

		ArrayList<Cliente> mulheres=new ArrayList<Cliente>();
		
		
		ModelAndView mv2=new ModelAndView("listaM");
		List<Cliente> pessoa=pr.findAll();
		for(int i=0;i<pessoa.size();++i) {
			Cliente mm=pessoa.get(i);
			if(mm.getGenero().equals("Feminino")) {
				pessoas.add(mm);
				
				//
				idade();
			}
			else {
				pessoas3.add(mm);
			}
				
			
		}
		String pess[]=new String[pessoas.size()];
		for(int i=0;i<pessoas.size();++i) {
			Cliente clienteF=pessoas.get(i);
			pess[i]=clienteF.getNome();
		}

		
		
		
		
		Arrays.sort(pess);
		for(int i=0;i<pessoas.size();++i) {
			for(int j=0;j<pessoas.size()-1;++j){
				if(pess[j].equals(pess[j+1])) {
					pess[j]="";
				}
			}
		}
	
		
		for(int i=0;i<pessoas.size();++i) {
			for(int j=0;j<pessoas.size();++j) {
				Cliente cl2=pessoas.get(j);
				if(cl2.getNome().equals(pess[i])) {
					mulheres.add(cl2);
					mv2.addObject("mulheres", mulheres);
					
					
				}
				
			}
			
			
			
		}
		
		

		
		
		return mv2;
	
	}
    
	
	
	
	@GetMapping("/config")
	public ModelAndView listaH() {
		ArrayList<Cliente> homens=new ArrayList<Cliente>();
		ArrayList<Cliente> pessoas= new ArrayList<Cliente>();
		int a=0;
		ModelAndView mv= new ModelAndView("listaH");
		List<Cliente> pessoa = pr.findAll();
		
		
		
		for(int i=0;i<pessoa.size();++i) {
		Cliente hh = pessoa.get(i);
		if(hh.getGenero().equals("Masculino")) {
			a=1;
			
			
			pessoas.add(hh);
			//mv.addObject("homens", homens);
			idade();
			
		}}
		
		String pess[]=new String[pessoas.size()];
		for(int i=0;i<pessoas.size();++i) {
			Cliente clienteF=pessoas.get(i);
			pess[i]=clienteF.getNome();
		}
		
		Arrays.sort(pess);
		for(int i=0;i<pessoas.size();++i) {
			for(int j=0;j<pessoas.size()-1;++j){
				if(pess[j].equals(pess[j+1])) {
					pess[j]="";
				}
			}
		}
		
		for(int i=0;i<pessoas.size();++i) {
			for(int j=0;j<pessoas.size();++j) {
				Cliente cl2=pessoas.get(j);
				if(cl2.getNome().equals(pess[i])) {
					homens.add(cl2);
					mv.addObject("homens", homens);
					
					
				}
				
			}
			
			
			
		}
		

		
		
	
		
		
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
