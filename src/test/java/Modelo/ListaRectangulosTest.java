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
public class ListaRectangulosTest {
    
    private Punto vertice1 = new Punto(0.0, 0.0);
    private Punto vertice2 = new Punto(5.0, 3.0);
    
    public ListaRectangulosTest() {
    }
       
    @Test
    public void testGetContador() {
        ListaRectangulos lista = new ListaRectangulos(10);
        Rectangulo r = new Rectangulo(vertice1, vertice2);
        lista.agregar(r);
        Rectangulo r2 = new Rectangulo(new Punto(2.0, 1.0), new Punto(3.0, 2.0));
        lista.agregar(r2);
        int resultado = lista.getContador();
        assertEquals(2, resultado, "Fallo en el test");
    }

   
    @Test
    public void testAgregar() {
        ListaRectangulos lista = new ListaRectangulos(10);
        Rectangulo r = new Rectangulo(vertice1, vertice2);
        String resultado = lista.agregar(r);
        assertEquals("Rectángulo agregado correctamente.", resultado, "Fallo en el test");
    }

    @Test
    public void testNoAgregar() {
        ListaRectangulos lista = new ListaRectangulos(2);
        Rectangulo r = new Rectangulo(vertice1, vertice2);
        lista.agregar(r);
        Rectangulo r2 = new Rectangulo(new Punto(1.0, 1.0), new Punto(4.0, 6.0));
        lista.agregar(r2);
        Rectangulo r3 = new Rectangulo(new Punto(2.0, 2.0), new Punto(8.0, 5.0));
        String resultado = lista.agregar(r3);
        assertEquals("No se pueden agregar más rectángulos.", resultado, "Fallo en el test");
    }
    
    @Test
    public void testBuscar() {
        ListaRectangulos lista = new ListaRectangulos(10);
        lista.agregar(new Rectangulo(vertice1, vertice2));
        Rectangulo resultado = lista.buscar(0);
        assertNotNull(resultado);
    }
    
    @Test
    public void testBuscarNo() {
        ListaRectangulos lista = new ListaRectangulos(10);
        Rectangulo resultado = lista.buscar(0);
        assertNull(resultado);
    }
   
    @Test
    public void testMostrarTodos() {
        ListaRectangulos lista = new ListaRectangulos(10);
        lista.agregar(new Rectangulo(vertice1, vertice2));
        String resultado = lista.mostrarTodos();
        assertTrue(resultado.contains("[0]"), "Fallo en el test");
    }

    @Test
    public void testEliminar() {
        ListaRectangulos lista = new ListaRectangulos(10);
        Rectangulo r = new Rectangulo(vertice1, vertice2);
        lista.agregar(r);
        String resultado = lista.eliminar(0);
        assertEquals("Rectángulo eliminado correctamente.", resultado, "Fallo en el test");
        assertEquals(0, lista.getContador(), "Fallo en el test");
    }
    
    @Test
    public void testEliminarReorganiza() {
        ListaRectangulos lista = new ListaRectangulos(10);
        lista.agregar(new Rectangulo(new Punto(0.0, 0.0), new Punto(5.0, 3.0)));
        lista.agregar(new Rectangulo(new Punto(1.0, 1.0), new Punto(4.0, 6.0)));
        lista.agregar(new Rectangulo(new Punto(2.0, 2.0), new Punto(8.0, 5.0)));
        lista.eliminar(0);
        assertEquals(2, lista.getContador(), "Fallo en el test");
        assertEquals(1.0, lista.buscar(0).getVertice1().getX(), "Fallo en el test");
    }
}
