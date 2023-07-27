package br.com.projeto;
import br.com.classes.*;

public class App {

	public static void main(String[] args) {
		
		Cliente cliente = new Cliente();
		Diarista diarista = new Diarista();
		
		diarista.setNome("Joao da silva");
		diarista.setTelefone("(11) 98757-7859");
		diarista.setEndereco("Av Cajamar, n°111");
		diarista.setChavePix("123");
		diarista.setSaldo(100.0);
		
		System.out.println("* Diarista *");
		System.out.println("");
		System.out.println("Nome: " + diarista.getNome());
		System.out.println("Telefone: " + diarista.getTelefone());
		System.out.println("Endereço: " + diarista.getEndereco());
		System.out.println("Chave Pix: " + diarista.getChavePix());
		System.out.println("Saldo: " + cliente.getSaldo());
		diarista.depositar(30);
		System.out.println("Novo saldo: " + diarista.getSaldo());
		System.out.println("");
		diarista.sacar(30);
		System.out.println("Novo saldo: " + diarista.getSaldo());
		System.out.println("");
		
		
		System.out.println("**************************************************");
		
		cliente.setNome("DanDan");
		cliente.setTelefone("(11) 96485-3271");
		cliente.setEndereco("Av Jalapão, n°55");
		cliente.setSaldo(100.0);
		
		
		System.out.println("");
		System.out.println("* CLIENTE *");
		System.out.println("");
		System.out.println("Nome: " + cliente.getNome());
		System.out.println("Telefone: " + cliente.getTelefone());
		System.out.println("Endereço: " + cliente.getEndereco());
		System.out.println("Saldo: " + cliente.getSaldo());
		cliente.depositar(30);
		System.out.println("Novo saldo: " + cliente.getSaldo());
		System.out.println("");
		cliente.sacar(30);
		System.out.println("Novo saldo: " + cliente.getSaldo());
		System.out.println("");
		
		System.out.println("**************************************************");
		
		Atendimento atendimento = new Atendimento();
		
		atendimento.setHoras(10);
		System.out.println(atendimento.getHoras());
	}

}
