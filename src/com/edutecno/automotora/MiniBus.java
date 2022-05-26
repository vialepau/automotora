package com.edutecno.automotora;

public class MiniBus extends Bus {

	public MiniBus(String color, String patente, int cantidadDeAsientos,String tipoViaje) {
		super(color, patente, cantidadDeAsientos);
		this.tipoViaje = tipoViaje;
		
	}

	private String tipoViaje;

	public String getTipoViaje() {
		return tipoViaje;
	}

	public void setTipoViaje(String tipoViaje) {
		this.tipoViaje = tipoViaje;
	}

	public void imprimeBus() {
		System.out.println("Color: "+ super.getColor());
		System.out.println("patente: "+ super.getPatente());
		System.out.println("cant. asientos: "+ super.getCantidadDeAsientos());
		System.out.println("tipo de viaje: "+ getTipoViaje());
	}
}
