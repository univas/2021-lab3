package br.edu.univas.vo;

public class Gato extends Felino {

	@Override
	public void emiteSom() {
		System.out.println("[CLASSE GATO]");
		System.out.println("Miau miau");
	}
	
	public void arranha() {
		System.out.println("arranhando objetos...");
	}
	
	
}
