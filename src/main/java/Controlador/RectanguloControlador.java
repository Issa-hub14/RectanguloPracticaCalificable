/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controlador;

/**
 *
 * @author isabe
 */
import Modelo.ListaRectangulos;
import Modelo.Punto;
import Modelo.Rectangulo;

public class RectanguloControlador {
    private ListaRectangulos lista;
    
    public RectanguloControlador(int capacidad) {
        this.lista = new ListaRectangulos(capacidad);
    }
    
    public String agregarRectangulo(double x1, double y1, double x2, double y2) {
        if (x1 == x2 || y1 == y2) {
            return "Las coordenadas no forman un rectángulo válido.";
        }
        Punto vertice1 = new Punto(x1, y1);
        Punto vertice2 = new Punto(x2, y2);
        Rectangulo rectangulo = new Rectangulo(vertice1, vertice2);
        return lista.agregar(rectangulo);
    }
    
    public String calcularArea(int indice) {
        Rectangulo r = lista.buscar(indice);
        if (r == null) 
            return "Rectángulo no encontrado.";
        return "Área: " + r.calcularArea();
    }
    
    public String escalar(int indice, double factor) {
        if (factor <= 0) 
            return "El factor de escala debe ser mayor a cero.";
        Rectangulo r = lista.buscar(indice);
        if (r == null) 
            return "Rectángulo no encontrado.";
        r.escalar(factor);
        return "Escala aplicada correctamente.\n" + r.mostrarDatos();
    }
    
    public String moverHorizontal(int indice, double dx) {
        Rectangulo r = lista.buscar(indice);
        if (r == null) 
            return "Rectángulo no encontrado.";
        if (dx == 0) 
            return "Debe ingresar un valor diferente de 0.";
        r.mover(dx);
        return "Rectángulo movido horizontalmente.\n" + r.mostrarDatos();
    }
    
    public String moverVertical(int indice, double dy) {
        Rectangulo r = lista.buscar(indice);
        if (r == null) 
            return "Rectángulo no encontrado.";
        if (dy == 0) 
            return "Debe ingresar un valor diferente de 0.";
        r.moverVertical(dy);
        return "Rectángulo movido verticalmente.\n" + r.mostrarDatos();
    }
    
    public String contienePunto(int indice, double px, double py) {
        Rectangulo r = lista.buscar(indice);
        if (r == null) 
            return "Rectángulo no encontrado.";
        Punto punto = new Punto(px, py);
        if (r.contiene(punto)) {
            return "El punto " + punto + " está dentro del rectángulo.";
        }
        return "El punto " + punto + " está fuera del rectángulo.";
    }
    
    public String mostrarTodos() {
        return lista.mostrarTodos();
    }
    
    public String eliminar(int indice) {
        return lista.eliminar(indice);
    }
    
    public String mostrarDatos(int indice) {
        Rectangulo r = lista.buscar(indice);
        if (r == null) 
            return "Rectángulo no encontrado.";
        return r.mostrarDatos();
    }
    
    public int getContador() {
        return lista.getContador();
    }
}
