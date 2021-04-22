package br.edu.univas.main;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

import br.edu.univas.vo.Carro;
import br.edu.univas.vo.Competidor;
import br.edu.univas.vo.Moto;

public class StartApp {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		ArrayList<Competidor> competidores = new ArrayList<>();
		cadastrar(scanner, competidores);
		corrida(competidores);
		Competidor vencedor = findVencedor(competidores);
		
		System.out.println("O vencedor foi: " + vencedor.getApelido());
		System.out.println("Com a velocidade de : " + vencedor.getVeiculo().getVelocidadeAtual());
		
		scanner.close();
	}
	
	private static Competidor findVencedor(ArrayList<Competidor> competidores) {
		Competidor competidor = competidores.get(0);
		
		for (int i = 1; i < competidores.size(); i++) {
			Competidor c = competidores.get(i);
			if (c.getVeiculo().getVelocidadeAtual() > competidor.getVeiculo().getVelocidadeAtual()) {
				competidor = c;
			}
		}
		
		return competidor;
	}

	private static void corrida(ArrayList<Competidor> competidores) {
		Random random = new Random();
		
		for (int i = 0; i < 10; i++) {
			for (int j = 0; j < competidores.size(); j++) {
				Competidor competidor = competidores.get(j);
				int value = random.nextInt(16) + 5;
				competidor.getVeiculo().acelerar(value);
			}
		}
	}

	public static void cadastrar(Scanner scanner, ArrayList<Competidor> competidores) {
		for (int i = 0; i < 5; i++) {
			Competidor competidor = new Competidor();
			System.out.println("Cadastro de competidor");
			System.out.println("Digite o apelido:");
			competidor.setApelido(scanner.nextLine());
			
			System.out.println("Selecione o tipo do veiculo: ");
			System.out.println("1 - Carro");
			System.out.println("2 - Moto");
			
			int option = scanner.nextInt();
			scanner.nextLine();
			
			if (option == 1) {
				Carro carro = new Carro();
				System.out.println("Digite a cor do carro:");
				carro.setCor(scanner.nextLine());
				
				System.out.println("Digite o ano de fabricação:");
				carro.setAnoFabricacao(scanner.nextInt());
				scanner.nextLine();
				
				System.out.println("Digite o ano modelo:");
				carro.setAnoModelo(scanner.nextInt());
				scanner.nextLine();
				
				System.out.println("Digite o torque do motor:");
				carro.getMotor().setTorque(scanner.nextDouble());
				scanner.nextLine();
				
				System.out.println("Digite a potência do motor:");
				carro.getMotor().setPotencia(scanner.nextInt());
				scanner.nextLine();
				competidor.setVeiculo(carro);
				
			} else if (option == 2) {
				Moto moto = new Moto();
				System.out.println("Digite a cor da moto:");
				moto.setCor(scanner.nextLine());
				
				System.out.println("Digite o ano de fabricação:");
				moto.setAnoFabricacao(scanner.nextInt());
				scanner.nextLine();
				
				System.out.println("Digite o ano modelo:");
				moto.setAnoModelo(scanner.nextInt());
				scanner.nextLine();
				
				System.out.println("Digite o torque do motor:");
				moto.getMotor().setTorque(scanner.nextDouble());
				scanner.nextLine();
				
				System.out.println("Digite a potência do motor:");
				moto.getMotor().setPotencia(scanner.nextInt());
				scanner.nextLine();
				competidor.setVeiculo(moto);
			}
			
			competidores.add(competidor);
		}
	}
}
