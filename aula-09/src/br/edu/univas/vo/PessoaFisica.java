package br.edu.univas.vo;

public class PessoaFisica extends Pessoa {

	public PessoaFisica(String nac) {
		super(nac);
	}

	@Override
	public void printNome() {
		System.out.println("[PF] Teste");
	}
	
}
