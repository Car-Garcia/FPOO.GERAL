package br.com.projeto;
import br.com.classes.*;

public class main {

	public static void main(String[] args) {
		
		Cliente cliente = new Cliente();
		Diarista diarista = new Diarista();
		
		diarista.nome = "Joao da silva";
		diarista.telefone = "(11) 98757-7859";
		diarista.endereco = "Av Cajamar, n°111";
		diarista.chavePix = "123";
		
		System.out.println("* Diarista *");
		System.out.println("");
		System.out.println("Nome: " + diarista.nome);
		System.out.println("Telefone: " + diarista.telefone);
		System.out.println("Endereço: " + diarista.endereco);
		System.out.println("Chave Pix: " + diarista.chavePix);
		diarista.atender("DanDan");
		System.out.println("");
		
		System.out.println("**************************************************");
		
		cliente.nome = "DanDan";
		cliente.telefone = "(11) 96485-3271";
		cliente.endereco = "Av Jalapão, n°55";
		cliente.saldo = 100.0;
		
		System.out.println("");
		System.out.println("* CLIENTE *");
		System.out.println("");
		System.out.println("Nome: " + cliente.nome);
		System.out.println("Telefone: " + cliente.telefone);
		System.out.println("Endereço: " + cliente.endereco);
		
		
	}

}
