package org.example;
public class Automovil {
	private String marca;
	private String modelo;
	private int año;
	private Double precio;
	private String kilometraje;
	private Motor motor;
	private Chasis chasis;

    //Constructor
	public Automovil(String marca, String modelo, int año, Double precio, String kilometraje, Motor motor, Chasis chasis) {
		this.marca = marca;
		this.modelo = modelo;
		this.año = año;
		this.precio = precio;
		this.kilometraje = kilometraje;
		this.motor = motor;
		this.chasis = chasis;
	}

	//Getters y Setters
	public String getMarca() {return this.marca;}
	public void setMarca(String marca) {
		this.marca = marca;
	}
	public String getModelo() {return this.modelo;}
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	public int getAño() {return this.año;}
	public void setAño(int año) {
		this.año = año;
	}
	public Double getPrecio() {return this.precio;}
	public void setPrecio(Double precio) {
		this.precio = precio;
	}
	public String getKilometraje() {return this.kilometraje;}
	public void setKilometraje(String kilometraje) {
		this.kilometraje = kilometraje;
	}
	public Motor getMotor() {
		return this.motor;
	}
	public void setMotor(Motor motor) {
		this.motor = motor;
	}
	public Chasis getChasis() {
		return this.chasis;
	}
	public void setChasis(Chasis chasis) {
		this.chasis = chasis;
	}
}