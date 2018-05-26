
package edu.clases;

/**
 * Nombre de la clase: Carrera
 * Fecha: 24-05-2018
 * Version: 1.0
 * CopyRight: Andrés Alfaro
 * @author Andrés Alfaro
 */
public class Carrera extends Facultad{
    private String nombreCarrera;
    private double nota1;
    private double nota2;
    private double promedio;

    public Carrera() {
    }

    public Carrera(String nombreCarrera, double nota1, double nota2, double promedio) {
        this.nombreCarrera = nombreCarrera;
        this.nota1 = nota1;
        this.nota2 = nota2;
        this.promedio = promedio;
    }

    public Carrera(String nombreCarrera, double nota1, double nota2, double promedio, String nomFacultad, int numMaterias, double promFinal) {
        super(nomFacultad, numMaterias, promFinal);
        this.nombreCarrera = nombreCarrera;
        this.nota1 = nota1;
        this.nota2 = nota2;
        this.promedio = promedio;
    }

    public Carrera(String nombreCarrera, double nota1, double nota2, double promedio, String nomFacultad, int numMaterias, double promFinal, String nombres, String apellidos, String genero, int edad, String intereses, String direccion, String fechaNaci, String estadoCivil, double mensualidad, int añoIngreso) {
        super(nomFacultad, numMaterias, promFinal, nombres, apellidos, genero, edad, intereses, direccion, fechaNaci, estadoCivil, mensualidad, añoIngreso);
        this.nombreCarrera = nombreCarrera;
        this.nota1 = nota1;
        this.nota2 = nota2;
        this.promedio = promedio;
    }    

    public String getNombreCarrera() {
        return nombreCarrera;
    }

    public void setNombreCarrera(String nombreCarrera) {
        this.nombreCarrera = nombreCarrera;
    }

    public double getNota1() {
        return nota1;
    }

    public void setNota1(double nota1) {
        this.nota1 = nota1;
    }

    public double getNota2() {
        return nota2;
    }

    public void setNota2(double nota2) {
        this.nota2 = nota2;
    }

    public double getPromedio() {
        return promedio;
    }

    public void setPromedio(double promedio) {
        this.promedio = promedio;
    }
    
    
    
}
