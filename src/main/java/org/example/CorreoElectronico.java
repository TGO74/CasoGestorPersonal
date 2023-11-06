package org.example;
public class CorreoElectronico {
	private String direccionCorreoElectronico;
	private String proveedorCorreoElectronico;

	//Constructor
	public CorreoElectronico(String direccionCorreoElectronico, String proveedorCorreoElectronico) {
		this.direccionCorreoElectronico = direccionCorreoElectronico;
		this.proveedorCorreoElectronico = proveedorCorreoElectronico;
	}

	//Getters y Setters
	public String getDireccionCorreoElectronico() {
		return this.direccionCorreoElectronico;
	}
	public void setDireccionCorreoElectronico(String direccionCorreoElectronico) {this.direccionCorreoElectronico = direccionCorreoElectronico;}
	public String getProveedorCorreoElectronico() {
		return this.proveedorCorreoElectronico;
	}
	public void setProveedorCorreoElectronico(String proveedorCorreoElectronico) {this.proveedorCorreoElectronico = proveedorCorreoElectronico;}

}