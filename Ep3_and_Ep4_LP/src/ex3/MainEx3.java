package ex3;

public class MainEx3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Pessoa p1=new Pessoa("Joyce", "7676886869", "Brasil");
		Lugar lugar=new Lugar("Brasil", "Norte", "Amazonas");
		AgenciaViagens av=new AgenciaViagens();
		
		av.adicionarViagem(lugar, p1);
		av.listarDadosDestino(p1);
	}

}
