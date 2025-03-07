package service;

import model.Persona;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import repository.PersonaRepository;

import java.util.List;

import static org.antlr.v4.runtime.tree.xpath.XPath.findAll;

@Service
public class PersonaService {
@Autowired
    private PersonaRepository repository;
public List<Persona> listarPersonas (){
    return repository.findAll();
}
public Persona guardarPersona (Persona persona){
    return repository.save(persona);
}
}
