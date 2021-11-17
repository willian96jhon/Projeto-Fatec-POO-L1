package ex2;

public class Ex2Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Conta conta = new Conta(1,"123", "corrente");
		
		
		Pessoa pessoa=new Pessoa("Jonathan", "3435454");
		
		pessoa.criarConta(conta);
		
		
		AgenciaBancaria ab=new AgenciaBancaria();
		
		ab.adicionarConta(conta);
		ab.listarDadosPessoais("3435454");
		
		ab.apagarConta(conta);

	}

}
