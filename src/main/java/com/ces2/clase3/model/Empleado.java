package com.ces2.clase3.model;

import java.io.Serializable;

public class Empleado extends Persona implements Pagable {
	
	

	public Empleado(String name, int porcentaje, String type) {
		super(name,porcentaje,type);
		
	}

//	public String aumentarPago(){
//		
//		String mensaje1 = getName()+", EMPLEADO: obtiene aumento del, "+getPorcentaje()+"%";
//		
//		String mensaje2 = getName()+", EMPLEADO: solicita aumento del "+getPorcentaje()+
//				"%, cancelado por exceder el "+Pagable.TOPE_AUMENTO_EMPLEADO+"%";
//
//		return (getPorcentaje() <= Pagable.TOPE_AUMENTO_EMPLEADO)? mensaje1: mensaje2;
//	};
}
