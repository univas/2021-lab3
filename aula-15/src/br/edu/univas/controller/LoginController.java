package br.edu.univas.controller;

import br.edu.univas.exception.CheckedLoginException;
import br.edu.univas.exception.UncheckedLoginException;
import br.edu.univas.model.User;

public class LoginController {

	public void login(User user) throws CheckedLoginException {
		if (!user.getEmail().equals("admin") || 
			!user.getPassword().equals("admin")) {
			throw new CheckedLoginException("Usuário/Senha incorretos!"); 
		}
	}
	
	public void login2(User user) {
		if (!user.getEmail().equals("admin") || 
			!user.getPassword().equals("admin")) {
			throw new UncheckedLoginException("Usuário/Senha incorretos!");
		}
	}
}
