package br.edu.univas.model;

public class PessoaFisica extends Pessoa {

	public void test(Integer x) {
		email = "rodrigo@gmail.com";
		telefone = "1234-1234";
	}
	
	@Override
	public void imprimeDados() {
		System.out.println("Classe PessoaFisica 1.0");
	}
	
	@Override
	public String toString() {
		return "E-mail: " + email;
	}

	@Override
	public void fazAlgumaCoisa() {
		//
	}
}
