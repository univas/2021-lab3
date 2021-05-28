package br.edu.univas.vo;

public class PessoaJuridica extends Pessoa {

	public PessoaJuridica(String nac) {
		super(nac);
	}

	@Override
	public void printNome() {
		System.out.println("[PJ] Teste");
	}
}
