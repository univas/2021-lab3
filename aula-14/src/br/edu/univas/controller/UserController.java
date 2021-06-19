package br.edu.univas.controller;

import java.io.IOException;
import java.util.Scanner;

import br.edu.univas.model.User;

public class UserController {

	private Scanner scanner;
	
	public void start() {
		scanner = new Scanner(System.in);
		
		do {
			User user = getUserInformation();
			
			LoginController loginController = new LoginController();

			try {	
				loginController.executeLogin(user);
				System.out.println("Usuário autenticado com sucesso");
				break;
			} catch (IOException e) {
				System.out.println("Usuário/Senha incorretos :(");
				e.printStackTrace();
			}

		} while (true);
		
		scanner.close();
	}
	
	private User getUserInformation() {
		User user = new User();
		
		System.out.println("Por favor, digite seu login:");
		user.setLogin(scanner.nextLine());
		
		System.out.println("Por favor, digite sua senha:");
		user.setPassword(scanner.nextLine());
		
		return user;
	}
	
}
