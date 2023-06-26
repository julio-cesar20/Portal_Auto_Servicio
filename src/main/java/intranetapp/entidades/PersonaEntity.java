/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package intranetapp.entidades;

/**
 *
 * @author HOME
 */
import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;

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

import java.io.Serializable;
import java.util.Date;

/**
 *
 * @author HOME
 */
@Entity
@Table(name = "persona")
@Inheritance(strategy = InheritanceType.JOINED)
public class PersonaEntity implements Serializable {
/**
	 * 
	 */
	private static final long serialVersionUID = -505320460047926015L;

//Representa la tabla en BD
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idPersona")
    private int idPersona;
    
    @Column(name = "nomobre")
    private String nombre;

    @Column(name = "apellido")
    private String apellido;
    
   
    @Column(name = "tipoDocumento")
    private String tipoDocumento;
    

    @Column(name = "numeroDoc")
    private String numeroDoc;

    @Column(name = "telefono")
    private String telefono;

    @Column(name = "direccion")
    private String direccion;

    @Column(name = "fechaIngreso")
    private Date fechaIngreso;

    @Column(name = "fechaRetiro")
    private Date fechaRetiro;

    @Column(name = "tipoContrato")
    private String tipoContrato;

    @Column(name = "estadoEmpleado")
    private String estadoEmpledo;

    @Column(name = "supervisor")
    private String supervisor;

    @Column(name = "solicitudes")
    private int solicitudes;
     
    @Column(name = "tipoEmpleado")
    private String tipoEmpleado;
    
      
    @ManyToOne
    @JsonBackReference
    @JoinColumn(name = "idPortal")
    private PortalEntity idPortal;

    //continua

    public int getIdPersona() {
        return idPersona;
    }

    public void setIdPersona(int idPersona) {
        this.idPersona = idPersona;
    }

    public String getTipoEmpleado() {
        return tipoEmpleado;
    }

    public void setTipoEmpleado(String tipoEmpleado) {
        this.tipoEmpleado = tipoEmpleado;
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

   
    public String getTipoDocumento() {
        return tipoDocumento;
    }

    public void setTipoDocumento(String tipoDocumento) {
        this.tipoDocumento = tipoDocumento;
    }

    public String getNumeroDoc() {
        return numeroDoc;
    }

    public void setNumeroDoc(String numeroDoc) {
        this.numeroDoc = numeroDoc;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public Date getFechaIngreso() {
        return fechaIngreso;
    }

    public void setFechaIngreso(Date FechaIngreso) {
        this.fechaIngreso = FechaIngreso;
    }

    public Date getFechaRetiro() {
        return fechaRetiro;
    }

    public void setFechaRetiro(Date FechaRetiro) {
        this.fechaRetiro = FechaRetiro;
    }

    public String getTipoContrato() {
        return tipoContrato;
    }

    public void setTipoContrato(String tipoContrato) {
        this.tipoContrato = tipoContrato;
    }

    public String getEstadoEmpledo() {
        return estadoEmpledo;
    }

    public void setEstadoEmpledo(String estadoEmpledo) {
        this.estadoEmpledo = estadoEmpledo;
    }

    public String getSupervisor() {
        return supervisor;
    }

    public void setSupervisor(String supervisor) {
        this.supervisor = supervisor;
    }

    public int getSolicitudes() {
        return solicitudes;
    }

    public void setSolicitudes(int solicitudes) {
        this.solicitudes = solicitudes;
    }

   

    public PortalEntity getPortalAutoServicio() {
        return idPortal;
    }

    public void setPortalAutoServicio(PortalEntity portalAutoServicio) {
        this.idPortal = portalAutoServicio;
    }

}
