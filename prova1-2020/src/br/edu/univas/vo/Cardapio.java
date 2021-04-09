package br.edu.univas.vo;

import java.util.ArrayList;

public class Cardapio {

	private String nome;
	private ArrayList<String> items = new ArrayList<>();
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public ArrayList<String> getItems() {
		return items;
	}
	public void setItems(ArrayList<String> items) {
		this.items = items;
	}
}
