package br.edu.univas.main;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

import br.edu.univas.vo.Caracteres;
import br.edu.univas.vo.GeraSenha;
import br.edu.univas.vo.Perguntas;

public class StartApp {
	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		
		
		
		System.out.println("Qual o tamanha minimo da Senha ?");
		Perguntas.setSenhaMinima(sc.nextInt());
		
		System.out.println("Qual o tamanho maximo da Senha ?");
		Perguntas.setSenhaMaxima(sc.nextInt());
		
		System.out.println("1.SIM|-|2.NAO");
		System.out.println("Deseja que a senha tenha letras Minusculas ?");
		Perguntas.setLetrasMinusculas(sc.nextInt());
		
		System.out.println("Deseja que a senha tenha letras Maiusculas ?");
		Perguntas.setLetrasMaiusculas(sc.nextInt());
		
		System.out.println("Deseja que a senha tenha Numeros ?");
		Perguntas.setNumeros(sc.nextInt());
		
		System.out.println("Deseja que a senha tenha caracteres Expeciais");
		Perguntas.setCaracteresExpeciais(sc.nextInt());
		
		Caracteres.concatenaString();
		GeraSenha.gerador();
		System.out.println("onde vai salvar o arquivo ?");
		String local = sc.next();
		
		geraSenha(local,GeraSenha.senha);
		
		sc.close();
		
	}
	
	public static void geraSenha(String Caminho , String senha) {
		
		try(
				FileWriter criador = new FileWriter(Caminho + "\\secret_password.txt");
				BufferedWriter buffer = new BufferedWriter(criador);
				PrintWriter escreve = new PrintWriter(buffer);
				
				){
			
			escreve.append(senha);
			
		}catch(IOException e) {
			e.printStackTrace();
		}
		
	}
	
}