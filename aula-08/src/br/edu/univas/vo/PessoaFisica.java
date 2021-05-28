package br.edu.univas.vo;

public class PessoaFisica extends Pessoa {

	public void test() {
		//não consegue pois "nome" é private
		//nome = "Rodrigo";
		
		setNome("Rodrigo");
		email = "rodrigo@gmail.com";
		telefone = "1111-1111";
	}
	
}
