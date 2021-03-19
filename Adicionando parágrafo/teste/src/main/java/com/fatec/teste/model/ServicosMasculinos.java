package com.fatec.teste.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class ServicosMasculinos {
	
	private String servicosMasculinos;
	
	
	@Id()
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long idServicosM;
	
	@Column(nullable = false, unique= false)
	private int corteCabelo=0;
	
	@Column(nullable = false, unique= false)
	private int modelagemBarba=0;
	
	@Column(nullable = false, unique= false)
	private int tratamentoQuedas=0;
	
	//Getters e Setters

	public String getServicosMasculinos() {
		return servicosMasculinos;
	}

	public void setServicosMasculinos(String servicosMasculinos) {
		this.servicosMasculinos = servicosMasculinos;
	}

	public long getIdServicosM() {
		return idServicosM;
	}

	public void setIdServicosM(long idServicosM) {
		this.idServicosM = idServicosM;
	}

	public int getCorteCabelo() {
		return corteCabelo;
	}

	public void setCorteCabelo(int corteCabelo) {
		this.corteCabelo = corteCabelo;
	}

	public int getModelagemBarba() {
		return modelagemBarba;
	}

	public void setModelagemBarba(int modelagemBarba) {
		this.modelagemBarba = modelagemBarba;
	}

	public int getTratamentoQuedas() {
		return tratamentoQuedas;
	}

	public void setTratamentoQuedas(int tratamentoQuedas) {
		tratamentoQuedas = tratamentoQuedas;
	}
	
	//Métodos
	
	public void addCorteCabelo() {
		++corteCabelo;
	}
    
	public void addModelagemBarba() {
		++modelagemBarba;
	}
	
	public void addTratamentoQuedas() {
		++tratamentoQuedas;
	}
}
