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
public class RectanguloTest {
    private Punto vertice1 = new Punto(0.0, 0.0);
    private Punto vertice2 = new Punto(5.0, 3.0);
    
    public RectanguloTest() {
    }
    
    @Test
    public void testCalcularArea() {
        Rectangulo r = new Rectangulo(vertice1, vertice2);
        double resultado = r.calcularArea();
        assertEquals(15.0, resultado, 0.01, "Fallo en el test");
    }

    
    @Test
    public void testEscalar() {
        Rectangulo r = new Rectangulo(vertice1, vertice2);
        r.escalar(2.0);
        assertEquals(10.0, r.getVertice2().getX(), 0.01, "Fallo en el test2");
        assertEquals(6.0, r.getVertice2().getY(), 0.01, "Fallo en el test2");
    }
   
    @Test
    public void testMoverHorizontalDerecha() {
       Rectangulo r = new Rectangulo(vertice1, vertice2);
       r.mover(4.0);
       assertEquals(4.0, r.getVertice1().getX(), 0.01, "Fallo en el test3");
       assertEquals(9.0, r.getVertice2().getX(), 0.01, "Fallo en el test3");
    }

    
    @Test
    public void testMoverHorizontalIzquierda() {
       Rectangulo r = new Rectangulo(vertice1, vertice2);
       r.mover(-4.0);
       assertEquals(-4.0, r.getVertice1().getX(), 0.01, "Fallo en el test4");
       assertEquals(1.0, r.getVertice2().getX(), 0.01, "Fallo en el test4");
    }
    
    @Test
    public void testMoverVerticalArriba() {
        Rectangulo r = new Rectangulo(vertice1, vertice2);
        r.moverVertical(4.0);
        assertEquals(4.0, r.getVertice1().getY(), 0.01, "Fallo en el test5");
        assertEquals(7.0, r.getVertice2().getY(), 0.01, "Fallo en el test5");
    }

     @Test
    public void testMoverVerticalAbajo() {
        Rectangulo r = new Rectangulo(vertice1, vertice2);
        r.moverVertical(-4.0);
        assertEquals(-4.0, r.getVertice1().getY(), 0.01, "Fallo en el test6");
        assertEquals(-1.0, r.getVertice2().getY(), 0.01, "Fallo en el test6");
    }
   
    @Test
    public void testContiene() {
        Rectangulo r = new Rectangulo(vertice1, vertice2);
        Punto punto = new Punto(2.0,1.0);
        boolean resultado = r.contiene(punto);
        assertTrue(resultado, "Fallo en el test7");
    }
    
    @Test
    public void testNoContiene() {
        Rectangulo r = new Rectangulo(vertice1, vertice2);
        Punto punto = new Punto(6.0,1.0);
        boolean resultado = r.contiene(punto);
        assertFalse(resultado, "Fallo en el test8");
    }
   
    @Test
    public void testMostrarDatos() {
       Rectangulo r = new Rectangulo(vertice1, vertice2);
       String resultado = r.mostrarDatos();
       assertTrue(resultado.contains("Vértice 1"), "Fallo en el test9");
       assertTrue(resultado.contains("Vértice 2"), "Fallo en el test9");
       assertTrue(resultado.contains("Área"), "Fallo en el test9");
    }
    
}
