package br.com.classes;

public class Cliente extends Pessoa{
	

	@Override
	public void sacar(double valor) {
		
		var saldoAtual = this.getSaldo();
		var novoSaldo = saldoAtual - valor;
		this.setSaldo(novoSaldo);
		
	}

	@Override
	public void depositar(double valor) {
		
		var saldoAtual = this.getSaldo();
		var novoSaldo = (((valor/100)*10)+valor)+saldoAtual;
		this.setSaldo(novoSaldo);
		
	}
	
	
}
