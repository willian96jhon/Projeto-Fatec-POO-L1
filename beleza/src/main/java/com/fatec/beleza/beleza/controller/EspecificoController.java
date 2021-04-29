package com.fatec.beleza.beleza.controller;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.fatec.beleza.beleza.model.Cliente;
import com.fatec.beleza.beleza.model.IdadesServicos;
import com.fatec.beleza.beleza.repository.ClienteRepository;
import com.fatec.beleza.beleza.repository.IdadesRepository;


@Controller
public class EspecificoController {
	public void idade() {
		List<Cliente> pessoa=cr.findAll();
		for(int i=0;i<pessoa.size();++i) {
			Cliente pi=pessoa.get(i);
			Date aniversario=pi.getDataNascimento();
			@SuppressWarnings("deprecation")
			int idade=aniversario.getYear();
		    LocalDate dataAtual= LocalDate.now();
			int anoAtual= dataAtual.getYear();
			int idade2=anoAtual-idade;
			pi.setIdade(idade2-1900);
			System.out.println(idade);
		}
	}
	
	
	
	@Autowired
	ClienteRepository cr;
	
	@Autowired
	IdadesRepository ir;
	//Methods
	
	
	//Controllers
	@RequestMapping("inicio/listarTudo")
	public ModelAndView listarEspecifico() {
		List<Cliente> pessoa=cr.findAll();
		ArrayList<Integer> todasIdades=new ArrayList<Integer>();
		ArrayList<Integer> IdadesM=new ArrayList<Integer>();
		ArrayList<Integer> IdadesF=new ArrayList<Integer>();
		IdadesServicos media=new IdadesServicos();


		for(int i=0;i<pessoa.size();++i) {
			Cliente cl=pessoa.get(i);
			todasIdades.add(cl.getIdade());
			
			
			if(cl.getGenero().equals("Masculino")) {
				IdadesM.add(cl.getIdade());
			}else {
				IdadesF.add(cl.getIdade());
			}
		}
		
		
		
		
		int soma=0;
		for(int i=0;i<pessoa.size();++i) {
			soma=todasIdades.get(i)+soma;
		}
		
		int mediaTodasIdades=soma/todasIdades.size();
		IdadesServicos is=new IdadesServicos();
		is.setMedia(mediaTodasIdades);
		
		soma=0;
		for(int i=0;i<IdadesM.size();++i) {
			soma=IdadesM.get(i)+soma;
		}
		int mediaHomens= soma/IdadesM.size();
		is.setMediaH(mediaHomens);
		
		soma=0;
		for(int i=0;i<IdadesF.size();++i) {
			soma=IdadesF.get(i)+soma;
		}
		
		int mediaFeminina= soma/IdadesF.size();
		is.setMediaM(mediaFeminina);
		

		ModelAndView mv=new ModelAndView("listarEspecifico");
		ir.save(media);
		mv.addObject(is);
		return mv;
	}
	
	
	
	@RequestMapping("inicio/listarMulher")
	public ModelAndView listarH() {
		ArrayList<Cliente> pessoas= new ArrayList<Cliente>();
		ArrayList<Cliente> pessoas3= new ArrayList<Cliente>();

		ArrayList<Cliente> mulheres=new ArrayList<Cliente>();
		
		
		ModelAndView mv2=new ModelAndView("listarM");
		List<Cliente> pessoa=cr.findAll();
		for(int i=0;i<pessoa.size();++i) {
			Cliente mm=pessoa.get(i);
			if(mm.getGenero().equals("Feminino")) {
				pessoas.add(mm);
				idade();
				
				//
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
		
		
		
	
	@RequestMapping("/inicio/ListarHomem")
	public ModelAndView listarM() {
		ArrayList<Cliente> homens=new ArrayList<Cliente>();
		ArrayList<Cliente> pessoas= new ArrayList<Cliente>();
		ModelAndView mv= new ModelAndView("listarH");
		List<Cliente> pessoa = cr.findAll();
		
		
		
		for(int i=0;i<pessoa.size();++i) {
		Cliente hh = pessoa.get(i);
		if(hh.getGenero().equals("Masculino")) {
			
			
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

}
