package br.edu.univas.vo;

public class Estagiario extends Funcionario {

	private float valorHora;

	public Estagiario(float salarioBase, float valorHora, String nome) {
		super(salarioBase, nome);
		this.valorHora = valorHora;
	}

	@Override
	public float calculaSalario() {
		return getHorasTrabalhadas() * valorHora;
	}

	public float getValorHora() {
		return valorHora;
	}

	public void setValorHora(float valorHora) {
		this.valorHora = valorHora;
	}

	@Override
	public String toString() {
		return "[Estagiario nome=" + getNome() + " salarioBase=" + getSalarioBase() + " valorHora=" + valorHora + "]";
	}
}
