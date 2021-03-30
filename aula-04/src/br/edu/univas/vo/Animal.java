package br.edu.univas.vo;

public class Animal {

	private String raca;
	private String cor;
	
	public void emiteSom() {
		System.out.println("[CLASSE ANIMAL]");
		System.out.println("Qualquer som!");
	}
	
	public String getRaca() {
		return raca;
	}
	public void setRaca(String raca) {
		this.raca = raca;
	}
	public String getCor() {
		return cor;
	}
	public void setCor(String cor) {
		this.cor = cor;
	}
	
	@Override
	public String toString() {
		return "Raça: " + this.raca + "\n" +
			   "Cor: " + this.cor;
	}
}
