package com.edutecno.automotora;

public class Vendedor extends Persona {

	public String direccion;

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}
	
	public Vendedor(String rut, String nombre, int edad,String direccion){
		super(rut,nombre,edad);
		this.direccion = direccion;
	}
}
