package br.edu.univas.vo;

public class Triangulo extends Poligono {

	private int a;
	private int b;
	private int c;
	
	public Triangulo(String nome, int a, int b, int c) {
		super(nome);
		this.a = a;
		this.b = b;
		this.c = c;
		System.out.println("Triangulo cadastrado com sucesso!");
	}
	
	public void print() {
		System.out.println("/_");
	}

	public int getA() {
		return a;
	}

	public void setA(int a) {
		this.a = a;
	}

	public int getB() {
		return b;
	}

	public void setB(int b) {
		this.b = b;
	}

	public int getC() {
		return c;
	}

	public void setC(int c) {
		this.c = c;
	}
}
