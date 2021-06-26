package br.edu.univas.model;

public interface Login {

	boolean doLogin(String username, String password);
	
	default int soma(int a, int b) {
		return a + b;
	}
	
}
