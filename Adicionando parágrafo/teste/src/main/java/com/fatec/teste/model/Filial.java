package com.fatec.teste.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

@Entity
public class Filial {

	@Column(nullable=false)
	private String filial;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long idFilial;
	
	
	
	
	
	public String getFilial() {
		return filial;
	}
	
	

	public void setFilial(String filial) {
		this.filial = filial;
	}

	public long getIdFilial() {
		return idFilial;
	}

	public void setIdFilial(long idFilial) {
		this.idFilial = idFilial;
	}
	
	
	



	
	
	
	
}
