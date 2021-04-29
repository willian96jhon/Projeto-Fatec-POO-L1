 package com.fatec.beleza.beleza.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import org.springframework.format.annotation.DateTimeFormat;



@Entity
public class Cliente {
	@Id
	@GeneratedValue(strategy= GenerationType.IDENTITY)
	private Long idCliente;
	
	
	@NotBlank
    @Size(max=100, message="Máximo de 100(cem) caracteres")
	private String nome;
	
	
	/*@OneToMany(cascade = CascadeType.ALL, orphanRemoval= true)
	@JoinColumn(name= "idPessoa")
	private Set<Telefone> telefones= new HashSet<Telefone>();*/
	
	@OneToMany(cascade= CascadeType.ALL, orphanRemoval=true)
	@JoinColumn(name="idTel")
	private Set<Telefone> telefones=new HashSet<Telefone>();
	
	@OneToMany
	private List<Servicos> servicos= new ArrayList<Servicos>();
	
	
	
	
	
	@NotNull
	@DateTimeFormat(pattern= "dd/MM/yy")
	@Temporal(TemporalType.DATE)
	private Date dataNascimento;
	
	
	private String genero;
	
	
	private String filial;
	
	private int idade;
	
	//Getters and setters
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public Date getDataNascimento() {
		return dataNascimento;
	}
	public void setDataNascimento(Date dataNascimento) {
		this.dataNascimento = dataNascimento;
	}
	public String getGenero() {
		return genero;
	}
	public void setGenero(String genero) {
		this.genero = genero;
	}
	public Long getIdCliente() {
		return idCliente;
	}
	public void setIdCliente(Long idCliente) {
		this.idCliente = idCliente;
	}
	
	public void setTelefones(Set<Telefone> telefones) {
		this.telefones = telefones;
	}
	public Set<Telefone> getTelefones() {
		return telefones;
	}
	public String getFilial() {
		return filial;
	}
	public void setFilial(String filial) {
		this.filial = filial;
	}
	public int getIdade() {
		return idade;
	}
	public void setIdade(int idade) {
		this.idade = idade;
	}
	public List<Servicos> getServicos() {
		return servicos;
	}
	public void setServicos(List<Servicos> servicos) {
		this.servicos = servicos;
	}
	
	

}
