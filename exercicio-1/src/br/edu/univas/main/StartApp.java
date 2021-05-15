package br.edu.univas.main;

import java.util.ArrayList;
import java.util.Scanner;

import br.edu.univas.vo.CLT;
import br.edu.univas.vo.Estagiario;
import br.edu.univas.vo.Funcionario;
import br.edu.univas.vo.Vendedor;

public class StartApp {

	//TODO
	//1 - Funcionario tem que ter nome
	//2 - Adicionar um menu novo: Calcular salario

	public static void main(String[] args) {
		//jeito 1
		StartApp app = new StartApp();
		app.initialize();
		
		//jeito 2
		//new StartApp().initialize();
	}
	
	public void initialize() {
		Scanner scanner = new Scanner(System.in);
		ArrayList<Funcionario> funcionarios = new ArrayList<>();
		int option = 0;
		
		do {
			printMenu();
			option = scanner.nextInt();
			
			if (option == 1) {
				cadastrar(scanner, funcionarios);
				
			} else if (option == 2) {
				listar(funcionarios);				
				
			} else if (option != 9) {
				System.out.println("Opção inválida!");
				
			} else {
				System.out.println("Bye bye");
			}		
			
		} while(option != 9);
		
		scanner.close();
	}
	
	private void cadastrar(Scanner scanner, ArrayList<Funcionario> funcionarios) {
		printSubMenu();
		int option = scanner.nextInt();
		Funcionario funcionario = null;
		
		System.out.println("Digite o salario base:");
		float salarioBase = scanner.nextFloat();
		
		if (option == 1) {
			funcionario = new CLT(salarioBase);
			funcionarios.add(funcionario);
			
		} else if (option == 2) {
			System.out.println("Digite o valor pago por hora:");
			float valorHora = scanner.nextFloat();
			funcionario = new Estagiario(salarioBase, valorHora);
			funcionarios.add(funcionario);
			
		} else if (option == 3) {
			System.out.println("Digite o valor da comissão:");
			float comissao = scanner.nextFloat();
			funcionario = new Vendedor(salarioBase, comissao);
			funcionarios.add(funcionario);
		}
	}
	
	private void listar(ArrayList<Funcionario> funcionarios) {
		System.out.println("::::Listagem de Funcionário::::");

		if (funcionarios.isEmpty()) {
			System.out.println("Nenhum funcionario cadastrado ainda!");
		}
		
		for (Funcionario funcionario : funcionarios) {
			System.out.println(funcionario);
		}
	}
	
	private void printMenu() {
		System.out.println("::::Cadastro de Funcionário::::");
		System.out.println("1 - Cadastrar Novo Funcionário");
		System.out.println("2 - Listar todos os Funcionários");
		System.out.println("9 - Sair");
	}
	
	private void printSubMenu() {
		System.out.println("::::Cadastro de Funcionário::::");
		System.out.println("1 - CLT");
		System.out.println("2 - Estagiário");
		System.out.println("3 - Vendedor");
		System.out.println("9 - Voltar");
	}

}
