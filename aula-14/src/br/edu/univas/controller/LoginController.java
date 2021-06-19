package br.edu.univas.controller;

import java.io.IOException;

import br.edu.univas.model.User;

public class LoginController {

	public void executeLogin(User user) throws IOException {
		
		boolean logged = user.getLogin().equals("admin") &&
				user.getPassword().equals("admin");
		
		if (!logged) {
			throw new IOException("deu ruim na autenticação");
		}
	}
	
}
