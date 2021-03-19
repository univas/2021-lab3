package br.edu.univas.main;

import java.util.ArrayList;
import java.util.Scanner;

import br.edu.univas.view.CarView;
import br.edu.univas.vo.Car;

public class StartApp {

	private static CarView view = new CarView();
	private static ArrayList<Car> cars = new ArrayList<>();
	private static Scanner scanner = new Scanner(System.in);
	
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
				editCar();
				
			} else if (option == 4) {
				view.printRemoveCar();
				deleteCar();
				
			} else if (option == 5) {
				view.printAcelerateCar();
				acelerateCar();
				
			} else if (option == 6) {
				view.printBrakeCar();
				brakeCar();
				
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
		
		cars.add(car);
	}
	
	private static void listCars() {
		for (int i = 0; i < cars.size(); i++) {
			Car c1 = cars.get(i);
			view.printCarInformation(c1, (i + 1));
		}
	}
	
	private static void editCar() {
		view.chooseCarMessage();
		listCars();
		
		int carIndexSelected = readInteger() - 1;
		Car car = cars.get(carIndexSelected);
		view.informModel();
		car.setModel(scanner.nextLine());
		
		view.informModelYear();
		car.setModelYear(readInteger());
		
		view.informColor();
		car.setColor(scanner.nextLine());
				
		view.informFabricationYear();
		car.setFabricationYear(readInteger());
		
		view.editCarSuccessMessage();
	}
	
	private static void deleteCar() {
		view.deleteCarMessage();
		listCars();
		
		int carIndexSelected = readInteger() - 1;
		cars.remove(carIndexSelected);
		view.deleteCarSuccessMessage();
	}
	
	private static void acelerateCar() {
		view.chooseCarMessage();
		listCars();
		
		int carIndexSelected = readInteger() - 1;
		Car car = cars.get(carIndexSelected);
		car.accelerate();
	}
	
	private static void brakeCar() {
		view.chooseCarMessage();
		listCars();
		
		int carIndexSelected = readInteger() - 1;
		Car car = cars.get(carIndexSelected);
		car.brake();
	}
	
	private static int readInteger() {
		int value = scanner.nextInt();
		scanner.nextLine();
		return value;
	}
}
