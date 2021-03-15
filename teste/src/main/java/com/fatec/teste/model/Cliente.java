package com.fatec.teste.model;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;

@Entity
public class Cliente extends Pessoa{
	
	
	@Column
	private String conta;
	
	@ManyToMany(cascade = CascadeType.ALL)
	@JoinColumn(name= "idCliente-ServicosF")
	private Set<ServicosFemininos> servMulher= new HashSet<ServicosFemininos>();

	@ManyToMany(cascade = CascadeType.ALL)
	@JoinColumn(name= "idCliente-ServicosM")
	private Set<ServicosMasculinos> servHomem= new HashSet<ServicosMasculinos>();
	
	//Getters e Setters
	public String getConta() {
		return conta;
	}

	public void setConta(String conta) {
		this.conta = conta;
	}

	public Set<ServicosFemininos> getServMulher() {
		return servMulher;
	}

	public void setServMulher(Set<ServicosFemininos> servMulher) {
		this.servMulher = servMulher;
	}

	public Set<ServicosMasculinos> getServHomem() {
		return servHomem;
	}

	public void setServHomem(Set<ServicosMasculinos> servHomem) {
		this.servHomem = servHomem;
	}

}
