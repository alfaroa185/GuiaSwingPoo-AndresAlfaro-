
package edu.clases;
/**
 * Nombre de la clase: Poligono
 * Fecha: 24-05-2018
 * Version: 1.0
 * CopyRight: Andrés Alfaro
 * @author Andrés Alfaro
 */
public abstract class Poligono {
    
    int lados;

    public int getLados() {
        return lados;
    }

    public void setLados(int lados) {
        this.lados = lados;
    }

    public Poligono() {
    }

    public Poligono(int lados) {
        this.lados = lados;
    }
    //metodo abstracto 
    public abstract double Area();
        
    
    
    
    
}
