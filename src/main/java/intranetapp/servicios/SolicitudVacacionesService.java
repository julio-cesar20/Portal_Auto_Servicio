package intranetapp.servicios;

import java.util.List;

import org.springframework.stereotype.Service;

import intranetapp.entidades.SolicitudVacacionesEntity;
import intranetapp.repositorio.SolicitudVacacionesRepository;

@Service
public class SolicitudVacacionesService {

	private SolicitudVacacionesRepository solicitudVacacionesRepository;
	
	public SolicitudVacacionesService(SolicitudVacacionesRepository solicitudVacacionesRepository) {
		this.solicitudVacacionesRepository = solicitudVacacionesRepository;
	}
	
	public List<SolicitudVacacionesEntity> getAllSolicitudes() {
		return solicitudVacacionesRepository.findAll();
	}
	
	public SolicitudVacacionesEntity nuevaSolicitud(SolicitudVacacionesEntity solicitud) {
		return solicitudVacacionesRepository.save(solicitud);
	}
	
	public List<String[]> listaSolicitudesPersona(int idPersona) {
		return solicitudVacacionesRepository.listaSolicitudesEmpleado(idPersona);
	}
	
	public List<String[]> listaSolicitudesPendientes(int idPersona) {
		return solicitudVacacionesRepository.listaSolicitudesPendientes(idPersona);
	}
	

	
}
