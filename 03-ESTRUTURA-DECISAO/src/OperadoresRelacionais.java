public class OperadoresRelacionais {
	
	int valor1, valor2;
	
	public void TestesLogicos1(){
		
		/* 
		 >  - MAIOR QUE
		 <  - MENOR QUE
		 >= - MAIOR OU IGUAL A
		 <= - MENOR OU IGUAL A 
		 == - IGUAL A
		 != - DIFERENTE DE
		 */
		
		this.valor1 = 10;
		this.valor2 = 5;
		boolean resultado;
		
		System.out.println("TESTE LÓGICO: valor1: " + this.valor1 + " > valor2: " + this.valor2);
		resultado = this.valor1 > this.valor2;
		System.out.println("RESULTADO: " + resultado);
		
		System.out.println("");
		
		System.out.println("TESTE LÓGICO: valor1: " + this.valor1 + " < valor2: " + this.valor2);
		resultado = this.valor1 < this.valor2;
		System.out.println("RESULTADO: " + resultado);
		
		System.out.println("");
		
		System.out.println("TESTE LÓGICO: valor1: " + this.valor1 + " >= valor2: " + this.valor2);
		resultado = this.valor1 >= this.valor2;
		System.out.println("RESULTADO: " + resultado);
		
		System.out.println("");
		
		System.out.println("TESTE LÓGICO: valor1: " + this.valor1 + " <= valor2: " + this.valor2);
		resultado = this.valor1 <= this.valor2;
		System.out.println("RESULTADO: " + resultado);
		
		System.out.println("");
		
		System.out.println("TESTE LÓGICO: valor1: " + this.valor1 + " == valor2: " + this.valor2);
		resultado = this.valor1 == this.valor2;
		System.out.println("RESULTADO: " + resultado);
		
		System.out.println("");
		
		System.out.println("TESTE LÓGICO: valor1: " + this.valor1 + " != valor2: " + this.valor2);
		resultado = this.valor1 != this.valor2;
		System.out.println("RESULTADO: " + resultado);
		
	}

}
