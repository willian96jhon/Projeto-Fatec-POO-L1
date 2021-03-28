package com.fatec.teste.controller;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

import com.fatec.teste.db.PessoaRepository;
import com.fatec.teste.model.Cliente;
import com.fatec.teste.model.Pessoa;

@Controller
public class ListaController {
	@Autowired
	private PessoaRepository pr;
	
	



	@GetMapping("/listar-clientes")
	public ModelAndView listarPessoas() {
		ArrayList<Cliente> pessoas= new ArrayList<Cliente>();
        
		ArrayList<Cliente> client= new ArrayList<Cliente>();
		//ArrayList<String> pess=new ArrayList<String>();
		
		//ArrayList<String> pess2=new ArrayList<String>();
		

		List<Cliente> pessoas2 = pr.findAll();
		String pess[]=new String[pessoas2.size()];
		long pess2[]=new long[pessoas2.size()];
		ModelAndView mv= new ModelAndView("listar");
		
		for(int i=0;i<pessoas2.size();++i) {
			Cliente cl=pessoas2.get(i);
			pess[i]=cl.getNome();
			pess2[i]=cl.getId();
			client.add(cl);
		}
		//comparando
		Arrays.sort(pess);
		for(int i=0;i<pessoas2.size();++i) {
			for(int j=0;j<pessoas2.size()-1;++j){
				if(pess[j].equals(pess[j+1])) {
					pess[j]="";
				}
			}
		}
		
		
		
		for(int i=0;i<pessoas2.size();++i) {
			for(int j=0;j<client.size();++j) {
				Cliente cl2=client.get(j);
				if(cl2.getNome().equals(pess[i])) {
					pessoas.add(cl2);
					mv.addObject("pessoas", pessoas);
					
					
				}
				
			}
			
			
			
		}
		
		
		
		//mv.addObject("pessoas",pessoas);
		return mv;
	}
}
