package br.edu.univas.model;

import br.edu.univas.exception.MyException;

public class Lista<T> {

	private T value;
	
	public T getValue() throws MyException {
		return value; 
	}
	
	public void setValue(T value) {
		
		this.value = value; 
	}
}
