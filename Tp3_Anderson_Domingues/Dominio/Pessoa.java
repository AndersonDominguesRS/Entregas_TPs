package br.edu.ifnet.app.Dominio;

import java.util.Scanner;


import br.edu.ifnet.app.Auxiliar.Constante;
import br.edu.ifnet.app.exceptions.NomeIncompletoException;


public class Pessoa {
	
	 private String nomeCompleto;
	 private String primeiroNome;
	 private String segundoNome;
	 private String ultimoNome;
	 private String nome;
	 private int qtdeCadastro;
	 private int codigo;
	 private String tipo;
	 private String status;

	 
	 	public String getNomeCompleto() {
			return nomeCompleto;
		}

		public void setNomeCompleto(String nomeCompleto) {
			this.nomeCompleto = nomeCompleto;
		}

		public String getPrimeiroNome() {
			return primeiroNome;
		}

		public void setPrimeiroNome(String primeiroNome) {
			this.primeiroNome = primeiroNome;
		}

		public String getSegundoNome() {
			return segundoNome;
		}

		public void setSegundoNome(String segundoNome) {
			this.segundoNome = segundoNome;
		}

		public String getUltimoNome() {
			return ultimoNome;
		}

		public void setUltimoNome(String ultimoNome) {
			this.ultimoNome = ultimoNome;
		}
	 
		 public String getStatus() {
			return status;
		}
	
		public void setStatus(String status) {
			this.status = status;
		}
	
		public String getNome() {
			return nomeCompleto;
		}
	
		public String getTipo() {
			return tipo;
		}
	
		public void setTipo(String tipo) {
			this.tipo = tipo;
		}
	
		public void setNome(String nome) {
			this.nomeCompleto = nome;
		}
	
		public int getQtdeCadastro() {
			return qtdeCadastro;
		}
	
		public void setQtdeCadastro(int qtdeCadastro) {
			this.qtdeCadastro = qtdeCadastro;
		}
	
	
		public int getCodigo() {
			return codigo;
		}
	
		public void setCodigo(int codigo) {
			this.codigo = codigo;
		}



	@Override
	public String toString() { 
		
		return nomeCompleto + " ; " +  codigo ;		

	}
	 
	 public void imprimir() {
		 
			System.out.println("---------------------------------------------------------");
			System.out.println("Primeiro nome do " + tipo + ":"+" "+ primeiroNome);
			System.out.println("---------------------------------------------------------");
			System.out.println("Segundo nome do " + tipo + ":"+" "+ segundoNome);
			System.out.println("---------------------------------------------------------");
			System.out.println("Terceiro nome do " + tipo + ":"+" "+ultimoNome);
			System.out.println("---------------------------------------------------------");
			System.out.println("Nome completo " + tipo + ":"+" "+ nomeCompleto);
			System.out.println("---------------------------------------------------------");
			System.out.println("Situacao: O status do  "+ tipo + " " + nomeCompleto + " "+ "esta como:"+ " "+ status);
	 }
	 

		public  void cadastroPessoa (){ 	

			Scanner in = new Scanner(System.in);
		
			if (qtdeCadastro<Constante.TAMANHO_MAXIMO_LISTA) {										
						
					System.out.print("Digite o nome completo (ex: Joao silva silva) do" +" " + tipo + ": ");			
					nomeCompleto=in.nextLine();
			}
			
			else {
				System.out.println("---------------------------------------------------------");
				System.out.println("Numero maximo de cadastros atingido!");
				System.out.println("---------------------------------------------------------");
			}		
	
	}
		
		public void recuperaNome() throws NomeIncompletoException {
			
			if (nomeCompleto.indexOf(" ") == nomeCompleto.lastIndexOf(" ") || ((nomeCompleto.length()) -nomeCompleto.lastIndexOf(" " ) <2) ) {
				
				throw new NomeIncompletoException("Não possui o campo nome digitado corretamente");
				
			}
			

			primeiroNome=(nomeCompleto.substring(0, nomeCompleto.indexOf(" ")));
			segundoNome=nomeCompleto.substring(nomeCompleto.indexOf(" "), nomeCompleto.lastIndexOf(" "));
			ultimoNome= nomeCompleto.substring(nomeCompleto.lastIndexOf(" "));
		}

		
		public String retornaNome() {
			
			StringBuilder nomeFormat= new StringBuilder();
			nomeFormat.append(primeiroNome);
			nomeFormat.append(segundoNome);
			nomeFormat.append(ultimoNome);
			
			return nome;
		}
}
