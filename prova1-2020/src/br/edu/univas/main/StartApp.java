package br.edu.univas.main;

import java.util.ArrayList;
import java.util.Scanner;

import br.edu.univas.vo.Estabelecimento;
import br.edu.univas.vo.Lanchonete;
import br.edu.univas.vo.Pizzaria;
import br.edu.univas.vo.Restaurante;

public class StartApp {

	public static void main(String[] args) {
		ArrayList<Estabelecimento> estabelecimentos = new 
				ArrayList<>();
		Scanner scanner = new Scanner(System.in);
		
		for (int i = 0; i < 5; i++) {
			System.out.println("Escolha um tipo de estabelecimento:");
			System.out.println("1 - Lanchonete");
			System.out.println("2 - Restaurante");
			System.out.println("3 - Pizzaria");
			System.out.println("Digite a sua opção:");
			int opcao = scanner.nextInt();
			scanner.nextLine();
			
			System.out.println("Digite o nome do estabelecimento:");
			String nome = scanner.nextLine();
			
			if (opcao == 1) {
				Lanchonete lanchonete = new Lanchonete();
				lanchonete.setNome(nome);
				estabelecimentos.add(lanchonete);
				
			} else if (opcao == 2) {
				Restaurante restaurante = new Restaurante();
				restaurante.setNome(nome);
				estabelecimentos.add(restaurante);
				
			} else if (opcao == 3) {
				Pizzaria pizzaria = new Pizzaria();
				pizzaria.setNome(nome);
				estabelecimentos.add(pizzaria);
			}
		}
		
		scanner.close();
	}
}
