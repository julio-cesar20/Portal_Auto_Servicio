package intranetapp.servicios;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import intranetapp.entidades.PersonaEntity;
import intranetapp.repositorio.PersonaRepository;

@Service
public class PersonaServicio {
	
	private PersonaRepository personaRepository;
	
	
	@Autowired
	public PersonaServicio(PersonaRepository personaRepository) {
		this.personaRepository=personaRepository;
		
		
		
	}
	
	public List<PersonaEntity> getAllPersonas(){
		
		
		return personaRepository.findAll();
		
	}
	
	public PersonaEntity nuevaPersona(PersonaEntity persona) {
		
		
		return personaRepository.save(persona);
		
	}
	
	public PersonaEntity actualizarPersona (int idPersona, PersonaEntity persona) {
		
		PersonaEntity personaA =  personaRepository.findById(idPersona).get();
		personaA.setNombre(persona.getNombre());
		personaA.setApellido(persona.getApellido());
		personaA.setTipoDocumento(persona.getTipoDocumento());
		personaA.setNumeroDoc(persona.getNumeroDoc());
		personaA.setTelefono(persona.getTelefono());
		personaA.setDireccion(persona.getDireccion());
		personaA.setFechaIngreso(persona.getFechaIngreso());
		personaA.setFechaRetiro(persona.getFechaRetiro());
		personaA.setTipoContrato(persona.getTipoContrato());
		personaA.setEstadoEmpledo(persona.getEstadoEmpledo());
		personaA.setSupervisor(persona.getSupervisor());
		personaA.setSolicitudes(persona.getSolicitudes());
		personaA.setTipoEmpleado(persona.getTipoEmpleado());
		personaA.setPortalAutoServicio(persona.getPortalAutoServicio());
		
		personaRepository.save(personaA);
		
		return personaA;
	}
	
	
	
	

}
