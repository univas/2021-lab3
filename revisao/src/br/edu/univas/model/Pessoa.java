package br.edu.univas.model;

public abstract class Pessoa implements Login {

	private String nome;
	protected String email;
	String telefone;
	
	public Pessoa() {
		super();
	}
	
	public Pessoa(String nome) {
		this.nome = nome;
	}
	
	public Pessoa(String nome, String email) {
		setNome(nome);
		setEmail(email);
	}
	
	@Override
	public int soma(int a, int b) {
		return a + b - 1;
	}
	
	@Override
	public boolean doLogin(String username, String password) {
		return false;
	}
	
	public void imprimeDados() {
		System.out.println("Classe Pessoa 1.0");
	}
	
	public void imprimeDados(String value) {
		System.out.println("Classe Pessoa 1.0");
	}
	
	public void imprimeDados(String value, String value2) {
		System.out.println("Classe Pessoa 1.0");
	}
	
	public void imprimeDados(int value) {
		System.out.println("Classe Pessoa 1.0");
	}
	
	public abstract void fazAlgumaCoisa();

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

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Pessoa other = (Pessoa) obj;
		if (email == null) {
			if (other.email != null)
				return false;
		} else if (!email.equals(other.email))
			return false;
		return true;
	}
}
