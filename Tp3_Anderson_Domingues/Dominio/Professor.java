package br.edu.ifnet.app.Dominio;

public class Professor extends Pessoa {
	
	public void cadastroNovoProfessor() {
		
		setTipo("professor");
		setStatus("ATIVO");
		cadastroPessoa();
		
	}	
	

}
