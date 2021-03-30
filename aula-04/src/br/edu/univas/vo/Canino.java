package br.edu.univas.vo;

public class Canino extends Animal {

	@Override
	public void emiteSom() {
		System.out.println("[CLASSE CANINO]");
		super.emiteSom();
	}
	
	@Override
	public String toString() {
		return "Raça: " + this.getRaca() + "\n" +
			   "Cor: " + this.getCor() + "\n" +
				"Qualquer coisa!";
	}
}
