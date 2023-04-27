/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package com.mycompany.trabajointegrador;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Nicolas_
 */
public class EquipoTest {
    
    public EquipoTest() {
    }

    /**
     * Test of mostrarEquipo method, of class Equipo.
     */
    @Test
    public void testMostrarEquipo() {
        System.out.println("mostrarEquipo");
        int idEquipo = 2;
        Equipo instance = new Equipo();
        instance.mostrarEquipo(idEquipo);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of mostrarEquipos method, of class Equipo.
     */
    @Test
    public void testMostrarEquipos() {
        System.out.println("mostrarEquipos");
        Equipo instance = new Equipo();
        instance.mostrarEquipos();
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
}
