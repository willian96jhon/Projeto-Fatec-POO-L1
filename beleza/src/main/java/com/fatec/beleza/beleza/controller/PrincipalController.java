package com.fatec.beleza.beleza.controller;

import java.time.LocalDate;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.Errors;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.fatec.beleza.beleza.model.Cliente;
import com.fatec.beleza.beleza.model.Servicos;
import com.fatec.beleza.beleza.model.Telefone;
import com.fatec.beleza.beleza.repository.ClienteRepository;
import com.fatec.beleza.beleza.repository.ServicosRepository;

@Controller
@RequestMapping("inicio")
public class PrincipalController {
	
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
			System.out.println(idade2);
		}
	}
	
	@Autowired
	ClienteRepository cr;
	
	@Autowired
	ServicosRepository sr;
	
	@RequestMapping
	public ModelAndView inicio() {
		ModelAndView mv=new ModelAndView("index");
		mv.addObject(new Cliente());
		
		return mv;
	}
	
	@RequestMapping(method=RequestMethod.POST)
	public ModelAndView salvar(@Validated Cliente cl, Telefone t, Errors errors) {
		if(errors.hasErrors()) {
			System.out.println("Erro");
			ModelAndView mv=new ModelAndView("index");

			return mv;
		}
		
		cl.getTelefones().add(t);
		
		ModelAndView mv=new ModelAndView("index");
		cr.save(cl);
		idade();
		cr.save(cl);
		
		mv.addObject("mensagem", "Titulo salvo com sucesso!");

		
		return mv;
	}
	
	
	
	@RequestMapping("/listagem")
	public ModelAndView listar() {
		List<Cliente> clientes= cr.findAll();
		
		ModelAndView mv=new ModelAndView("listar");
		mv.addObject("clientes", clientes);
		return mv;
	}
	
	
	
	@RequestMapping("/listagem/{idCliente}")
	public ModelAndView editar(@PathVariable ("idCliente") Long id) {
		Cliente cl= cr.getOne(id);
		ModelAndView mv= new ModelAndView("index");
		mv.addObject(cl);
		idade();
		return mv;
	}
	
	
	@RequestMapping(value="/listagem/{codigo}", method= RequestMethod.DELETE)
	public String excluir(@PathVariable  Long codigo) {
		cr.deleteById(codigo);
		System.out.println("Excuir");
		
		return "redirect:/inicio/listagem";
	}
	
	
	long idClient=-1;
	@RequestMapping(value="/adicionarServicos/{idCliente}", method=RequestMethod.GET)
	public ModelAndView getAddServico(@PathVariable("idCliente") Long idCli) {
		ModelAndView mv= new ModelAndView("addServicos");
		Cliente cliente= cr.getOne(idCli);
		idClient=cliente.getIdCliente();
		
		List<Servicos> servicos=cliente.getServicos();
		mv.addObject("servicos", servicos);
		return mv;
	}
	
	
	@RequestMapping(value="/adicionarServicos", method=RequestMethod.POST)
	public String addServico(Servicos servicos) {
		Cliente cliente=cr.getOne(idClient);
		sr.save(servicos);
		cliente.getServicos().add(servicos);
		cr.save(cliente);
		
		idClient=-1;
        		
		return "redirect:/inicio";
	}
	
	  
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
