package br.edu.univas.dao;

import java.util.ArrayList;
import java.util.List;

import br.edu.univas.vo.Pessoa;

public class PessoaDAO {

	private static List<Pessoa> my_database = new ArrayList<>();
	
	public void save(Pessoa pessoa) {
		my_database.add(pessoa);
	}
	
}
