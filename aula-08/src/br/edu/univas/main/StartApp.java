package br.edu.univas.main;

import br.edu.univas.vo.Pessoa;

public class StartApp {
	
	public static void main(String[] args) {
		if (args.length == 0) {
			System.out.println("SEM ARGUMENTO!!!");
			
		} else {
			
			for (String argument : args) {
				System.out.println(argument);
			}
			
			String usuario = args[0];
			String senha = args[3];
			
		}
	}
	
	public static void mains(String[] args) {
		Pessoa pessoa = new Pessoa();
		//não consegue pois "nome" é private 
		//pessoa.nome = "Rodrigo";
		
		pessoa.setNome("Rodrigo");
		pessoa.endereco = "Rua WWW";
		pessoa.printHello();
		System.out.println("Endereço: " + pessoa.endereco);
		//pessoa.email = "rodrigo@gmail.com";
		//pessoa.telefone = "1111-1111";
		
		
		Pessoa.endereco = "Rua x";
		Pessoa.printHello();
		
		StartApp app = new StartApp();
		app.teste();
		
		System.out.println("Endereço: " + pessoa.endereco);
	}
	
	public void teste() {
		Pessoa.printHello();
	}
	
}
