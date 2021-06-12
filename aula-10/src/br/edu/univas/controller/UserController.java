package br.edu.univas.controller;

public interface UserController {

	boolean login(String username, String password);
	
	boolean logout();
	
	default void doSomething() {
		System.out.println("Faz alguma coisa na interface");
	}
}
