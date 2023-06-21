/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.portalautoservicio;

import java.util.Date;

class SolicitudVacaciones {
    private Empleado empleado;
    private Date fechaInicio;
    private Date fechaFin;
    
    private String estado;
    

    public SolicitudVacaciones(Empleado empleado, Date fechaInicio, Date fechaFin) {
        this.empleado = empleado;
        this.fechaInicio = fechaInicio;
        this.fechaFin = fechaFin;
        this.estado = "Pendiente";
    }

    public Empleado getEmpleado() {
        return empleado;
    }

    public Date getFechaInicio() {
        return fechaInicio;
    }

    public Date getFechaFin() {
        return fechaFin;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }
}
