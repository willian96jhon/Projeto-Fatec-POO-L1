package com.fatec.teste.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class ServicosFemininos {

	
	private String servicos;
	
	@Id()
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long idServFemininos;
	
	@Column(nullable = false, unique= false)
	private int manicureandPedicure;
	
	@Column(nullable = false, unique= false)
	private int designCejas=0;
	
	@Column(nullable = false, unique= false)
	private int manutCabelo=0;
	
	@Column(nullable = false, unique= false)
	private int servicosPele=0;
	
	@Column(nullable = false, unique= false)
	private int botox=0;
	
	@Column(nullable = false, unique= false)
	private int corporal=0;
	
	//Métodos
	
	public void addManiPedi() {
		++manicureandPedicure;
	}
	
	public void addDesignCejas() {
		++designCejas;
	}
	
	public void addManutCabelo() {
		++manutCabelo;
	}
	
	public void addServicosPele() {
		++servicosPele;
	}
	
	public void addBotox() {
		++botox;
	}
	
	public void addCorporal() {
		++corporal;
	}
	
	
	
	

	//Getters e Setters
	
	
	
	
	public void setManicureandPedicure(int manicureandPedicure) {
		this.manicureandPedicure = manicureandPedicure;
	}
	
	

	
	
	
	
	public int getManicureandPedicure() {
		return manicureandPedicure;
	}







	public int getDesignCejas() {
		return designCejas;
	}







	public void setDesignCejas(int designCejas) {
		this.designCejas = designCejas;
	}







	public int getManutCabelo() {
		return manutCabelo;
	}







	public void setManutCabelo(int manutCabelo) {
		this.manutCabelo = manutCabelo;
	}







	public int getServicosPele() {
		return servicosPele;
	}







	public void setServicosPele(int servicosPele) {
		this.servicosPele = servicosPele;
	}







	public int getBotox() {
		return botox;
	}







	public void setBotox(int botox) {
		this.botox = botox;
	}







	public int getCorporal() {
		return corporal;
	}







	public void setCorporal(int corporal) {
		this.corporal = corporal;
	}







	public long getIdServFemininos() {
		return idServFemininos;
	}







	public void setIdServFemininos(long idServFemininos) {
		this.idServFemininos = idServFemininos;
	}

	public String getServicos() {
		return servicos;
	}

	public void setServicos(String servicos) {
		this.servicos = servicos;
	}
	
	
}
