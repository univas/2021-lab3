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
	
	public String emiteSom(int xpto) {
		String test1 = String.valueOf(10);
		String test2 = String.valueOf(true);
		
		soma(1, 3, 6, 9);
		int[] dados = {1,2,3,4,5,6};
		soma(dados);
		soma(1.5f);
		soma(1.5f, 2.6f);
		soma(1.5f, 2.6f, 7.6f);
		soma();
		
		int i = 10;
		
		return i > 5 ? "grande" : "pequeno";
		
//		if (i > 5) {
//			return "grande";
//		} else {
//			return "pequeno";
//		}
	}
	
	public int soma(int a, int b, int c, int d) {
		return 0;
	}
	
	public int soma(int[] dados) {
		return 0;
	}
	
	public int soma(float... dados) {
		return 0;
	}
	
	public void setPeso(int peso) {
		this.peso = peso;
	}	
}
