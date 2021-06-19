package br.edu.univas.main;

public class MyGenericContainer<T> {
	
	private T value;
	
	public T get() {
		return value;
	}
	
	public void set(T value) {
		this.value = value;
	}
}
