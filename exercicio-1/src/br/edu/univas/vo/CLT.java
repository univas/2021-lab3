package br.edu.univas.vo;

public class CLT extends Funcionario {

	public CLT(float salarioBase, String nome) {
		super(salarioBase, nome);
	}

	@Override
	public float calculaSalario() {
		return getSalarioBase();
	}

	@Override
	public String toString() {
		return "[CLT nome=" + getNome() + " salarioBase=" + getSalarioBase() + "]";
	}
}
