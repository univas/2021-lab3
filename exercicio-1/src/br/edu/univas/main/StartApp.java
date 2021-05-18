package br.edu.univas.main;

import java.util.ArrayList;
import java.util.Scanner;

import br.edu.univas.vo.CLT;
import br.edu.univas.vo.Estagiario;
import br.edu.univas.vo.Funcionario;
import br.edu.univas.vo.Vendedor;

public class StartApp {

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
			option = readInteger(scanner);
			
			if (option == 1) {
				cadastrar(scanner, funcionarios);
				
			} else if (option == 2) {
				listar(funcionarios);

			} else if (option == 3) {
				calculaSalario(funcionarios, scanner);

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
		int option = readInteger(scanner);
		Funcionario funcionario = null;

		System.out.println("Digite o nome do funcionário:");
		String nome = scanner.nextLine();

		System.out.println("Digite o salario base:");
		float salarioBase = readFloat(scanner);
		
		if (option == 1) {
			funcionario = new CLT(salarioBase, nome);
			funcionarios.add(funcionario);
			
		} else if (option == 2) {
			System.out.println("Digite o valor pago por hora:");
			float valorHora = readFloat(scanner);
			funcionario = new Estagiario(salarioBase, valorHora, nome);
			funcionarios.add(funcionario);
			
		} else if (option == 3) {
			System.out.println("Digite o valor da comissão:");
			float comissao = readFloat(scanner);
			funcionario = new Vendedor(salarioBase, comissao, nome);
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
	
	private void calculaSalario(ArrayList<Funcionario> funcionarios, Scanner scanner) {

		for (Funcionario funcionario : funcionarios) {
			System.out.println("Funcionário: " + funcionario.getNome());

			if (funcionario instanceof Estagiario) {
				System.out.println("Digite a quantidade de horas trabalhadas para o calculo do salário:");
				funcionario.setHorasTrabalhadas(readFloat(scanner));
			}

			System.out.println("Salário calculado: " + funcionario.calculaSalario());
		}
	}

	private void printMenu() {
		System.out.println("::::Cadastro de Funcionário::::");
		System.out.println("1 - Cadastrar Novo Funcionário");
		System.out.println("2 - Listar todos os Funcionários");
		System.out.println("3 - Calcular salário");
		System.out.println("9 - Sair");
	}

	private void printSubMenu() {
		System.out.println("::::Cadastro de Funcionário::::");
		System.out.println("1 - CLT");
		System.out.println("2 - Estagiário");
		System.out.println("3 - Vendedor");
		System.out.println("9 - Voltar");
	}

	private int readInteger(Scanner scanner) {
		int option = scanner.nextInt();
		scanner.nextLine();
		return option;
	}

	private float readFloat(Scanner scanner) {
		float option = scanner.nextFloat();
		scanner.nextLine();
		return option;
	}
}
