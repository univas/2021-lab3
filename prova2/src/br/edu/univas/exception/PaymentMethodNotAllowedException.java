package br.edu.univas.exception;

public class PaymentMethodNotAllowedException extends Exception {

	private static final long serialVersionUID = 4634440138891297855L;

	public PaymentMethodNotAllowedException(String message) {
		super(message);
	}

}
