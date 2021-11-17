package ex3;

public class Pessoa {
	
	private String nome;
	private String CPF;
	private String endereco;
	
	
	
	public Pessoa(String nome, String cPF, String endereco) {
		super();
		this.nome = nome;
		CPF = cPF;
		this.endereco = endereco;
	}
	
	
	//Getters and Setters
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getCPF() {
		return CPF;
	}
	public void setCPF(String cPF) {
		CPF = cPF;
	}
	public String getEndereco() {
		return endereco;
	}
	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}
	
	

}
