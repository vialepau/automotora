package com.edutecno.automotora;

public class Tienda {

	private Vendedor vendedor; //= new Vendedor(null, null, 0, null);
	private Vehiculo vehiculo; //= new Vehiculo(null, null);
	
	private int stock;
	
	
	public Vendedor getVendedor() {
		return vendedor;
	}
	public Vehiculo getVehiculo() {
		return vehiculo;
	}
	public int getStock() {

		return stock;
	}
	
	public void setVendedor(Vendedor vendedor) {
		this.vendedor = vendedor;
	}
	public void setVehiculo(Vehiculo vehiculo) {
		this.vehiculo = vehiculo;
	}
	public void setStock(int stock) {
		this.stock = stock;
	}
	
	public Tienda(Vendedor vendedor, Vehiculo vehiculo, int stock) {
		this.vendedor = vendedor;
		this.vehiculo = vehiculo;
		this.stock = stock;
	}
	
	public String existeStock() {
				
		return "La cantidad de Stock es de "+ getStock();
	}
	
}
