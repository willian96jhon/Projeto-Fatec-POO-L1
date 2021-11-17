package ex1;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Concessionaria {
	
	private ArrayList<Carro> carros= new ArrayList<Carro>();
	private Map<String, Double> tabela_placaCar_preco= new HashMap<String, Double>();
	
	//Getters and Setters
	public ArrayList<Carro> getCarros() {
		return carros;
	}
	public void setCarros(ArrayList<Carro> carros) {
		this.carros = carros;
	}
	public Map<String, Double> getTabela_placaCar_preco() {
		return tabela_placaCar_preco;
	}
	public void setTabela_placaCar_preco(HashMap<String, Double> tabela_placaCar_preco) {
		this.tabela_placaCar_preco = tabela_placaCar_preco;
	}
	
	
	//Métodos
	
	public Carro listarCarros(){
		int i=0;
		
		if(carros.size()>0) {
		 while(i<carros.size()) {
			 Carro car=carros.get(i);
             System.out.println(car);			
             i+=1;
			 
			 return car;
			 
		 }}
		
	return null;
	}
	
	
	
	
	
	
	public Double tabelaPreco() {
		int i=0;
		ArrayList<Double> precos= new ArrayList<Double>();
		
		while(i < carros.size()) {
			Carro car=carros.get(i);
			precos.add(car.getPreco());
			i+=1;
		}
		
		i=0;
		
		while(i<precos.size()) {
			System.out.println(precos.get(i));
			return precos.get(i);
		}
		
		return 0.0;
		
	}
	
	public Double listarDadosCarro(String placa) {
		
		Double preco = null;
		if(tabela_placaCar_preco.containsKey(placa)) {
			preco=tabela_placaCar_preco.get(placa);
			System.out.println( "O valor é R$ " + preco.toString());
			return preco;
			
		}
		
		 
		
		return 0.0;
	}
	
	
	
}


