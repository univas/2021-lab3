package br.edu.univas.controller;

import java.util.Scanner;

import br.edu.univas.exception.PaymentMethodNotAllowedException;
import br.edu.univas.vo.AccountDebit;
import br.edu.univas.vo.BankSlip;
import br.edu.univas.vo.CreditCard;
import br.edu.univas.vo.Customer;
import br.edu.univas.vo.Pix;

public class CustomerController {

	public Customer createCustomer() throws PaymentMethodNotAllowedException {
		Scanner scanner = new Scanner(System.in);
		
		try {
			System.out.println("Criando customer");
			
			Customer customer = new Customer();
			System.out.println("Digite o nome:");
			customer.setName(scanner.nextLine());
			
			System.out.println("Digite o CPF:");
			customer.setCpf(scanner.nextLine());
			
			System.out.println("Digite o meio de pagamento:");
			String metodoPagamento = scanner.nextLine();
			
			setPaymentMethod(customer, metodoPagamento);
			return customer;
		} finally {
			scanner.close();
		}
	}
	
	private void setPaymentMethod(Customer customer, String metodoPagamento)
			throws PaymentMethodNotAllowedException {

		if (metodoPagamento.equals("cartao_credito")) {
			customer.setPaymentMethod(new CreditCard());
		
		} else if (metodoPagamento.equals("debito_em_conta")) {
			customer.setPaymentMethod(new AccountDebit());
		
		} else if (metodoPagamento.equals("pix")) {
			customer.setPaymentMethod(new Pix());
		
		} else if (metodoPagamento.equals("boleto")) {
			customer.setPaymentMethod(new BankSlip());
		
		} else {
			throw new PaymentMethodNotAllowedException("Meio de pagamento inválido!");
		}
	}
	
}
