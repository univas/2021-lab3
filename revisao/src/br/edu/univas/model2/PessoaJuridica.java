package br.edu.univas.model2;

import br.edu.univas.model.Pessoa;

public class PessoaJuridica extends Pessoa {

	public void test() {
		email = "rodrigo@gmail.com";
		//nome = "rodrigo";//não tem acesso
		//telefone = "1234-1234"; //não tem acesso
	}

	@Override
	public void fazAlgumaCoisa() {
		
	}
	
	
	@Override
	public boolean doLogin(String username, String password) {
		return super.doLogin(username, password);
	}
}
