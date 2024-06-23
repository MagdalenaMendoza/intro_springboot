package com.keepcoding.intro.app.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.keepcoding.intro.app.entity.Persona;
import com.keepcoding.intro.app.services.PersonaService;

@RestController
public class PersonaController {
	
	@Autowired
	private PersonaService personaService;
	
	@GetMapping("/personas")
	public List<Persona> listado(){
		
		return personaService.listapersona();
	}
	
	@GetMapping("/newpersona")
	public String insert() {
		personaService.insertaPersona();
		return "Persona insertada!!";
	}

}
