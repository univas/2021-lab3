package br.edu.univas.main;

import br.edu.univas.vo.Animal;
import br.edu.univas.vo.Cachorro;
import br.edu.univas.vo.Gato;

public class StartApp {

	public static void main(String[] args) {
		Gato gato = new Gato();
		gato.setCor("Branco");
		gato.setRaca("Siâmes");
		gato.emiteSom();
		gato.arranha();
		
		Cachorro cachorro = new Cachorro();
		cachorro.setCor("Amarelo");
		cachorro.setRaca("Tomba lata");
		cachorro.emiteSom();
		
		Animal qualquerAnimal = new Animal();
		qualquerAnimal.setCor("Azul");
		qualquerAnimal.setRaca("Arara Azul");
		qualquerAnimal.emiteSom();
		
		imprimeAnimal(qualquerAnimal);
		imprimeAnimal(cachorro);
		imprimeAnimal(gato);
	}
	
	private static void imprimeAnimal(Animal animal) {
		System.out.println(animal);
	}
}
