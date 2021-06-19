package br.edu.univas.main;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

public class StartApp {

	public static void main(String[] args) {
		List<String> alunos = new ArrayList<>();
		alunos.add("Rodrigo");
		alunos.add("João");
		alunos.add("José");
		
		String nome = alunos.get(1);
		System.out.println(nome);
		
		List<Integer> notas = new ArrayList<>();
		notas.add(10);
		notas.add(15);
		notas.add(20);
		
		Integer nota = notas.get(1);
		System.out.println(nota);
		
		List<Carro> carros = new ArrayList<>();
		carros.add(new Carro());
		
		Carro carro = carros.get(0);
		
		List<Aluno> alunos2 = new ArrayList<>();
		alunos2.add(new Aluno());
		
		Aluno aluno = alunos2.get(0);
		
		
		List cidades = new ArrayList<>();
		cidades.add("Pouso Alegre");
		cidades.add("Santa Rita do Sapucaí");
		
		String cidade = (String) cidades.get(0);
		
		
		//////////////////////////////////////
		MyContainer myContainer = new MyContainer();
		myContainer.set("Univas");
		String containerItem = (String) myContainer.get();
		
		//////////////////////////////////////
		MyGenericContainer<Carro> myGC1 = new MyGenericContainer<>();
		myGC1.set(new Carro());
		Carro c1 = myGC1.get();
		
		
		MyGenericContainer<File> myGC2 = new MyGenericContainer<>();
		myGC2.set(new File(""));
		File f1 = myGC2.get();
		
		//////////////////////////////////////
		//MyGenericContainer2<File> myGC22 = new MyGenericContainer2<>();
		MyGenericContainer2<Sedan> mySedan = new MyGenericContainer2<>();
		MyGenericContainer2<Carro> myCarro = new MyGenericContainer2<>();
		
		mySedan.set(new Sedan());
		Sedan s = mySedan.get();
				
		//////////////////////////////////////
		MyGenericContainer3<String, Integer> mgc33 = new MyGenericContainer3<>("Eduardo", 25);
		String alunoNome = mgc33.getKey();
		Integer alunoNota = mgc33.getValue();
				
		//////////////////////////////////////
		String s1 = MyGenericContainer4.process("Rodrigo");
		
		Integer int1 = MyGenericContainer4.process(12);
	}
}
