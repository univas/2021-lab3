package br.edu.univas.exception;

public class CheckedLoginException extends Exception {

	private static final long serialVersionUID = 7728924831815034570L;

	public CheckedLoginException(String message) {		
		super(message);
	}
}
