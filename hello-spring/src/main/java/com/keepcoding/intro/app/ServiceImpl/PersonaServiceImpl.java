package com.keepcoding.intro.app.ServiceImpl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.keepcoding.intro.app.entity.Persona;
import com.keepcoding.intro.app.services.PersonaService;

@Service
public class PersonaServiceImpl implements PersonaService{
	
	@Autowired
	Persona persona;
	Persona persona1;
	Persona persona2;
	Persona persona3;
	
	//declaro lista de persona
	List<Persona> lista = new ArrayList<>();
	@Override
	public List<Persona> listapersona() {
		// TODO Auto-generated method stub
		//cargo datos de objeto
		if (lista.size()==0) {
			persona1 = new Persona("Magdalena","Mendoza","180224726","mmendoza2@uc.cl",976682057);
			persona2 = new Persona("Javiera","Perez","180224726","jperez@uc.cl",976682068);
			persona3 = new Persona("Josefina","Gonzalez","167224726","jgonzalez@uc.cl",979982068);
			lista.add(persona1);
			lista.add(persona2);
			lista.add(persona3);
		}
//		for (int i=0;i<3;i++) {
//			persona.setNombre("Magdalena"+i);
//			persona.setApellido("Mendoza"+i);
//			persona.setDni("190234827");
//			persona.setEmail("mmendoza@uc.cl"+i);
//			persona.setTelefono(999999);
//			lista.add(persona);
//		}
		
		return lista;
	}

	@Override
	public void insertaPersona() {
		// TODO Auto-generated method stub
		persona.setNombre("Javiera");
		persona.setApellido("Perez");
		persona.setDni("192227380");
		persona.setEmail("mperez@uc.cl");
		persona.setTelefono(999999);
		lista.add(persona);
		
	}

}
