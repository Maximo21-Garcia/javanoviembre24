package controller;

import model.Persona;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import service.PersonaService;

import java.util.List;

@RequestMapping
@RestController
public class PersonaController {
@Autowired
    private PersonaService service;
@GetMapping
    public List<Persona> listarPersonas(){
    return service.listarPersonas();
}
@PostMapping
    public Persona guardarPersona(@RequestBody Persona persona){
    return service.guardarPersona(persona);
}
}
