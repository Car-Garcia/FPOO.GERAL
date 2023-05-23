public class EstruturaDecisaoTextos {
	
	public void testeVazio(String senha) {
		
		if(senha.isEmpty()) {
			System.out.println("A SENHA É OBRIGATÓRIA!");
		}
		
	}
	
	public void testeIgualdade(String senha, String confirmrSenha) {
		
		if (!senha.equals(confirmrSenha)) {
			System.out.println("AS SENHAS DEVEM SER IGUAIS!");
		}
				
	}
	
	public void testeTamanho(String senha) {
		
		int tamanho = senha.length();
		
		if (tamanho < 8) {
			System.out.println("A SENHA DEVE TER NO MÍNIMO 8 CARACTERES!");
		}		
		
	}
	
}
