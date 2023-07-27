package br.com.main;
import java.util.Scanner;

import br.com.loja.veiculo;

public class main {

	public static void main(String[] args) {
		
		String estado;
		Scanner scanner = new Scanner(System.in);
		
		//INICIANDO O OBJETO
		veiculo carro = new veiculo();
		carro.nome = "Corsa";
		carro.cor = "Rosa";
		carro.motor = "16cv";
		carro.velocidade = 100;
		
		System.out.println("Nome: " + carro.nome);
		System.out.println("Cor: " + carro.cor);
		System.out.println("Motor: "+ carro.motor);
		System.out.println("Velocidade: " + carro.velocidade);
		
		System.out.println("Deseja ligar o carro ?");
		estado = scanner.next();
		
		if (estado == "sim") {
			carro.ligar();
		}else {
			carro.desligar();
		}

	}

}
