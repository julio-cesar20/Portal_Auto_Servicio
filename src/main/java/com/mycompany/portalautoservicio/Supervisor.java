/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.portalautoservicio;

import java.util.ArrayList;
import java.util.List;


class Supervisor {
    
    private List<Empleado> empleadosAsignados;
    private List<SolicitudVacaciones> solicitudesPendientes;

    public Supervisor(List<Empleado> empleadosAsignados) {
        this.empleadosAsignados = empleadosAsignados;
        this.solicitudesPendientes = new ArrayList<>();
    }

    public List<Empleado> getEmpleadosAsignados() {
        return empleadosAsignados;
    }

    public List<SolicitudVacaciones> getSolicitudesPendientes() {
        return solicitudesPendientes;
    }

    public void aprobarSolicitud(SolicitudVacaciones solicitud) {
        // Lógica para aprobar una solicitud de vacaciones
        // ...

        // Ejemplo de implementación
        solicitud.setEstado("Aprobada");
        solicitudesPendientes.remove(solicitud);
    }
}
