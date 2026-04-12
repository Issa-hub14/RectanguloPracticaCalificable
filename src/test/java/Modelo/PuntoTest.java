/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package Modelo;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author isabe
 */
public class PuntoTest {
    
    public PuntoTest() {
    }
    
    @Test
    public void testPunto() {
        Punto p = new Punto(3.0, 4.0);
        assertEquals(3.0, p.getX(), 0.01, "Falla en el test");
        assertEquals(4.0, p.getY(), 0.01, "Falla en el test");
    }
    
    @Test
    public void testSetX() {
        Punto p = new Punto(3.0, 4.0);
        p.setX(10.0);
        assertEquals(10.0, p.getX(), 0.01, "Falla en el test2");
    }
    
    @Test
    public void testSetY() {
        Punto p = new Punto(3.0, 4.0);
        p.setY(10.0);
        assertEquals(10.0, p.getY(), 0.01, "Falla en el test3");
    }
    
    @Test
    public void testToString() {
        Punto p = new Punto(3.0, 4.0);
        assertEquals("(3.0, 4.0)", p.toString(), "Falla en el test4");
    }
    
    @Test
    public void testCoordenadaNegativa() {
        Punto p = new Punto(-3.0, -4.0);
        assertEquals(-3.0, p.getX(), 0.01, "Falla en el test5");
        assertEquals(-4.0, p.getY(), 0.01, "Falla en el test5");
    }
    
    
    @Test
    public void testGetX() {
        Punto p = new Punto(3.0, 4.0);
        p.getX();
        assertEquals(3.0, p.getX(), 0.01, "Falla en el test6");
    }

    @Test
    public void testGetY() {
        Punto p = new Punto(3.0, 4.0);
        p.getY();
        assertEquals(4.0, p.getY(), 0.01, "Falla en el test7");
    }
    
}
