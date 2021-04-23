package br.edu.univas.main;

import java.util.Scanner;

import br.edu.univas.vo.Triangulo;

public class StartpApp {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Digite o valor de A:");
		int x1 = scanner.nextInt();
		System.out.println("Digite o valor de B:");
		int x2 = scanner.nextInt();
		System.out.println("Digite o valor de C:");
		int x3 = scanner.nextInt();
		
		Triangulo triangulo = new Triangulo("TRIANGULO", x1, x2, x3);
		triangulo.print();
		
		scanner.close();
	}
}
