package br.edu.univas.vo;

public class Pessoa {

	private String nome;
	protected String email;
	String telefone;
	public static String endereco;
	
	public static void printHello() {
		System.out.println("Hello");
		
		//nome = "hello";
		
		endereco = "Rua XPTO";
	}
	
	public static void a() {
		printHello();
		//System.out.println(getNome());
		
		Pessoa pessoa = new Pessoa();
		pessoa.getNome();
	}
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getTelefone() {
		return telefone;
	}
	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}
}
