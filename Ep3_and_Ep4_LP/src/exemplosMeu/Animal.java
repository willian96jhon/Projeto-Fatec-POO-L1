package exemplosMeu;

public class Animal {
	
	private String nomePopular;
	private String Habitat;
	private int numPatas;
	
	
	public Animal(String nomePopular, String habitat, int numPatas) {
		super();
		this.nomePopular = nomePopular;
		Habitat = habitat;
		this.numPatas = numPatas;
	}

	//Getters and Setters

	public String getNomePopular() {
		return nomePopular;
	}


	public void setNomePopular(String nomePopular) {
		this.nomePopular = nomePopular;
	}


	public String getHabitat() {
		return Habitat;
	}


	public void setHabitat(String habitat) {
		Habitat = habitat;
	}


	public int getNumPatas() {
		return numPatas;
	}


	public void setNumPatas(int numPatas) {
		this.numPatas = numPatas;
	}
	
	
	
	

}
