package br.edu.univas.model;

public enum Estado {

	MG("Minas Gerais"),
	SP("São Paulo"),
	RJ("Rio de Janeiro"),
	ES("Espirito Santo");
	
	private String nome;
	
	Estado(String nome) {
		this.nome = nome;
	}

	public String getNome() {
		return nome;
	}
}
