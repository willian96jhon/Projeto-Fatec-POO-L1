package exemplosMeu;

import java.util.ArrayList;

public class Zoo {
	
	private String nome;
	private ArrayList<Animal> animais;
	
	//Getters and Setters
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public ArrayList<Animal> getAnimais() {
		return animais;
	}
	public void setAnimais(ArrayList<Animal> animais) {
		this.animais = animais;
	}
	
	//Métodos
	
	public void addAnimais(Animal animal) {
		getAnimais().add(animal);
		System.out.println("Animal " + animal.getNomePopular() + " adicionado com sucesso");
	}
	
	public void listarAnimais() {
		
		for(Animal animais : getAnimais()) {
			System.out.println(animais.getNomePopular());
		}
		
	}
	

}
