package com.ces2.clase3.model.controller;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.ces2.clase3.model.Contratista;
import com.ces2.clase3.model.Empleado;
import com.ces2.clase3.model.Persona;
import com.ces2.clase3.model.Type;
import com.ces2.clase3.repository.PersonaRepository;


@Controller
public class PersonaController {
	
	private PersonaRepository repository;
	
	public PersonaController(PersonaRepository repository) {
		
		this.repository = repository;
	}
	
	@GetMapping("/persona")
	public String showForm(Model model) {
		
		model.addAttribute("persona",new Persona());	
		List<String> tipos = Arrays.asList("Empleado","Contratista");
		model.addAttribute("tipos",tipos);	
		return "personaform";
	}
	
	@PostMapping("/aumentos")
    public String checkPersonInfo(@ModelAttribute("persona") Persona persona, Model model) {
		
		if (persona.getType().equals("Empleado")) {
			repository.save(new Empleado(persona.getName(),persona.getPorcentaje(),persona.getType()));
		}
		
		if (persona.getType().equals("Contratista")) {
			repository.save(new Contratista(persona.getName(),persona.getPorcentaje(),persona.getType()));
		}
		
		List<String> mensajesCalculos = new ArrayList<>();

		for(Persona p: repository.findAll()) {
			if(p instanceof Empleado) {
				Empleado emp = (Empleado) p;
				mensajesCalculos.add(emp.aumentarPago());
			}
			if(p instanceof Contratista) {
				Contratista con = (Contratista) p;
				mensajesCalculos.add(con.aumentarPago());
			}
		}
		
		model.addAttribute("calculos", mensajesCalculos);

        return "aumentos";
    }
	
	@GetMapping("/verlista")
	public String showEmployees(Model model) {
		
		List<String> mensajesCalculos = new ArrayList<>();

		for(Persona p: repository.findAll()) {
			if(p instanceof Empleado) {
				Empleado emp = (Empleado) p;
				mensajesCalculos.add(emp.aumentarPago());
			}
			if(p instanceof Contratista) {
				Contratista con = (Contratista) p;
				mensajesCalculos.add(con.aumentarPago());
			}
		}
		
		model.addAttribute("calculos", mensajesCalculos);

        return "aumentos";
	}
	
}
