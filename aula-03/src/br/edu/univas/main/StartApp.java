package br.edu.univas.main;

import br.edu.univas.vo.Aluno;

public class StartApp {

	public static void main(String[] args) {
		int idadeAlunoA = 10;
		int idadeAlunoB = 11;
		
		Aluno alunoA = new Aluno();
		alunoA.setNome("João");
		alunoA.setCpf("123456");
		
		Aluno alunoB = new Aluno();
		alunoB.setNome("José");
		alunoB.setCpf("123456");
		
		if (idadeAlunoA == idadeAlunoB) {
			System.out.println("Os alunos tem a mesma idade!");
		} else {
			System.out.println("Os alunos tem idades diferentes!");
		}
		
		if (alunoA == alunoB) {
			System.out.println("Aluno A é o aluno B");
		} else {
			System.out.println("Os alunos A e B são diferentes!");
		}
		
		if (alunoA.equals(alunoB)) {
			System.out.println("Aluno A é igual ao B");
		} else {
			System.out.println("Aluno A não é igual ao aluno B!");
		}
		
	}
	
}
