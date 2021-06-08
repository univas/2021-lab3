package br.edu.univas.controller;

import java.util.Scanner;

import br.edu.univas.dao.PessoaDAO;
import br.edu.univas.vo.Estado;
import br.edu.univas.vo.PessoaFisica;

public class PessoaController {

	private Scanner scanner = new Scanner(System.in);
	private PessoaDAO pessoaDAO = new PessoaDAO();
	
	public void startMenu() {
		System.out.println("Bem vindo ao cadastro de pessoas!");
		
		int option = 0;
		
		do {
			printMenu();
			option = readInteger();
			
			if (option == 1) {
				registerPF();
			}
			
		} while (option != 9);
		
		System.out.println("Bye bye!");
	}
	
	private void registerPF() {
		PessoaFisica pessoa = new PessoaFisica();

		System.out.println(":::Cadastro de Pessoa Física:::");
		System.out.println("Digite o nome da pessoa:");
		pessoa.setNome(scanner.nextLine());
		
		System.out.println("Digite o cpf da pessoa:");
		pessoa.setCpf(scanner.nextLine());
		
		System.out.println("Digite o telefone da pessoa:");
		pessoa.setTelefone(scanner.nextLine());
		
		System.out.println("Digite o endereço da pessoa:");
		pessoa.setEndereco(scanner.nextLine());
		
		System.out.println("Digite o estado da pessoa:");
		String estado = scanner.nextLine();
		
		Estado qualEstado = Estado.SP;
		
		
		if (estado.equals("Minas Gerais") || estado.equals("São Paulo") ||
			estado.equals("Rio de Janeiro") || estado.equals("Espírito Santo")) {
			pessoa.setEstado(estado);
		}
		
		pessoaDAO.save(pessoa);
	}
	
	private void printMenu() {
		System.out.println("1 - Cadastrar pessoa física");
		System.out.println("2 - Cadastrar pessoa jurídica");
		System.out.println("3 - Listar pessoa física");
		System.out.println("4 - Listar pessoa jurídica");
		System.out.println("Digite uma opção:");
	}
	
	private int readInteger() {
		int result = scanner.nextInt();
		scanner.nextLine();
		return result;
	}
}
