package com.edutecno.automotora;


public class Taxi extends Vehiculo {

	private int valorPasaje;

	public int getValorPasaje() {
		return valorPasaje;
	}

	public void setValorPasaje(int valorPasaje) {
		this.valorPasaje = valorPasaje;
	}
	
	public Taxi(String color, String patente ,int valorPasaje) {
		super(color, patente);
		this.valorPasaje = valorPasaje;
				
	}
	
	public int pagarPasaje(int pasaje) {
		
		int vuelto = 0;
		
		if(pasaje>valorPasaje) {
			vuelto = pasaje-valorPasaje;
			
		}else {
			vuelto = valorPasaje;
		}
		
		return vuelto;
			
	}
}
