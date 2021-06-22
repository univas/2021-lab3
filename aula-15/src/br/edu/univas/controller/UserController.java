package br.edu.univas.controller;

import java.util.NoSuchElementException;
import java.util.Scanner;

import br.edu.univas.exception.CheckedLoginException;
import br.edu.univas.model.User;

public class UserController {

	private Scanner scanner;
	
	public void start() {
		scanner = new Scanner(System.in);
		try {
			doLogin();
			
			doLogin2();
			return;
		} finally {
			scanner.close();
		}		
	}
	
	private void doLogin() {
		LoginController controller = new LoginController();
		User user = new User();
		
		do {
			try {
				System.out.println("Digite seu e-mail");
				user.setEmail(scanner.nextLine());
				
				System.out.println("Digite sua senha");
				user.setPassword(scanner.nextLine());
				
				controller.login(user);
				break;
			} catch(CheckedLoginException e) {
				System.out.println(e.getMessage());
				System.out.println("Por favor tente novamente!");
			} catch (IllegalStateException | NoSuchElementException e) {
				scanner = new Scanner(System.in);
				System.out.println("Por favor tente novamente!");
			} finally {
				//trata alguma coisa que a gte quer fazer por ultimo!
			}
			
		} while(true);
	}
	
	
	private void doLogin2() {
		LoginController controller = new LoginController();
		User user = new User();
		
		do {
			System.out.println("Digite seu e-mail");
			user.setEmail(scanner.nextLine());
			
			System.out.println("Digite sua senha");
			user.setPassword(scanner.nextLine());
			
			controller.login2(user);
			break;
			
		} while(true);
	}
	
}
