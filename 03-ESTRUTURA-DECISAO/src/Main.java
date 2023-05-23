public class Main {

	public static void main(String[] args) {
		
		OperadoresRelacionais objetoOperadoresRealacionais = new OperadoresRelacionais();
		ComparandoTextos objetoComparandoTextos = new ComparandoTextos();
		EstruturaDecisaoSimples objetoEstruturaDecisaoSimples = new EstruturaDecisaoSimples();
		EstruturaDecisaoComposta objetoEstruturaDecisaoComposta = new EstruturaDecisaoComposta();
		EstruturaDecisaoTextos objetoEstruturaDecisaoTextos = new EstruturaDecisaoTextos();
		
		//objetoOperadoresRealacionais.TestesLogicos1();
		//objetoComparandoTextos.TestesLogicos1();
		
		/* ESTRUTURA DE DECISÃO SIMPLES: */
		/*objetoEstruturaDecisaoSimples.testeMenor(5, 10);
		objetoEstruturaDecisaoSimples.testeMenorIgual(10, 10);
		objetoEstruturaDecisaoSimples.testeMaior(10, 5);
		objetoEstruturaDecisaoSimples.testeMaiorIgual(5, 5);
		objetoEstruturaDecisaoSimples.testeIgual(20, 20);
		objetoEstruturaDecisaoSimples.testeDiferente(50, 100);*/
		
		/* ESTRUTURA DE DECISÃO COMPOSTA: */
		//objetoEstruturaDecisaoComposta.testeMenorIgual(10, 5);
		//objetoEstruturaDecisaoComposta.testeMaiorIgual(100, 50);
		//objetoEstruturaDecisaoComposta.testeMenor(100, 50);
		
		/* ESTRUTURA DE DECISÃO COMPOSTA: */
		objetoEstruturaDecisaoTextos.testeVazio("testeSenha123");
		objetoEstruturaDecisaoTextos.testeIgualdade("testeSenha123", "testeSenha123");
		objetoEstruturaDecisaoTextos.testeTamanho("testeSenha123");
	}

}
