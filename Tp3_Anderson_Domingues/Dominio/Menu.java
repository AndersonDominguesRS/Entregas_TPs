package br.edu.ifnet.app.Dominio;

import java.util.Scanner;

public class Menu extends Pessoa {
	
	public int opcao=0;
	
	public void opcoes(){ //lista opcoes do usuario		
		
		System.out.println("Opcoes do programa:");
		System.out.println("[1] Cadastrar professor.");
		System.out.println("[2] Cadastrar aluno.");
		System.out.println("[3] Consultar situação de um docente/discente.");
		System.out.println("[4] Sair.");
		
		Scanner in=new Scanner(System.in);	
		
		System.out.print("Informe a opcao desejada: ");
		opcao=in.nextInt();
		
	}

}
