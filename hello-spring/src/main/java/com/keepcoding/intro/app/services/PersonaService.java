package com.keepcoding.intro.app.services;

import java.util.List;

import com.keepcoding.intro.app.entity.Persona;

//Aqui definimos los metodos que vamos a tener
public interface PersonaService {
	
	//metodos abstractos
	//metodo que devuelva lista de objeto persona
	List<Persona> listapersona();
	
	//metodo que insert
	void insertaPersona();

}
