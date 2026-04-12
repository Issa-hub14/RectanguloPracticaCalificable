/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package Controlador;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author isabe
 */
public class RectanguloControladorIT {

    public RectanguloControladorIT() {
    }

    @Test
    public void testAgregarRectangulo() {
        RectanguloControlador controlador = new RectanguloControlador(10);
        double x1 = 0.0;
        double y1 = 0.0;
        double x2 = 5.0;
        double y2 = 3.0;
        String resultado = controlador.agregarRectangulo(x1, y1, x2, y2);
        assertEquals("Rectángulo agregado correctamente.", resultado, "Falla en el test");
    }

    @Test
    public void testNoAgregarRectangulo() {
        RectanguloControlador controlador = new RectanguloControlador(10);
        double x1 = 0.0;
        double y1 = 0.0;
        double x2 = 0.0;
        double y2 = 3.0;
        String resultado = controlador.agregarRectangulo(x1, y1, x2, y2);
        assertEquals("Las coordenadas no forman un rectángulo válido.", resultado, "Falla en el test");
    }

    @Test
    public void testCalcularArea() {
        RectanguloControlador controlador = new RectanguloControlador(10);
        double x1 = 0.0;
        double y1 = 0.0;
        double x2 = 5.0;
        double y2 = 3.0;
        controlador.agregarRectangulo(x1, y1, x2, y2);
        String resultado = controlador.calcularArea(0);
        assertEquals("Área: 15.0", resultado, "Falla en el test");
    }

    @Test
    public void testCalcularAreaRectanguloNoEncontrado() {
        RectanguloControlador controlador = new RectanguloControlador(10);
        String resultado = controlador.calcularArea(0);
        assertEquals("Rectángulo no encontrado.", resultado, "Falla en el test");
    }

    @Test
    public void testEscalar() {
        RectanguloControlador controlador = new RectanguloControlador(10);
        double x1 = 0.0;
        double y1 = 0.0;
        double x2 = 5.0;
        double y2 = 3.0;
        controlador.agregarRectangulo(x1, y1, x2, y2);
        String resultado = controlador.escalar(0, 2.0);
        assertTrue(resultado.contains("Escala aplicada correctamente."), "Falla en el test");
    }

    @Test
    public void testEscalarFactorInvalido() {
        RectanguloControlador controlador = new RectanguloControlador(10);
        double x1 = 0.0;
        double y1 = 0.0;
        double x2 = 5.0;
        double y2 = 3.0;
        controlador.agregarRectangulo(x1, y1, x2, y2);
        String resultado = controlador.escalar(0, -1.0);
        assertEquals("El factor de escala debe ser mayor a cero.", resultado, "Falla en el test");
    }

    @Test
    public void testMoverHorizontal() {
        RectanguloControlador controlador = new RectanguloControlador(10);
        double x1 = 0.0;
        double y1 = 0.0;
        double x2 = 5.0;
        double y2 = 3.0;
        controlador.agregarRectangulo(x1, y1, x2, y2);
        String resultado = controlador.moverHorizontal(0, 4.0);
        assertTrue(resultado.contains("Rectángulo movido horizontalmente."), "Fallo en el test");
        assertTrue(resultado.contains("4.0"), "Fallo en el test");
    }

    @Test
    public void testMoverVertical() {
        RectanguloControlador controlador = new RectanguloControlador(10);
        double x1 = 0.0;
        double y1 = 0.0;
        double x2 = 5.0;
        double y2 = 3.0;
        controlador.agregarRectangulo(x1, y1, x2, y2);
        String resultado = controlador.moverVertical(0, -4.0);
        assertTrue(resultado.contains("Rectángulo movido verticalmente."), "Falla en el test");
        assertTrue(resultado.contains("-4.0"), "Falla en el test");
    }

    @Test
    public void testContienePunto() {
        RectanguloControlador controlador = new RectanguloControlador(10);
        double x1 = 0.0;
        double y1 = 0.0;
        double x2 = 5.0;
        double y2 = 3.0;
        controlador.agregarRectangulo(x1, y1, x2, y2);
        double px = 2.0;
        double py = 1.0;
        String resultado = controlador.contienePunto(0, px, py);
        assertEquals("El punto (2.0, 1.0) está dentro del rectángulo.", resultado, "Falla en el test");
    }

    @Test
    public void testNoContienePunto() {
        RectanguloControlador controlador = new RectanguloControlador(10);
        double x1 = 0.0;
        double y1 = 0.0;
        double x2 = 5.0;
        double y2 = 3.0;
        controlador.agregarRectangulo(x1, y1, x2, y2);
        double px = 6.0;
        double py = 6.0;
        String resultado = controlador.contienePunto(0, px, py);
        assertEquals("El punto (6.0, 6.0) está fuera del rectángulo.", resultado, "Falla en el test");
    }

    @Test
    public void testMostrarTodos() {
        RectanguloControlador controlador = new RectanguloControlador(10);
        controlador.agregarRectangulo(0.0, 0.0, 5.0, 3.0);
        controlador.agregarRectangulo(1.0, 1.0, 4.0, 6.0);
        String resultado = controlador.mostrarTodos();
        assertTrue(resultado.contains("[0]"), "Falla en el test");
        assertTrue(resultado.contains("[1]"), "Falla en el test");
    }

    @Test
    public void testEliminar() {
        RectanguloControlador controlador = new RectanguloControlador(10);
        double x1 = 0.0;
        double y1 = 0.0;
        double x2 = 5.0;
        double y2 = 3.0;
        controlador.agregarRectangulo(x1, y1, x2, y2);

        String resultado = controlador.eliminar(0);
        assertEquals("Rectángulo eliminado correctamente.", resultado, "Falla en el test");
        assertEquals(0, controlador.getContador(), "Falla en el test");
    }

    @Test
    public void testMostrarDatos() {
        RectanguloControlador controlador = new RectanguloControlador(10);
        double x1 = 0.0;
        double y1 = 0.0;
        double x2 = 5.0;
        double y2 = 3.0;
        controlador.agregarRectangulo(x1, y1, x2, y2);
        
        String resultado = controlador.mostrarDatos(0);
        assertTrue(resultado.contains("Área"), "Falla en el test");
    }

}
