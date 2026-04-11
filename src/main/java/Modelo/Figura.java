/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

/**
 *
 * @author isabe
 */

public class Figura {
    
    protected Punto vertice1;
    
    public Figura(Punto vertice1) {
        this.vertice1 = vertice1;
    }
    
    public Punto getVertice1() {
        return vertice1;
    }
    
    public void setVertice1(Punto vertice1) {
        this.vertice1 = vertice1;
    }
    
    public double calcularArea(){
        return 0;
    };
    
    public void escalar(double factor){
        
    };
    
    public void mover(double dx, double dy){
        
    };
    
    public String mostrarDatos(){
        return "Vértice 1: " + vertice1;
    };
}