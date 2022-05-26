package com.edutecno.automotora;

public class Cliente extends Persona{

	private static int edad;

	public static int getEdadCLi() {
		return edad;
	}

	public void setEdadCLi(int edadCli) {
		Cliente.edad = edadCli;
	}
	
	public Cliente(String rut, String nombre, int edad,int edadCli) {
		super(rut,nombre,edad);
		Cliente.edad = edadCli;
	}
	//agregado para desafio evaluado
	public Cliente(int edad) {
		super(edad);
		Cliente.edad=edad;
	}
}
