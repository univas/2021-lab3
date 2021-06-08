package br.edu.univas.main;

import br.edu.univas.controller.PessoaController;

public class StartApp {

	public static void main(String[] args) {
		PessoaController controller = new PessoaController();
		controller.startMenu();
	}
}
