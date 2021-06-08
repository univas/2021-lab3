package br.edu.univas.vo;

public enum Estado {

	MG("Minas Gerais"),
	SP("São Paulo"),
	RJ("Rio de Janeiro"),
	ES("Espírito Santo");
	
	private String name;
	
	private Estado(String name) {
		this.name = name;
	}
	
//	
//	public boolean isValidEstado(String estado) {
//		
//	}
}
