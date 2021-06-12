package br.edu.univas.vo;

public enum Estado {

	MG("Minas Gerais", 12),
	SP("São Paulo", 153),
	RJ("Rio de Janeiro", 3434),
	ES("Espírito Santo", 2);
	
	private String name;
	private int population;
	
	private Estado(String name, int population) {
		this.name = name;
		this.population = population;
	}

	public static Estado valueFrom(String stateName) {
		for (Estado estado : Estado.values()) {
			if (estado.name.equals(stateName)) {
				return estado;
			}
		}
		return null;
	}

	public String getName() {
		return name;
	}

	public int getPopulation() {
		return population;
	}
	
	public static boolean isValidEstado(String stateName) {
		return valueFrom(stateName) != null;
	}
}
