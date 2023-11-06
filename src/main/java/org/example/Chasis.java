package org.example;
public class Chasis {
	private int numeroDeChasis;
	private String material;

    //Constructor
	public Chasis(int numeroDeChasis, String material) {
		this.numeroDeChasis = numeroDeChasis;
		this.material = material;
	}

	//Getters y Setters
	public int getNumeroDeChasis() {
		return this.numeroDeChasis;
	}
	public void setNumeroDeChasis(int numeroDeChasis) {
		this.numeroDeChasis = numeroDeChasis;
	}
	public String getMaterial() {return this.material;}
	public void setMaterial(String material) {
		this.material = material;
	}
}