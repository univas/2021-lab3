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
		
		
		Animal animal = new Animal();
		animal.setCor("Azul");
		animal.setRaca("Arara Azul");
		animal.emiteSom();
		
	}
	
}
