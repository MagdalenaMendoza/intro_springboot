package com.keepcoding.intro.app.entity;

import org.springframework.stereotype.Component;

@Component
public class Persona {
	private String nombre;
	private String apellido;
	private String dni;
	private String email;
	private long telefono;
	
	
	public Persona() {
		
	}
	
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public String getDni() {
		return dni;
	}

	public void setDni(String dni) {
		this.dni = dni;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public long getTelefono() {
		return telefono;
	}

	public void setTelefono(long telefono) {
		this.telefono = telefono;
	}

	public Persona(String nombre, String apellido, String dni, String email, long telefono) {
		super();
		this.nombre = nombre;
		this.apellido = apellido;
		this.dni = dni;
		this.email = email;
		this.telefono = telefono;
	}
	
	
	
}
