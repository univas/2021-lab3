package br.edu.univas.vo;

public class Pessoa {

	private String nome;
	private String telefone;
	private String endereco;
	private Estado estado;
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getTelefone() {
		return telefone;
	}
	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}
	public String getEndereco() {
		return endereco;
	}
	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}
	public Estado getEstado() {
		return estado;
	}
	public void setEstado(Estado estado) {
		this.estado = estado;
	}

	@Override
	public String toString() {
		String result = "Pessoa [nome=" + nome + 
				", telefone=" + telefone + 
				", endereco=" + endereco;
		
		if (estado != null) {
			result += ", estado=" + estado.getName() + "]";
		} else {
			result += ", estado=(não preenchido)]";
		}
		return result;
	}
}
