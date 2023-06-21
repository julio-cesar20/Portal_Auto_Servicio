/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.portalautoservicio;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

class Empleado {
    private String usuario;
    private String nombres;
    private String apellidos;
    private int diasVacacionesDisponibles;

    public Empleado(String usuario, String nombres, String apellidos) {
        this.usuario = usuario;
        this.nombres = nombres;
        this.apellidos = apellidos;
        this.diasVacacionesDisponibles = 0;
    }

    public String getUsuario() {
        return usuario;
    }

    public String getNombres() {
        return nombres;
    }

    public String getApellidos() {
        return apellidos;
    }

    public int getDiasVacacionesDisponibles() {
        return diasVacacionesDisponibles;
    }
    
    
    
    public void calcularDiasVacacionesDisponibles() {
        // Lógica para calcular los días de vacaciones disponibles
        // basado en las reglas de la empresa y el historial del empleado
        // ...
    }

    public boolean solicitarVacaciones(Date fechaInicio, Date fechaFin, Supervisor supervisor) {
        // Lógica para solicitar vacaciones
        // Verificar las reglas de solicitud y la disponibilidad de días de vacaciones
        // ...
        // Ejemplo de implementación
        boolean solicitudAprobada = true;
        if (diasVacacionesDisponibles >= calcularDuracionVacaciones(fechaInicio, fechaFin)) {
            // Aplicar lógica para aprobación de la solicitud
            // ...
        } else {
            solicitudAprobada = false;
        }

        return solicitudAprobada;
    }

    private int calcularDuracionVacaciones(Date fechaInicio, Date fechaFin) {
        // Lógica para calcular la duración de las vacaciones
        // basado en las fechas de inicio y fin
        // ...
        return 0; // Devuelve la duración calculada
    }
}
