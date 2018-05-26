
package edu.clases;
/**
 * Nombre de la clase: Romboide
 * Fecha: 24-05-2018
 * Version: 1.0
 * CopyRight: Andrés Alfaro
 * @author Andrés Alfaro
 */
public class Romboide extends Poligono{
    private double altura;
    private double base;

   

    public Romboide(double altura, double base) {
        super(2);
        this.altura = altura;
        this.base = base;
    }

    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        this.base = base;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public Romboide() {
    }
    
    @Override
    public double Area(){
        double area=0;
        area=base*altura;
        return area;
    }
    
    
    
    
    
    
}
