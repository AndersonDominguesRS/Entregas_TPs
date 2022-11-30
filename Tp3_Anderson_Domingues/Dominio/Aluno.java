package br.edu.ifnet.app.Dominio;

import java.util.Scanner;

public class Aluno extends Pessoa {
	  private float av1;
	  private float av2;
	  private float mediaAV;
	 public void cadastraNovoAluno() {
		 
		 Scanner in = new Scanner(System.in);
	
		 	setTipo("ALUNO");
		 	cadastroPessoa();
		 	System.out.print("Digite a nota da Av1 do aluno" +" "+ getNome()+": ");
			av1 = in.nextFloat();
			System.out.print("Digite a nota da Av2 do aluno" +" "+ getNome()+": ");
			av2 = in.nextFloat();
			mediaAV=(av2+av1)/2;
			
			if (mediaAV<4) {
				setStatus("REPROVADO");
			}
			else if (mediaAV<7) {
				setStatus("PROVA FINAL");
			}
			else {
				setStatus("APROVADO");
			}
	 }
	 public void statusAluno() {
			System.out.println("---------------------------------------------------------");
			System.out.println("Nome do aluno:"+" "+ getNome());
			System.out.println("Nota da AV1 do aluno "+" "+ getNome() +" "+" :"+ av1);
			System.out.println("Nota da AV2 do aluno "+" "+ getNome() +" "+" :"+ av2);			
			System.out.println("A media das avaliacoes do aluno "+" "+ getNome() + " "+" e:"+" "+ mediaAV);
			System.out.println("Situacao: O aluno"+" "+ getNome() + " "+ "esta como"+ " "+ getStatus());
			System.out.println("---------------------------------------------------------");
	 }

	 
	 public void imprimirAluno() {
		 
		 	imprimir();
			System.out.println("---------------------------------------------------------");
			System.out.println("Tipo de cadastro;" + " " + getTipo());
			System.out.println("Nome do aluno:"+" "+ getNome());
			System.out.println("Nota da AV1 do aluno "+" "+ getNome() +" "+" :"+ av1);
			System.out.println("Nota da AV2 do aluno "+" "+ getNome() +" "+" :"+ av2);			
			System.out.println("A media das avaliacoes do aluno "+" "+ getNome() + " "+" e:"+" "+ mediaAV);
			
			System.out.println("---------------------------------------------------------");
	 }

	 
		@Override
		public String toString() { 
			
			return getNome() + " ; " + getQtdeCadastro() + " ;  " + getCodigo() + " ; " + mediaAV + " ;  " + av1 ;
			
	
		}

}
