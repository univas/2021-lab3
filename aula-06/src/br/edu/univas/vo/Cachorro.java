package br.edu.univas.vo;

public class Cachorro extends Animal {

	private int peso;
	
	public void correrEmVoltaDeSiMesmo() {
		System.out.println("Correndo em circulo...");
	}
	
	@Override
	public void emiteSom() {
		for (int i = 0; i < peso; i++) {
			System.out.println("au ");
		}
	}
	
	public void setPeso(int peso) {
		this.peso = peso;
	}
}
