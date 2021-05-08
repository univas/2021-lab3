package br.edu.univas;

import java.util.ArrayList;

import br.edu.univas.vo.Animal;
import br.edu.univas.vo.Cachorro;
import br.edu.univas.vo.Gato;

public class StartApp {

	public static void main(String[] args) {
		Animal animal = new Gato();
		animal.comer();
		
		Animal animal2 = new Cachorro();
		animal2.comer();
		
		Gato gato = new Gato();
		gato.comer();
		
		Cachorro cachorro = new Cachorro();
		cachorro.comer();
		
		ArrayList<Animal> animais = new ArrayList<>();
		animais.add(gato);
		animais.add(cachorro);
		animais.add(animal);
		animais.add(animal2);
		
		Animal[] animais2 = new Animal[4];
		animais2[0] = gato;
		animais2[1] = cachorro;
		animais2[2] = animal;
		animais2[3] = animal2;
	}
}
