package intranetapp.controlador;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import intranetapp.entidades.SolicitudVacacionesEntity;
import intranetapp.servicios.SolicitudVacacionesService;

@Controller
@RequestMapping("/Solicitud")
public class SolicitudVacacionesController {

	private SolicitudVacacionesService solicitudVacacionesService;
	
	@Autowired
	public SolicitudVacacionesController(SolicitudVacacionesService solicitudVacacionesService) {
		this.solicitudVacacionesService = solicitudVacacionesService;
	}
	
	@GetMapping("/s")
	public ResponseEntity<?> getAllSolicitudes() {
		return ResponseEntity.ok(solicitudVacacionesService.getAllSolicitudes());
	}
	
	@PostMapping
	public ResponseEntity<?> guardarSolicitud(@RequestBody SolicitudVacacionesEntity solicitud) {
		return ResponseEntity.status(HttpStatus.CREATED).body(solicitudVacacionesService.nuevaSolicitud(solicitud));
	}
	
	@GetMapping("/listaSolicitudes/{idPersona}")
	public ResponseEntity<?> listaSolicitudPersona(@PathVariable int idPersona){
		return ResponseEntity.ok(solicitudVacacionesService.listaSolicitudesPersona(idPersona));
	}
	
	@GetMapping("/listaSolicitudesPendientes/{idPersona}")
	public ResponseEntity<?> listaSolicitudPendientes(@PathVariable int idPersona){
		return ResponseEntity.ok(solicitudVacacionesService.listaSolicitudesPendientes(idPersona));
	}
}
