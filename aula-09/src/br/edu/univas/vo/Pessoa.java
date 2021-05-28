package br.edu.univas.vo;

public class Pessoa {

	private final String nacionalidade;
	private final int idade;
	
	public static final String NATURALIDADE_XPTO = "XPTO";
	
	public Pessoa(String nac) {
		nacionalidade = nac;
		idade = 10;
	}
	
	public void printNome() {
		System.out.println("Teste");
		
		//nacionalidade = "Argentino(a)";
		//idade = 11;
		
		final String cidade = "PA";
		
		
		//cidade = "Paraiso";
	}
	
}
