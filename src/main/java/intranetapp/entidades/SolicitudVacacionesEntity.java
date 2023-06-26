package intranetapp.entidades;

import java.io.Serializable;
import java.util.Date;

import com.fasterxml.jackson.annotation.JsonBackReference;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Inheritance;
import jakarta.persistence.InheritanceType;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "solicitudvacaciones")
@Inheritance(strategy = InheritanceType.JOINED)
public class SolicitudVacacionesEntity implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -4316035695991925697L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "idSolicitud")
	private int idSolicitud;
	
	@Column(name = "nombre")
	private String nombre;
	
	@Column(name = "apellido")
	private String apellido;
	
	@Column(name = "cargo")
	private String cargo;
	
	@Column(name = "numeroDoc")
	private String numeroDoc;
	
	@Column(name = "diasSolicitados")
	private int diasSolicitados;
	
	@Column(name = "fechaInicio")
	private Date fechaInicio;
	
	@Column(name = "fechaFin")
	private Date fechaFin;
	
	@Column(name = "fechaReintegro")
	private Date fechaReintegro;
	
	@Column(name = "estadoSolicitud")
	private String estadoSolicitud;
	
	@ManyToOne
	@JsonBackReference
	@JoinColumn(name = "idPersona")
	private PersonaEntity idPersona;

	public int getIdSolicitud() {
		return idSolicitud;
	}

	public void setIdSolicitud(int idSolicitud) {
		this.idSolicitud = idSolicitud;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public String getCargo() {
		return cargo;
	}

	public void setCargo(String cargo) {
		this.cargo = cargo;
	}

	public String getNumeroDoc() {
		return numeroDoc;
	}

	public void setNumeroDoc(String numeroDoc) {
		this.numeroDoc = numeroDoc;
	}

	public int getDiasSolicitados() {
		return diasSolicitados;
	}

	public void setDiasSolicitados(int diasSolicitados) {
		this.diasSolicitados = diasSolicitados;
	}

	public Date getFechaInicio() {
		return fechaInicio;
	}

	public void setFechaInicio(Date fechaInicio) {
		this.fechaInicio = fechaInicio;
	}

	public Date getFechaFin() {
		return fechaFin;
	}

	public void setFechaFin(Date fechaFin) {
		this.fechaFin = fechaFin;
	}

	public Date getFechaReintegro() {
		return fechaReintegro;
	}

	public void setFechaReintegro(Date fechaReintegro) {
		this.fechaReintegro = fechaReintegro;
	}

	public String getEstadoSolicitud() {
		return estadoSolicitud;
	}

	public void setEstadoSolicitud(String estadoSolicitud) {
		this.estadoSolicitud = estadoSolicitud;
	}

	public PersonaEntity getIdPersona() {
		return idPersona;
	}

	public void setIdPersona(PersonaEntity idPersona) {
		this.idPersona = idPersona;
	}
}
