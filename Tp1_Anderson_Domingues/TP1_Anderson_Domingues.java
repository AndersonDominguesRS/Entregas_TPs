package br.edu.ifnet.app;

import java.util.Scanner;

public class CadastroAlunos {
	
	private static String[] nomes;
	private static int qtdeCadastro;
	private static float[] av1;
	private static float[] av2;
	private static String[] status;
	private static int codigo=0;
	private static int opcao;
	private static float[] mediaAV;
	private static final int TAMANHO_MAXIMO_LISTA = 100; //Quantidade máxima de nomes permitidos na lista + Definindo como valor unico (constante)
	
	private static void opcoes(){ //lista opções para escolha do usuário		
			
		System.out.println("Opcoes do programa:");
		System.out.println("[1] Registrar as notas de um novo aluno.");
		System.out.println("[2] Consultar boletim de um aluno.");
		System.out.println("[3] Consultar notas da turma.");
		System.out.println("[4] Sair.");
		Scanner in=new Scanner(System.in);	
		
		System.out.print("Informe a opcao desejada: ");
		opcao=in.nextInt();		
		
	}
	
	private static void cadastro (){ //Inicia a opcao de cadastro		

			Scanner in = new Scanner(System.in);
		
			if (qtdeCadastro<TAMANHO_MAXIMO_LISTA) {										
						
					System.out.print("Digite o nome do aluno: ");			
					nomes[codigo]=in.next(); //inserindo nome com o indice referenciado pelo i e colocando no array o nome digitado		
					System.out.print("Digite a nota da Av1 do aluno" +" "+ nomes[codigo]+": ");
					av1[codigo] = in.nextFloat();
					System.out.print("Digite a nota da Av2 do aluno" +" "+ nomes[codigo]+": ");
					av2[codigo] = in.nextFloat();
					System.out.println("---------------------------------------------------------");
					System.out.println("O aluno "+ " "+nomes[codigo] + " " + "foi cadastrado com o codigo:" + " "+ codigo);
					System.out.println("---------------------------------------------------------");
					mediaAV[codigo]=(av2[codigo]+av1[codigo])/2;
			     	qtdeCadastro++;
			     	
					if (mediaAV[codigo]<4) {
						status[codigo]="REPROVADO";;
					}
					else if (mediaAV[codigo]<7) {
						status[codigo]="PROVA FINAL";
					}
					else {
						status[codigo]="APROVADO";
					}			
				
			}else {
				System.out.println("---------------------------------------------------------");
				System.out.println("Número máximo de cadastros atingido!");
				System.out.println("---------------------------------------------------------");
			}		
	
	}
	
	private static void consultaAluno(){ //Consulta individual de alunos
		
			Scanner in = new Scanner(System.in);
			System.out.print("Digite o código do aluno: ");
			int codAluno = in.nextInt();
			System.out.println("---------------------------------------------------------");
			System.out.println("Nome do aluno:"+" "+ nomes[codAluno]);
			System.out.println("Nota da AV1 do aluno "+" "+ nomes[codAluno] +" "+"é:"+ av1[codAluno]);
			System.out.println("Nota da AV2 do aluno "+" "+ nomes[codAluno] +" "+"é:"+ av2[codAluno]);			
			System.out.println("A média das avaliações do aluno "+" "+ nomes[codAluno] + " "+" é:"+" "+ mediaAV[codAluno]);
			System.out.println("Situacao: O aluno"+" "+ nomes[codAluno] + " "+ "esta como"+ " "+ status[codAluno]);
			System.out.println("---------------------------------------------------------");
		
	}
	
	private static void listarAlunos() { //Listagem geral de alunos
		System.out.println("---------------------------------------------------------");
		for (int i=0;i<qtdeCadastro;i++) {
			if (nomes[i] !=null) {				
				System.out.println("Nome do aluno:"+" "+ nomes[i]);
				System.out.println("Nota da AV1 do aluno "+" "+ nomes[i] +" "+"é:"+ av1[i]);
				System.out.println("Nota da AV2 do aluno "+" "+ nomes[i] +" "+"é:"+ av2[i]);			
				System.out.println("A média das avaliações do aluno "+" "+ nomes[i] + " "+" é:"+" "+ mediaAV[i]);
				System.out.println("Situacao: O aluno"+" "+ nomes[i] + " "+ "esta como"+ " "+ status[i]);
				System.out.println("---------------------------------------------------------");
			}
			
		}
	}
	
	
	
	public static void main(String[] args) {
		
		nomes=new String[TAMANHO_MAXIMO_LISTA];
		av1=new float[TAMANHO_MAXIMO_LISTA];
		av2=new float[TAMANHO_MAXIMO_LISTA];
		mediaAV=new float[TAMANHO_MAXIMO_LISTA];
		status=new String[TAMANHO_MAXIMO_LISTA];
		
		
		do {opcoes();
		
		switch (opcao) {
		case 1:
			
			cadastro();
			codigo++;
			
			break;
			
		case 2:
			
			consultaAluno();
			
			break;
			
		case 3:
			
			listarAlunos();
			
			break;

		default:
			break;
		}
		
		}while (opcao!=4);{
			System.out.println("Programa finalizado!");
		}
	
	

	}
}

