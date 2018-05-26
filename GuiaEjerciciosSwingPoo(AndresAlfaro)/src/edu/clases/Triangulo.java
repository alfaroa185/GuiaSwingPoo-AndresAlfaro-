
package edu.clases;

import java.text.DecimalFormat;

/**
 * Nombre de la clase: Triangulo
 * Fecha: 24-05-2018
 * Version: 1.0
 * CopyRight: Andrés Alfaro
 * @author Andrés Alfaro
 */
public class Triangulo extends Poligono {
  private double lado1;
  private double lado2;
  private double lado3;

    

    public Triangulo(double lado1, double lado2, double lado3) {
        super(3);
        this.lado1 = lado1;
        this.lado2 = lado2;
        this.lado3 = lado3;
    }

    public double getLado1() {
        return lado1;
    }

    public void setLado1(double lado1) {
        this.lado1 = lado1;
    }

    public double getLado2() {
        return lado2;
    }

    public void setLado2(double lado2) {
        this.lado2 = lado2;
    }

    public double getLado3() {
        return lado3;
    }

    public void setLado3(double lado3) {
        this.lado3 = lado3;
    }

    public Triangulo() {
    }
    
    
  @Override
    public double Area(){
        double area=0;
        DecimalFormat f = new DecimalFormat("###.00");
        //calcule el area por medio de la formula de heron
        area=(lado1*lado2)/2;
       
        
        
        return area;
    }
}
   