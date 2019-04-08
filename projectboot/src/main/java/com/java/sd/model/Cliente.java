package com.java.sd.model;

import javax.persistence.Entity;

@Entity
public class Cliente {
	
	String Nombre;
	String Apellido;	
	String Direccion;
	String  Matricula;
	
	
	
	
	public Cliente(String nombre, String apellido, String direccion, String matricula) {
		super();
		Nombre = nombre;
		Apellido = apellido;
		Direccion = direccion;
		this.Matricula = matricula;
	}
	
	public String getNombre() {
		return Nombre;
	}
	public void setNombre(String nombre) {
		Nombre = nombre;
	}
	public String getApellido() {
		return Apellido;
	}
	public void setApellido(String apellido) {
		Apellido = apellido;
	}
	public String getDireccion() {
		return Direccion;
	}
	public void setDireccion(String direccion) {
		Direccion = direccion;
	}
	public String getMatricula() {
		return Matricula;
	}
	public void setMatricula(String matricula) {
		this.Matricula = matricula;
	}
	
	

}
