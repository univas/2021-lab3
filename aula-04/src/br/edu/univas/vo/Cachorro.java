package br.edu.univas.vo;

public class Cachorro extends Canino {

	@Override
	public void emiteSom() {
		System.out.println("[CLASSE CACHORRO]");
		super.emiteSom();
	}
	
	@Override
	public String toString() {
		return "Sou um cachorro da raça: " + this.getRaca() +
			"\n e tenho a cor: " + this.getCor();
	}
}
