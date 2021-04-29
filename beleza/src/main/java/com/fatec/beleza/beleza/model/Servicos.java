package com.fatec.beleza.beleza.model;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Servicos {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long idServico;
	
	@Column
	private String servico;
	
	private String servicoF;
	
	//Getters and Seters

	public Long getIdServico() {
		return idServico;
	}

	public void setIdServico(Long idServico) {
		this.idServico = idServico;
	}

	public String getServico() {
		return servico;
	}

	public void setServico(String servico) {
		this.servico = servico;
	}

	public String getServicoF() {
		return servicoF;
	}

	public void setServicoF(String servicoF) {
		this.servicoF = servicoF;
	}

   
	
	
	

}
