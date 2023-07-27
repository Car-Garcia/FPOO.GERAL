package br.com.classes;

public class Atendimento {
	
	private int horas;

	public int getHoras() {
		return horas;
	}

	public void setHoras(int horas) {
		
		if (horas >= 1 || horas <= 12) {
			System.out.println("Atendimento válido");
			this.horas = horas;
		} else {
			System.out.println("Atendimento inválido");
			this.horas = horas;
		}
	}

}
