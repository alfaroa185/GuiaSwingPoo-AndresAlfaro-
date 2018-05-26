package edu.clases;

/**
 * Nombre de la clase: OperacionesCalculadora
 * Fecha: 24-05-2018
 * Version: 1.0
 * CopyRight: Andrés Alfaro
 * @author Andrés Alfaro
 */
public class OperacionesCalculadora implements Calculadora {
    
    private double n1;
    private double n2;

    public OperacionesCalculadora() {
    }

    public OperacionesCalculadora(double n1, double n2) {
        this.n1 = n1;
        this.n2 = n2;
    }

    public double getN1() {
        return n1;
    }

    public void setN1(double n1) {
        this.n1 = n1;
    }

    public double getN2() {
        return n2;
    }

    public void setN2(double n2) {
        this.n2 = n2;
    }
    
    //metodos implementados
    
    @Override
    public double resta() {
       double resultado;
       resultado=n1-n2;
       return resultado;
    }

    @Override
    public double multiplicacion() {
       double resultado;
       resultado=n1*n2;
       return resultado;
    }

    @Override
    public double division() {
       double resultado;
       resultado=n1/n2;
       return resultado;
    }

    @Override
    public double potencia() {
       double resultado;
       resultado=Math.pow(n1, n2);
       return resultado;
    }

    @Override
    public double raiz() {
       double resultado;
       resultado=Math.sqrt(n1);
       return resultado;
    } 

    @Override
    public double suma() {
       double resultado;
       resultado=n1+n2;
       return resultado;
    }
}
