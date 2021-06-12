package br.edu.univas.vo;

public class PessoaJuridica extends Pessoa {

	private String cnpj;

	public String getCnpj() {
		return cnpj;
	}

	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}

	@Override
	public String toString() {
		return "PessoaJuridica [cnpj=" + cnpj + ", toString()=" + super.toString() + "]";
	}
	
}
