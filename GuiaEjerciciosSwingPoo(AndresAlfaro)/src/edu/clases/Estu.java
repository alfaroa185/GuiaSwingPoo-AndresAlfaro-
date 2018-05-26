
package edu.clases;

/**
 * Nombre de la clase: Estu
 * Fecha: 24-05-2018
 * Version: 1.0
 * CopyRight: Andrés Alfaro
 * @author Andrés Alfaro
 */
public class Estu {
    private int carnet;
    private String nombre;
    private double notaTeoria;
    private double notaPractica;

    public Estu() {
    }

    public Estu(int carnet, String nombre, double notaTeoria, double notaPractica) {
        this.carnet = carnet;
        this.nombre = nombre;
        this.notaTeoria = notaTeoria;
        this.notaPractica = notaPractica;
    }

    public int getCarnet() {
        return carnet;
    }

    public void setCarnet(int carnet) {
        this.carnet = carnet;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getNotaTeoria() {
        return notaTeoria;
    }

    public void setNotaTeoria(double notaTeoria) {
        this.notaTeoria = notaTeoria;
    }

    public double getNotaPractica() {
        return notaPractica;
    }

    public void setNotaPractica(double notaPractica) {
        this.notaPractica = notaPractica;
    }
    
    public double calcularPromedio(double notaTeoria,double notaPractica)
    {
        double calcularT = notaTeoria * 0.30;
        double calcularP = notaPractica * 0.70;
        double notaFinal = calcularT + calcularP;
        return notaFinal;
    }
}
