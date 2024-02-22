package com.ces2.clase3.model;

public class Persona {
		
	private String name;
	private int porcentaje;
	private String type;
	
	public Persona() {
	}
	
	public Persona(String name, int porcentaje, String type) {
		this.name = name;
		this.porcentaje = porcentaje;
		this.type = type;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		
		
		this.name = name;
	}
	public int getPorcentaje() {
		return porcentaje;
	}
	public void setPorcentaje(int porcentaje) {
		this.porcentaje = porcentaje;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	
	
}
