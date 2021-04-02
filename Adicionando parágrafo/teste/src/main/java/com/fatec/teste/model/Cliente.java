package com.fatec.teste.model;


import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.ManyToOne;
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
	
    @ManyToOne(cascade=CascadeType.ALL)
	private Filial empresa;
    
    private int idEmpresa;
    
    
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
	
	public Filial getEmpresa() {
		return empresa;
	}
	
	public void setEmpresa(Filial empresa) {
		this.empresa = empresa;
	}
	
	public int getIdEmpresa() {
		return idEmpresa;
	}
	
	public void setIdEmpresa(int idEmpresa) {
		this.idEmpresa = idEmpresa;
	}
	
	//Métodos
	public void id () {
		if(getEmpresa().getFilial().equals("FilialA")) {
			setIdEmpresa(1);
		}else if(getEmpresa().getFilial().equals("FilialB")) {
			setIdEmpresa(2);
		}else {
			setIdEmpresa(3);
		}
		
		}

}
