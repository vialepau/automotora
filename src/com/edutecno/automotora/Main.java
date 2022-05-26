package com.edutecno.automotora;



public class Main {

	public static void main(String[] args) {
		
		
		Bus bus = new Bus("azul","dfds-65",45);
		System.out.println(bus.getCantidadDeAsientos());
		System.out.println("Asientos disponible : "+bus.asientosDisponibles());
		System.out.println("-----");
		
		MiniBus mini = new MiniBus("rojo","asas-65",18,"viaje Corto");
		mini.imprimeBus();
		System.out.println("-----");
		
		Persona persona = new Persona("12.345.678-9","Loreto",25);
		Vendedor vendedor = new Vendedor(persona.getRut(),
										persona.getNombre(),	
										persona.getEdad(),
										"calle nueva 1234");
		System.out.println(vendedor.toString());
		System.out.println(vendedor.getDireccion());
		System.out.println("-----");
		
		
		Vehiculo vehiculo = new Vehiculo(bus.getColor(),Vehiculo.getPatente());
		Tienda tienda = new Tienda(vendedor,vehiculo,52);
		System.out.println(vehiculo.toString());
		System.out.println(tienda.existeStock());
		System.out.println("-----");
		
		Taxi taxi = new Taxi("negro y amarillo","ltlr-98",450);
		System.out.println("color: "+taxi.getColor());
		System.out.println("patente: "+Vehiculo.getPatente());
		System.out.println("el pasaje es de "+ taxi.getValorPasaje());
		System.out.println("su vuelto es de "+taxi.pagarPasaje(1000));
		
		/**desafio evaluado*/
		System.out.println("-----------------");
		
		new Cliente(52);
		new Vehiculo("lght-95");
		
		LibroVenta libroV = new LibroVenta("bgbgbgbg","01022020");
		libroV.guardarVenta();
		
	}

	

}
