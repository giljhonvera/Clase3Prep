package com.ces2.clase3.model;

public class Contratista extends Persona implements Pagable  {
	
	public Contratista(String name, int porcentaje, String type) {
		super(name,porcentaje,type);
	}
	
	public String aumentarPago(){
		
		String mensaje1 = getName()+", CONTRATISTA: obtiene aumento del, "+getPorcentaje()+"%";
		
		String mensaje2 = getName()+", CONTRATISTA: solicita aumento del "+getPorcentaje()+
				"%, cancelado por exceder el "+Pagable.TOPE_AUMENTO_CONTRATISTA+"%";

		return (getPorcentaje() <= Pagable.TOPE_AUMENTO_CONTRATISTA)? mensaje1: mensaje2;
	};
}
