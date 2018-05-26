
package edu.clases;
/**
 * Nombre de la clase: Rombo
 * Fecha: 24-05-2018
 * Version: 1.0
 * CopyRight: Andrés Alfaro
 * @author Andrés Alfaro
 */
public class Rombo extends Poligono{
   private double diagonal1;
   private double diagonal2;

  
    public Rombo(double diagonal1, double diagonal2) {
        super(2);
        this.diagonal1 = diagonal1;
        this.diagonal2= diagonal2;
    }
     public double getDiagonal1() {
        return diagonal1;
    }

    public void setDiagonal1(double diagonal1) {
        this.diagonal1 = diagonal1;
    }

    public double getDiagonal2() {
        return diagonal2;
    }

    public void setDiagonal2(double diagonal2) {
        this.diagonal2 = diagonal2;
    }

   

    public Rombo() {
    }

   @Override
   public double Area(){
       double area=0;
       //por medio de la diagonal mayor y menor
       
       area=(diagonal1*diagonal2)/2.0;
       
       
       return area;
   }

   
    
    
    
    
}
