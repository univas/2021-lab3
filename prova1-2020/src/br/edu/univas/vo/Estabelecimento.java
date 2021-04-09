package br.edu.univas.vo;

import java.util.ArrayList;

public class Estabelecimento {

	private String nome;
	private ArrayList<Cardapio> cardapio = new ArrayList<>();
	
	public void addCardapio(Cardapio cardapio) {
		this.cardapio.add(cardapio);
	}
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public ArrayList<Cardapio> getCardapio() {
		return cardapio;
	}
	public void setCardapio(ArrayList<Cardapio> cardapio) {
		this.cardapio = cardapio;
	}
}
