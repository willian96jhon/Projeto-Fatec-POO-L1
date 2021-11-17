package ex2;

public class Conta {
	
	private int id;
	private String numeroConta;
	private String tipoConta;
	private Pessoa pessoa;
	
	
	
	public Conta(int id, String numeroConta, String tipoConta) {
		super();
		this.id = id;
		this.numeroConta = numeroConta;
		this.tipoConta = tipoConta;
	}
	
	
	//Getters and Setters
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getNumeroConta() {
		return numeroConta;
	}
	public void setNumeroConta(String numeroConta) {
		this.numeroConta = numeroConta;
	}
	public String getTipoConta() {
		return tipoConta;
	}
	public void setTipoConta(String tipoConta) {
		this.tipoConta = tipoConta;
	}


	public Pessoa getPessoa() {
		return pessoa;
	}


	public void setPessoa(Pessoa pessoa) {
		this.pessoa = pessoa;
	}
	
	

}
