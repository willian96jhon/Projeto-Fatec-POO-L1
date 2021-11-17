package ex3;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class AgenciaViagens {
	
	private ArrayList<Lugar> destinos= new ArrayList<Lugar>();
	private Set<String> CPFClientes= new HashSet<String>();
	private Map<String, Lugar> viagens=new HashMap<String,Lugar>();
	
	//Getters and Setters
	public ArrayList<Lugar> getDestinos() {
		return destinos;
	}
	public void setDestinos(ArrayList<Lugar> destinos) {
		this.destinos = destinos;
	}
	public Set<String> getCPFClientes() {
		return CPFClientes;
	}
	public void setCPFClientes(Set<String> cPFClientes) {
		CPFClientes = cPFClientes;
	}
	
	public Map<String, Lugar> getViagens() {
		return viagens;
	}
	public void setViagens(Map<String, Lugar> viagens) {
		this.viagens = viagens;
	}
	
	//Metodos
	
	public void adicionarViagem(Lugar lugar, Pessoa pessoa) {
		System.out.println("A pessoa " + pessoa.getNome() + "vai para o lugar " + lugar.getPais());
		viagens.put(pessoa.getNome(), lugar);
	}
	
	
	public void listarDadosDestino(Pessoa pessoa) {
		int i=0;
		while(i < viagens.size()) {
			if(viagens.containsKey(pessoa.getNome())) {
				Lugar lugar=viagens.get(pessoa.getNome());
				System.out.println("O país é " + lugar.getPais() + ", o estado é " + lugar.getEstado() + ", e a região é " + lugar.getRegiao());
				i+=1;
			}
		}
		
	}
	
	
	
	
	
	
	
	

}
