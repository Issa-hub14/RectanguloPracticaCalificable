/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

/**
 *
 * @author isabe
 */

public class Rectangulo extends Figura {
    
    private Punto vertice2;
    
    public Rectangulo(Punto vertice1, Punto vertice2) {
        super(vertice1);
        this.vertice2 = vertice2;
    }
    
    public Punto getVertice2() {
        return vertice2;
    }
    
    public void setVertice2(Punto vertice2) {
        this.vertice2 = vertice2;
    }
    
    @Override
    public double calcularArea() {
        double base = Math.abs(vertice2.getX() - vertice1.getX());
        double altura = Math.abs(vertice2.getY() - vertice1.getY());
        return base * altura;
    }
    
    @Override
    public void escalar(double factor) {
        if (factor > 0) {
            double nuevoX = vertice1.getX() + (vertice2.getX() - vertice1.getX()) * factor;
            double nuevoY = vertice1.getY() + (vertice2.getY() - vertice1.getY()) * factor;
            vertice2.setX(nuevoX);
            vertice2.setY(nuevoY);
        }
    }
    
    
    @Override
    public void mover(double dx, double dy) {

        vertice1.setX(vertice1.getX() + dx);
        vertice1.setY(vertice1.getY() + dy);

        vertice2.setX(vertice2.getX() + dx);
        vertice2.setY(vertice2.getY() + dy);
    }

    public void mover(double dx) {
        mover(dx, 0);
    }

    public void moverVertical(double dy) {
        mover(0, dy);
    }

    public boolean contiene(Punto p) {
        double xMin = Math.min(vertice1.getX(), vertice2.getX());
        double xMax = Math.max(vertice1.getX(), vertice2.getX());
        double yMin = Math.min(vertice1.getY(), vertice2.getY());
        double yMax = Math.max(vertice1.getY(), vertice2.getY());

        return (p.getX() >= xMin && p.getX() <= xMax &&
                p.getY() >= yMin && p.getY() <= yMax);
    }

    @Override
    public String mostrarDatos() {
        return "Rectángulo:\n" +
               "Vértice 1: (" + vertice1.getX() + ", " + vertice1.getY() + ")\n" +
               "Vértice 2: (" + vertice2.getX() + ", " + vertice2.getY() + ")\n" +
               "Área: " + calcularArea();
    }
    
}
