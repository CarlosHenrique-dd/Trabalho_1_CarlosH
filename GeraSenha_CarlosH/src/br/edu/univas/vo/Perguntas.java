package br.edu.univas.vo;

public class Perguntas{
	
	private static int senhaMinima;
	private static int senhaMaxima;
	
	private static int letrasMaiusculas;
	private static int letrasMinusculas;
	private static int numeros;
	private static int caracteresExpeciais;
	
	
	public static int getSenhaMinima() {
		return senhaMinima;
	}
	public static void setSenhaMinima(int senhaMinima) {
		Perguntas.senhaMinima = senhaMinima;
	}
	public static int getSenhaMaxima() {
		return senhaMaxima;
	}
	public static void setSenhaMaxima(int senhaMaxima) {
		Perguntas.senhaMaxima = senhaMaxima;
	}
	public static int getLetrasMaiusculas() {
		return letrasMaiusculas;
	}
	public static void setLetrasMaiusculas(int letrasMaiusculas) {
		Perguntas.letrasMaiusculas = letrasMaiusculas;
	}
	public static int getLetrasMinusculas() {
		return letrasMinusculas;
	}
	public static void setLetrasMinusculas(int letrasMinusculas) {
		Perguntas.letrasMinusculas = letrasMinusculas;
	}
	public static int getNumeros() {
		return numeros;
	}
	public static void setNumeros(int numeros) {
		Perguntas.numeros = numeros;
	}
	public static int getCaracteresExpeciais() {
		return caracteresExpeciais;
	}
	public static void setCaracteresExpeciais(int caracteresExpeciais) {
		Perguntas.caracteresExpeciais = caracteresExpeciais;
	}


	
}
