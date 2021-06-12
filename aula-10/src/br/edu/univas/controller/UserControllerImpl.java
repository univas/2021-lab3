package br.edu.univas.controller;

public class UserControllerImpl implements UserController,
								PrintData {

	@Override
	public boolean login(String username, String password) {
		if (username.equals("admin") &&
			password.equals("admin")) {
			return true;
		}
		return false;
	}

	@Override
	public boolean logout() {
		return true;
	}

	@Override
	public void print(String message) {
		System.out.println("Mensagem recebida: " + message);
	}

	@Override
	public void doSomething() {
		System.out.println("NÃO VOU FAZER NADA!!!");
	}
}
