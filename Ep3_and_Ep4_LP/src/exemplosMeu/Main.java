package exemplosMeu;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Animal a1=new Animal("Anta", "Cerrado brasileiro" , 4);
		
		Zoo zoo=new Zoo();
		zoo.addAnimais(a1);
		zoo.listarAnimais();

	}

}
