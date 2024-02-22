package com.ces2.clase3.model;

public interface Pagable {
	
	int TOPE_AUMENTO_EMPLEADO = 20; // Automáticamente se vuelve public static final
	int TOPE_AUMENTO_CONTRATISTA = 10; // Automáticamente se vuelve public static final
	
	default String aumentarPago(){
		// Esto sale si la clase que lo implementa no define su propio código
		return "Este empleado/contratista esta añorando un aumento.";
	};
	
	static double consultarLimiteDeAumento() {
		return 800_000;
	}
	
}
