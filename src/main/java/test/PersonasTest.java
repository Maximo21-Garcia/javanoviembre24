package test;

import model.Persona;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import service.PersonaService;

public class PersonasTest {
    @Autowired
    private PersonaService service;
    @Test
    public void testGuardarPersona(){
        Persona persona = new Persona(null, "Juan","Perez","Guardia","juan@gmail.com");
        service.guardarPersona(persona);
        assert(service.listarPersonas().size()>0);
    }

}
