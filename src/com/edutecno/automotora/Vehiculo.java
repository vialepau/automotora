package com.edutecno.automotora;

public class Vehiculo {

	private String color;
	private static String patente;
	
	public String getColor() {
		return color;
	}
	public static String getPatente() {
		return patente;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public void setPatente(String patente) {
		Vehiculo.patente = patente;
	}
	
	public Vehiculo(String color, String patente) {
		this.color = color;
		Vehiculo.patente = patente;
	}
	//agregado para desafio evaluado
	//se cambia vaiable a static para poder utilizarla 
	public Vehiculo(String patente) {
		Vehiculo.patente = patente;
	}
	
	@Override
	public String toString() {
		
		return patente;
	}
	
}
