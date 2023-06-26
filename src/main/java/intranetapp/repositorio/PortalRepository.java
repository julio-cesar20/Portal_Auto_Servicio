/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package intranetapp.repositorio;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import intranetapp.entidades.PortalEntity;

/**
 *
 * @author HOME
 */
@Repository
public interface PortalRepository extends JpaRepository<PortalEntity, Integer> {

}
