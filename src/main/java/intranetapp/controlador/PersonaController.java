package intranetapp.controlador;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import intranetapp.entidades.PersonaEntity;
import intranetapp.servicios.PersonaServicio;

@Controller
@RequestMapping("/Persona")
public class PersonaController {

	private PersonaServicio personaServicio;
	
	@Autowired
    public PersonaController(PersonaServicio personaServicio) {
		this.personaServicio = personaServicio;
	}

	@GetMapping("/")
    public ResponseEntity<?> getAllPersonas() {

        return ResponseEntity.ok(personaServicio.getAllPersonas());

    }   
	
	@PostMapping
	public ResponseEntity<?> guardarPersona(@RequestBody PersonaEntity persona){
		return ResponseEntity.status(HttpStatus.CREATED).body(personaServicio.nuevaPersona(persona));
	}
	
	@PutMapping("/{idPersona}")
	public ResponseEntity<?> actualizarPersona(@PathVariable int idPersona, @RequestBody PersonaEntity persona) {
		return ResponseEntity.ok(personaServicio.actualizarPersona(idPersona, persona));
	}
}
