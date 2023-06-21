/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.portalautoservicio;

import java.util.Date;
import java.util.List;

/**
 *
 * @author HOME
 */
public class PortalAutoServicio {

  
   public static void main(String[] args) {
        Empleado empleado1 = new Empleado("empleado1", "John", "Doe");
        Empleado empleado2 = new Empleado("empleado2", "Jane", "Smith");
        
       
        empleado1.calcularDiasVacacionesDisponibles();
        empleado2.calcularDiasVacacionesDisponibles();

        Date fechaInicio = new Date(); // Ingresar la fecha de inicio deseada
        Date fechaFin = new Date(); // Ingresar la fecha de fin deseada

        Supervisor supervisor = new Supervisor(List.of(empleado1, empleado2));
        boolean solicitudAprobada = empleado1.solicitarVacaciones(fechaInicio, fechaFin, supervisor);

        if (solicitudAprobada) {
            System.out.println("La solicitud de vacaciones ha sido aprobada.");
        } else {
            System.out.println("La solicitud de vacaciones ha sido rechazada o no es válida.");
        }

        Administrador administrador = new Administrador();
        administrador.agregarSolicitud(new SolicitudVacaciones(empleado1, fechaInicio, fechaFin));
        administrador.agregarSolicitud(new SolicitudVacaciones(empleado2, fechaInicio, fechaFin));
        
        
        System.out.println(empleado1.getUsuario()+"\n"+ empleado1.getNombres()+"\n"+ empleado1.getApellidos()); 
        
         System.out.println(empleado2.getUsuario()+"\n"+ empleado2.getNombres()+"\n"+ empleado2.getApellidos()); 
         
         
         System.err.println(supervisor.toString());
     
    }

}
