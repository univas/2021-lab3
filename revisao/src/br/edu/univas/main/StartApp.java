package br.edu.univas.main;

import br.edu.univas.exception.MyException;
import br.edu.univas.model.Lista;
import br.edu.univas.model.Pessoa;
import br.edu.univas.model.PessoaFisica;
import br.edu.univas.model2.PessoaJuridica;

public class StartApp {

	public static void main(String[] args) {
		Pessoa pessoa1 = new PessoaFisica();
		pessoa1.setEmail("joao@gmail.com");
		
		Pessoa pessoa2 = new PessoaJuridica();
		pessoa2.setEmail("joao@gmail.com");
		
		pessoa1.imprimeDados();
		pessoa2.imprimeDados(2);
		
		if (pessoa1 instanceof PessoaFisica) {
			PessoaFisica pf1 = (PessoaFisica) pessoa1;
			//lancaria exceção
			PessoaJuridica pf2 = (PessoaJuridica) pessoa1;
		}
		
//		Pessoa pessoa3 = new Pessoa();
//		Pessoa pessoa4 = new Pessoa("João");
//		Pessoa pessoa5 = new Pessoa("João", "joao@gmail.com");
		
		//aqui em baixo vai apontar para o mesmo objeto
		//pessoa2 = pessoa1;
		
		if (pessoa1 == pessoa2) {
			//faz alguma coisa
		}
		
		if (pessoa1.equals(pessoa2)) {
			//faz alguma coisa
		}
		//int long short byte char boolean double float
		Integer a = Integer.valueOf(10);
		Integer b = 10;
		if (a.equals(b)) {
			System.out.println("A");
		}
		
		if (a == b) {
			System.out.println("B");
		}
		
		String nome1 = "Rodrigo";
		String nome2 = "Rodrigo";
		String nome3 = new String("Rodrigo");
		
		if (nome1 == nome2) {
			System.out.println("C");
		}
		
		if (nome1 == nome3) {
			System.out.println("D");
		}
		
		if (nome1.equals(nome2)) {
			System.out.println("E");
		}
		
		int c = 2;
		PessoaFisica p = new PessoaFisica();
		p.test(c);
		
		try {
			Lista<PessoaJuridica> minhaLista = new Lista<>();
			minhaLista.setValue(new PessoaJuridica());
			PessoaJuridica pj = minhaLista.getValue();
			
			Lista<PessoaFisica> minhaLista22 = new Lista<>();
			minhaLista22.setValue(new PessoaFisica());
			PessoaFisica pf = minhaLista22.getValue();
			
			Lista minhaLista33 = new Lista<>();
			minhaLista33.setValue(new PessoaFisica());
			minhaLista33.setValue("abc");
			
			String valor = (String) minhaLista33.getValue();
			
		} catch(MyException e) {
			e.printStackTrace();
		} finally {
			System.out.println("sempre vai ser executado");
		}
	}
}
