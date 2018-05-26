
package edu.clases;

/**
 * Nombre de la clase: Facultad
 * Fecha: 24-05-2018
 * Version: 1.0
 * CopyRight: Andrés Alfaro
 * @author Andrés Alfaro
 */
public class Facultad extends Estudiante{
    private String nomFacultad;
    private int numMaterias;
    private double promFinal;

    public Facultad() {
    }

    public Facultad(String nomFacultad, int numMaterias, double promFinal) {
        this.nomFacultad = nomFacultad;
        this.numMaterias = numMaterias;
        this.promFinal = promFinal;
    }

    public Facultad(String nomFacultad, int numMaterias, double promFinal, String nombres, String apellidos, String genero, int edad, String intereses, String direccion, String fechaNaci, String estadoCivil, double mensualidad, int añoIngreso) {
        super(nombres, apellidos, genero, edad, intereses, direccion, fechaNaci, estadoCivil, mensualidad, añoIngreso);
        this.nomFacultad = nomFacultad;
        this.numMaterias = numMaterias;
        this.promFinal = promFinal;
    }

    public String getNomFacultad() {
        return nomFacultad;
    }

    public void setNomFacultad(String nomFacultad) {
        this.nomFacultad = nomFacultad;
    }

    public int getNumMaterias() {
        return numMaterias;
    }

    public void setNumMaterias(int numMaterias) {
        this.numMaterias = numMaterias;
    }

    public double getPromFinal() {
        return promFinal;
    }

    public void setPromFinal(double promFinal) {
        this.promFinal = promFinal;
    }
    
    
}
