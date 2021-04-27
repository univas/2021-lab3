package br.edu.univas.main;

import br.edu.univas.vo.Animal;
import br.edu.univas.vo.Cachorro;
import br.edu.univas.vo.Gato;

/**
 * 
 * @author rodrigo.faria
 *
 */
public class StartApp {

	/**
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		Animal animal1 = new Animal();
		animal1.emiteSom();
		//animal1.correrEmVoltaDeSiMesmo();
		//animal1.arranhar();
		
		Gato gato1 = new Gato();
		gato1.emiteSom();
		gato1.arranhar();
		//gato1.correrEmVoltaDeSiMesmo();
		
		Cachorro cachorro1 = new Cachorro();
		cachorro1.emiteSom();
		cachorro1.correrEmVoltaDeSiMesmo();
		cachorro1.setPeso(10);
		//cachorro1.arranhar();
		
		Animal animal2 = new Gato();
		Animal animal3 = new Cachorro();
		//as 2 linhas abaixo não compilam!
		//Gato gato2 = new Animal();
		//Cachorro cachorro2 = new Animal();
		
		System.out.println("*****************");
		animal2.emiteSom();
		animal3.emiteSom();
	
		if (animal3 instanceof Gato) {
			Gato g1 = (Gato) animal3;
			g1.arranhar();
			
		} else if (animal3 instanceof Cachorro) {
			Cachorro c1 = (Cachorro) animal3;
			c1.correrEmVoltaDeSiMesmo();
			c1.setPeso(3);
		}
	}
}
