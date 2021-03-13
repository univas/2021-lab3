package br.edu.univas.main;

import java.util.Scanner;

import br.edu.univas.view.CarView;
import br.edu.univas.vo.Car;

public class StartApp {

	private static CarView view = new CarView();
	private static Car[] cars = new Car[10];
	private static Scanner scanner = new Scanner(System.in);
	private static int position = 0;
	
	public static void main(String[] args) {		
		int option = 0;
		
		do {
			view.printMenu();
			option = readInteger();
			
			if (option == 1) {
				view.printSaveCar();
				saveCar();
				
			} else if (option == 2) {
				view.printListCar();
				listCars();
				
			} else if (option == 3) {
				view.printEditCar();
				
			} else if (option == 4) {
				view.printRemoveCar();
				
			} else if (option != 9) {
				view.printWrongOption();
			}
			
		} while (option != 9);
	}
	
	private static void saveCar() {
		Car car = new Car();
		view.informModel();
		car.setModel(scanner.nextLine());
		
		view.informModelYear();
		car.setModelYear(readInteger());
		
		view.informColor();
		car.setColor(scanner.nextLine());
				
		view.informFabricationYear();
		car.setFabricationYear(readInteger());
		
		cars[position++] = car;
	}
	
	private static void listCars() {
		for (int i = 0; i < 10; i++) {
			Car c1 = cars[i];
			if (c1 != null) {					
				System.out.println("Carro:::");
				System.out.println(c1.getModel());
				System.out.println(c1.getColor());
				System.out.println(c1.getFabricationYear());
				System.out.println(c1.getModelYear());
			}
		}
	}
	
	private static int readInteger() {
		int value = scanner.nextInt();
		scanner.nextLine();
		return value;
	}
}
