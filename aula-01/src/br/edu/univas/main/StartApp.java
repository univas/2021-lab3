package br.edu.univas.main;

import java.util.Scanner;

import br.edu.univas.vo.Aluno;

public class StartApp {

	public static void main(String[] args) {
		int idade = 10;
		long idade2 = 11;
		float peso = 22.22f;
		Scanner leitura = new Scanner(System.in);
		
		String nome = leitura.nextLine();
		System.out.println("Olá " + nome);
		
		if (idade > 5) {
			System.out.println("Tem obrigação de ir pra escola");
		} else if (idade == 5) {
			System.out.println("Vai se preparando para a escola!");
		} else {
			System.out.println("Ainda não é obrigado a frequentar a escola!");
		}
		
		System.out.println("\nFOR\n");
		for (int i = 0; i < 10; i++) {
			System.out.println("Posição: " + i);
		}
		
		System.out.println("\nWHILE\n");
		int i = 0;
		while (i < 10) {
			System.out.println("Posição: " + i);
			i++;
		}
		
		System.out.println("\nDO - WHILE\n");
		i = 0;
		do {
			System.out.println("Posi��o: " + i);
			i++;
		} while (i < 10);
		
		int[] numerosSorteados = new int[15];
		numerosSorteados[0] = 5;
		numerosSorteados[1] = 21;
		numerosSorteados[14] = 11;
		
		int[][] ultimosSorteios = new int[5][15];
		ultimosSorteios[2][7] = 6;
		
		Aluno aluno1 = new Aluno();
		aluno1.nome = "RODRIGO";
		aluno1.telefone = 2134234;
	}
	
}
