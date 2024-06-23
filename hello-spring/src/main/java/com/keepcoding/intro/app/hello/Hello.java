package com.keepcoding.intro.app.hello;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.keepcoding.intro.app.entity.Persona;

@RestController
public class Hello {
	@Autowired
	Persona persona;
	@GetMapping("/saludar")
	public List<Persona> saludar() {
//		Persona persona = new Persona("Magdalena","Mendoza","180224726","mmendoza2@uc.cl",976682057);
//		Persona persona2 = new Persona("Javiera","Perez","180224726","jperez@uc.cl",976682068);
//		Persona persona3 = new Persona("Josefina","Gonzalez","167224726","jgonzalez@uc.cl",979982068);
		ArrayList<Persona> lista_persona = new ArrayList<>();
		persona.setNombre("Magdalena");
		persona.setApellido("Mendoza");
		persona.setDni("");
		persona.setEmail(".cl");
		persona.setTelefono(999999);
		lista_persona.add(persona);
//		lista_persona.add(persona);
//		lista_persona.add(persona2);
//		lista_persona.add(persona3);
		return lista_persona;	
	}
	
	
}
