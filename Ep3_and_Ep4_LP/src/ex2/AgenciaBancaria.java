package ex2;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class AgenciaBancaria {
	
	private ArrayList<Conta> contas= new ArrayList<Conta>();
	private Set<String> CPFClientes=new HashSet<String>();
	
	//Getters and Setters
	public ArrayList<Conta> getContas() {
		return contas;
	}
	public void setContas(ArrayList<Conta> contas) {
		this.contas = contas;
	}
	public Set<String> getCPFClientes() {
		return CPFClientes;
	}
	public void setCPFClientes(Set<String> cPFClientes) {
		CPFClientes = cPFClientes;
	}
	
	
	//Métodos
	
	
	public void adicionarConta(Conta conta) {
		
		getContas().add(conta);
		System.out.println("Conta adicionada com sucesso!");
		
	}
	
	public void apagarConta(Conta conta) {
		getContas().remove(conta);
		System.out.println("onta removida com sucesso!");
	}
	
	public void listarDadosPessoais(String cpf) {
		
		int i=0;
		while(i<contas.size()) {
			Conta conta1=contas.get(i);
			Pessoa pessoa=conta1.getPessoa();
			if(pessoa.getCpf().equals(cpf)) {
				System.out.println("Nome: " +pessoa.getNome());
				System.out.println("CPF: " + cpf);
				System.out.println("Número da Conta: "+ pessoa.getConta().getNumeroConta());
			}else {
				System.out.println("Este CPF não consta no registro, por favor tente outro CPF");
			}
			i+=1;
		}
		
		
		
	}
	
	
	
	
	

}
