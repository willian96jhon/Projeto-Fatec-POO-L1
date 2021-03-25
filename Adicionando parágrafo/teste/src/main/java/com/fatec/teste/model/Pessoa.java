package com.fatec.teste.model;

import java.time.LocalDate;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;

@Entity
@Inheritance(strategy=InheritanceType.JOINED)
public abstract class Pessoa {
	
	//chave primária!!
	@Id()
	@GeneratedValue(strategy = GenerationType.IDENTITY) //auto=incremento
	protected long id;
	
	@Column(nullable = false, unique= false)
	protected String nome;
	
	
	@Column(nullable=false, unique=false)
	protected String genero;
	
	@Column(nullable=false, unique=false)
	protected LocalDate nascimento;
	
	@Column
	protected int idade;
	
	
	
	
	
	@OneToMany(cascade = CascadeType.ALL, orphanRemoval= true)
	@JoinColumn(name= "idPessoa")
	protected Set<Telefone> telefones= new HashSet<Telefone>();
	
	
	
	
	public void setTelefones(Set<Telefone> telefones) {
		this.telefones = telefones;
	}
	
	public Set<Telefone> getTelefones() {
		return telefones;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}
	
	public String getGenero() {
		return genero;
	}
	
	public void setGenero(String genero) {
		this.genero = genero;
	}
	
	public LocalDate getNascimento() {
		return nascimento;
	}
	
	public void setNascimento(LocalDate nascimento) {
		this.nascimento = nascimento;
	}
	
	public int getIdade() {
		return idade;
	}
	
	public void setIdade(int idade) {
		this.idade = idade;
	}
	

}
