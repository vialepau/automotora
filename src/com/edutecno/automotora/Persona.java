package com.edutecno.automotora;

public class Persona {

	private String rut;
	private String nombre;
	protected int edad;
	
	public String getRut() {
		return rut;
	}
	public String getNombre() {
		return nombre;
	}
	public int getEdad() {
		return edad;
	}
	public void setRut(String rut) {
		this.rut = rut;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public void setEdad(int edad) {
		this.edad = edad;
	}
	
	public Persona(String rut, String nombre, int edad) {
		this.rut = rut;
		this.nombre = nombre;
		this.edad = edad;
		
	}
	//agregado para desafio evaluado
	public Persona(int edad) {
		this.edad = edad;
	}
	
	@Override
	public String toString() {
		
		return "edad = " + edad+ "";
	}
}

