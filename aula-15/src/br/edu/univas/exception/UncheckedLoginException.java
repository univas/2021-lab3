package br.edu.univas.exception;

public class UncheckedLoginException extends RuntimeException  {

	private static final long serialVersionUID = -413894201321915294L;

	public UncheckedLoginException(String message) {
		super(message);
	}
}
