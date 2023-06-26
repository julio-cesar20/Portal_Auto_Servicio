/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package intranetapp.servicios;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import intranetapp.entidades.PortalEntity;
import intranetapp.repositorio.PortalRepository;

/**
 *
 * @author HOME
 */
@Service
public class PortalServicio {

    private PortalRepository portalRepository;

    @Autowired
    public PortalServicio(PortalRepository portalRepository) {

        this.portalRepository = portalRepository;

    }

    public List<PortalEntity> getallEmpleados() {

        return portalRepository.findAll();

    }

}
