
package edu.clases;
/**
 * Nombre de la clase: Rectangulo
 * Fecha: 24-05-2018
 * Version: 1.0
 * CopyRight: Andrés Alfaro
 * @author Andrés Alfaro
 */
public class Rectangulo extends Poligono{
    private double lado1;
    private double lado2;

   

    public Rectangulo(double lado1, double lado2) {
        super(2);
        this.lado1 = lado1;
        this.lado2 = lado2;
    }

    public double getLado2() {
        return lado2;
    }

    public void setLado2(double lado2) {
        this.lado2 = lado2;
    }

    public double getLado1() {
        return lado1;
    }

    public void setLado1(double lado1) {
        this.lado1 = lado1;
    }

    public Rectangulo() {
    }
    @Override
    public double Area(){
        double area=0;
        
        area=lado1*lado2;
        
        return area;
    }
    
    
    
    
}
