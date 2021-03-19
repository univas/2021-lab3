package br.edu.univas.vo;

public class Car {

	private String model;
	private String color;
	private int fabricationYear;
	private int modelYear;
	private int speed;
	
	public void accelerate() {
		speed += 10;
	}
	
	public void brake() {
		if (speed > 0) {
			speed -= 10;
		}
	}
	
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public int getFabricationYear() {
		return fabricationYear;
	}
	public void setFabricationYear(int fabricationYear) {
		this.fabricationYear = fabricationYear;
	}
	public int getModelYear() {
		return modelYear;
	}
	public void setModelYear(int modelYear) {
		this.modelYear = modelYear;
	}
	public int getSpeed() {
		return speed;
	}
}
