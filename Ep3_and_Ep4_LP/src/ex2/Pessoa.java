package ex2;

public class Pessoa {
	
	private String nome;
	private String cpf;
	private Conta conta;
	
	
	
	public Pessoa(String nome, String cpf) {
		super();
		this.nome = nome;
		this.cpf = cpf;
	}
	//Getters and Setters
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	public Conta getConta() {
		return conta;
	}
	public void setConta(Conta conta) {
		this.conta = conta;
	}
	
	public void criarConta(Conta conta) {
		setConta(conta);
		getConta().setPessoa(this);
	}
	
	
	
	

}
