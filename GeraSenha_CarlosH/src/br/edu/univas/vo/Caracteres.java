package br.edu.univas.vo;

public class Caracteres{
	
	static String caracMinusculos = "abcdefghijklmnopqrstuvwxyz";
	static String caracMaisculos = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
	static String numeros = "0123456789";
	static String caracExpeciais = ":!@#$%&*";
	
	public static String opçoesCompletas = "";
	
	
	public static void concatenaString() {
		if(Perguntas.getLetrasMinusculas()== 1) {
			opçoesCompletas = opçoesCompletas + caracMinusculos;}
		
		if(Perguntas.getLetrasMaiusculas()==1) {
			opçoesCompletas = opçoesCompletas +caracMaisculos;}
		
		if(Perguntas.getNumeros()==1) {
			opçoesCompletas = opçoesCompletas +numeros;}
		
		if(Perguntas.getCaracteresExpeciais()==1) {
			opçoesCompletas = opçoesCompletas +caracExpeciais;}
	}
}
