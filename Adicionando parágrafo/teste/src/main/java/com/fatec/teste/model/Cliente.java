package com.fatec.teste.model;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

@Entity
public class Cliente extends Pessoa{
	
	
	@Column
	private String conta;
	
	/*@ManyToMany(cascade = CascadeType.ALL)
	@JoinColumn(name= "idServM")
	protected Set<ServicosMasculinos> servM= new HashSet<ServicosMasculinos>();
	
	@ManyToMany(cascade = CascadeType.ALL)
	@JoinColumn(name= "idServF")
	protected Set<ServicosFemininos> servF= new HashSet<ServicosFemininos>();*/
	
    @OneToOne(cascade=CascadeType.ALL)
	private ServicosMasculinos idServM;
	
	
	//Getters e Setters
	public String getConta() {
		return conta;
	}

	public void setConta(String conta) {
		this.conta = conta;
	}
	/*
	public Set<ServicosMasculinos> getServM() {
		return servM;
	}
	
	public void setServM(Set<ServicosMasculinos> servM) {
		this.servM = servM;
	}
	
	public Set<ServicosFemininos> getServF() {
		return servF;
	}
	
	public void setServF(Set<ServicosFemininos> servF) {
		this.servF = servF;
	}*/
	
	

}
