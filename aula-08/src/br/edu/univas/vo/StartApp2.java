package br.edu.univas.vo;

public class StartApp2 {

	public static void main(String[] args) {
		Pessoa pessoa = new Pessoa();
		pessoa.email = "rodrigo@gmail.com";
		pessoa.telefone = "1111-1111";
		
		
		Pessoa.endereco = "Rua Y";
	}
	
}

/*
private -> somente a classe
default -> a classe e todo mundo que está no mesmo pacote
protected -> a classe, todo mundo que está no mesmo pacote 
e as classes filhas
public -> libera geral
*/