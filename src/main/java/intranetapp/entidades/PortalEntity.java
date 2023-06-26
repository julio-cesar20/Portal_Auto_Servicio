package intranetapp.entidades;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */


import com.fasterxml.jackson.annotation.JsonManagedReference;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Inheritance;
import jakarta.persistence.InheritanceType;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

import java.beans.ConstructorProperties;
import java.io.Serializable;
import java.time.LocalDate;
import java.util.List;

/**
 *
 * @author HOME
 */
@Entity
@Table(name = "portal")
@Inheritance(strategy = InheritanceType.JOINED)
public class PortalEntity implements Serializable {
	
    /**
	 * 
	 */
	private static final long serialVersionUID = 6296998036689586274L;
	
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idPortal")
    private int idPortal;
    
    @Column(name = "horalogin")
    private String hora;
    
    @Column(name = "usuario")
    private String usuario;
    
    @Column(name = "contrasena")
    private String contrasena;
    
    @OneToMany (mappedBy = "idPersona")
    @JsonManagedReference
    private List<PersonaEntity> empleados;

    public String getContrasena() {
        return contrasena;
    }

    public void setContrasena(String contraseña) {
        this.contrasena = contraseña;
    }
    
    public int getIdPortal() {
        return idPortal;
    }

    public void setIdPortal(int idPortal) {
        this.idPortal = idPortal;
    }

    public String getHora() {
        return hora;
    }

    public void setHora(String hora) {
        this.hora = hora;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public List<PersonaEntity> getEmpleados() {
        return empleados;
    }

    public void setEmpleados(List<PersonaEntity> empleados) {
        this.empleados = empleados;
    }

   



   

}
