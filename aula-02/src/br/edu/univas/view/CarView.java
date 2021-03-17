package br.edu.univas.view;

import br.edu.univas.vo.Car;

public class CarView {

	public void printMenu() {
		System.out.println("***MENU***");
		System.out.println("1 - Cadastrar Carro");
		System.out.println("2 - Listar Carro");
		System.out.println("3 - Editar Carro");
		System.out.println("4 - Remover Carro");
		System.out.println("9 - Sair");
	}
	
	public void printSaveCar() {
		System.out.println("***CADASTRO DE CARRO***");
	}
	
	public void printListCar() {
		System.out.println("***CARROS CADASTRADOS***");
	}
	
	public void printEditCar() {
		System.out.println("***EDITAR CARRO***");
	}
	
	public void printRemoveCar() {
		System.out.println("***REMOVER CARRO***");
	}
	
	public void printWrongOption() {
		System.out.println("Opção inválida! "
				+ "Digite uma opção correta!");
	}
	
	public void informModel() {
		System.out.println("Digite o modelo:");
	}
	
	public void informColor() {
		System.out.println("Digite a cor:");
	}
	
	public void informFabricationYear() {
		System.out.println("Digite o ano de fabricação:");
	}
	
	public void informModelYear() {
		System.out.println("Digite o ano do modelo:");
	}
	
	public void printCarInformation(Car car, int position) {
		System.out.println("Carro:::" + position);
		System.out.println(car.getModel());
		System.out.println(car.getColor());
		System.out.println(car.getFabricationYear());
		System.out.println(car.getModelYear());
	}
	
	public void editCarMessage() {
		System.out.println("Escolha um carro:");
	}
	
	public void editCarSuccessMessage() {
		System.out.println("Carro editado com sucesso!");
	}
	
	public void deleteCarMessage() {
		System.out.println("Escolha um carro:");
	}
	
	public void deleteCarSuccessMessage() {
		System.out.println("Carro removido com sucesso!");
	}
}
