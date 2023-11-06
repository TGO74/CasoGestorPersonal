package org.example;
public class Motor {
	private String numeroDeMotor;
	private String cilindrada;

	//Constructor
	public Motor(String numeroDeMotor, String cilindrada) {
		this.numeroDeMotor = numeroDeMotor;
		this.cilindrada = cilindrada;
	}

	//Getters y Setters
	public String getNumeroDeMotor() {
		return this.numeroDeMotor;
	}
	public void setNumeroDeMotor(String numeroDeMotor) {
		this.numeroDeMotor = numeroDeMotor;
	}
	public String getCilindraje() {return this.cilindrada;}
	public void setCilindraje(String cilindrada) {
		this.cilindrada = cilindrada;
	}
}