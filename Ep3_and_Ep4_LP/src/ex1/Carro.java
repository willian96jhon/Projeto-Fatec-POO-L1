package ex1;

public class Carro {
	
	private String cor;
	private String modelo;
	private int ano;
	private boolean isTracionado;
	private int quilometragem;
	private boolean isUsado;
	private double preco;
	private String placa;
	
	
	
	public Carro(String cor, String modelo, int ano, boolean isTracionado, int quilometragem, boolean isUsado,
			double preco, String placa) {
		super();
		this.cor = cor;
		this.modelo = modelo;
		this.ano = ano;
		this.isTracionado = isTracionado;
		this.quilometragem = quilometragem;
		this.isUsado = isUsado;
		this.preco = preco;
		this.placa=placa;
	}
	
	
	//Getters and Setters
	public String getCor() {
		return cor;
	}
	public void setCor(String cor) {
		this.cor = cor;
	}
	public String getModelo() {
		return modelo;
	}
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	public int getAno() {
		return ano;
	}
	public void setAno(int ano) {
		this.ano = ano;
	}
	public boolean isTracionado() {
		return isTracionado;
	}
	public void setTracionado(boolean isTracionado) {
		this.isTracionado = isTracionado;
	}
	public int getQuilometragem() {
		return quilometragem;
	}
	public void setQuilometragem(int quilometragem) {
		this.quilometragem = quilometragem;
	}
	public boolean isUsado() {
		return isUsado;
	}
	public void setUsado(boolean isUsado) {
		this.isUsado = isUsado;
	}
	public double getPreco() {
		return preco;
	}
	public void setPreco(double preco) {
		this.preco = preco;
	}


	public String getPlaca() {
		return placa;
	}


	public void setPlaca(String placa) {
		this.placa = placa;
	}
	
	

}
