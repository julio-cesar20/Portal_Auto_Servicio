/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package proyecto1.demo.persistence.entities;

import java.time.LocalDate;
import java.util.List;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import intranetapp.entidades.PortalEntity;

import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author HOME
 */
public class PortalEntityTest {
    
    public PortalEntityTest() {
    }
    
    @BeforeAll
    public static void setUpClass() {
    }
    
    @AfterAll
    public static void tearDownClass() {
    }
    
    @BeforeEach
    public void setUp() {
    }
    
    @AfterEach
    public void tearDown() {
    }

    /**
     * Test of getContraseña method, of class PortalEntity.
     */
    @Test
    public void testGetContraseña() {
        System.out.println("getContrase\u00f1a");
        PortalEntity instance = new PortalEntity();
        String expResult = "";
        String result = instance.getContrasena();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setContraseña method, of class PortalEntity.
     */
    @Test
    public void testSetContraseña() {
        System.out.println("setContrase\u00f1a");
        String contraseña = "";
        PortalEntity instance = new PortalEntity();
        instance.setContrasena(contraseña);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getIdPortal method, of class PortalEntity.
     */
    @Test
    public void testGetIdPortal() {
        System.out.println("getIdPortal");
        PortalEntity instance = new PortalEntity();
        int expResult = 0;
        int result = instance.getIdPortal();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setIdPortal method, of class PortalEntity.
     */
    @Test
    public void testSetIdPortal() {
        System.out.println("setIdPortal");
        int idPortal = 0;
        PortalEntity instance = new PortalEntity();
        instance.setIdPortal(idPortal);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getHora method, of class PortalEntity.
     */
    @Test
    public void testGetHora() {
        System.out.println("getHora");
        PortalEntity instance = new PortalEntity();
        String expResult = null;
        String result = instance.getHora();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setHora method, of class PortalEntity.
     */
    @Test
    public void testSetHora() {
        System.out.println("setHora");
        String hora = null;
        PortalEntity instance = new PortalEntity();
        instance.setHora(hora);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getUsuario method, of class PortalEntity.
     */
    @Test
    public void testGetUsuario() {
        System.out.println("getUsuario");
        PortalEntity instance = new PortalEntity();
        String expResult = "";
        String result = instance.getUsuario();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setUsuario method, of class PortalEntity.
     */
    @Test
    public void testSetUsuario() {
        System.out.println("setUsuario");
        String usuario = "";
        PortalEntity instance = new PortalEntity();
        instance.setUsuario(usuario);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getEmpleados method, of class PortalEntity.
     */
//    @Test
//    public void testGetEmpleados() {
//        System.out.println("getEmpleados");
//        PortalEntity instance = new PortalEntity();
//        List<PersonaEntity> expResult = null;
//        List<PersonaEntity> result = instance.getEmpleados();
//        assertEquals(expResult, result);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }

    /**
     * Test of setEmpleados method, of class PortalEntity.
     */
//    @Test
//    public void testSetEmpleados() {
//        System.out.println("setEmpleados");
//        List<PersonaEntity> empleados = null;
//        PortalEntity instance = new PortalEntity();
//        instance.setEmpleados(empleados);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
    
}
