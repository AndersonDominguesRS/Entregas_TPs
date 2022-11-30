package br.edu.ifnet.app.testes;

import java.util.Scanner;

import br.edu.ifnet.app.Auxiliar.Constante;
import br.edu.ifnet.app.Dominio.Aluno;
import br.edu.ifnet.app.Dominio.Menu;
import br.edu.ifnet.app.Dominio.Professor;
import br.edu.ifnet.app.exceptions.NomeIncompletoException;


public class Teste {		
		
	public static void main(String[] args) {		
		
		int controleCadastro=0;
		
		Menu menu=new Menu();
		
		Aluno[] cadAluno = new Aluno[Constante.TAMANHO_MAXIMO_LISTA];
		Professor[] cadProfessor= new Professor[Constante.TAMANHO_MAXIMO_LISTA];
		
		
		do {menu.opcoes();
		
		switch (menu.opcao) {
		case 1:			
			
			Professor professor =new Professor();	
			professor.setCodigo(controleCadastro);
			professor.setQtdeCadastro(controleCadastro);
			professor.cadastroNovoProfessor();	
			try {
				professor.recuperaNome();
				professor.retornaNome();
				cadProfessor[controleCadastro]=professor;			
				controleCadastro++;
				professor.setCodigo(controleCadastro);
				professor.setQtdeCadastro(controleCadastro);
				System.out.println("---------------------------------------------------------");
				System.out.println("O professor "+ " "+professor.getNome() + " " + "foi cadastrado com o codigo:" + " "+ professor.getCodigo());
				System.out.println("---------------------------------------------------------");
				
			} catch (NomeIncompletoException e) {
				System.out.println("[ERROR]" + " " + e.getMessage()) ;;
			}		

			break;
						
			
		case 2:
			
			Aluno aluno=new Aluno();			
			aluno.setCodigo(controleCadastro);
			aluno.setQtdeCadastro(controleCadastro);
			aluno.cadastraNovoAluno();
			
			try {
				aluno.recuperaNome();
				aluno.retornaNome();
				cadAluno[controleCadastro]=aluno;			
				controleCadastro++;
				aluno.setCodigo(controleCadastro);
				aluno.setQtdeCadastro(controleCadastro);
				System.out.println("---------------------------------------------------------");
				System.out.println("O aluno "+ " "+ aluno.getNome() + " " + "foi cadastrado com o codigo:" + " "+ aluno.getCodigo());
				System.out.println("---------------------------------------------------------");
				
				
			} catch (NomeIncompletoException e) {
				System.out.println("[ERROR]" + " " + e.getMessage()) ;;
			}
			

			
			break;
			
		case 3:
			
			int escolha;
			
			System.out.println("Opcoes do consulta:");
			System.out.println("[1] ALUNO");
			System.out.println("[2] PROFESSOR");
			
			Scanner en = new Scanner(System.in);
			
			System.out.print("Digite a opcao desejada ");
			escolha = en.nextInt();
			
			if (escolha == 1) {
				
			System.out.print("Digite o codigo do aluno: ");
			int codAluno = en.nextInt();
			
			cadAluno[codAluno].imprimirAluno();
				
			}else {
				
				System.out.print("Digite o codigo do professor: ");
				int codProfessor = en.nextInt();				
				cadProfessor[codProfessor].imprimir();			
				
				
			}

			
			break;

		default:
			break;
		}
		
		}while (menu.opcao!=4);{
			System.out.println("Programa finalizado!");
		}	

	}
}
