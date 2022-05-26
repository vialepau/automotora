package com.edutecno.automotora;

public class Bus extends Vehiculo{
	
	public Bus(String color, String patente,int cantidadDeAsientos) {
		super(color, patente);
		this.cantidadDeAsientos = cantidadDeAsientos;
	}

	private int cantidadDeAsientos;

	public int getCantidadDeAsientos() {
		return cantidadDeAsientos;
	}

	public void setCantidadDeAsientos(int cantidadDeAsientos) {
		this.cantidadDeAsientos = cantidadDeAsientos;
	}
	
	public int asientosDisponibles() {
		return getCantidadDeAsientos();
		
	}
	
	
}
