/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

/**
 *
 * @author isabe
 */
public class ListaRectangulos {
    
    private Rectangulo[] rectangulos;
    private int contador;
    
    public ListaRectangulos(int capacidad) {
        this.rectangulos = new Rectangulo[capacidad];
        this.contador = 0;
    }
    
    public Rectangulo[] getRectangulos() {
        return rectangulos;
    }
    
    public int getContador() {
        return contador;
    }
    
    public String agregar(Rectangulo rectangulo) {
        if (contador < rectangulos.length) {
            rectangulos[contador] = rectangulo;
            contador++;
            return "Rectángulo agregado correctamente.";
        }
        return "No se pueden agregar más rectángulos.";
    }
    
    public Rectangulo buscar(int indice) {
        if (indice >= 0 && indice < contador) {
            return rectangulos[indice];
        }
        return null;
    }
    
    public String mostrarTodos() {
        if (contador == 0) {
            return "No hay rectángulos registrados.";
        }
        String lista = "";
        for (int i = 0; i < contador; i++) {
            lista += "Rectángulo [" + i + "]:\n" + rectangulos[i].mostrarDatos() + "\n\n";
        }
        return lista;
    }
    
    public String eliminar(int indice) {
        if (indice < 0 || indice >= contador) {
            return "Índice no válido.";
        }
        for (int i = indice; i < contador - 1; i++) {
            rectangulos[i] = rectangulos[i + 1];
        }
        rectangulos[contador - 1] = null;
        contador--;
        return "Rectángulo eliminado correctamente.";
    }
}
