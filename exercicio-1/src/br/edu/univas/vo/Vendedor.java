package br.edu.univas.vo;

public class Vendedor extends Funcionario {

	private float comissao;

	public Vendedor(float salarioBase, float comissao, String nome) {
		super(salarioBase, nome);
		this.comissao = comissao;
	}

	@Override
	public float calculaSalario() {
		return getSalarioBase() + (getSalarioBase() * comissao / 100);
	}

	public float getComissao() {
		return comissao;
	}

	public void setComissao(float comissao) {
		this.comissao = comissao;
	}

	@Override
	public String toString() {
		return "[Vendedor nome=" + getNome() + " salarioBase=" + getSalarioBase() + " comissão=" + comissao + "]";
	}
}
