package br.edu.univas.main;

import java.util.ArrayList;
import java.util.List;

import br.edu.univas.controller.UserController;
import br.edu.univas.controller.UserControllerImpl;

public class StartApp {

	public static void main(String[] args) {
		UserController controller = new UserControllerImpl();
		
		boolean successLogin = controller.login("admin", "abc123");
		if (successLogin) {
			System.out.println("Login executado com sucesso!");
		} else {
			System.out.println("Usuário/Senha errados!");
		}
		
		List<String> alunos = new ArrayList<>();
		alunos.add("Mateus");
		alunos.add("Brendon");
		
		for (String aluno : alunos) {
			System.out.println(aluno);
		}
		
		UserController u = new UserController() {
			
			@Override
			public boolean logout() {
				System.out.println("Estou dentro da classe anonima");
				return false;
			}
			
			@Override
			public boolean login(String username, String password) {
				System.out.println("Estou dentro da classe anonima");
				return false;
			}
		};
		
		
		u.login("abc", "abc");
		u.logout();
	}
}
