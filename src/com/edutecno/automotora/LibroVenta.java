package com.edutecno.automotora;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.util.ArrayList;

public class LibroVenta {

	private String nombreVenta;
	private String fecha;

	public LibroVenta(String nombreVenta, String fecha) {
		super();
		this.nombreVenta = nombreVenta;
		this.fecha = fecha;
	}

	public String getNombreVenta() {
		return nombreVenta;
	}

	public String getFecha() {
		return fecha;
	}

	public void setNombreVenta(String nombreVenta) {
		this.nombreVenta = nombreVenta;
	}

	public void setFecha(String fecha) {
		this.fecha = fecha;
	}

	public void guardarVenta() {

		File directorio = new File("src/com/edutecno/automotora/Ficheros");
		File archivo = new File("src/com/edutecno/automotora/Ficheros/" + nombreVenta + ".txt");

		if (!directorio.exists()) {
			try {
				if (directorio.mkdirs()) {
					System.out.println("Directorio creado...");

				}
			} catch (Exception e1) {
				System.out.println("archivo  " + archivo.getName() + " correcto");
				e1.printStackTrace();
			}

		}
		if (!archivo.exists()) {

			try {
				archivo.createNewFile();
				FileWriter fw = new FileWriter(archivo);
				BufferedWriter bw = new BufferedWriter(fw);

				Vehiculo vehiculo = new Vehiculo(Vehiculo.getPatente());
				Cliente cliente = new Cliente(Cliente.getEdadCLi());

				ArrayList<String> datosVenta = new ArrayList<String>();

				datosVenta.add("Vehiculo: " + vehiculo);
				datosVenta.add("Edad Cliente: " + cliente);
				datosVenta.add("Fecha Venta: " + getFecha());
				datosVenta.add("Nombre de Venta: " + getNombreVenta());

				for (String e : datosVenta) {
					bw.write(e);
					bw.newLine();
				}
				bw.close();
				System.out.println("archivo  " + archivo.getName() + " correcto");
			} catch (Exception e) {
				System.out.println("Error al crear archivo...");
				e.printStackTrace();

			}

		}
	}

}
