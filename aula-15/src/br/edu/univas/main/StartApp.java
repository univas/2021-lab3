package br.edu.univas.main;

import br.edu.univas.controller.UserController;

public class StartApp {

	public static void main(String[] args) {
		UserController controller = new UserController();
		controller.start();
	}
}
