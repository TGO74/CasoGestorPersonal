package org.example;

import java.util.ArrayList;
public class Persona {
	private String nombre;
	private String apellido;
	private String rut;


	public ArrayList<Automovil> automoviles = new ArrayList<Automovil>();
	public ArrayList<CorreoElectronico> correos = new ArrayList<CorreoElectronico>();

	//Constructor
	public Persona(String nombre, String apellido, String rut) {
		this.nombre = nombre;
		this.apellido = apellido;
		this.rut = rut;
	}

	//Getters y Setters
	public  String getNombre() {
		return this.nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getApellido() {
		return this.apellido;
	}
	public void setApellido(String apellido) {
		this.apellido = apellido;
	}
	public String getRut() {
		return this.rut;
	}
	public void setRut(String rut) {
		this.rut = rut;
	}
	public ArrayList<Automovil> getAutomoviles() {
		return this.automoviles;
	}
	public void setAutomoviles(ArrayList<Automovil> automoviles) {
		this.automoviles = automoviles;
	}
	public ArrayList<CorreoElectronico> getCorreos() {
		return this.correos;
	}
	public void setCorreos(ArrayList<CorreoElectronico> correos) {
		this.correos = correos;
	}

	//Método para agregar automovil
	  public void agregarAutomovil(Automovil automovil) {
			automoviles.add( automovil);
		}

	//Método para agregar correo
	public void agregarCorreo( CorreoElectronico correo) {
		correos.add(correo);
	}

	//Método para buscar persona por rut
	public boolean tieneAutomovilMarca(String marca) {
		for (Automovil automovil : automoviles) {
			if (automovil.getMarca().equalsIgnoreCase(marca)) {

				return true;
			}
		}
		return false;
	}

	}



