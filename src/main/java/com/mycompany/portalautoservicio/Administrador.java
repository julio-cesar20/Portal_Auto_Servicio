/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.portalautoservicio;

import java.util.ArrayList;
import java.util.List;

class Administrador {
    private List<SolicitudVacaciones> todasSolicitudes;
    private List<SolicitudVacaciones> solicitudesPendientes;


    public Administrador() {
        this.todasSolicitudes = new ArrayList<>();
        this.solicitudesPendientes = new ArrayList<>();
    }

    public List<SolicitudVacaciones> getTodasSolicitudes() {
        return todasSolicitudes;
    }

    public void agregarSolicitud(SolicitudVacaciones solicitud) {
        todasSolicitudes.add(solicitud);
    }
    
    public void aprobarSolicitud(SolicitudVacaciones solicitud) {
        // Lógica para aprobar una solicitud de vacaciones
        // ...

        // Ejemplo de implementación
        solicitud.setEstado("Aprobada");
        solicitudesPendientes.remove(solicitud);
    }
}
