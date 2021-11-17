package ex3;

public class Lugar {
	
	private String pais;
	private String regiao;
	private String estado;
	
	
	public Lugar(String pais, String regiao, String estado) {
		super();
		this.pais = pais;
		this.regiao = regiao;
		this.estado = estado;
	}
	
	public String getPais() {
		return pais;
	}
	public void setPais(String pais) {
		this.pais = pais;
	}
	public String getRegiao() {
		return regiao;
	}
	public void setRegiao(String regiao) {
		this.regiao = regiao;
	}
	public String getEstado() {
		return estado;
	}
	public void setEstado(String estado) {
		this.estado = estado;
	}
	
	
	

}
