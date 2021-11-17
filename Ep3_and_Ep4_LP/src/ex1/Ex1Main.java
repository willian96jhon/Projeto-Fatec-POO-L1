package ex1;

public class Ex1Main {

	public static void main(String[] args) {


		Carro carro=new Carro("Azul", "Honda Civic", 1998, false, 300, true, 45000 , "BBG-999");
		
		Concessionaria c= new Concessionaria();
		
		c.getCarros().add(carro);
		
		c.getTabela_placaCar_preco().put(carro.getPlaca(), carro.getPreco());
		
		c.listarCarros();
		c.listarDadosCarro("BBG-999");
		
		
		
		
		
		
	}

}
