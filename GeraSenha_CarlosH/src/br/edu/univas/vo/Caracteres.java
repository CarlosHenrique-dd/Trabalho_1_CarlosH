package br.edu.univas.vo;

public class Caracteres{
	
	static String caracMinusculos = "abcdefghijklmnopqrstuvwxyz";
	static String caracMaisculos = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
	static String numeros = "0123456789";
	static String caracExpeciais = ":!@#$%&*";
	
	public static String op�oesCompletas = "";
	
	
	public static void concatenaString() {
		if(Perguntas.getLetrasMinusculas()== 1) {
			op�oesCompletas = op�oesCompletas + caracMinusculos;}
		
		if(Perguntas.getLetrasMaiusculas()==1) {
			op�oesCompletas = op�oesCompletas +caracMaisculos;}
		
		if(Perguntas.getNumeros()==1) {
			op�oesCompletas = op�oesCompletas +numeros;}
		
		if(Perguntas.getCaracteresExpeciais()==1) {
			op�oesCompletas = op�oesCompletas +caracExpeciais;}
	}
}
