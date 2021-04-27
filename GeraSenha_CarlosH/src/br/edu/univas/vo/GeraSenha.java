package br.edu.univas.vo;

public class GeraSenha {
	public static String senha = "";
	public static void gerador() {

		
		int min = Perguntas.getSenhaMinima();
		int max = Perguntas.getSenhaMaxima();
		
		String caracteres = Caracteres.opçoesCompletas;
		
		int tamanhoSenha = (int) Math.floor((Math.random() * max) + min);
		
		int Random = 0;
		
		for(int i = 0;i < tamanhoSenha;i++) {
			
			 Random = (int) Math.floor(Math.random() * Caracteres.opçoesCompletas.length());
			 senha = senha + caracteres.substring(Random, Random + 1);
		
		}
		   
	}
	  
	
}
