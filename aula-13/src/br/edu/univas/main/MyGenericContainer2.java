package br.edu.univas.main;

public class MyGenericContainer2<T extends Carro> {

	private T value;
	
	public T get() {
		return value;
	}
	
	public void set(T value) {
		this.value = value;
	}
}
