package intranetapp.repositorio;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import intranetapp.entidades.SolicitudVacacionesEntity;

@Repository
public interface SolicitudVacacionesRepository extends JpaRepository<SolicitudVacacionesEntity, Integer> {

	@Query(value = "select distinct solicitudvacaciones.idSolicitud, solicitudvacaciones.estadoSolicitud, solicitudvacaciones.fechaInicio from solicitudvacaciones inner join persona where solicitudvacaciones.idPersona=:idPersona order by solicitudvacaciones.fechaInicio DESC", nativeQuery=true)
	List<String[]> listaSolicitudesEmpleado(int idPersona);
	
	@Query(value = "select distinct sv.fechaInicio, sv.fechaFin, sv.fechaReintegro, sv.diasSolicitados, p.fechaIngreso, sv.idPersona, sv.idSolicitud from solicitudvacaciones as sv inner join persona as p where sv.idPersona=:idPersona and sv.estadoSolicitud = 'pendiente' and p.idPersona=:idPersona", nativeQuery=true)
	List<String[]> listaSolicitudesPendientes(int idPersona);
}
