package br.edu.univas.controller;

import java.util.Scanner;

import br.edu.univas.dao.PessoaDAO;
import br.edu.univas.vo.Estado;
import br.edu.univas.vo.Pessoa;
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
			} else if (option == 2) {
				System.out.println("\n\nNão faz nada por enquanto ...\n\n");
			} else if (option == 3) {
				listPF();
			} else if (option == 4) {
				System.out.println("\n\nNão faz nada por enquanto ...\n\n");
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
		pessoa.setEstado(Estado.valueFrom(estado));

		pessoaDAO.save(pessoa);
	}
	
	private void listPF() {
		System.out.println(":::Lista de Pessoa Física Cadastrada:::");
		
		for (Pessoa pessoa : pessoaDAO.listAll()) {
			if (pessoa instanceof PessoaFisica) {
				PessoaFisica pf = (PessoaFisica) pessoa;
				System.out.println(pf);
			}
		}
	}
	
	private void printMenu() {
		System.out.println("1 - Cadastrar pessoa física");
		System.out.println("2 - Cadastrar pessoa jurídica");
		System.out.println("3 - Listar pessoa física");
		System.out.println("4 - Listar pessoa jurídica");
		System.out.println("9 - Sair");
		System.out.println("Digite uma opção:");
	}
	
	private int readInteger() {
		int result = scanner.nextInt();
		scanner.nextLine();
		return result;
	}
}
