package br.edu.univas.vo;

public class Gato extends Animal {

	public void arranhar() {
		System.out.println("Arranhando coisas...");
	}
	
	@Override
	public void emiteSom() {
		System.out.println("Miau");
	}
}
