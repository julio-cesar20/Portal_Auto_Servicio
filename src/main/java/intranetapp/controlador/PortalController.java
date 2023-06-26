/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package intranetapp.controlador;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import intranetapp.servicios.PortalServicio;

/**
 *
 * @author HOME
 */
@Controller
@RequestMapping("/PortalAutoServicio")

public class PortalController {

   
  private PortalServicio PortalServicio;
    
    @Autowired
    public PortalController(PortalServicio PortalServicio) {
        this.PortalServicio = PortalServicio;

    }

    @GetMapping("/")
    public ResponseEntity<?> getallPortalAutoServicios() {

        return ResponseEntity.ok(PortalServicio.getallEmpleados());

    }   
    
    
    
    
    
}
