package edu.clases;

/**
 * Nombre de la clase: Empleado
 * Fecha: 24-05-2018
 * Version: 1.0
 * CopyRight: Andrés Alfaro
 * @author Andrés Alfaro
 */
public class Empleado {
    private int carnet;
    private String nombre;
    private int edad;
    private double sueldo;
    private String intereses;
    private String genero;
    private String dui;
    private String nit;
    private String telefono;
    private String cargo;
    private String departamento;
    private int licencia;
    private double sueldofinal;

    public Empleado() {
    }

    public Empleado(int carnet, String nombre, int edad, double sueldo, String intereses, String genero, String dui, String nit, String telefono, String cargo, String departamento, int licencia, double sueldofinal) {
        this.carnet = carnet;
        this.nombre = nombre;
        this.edad = edad;
        this.sueldo = sueldo;
        this.intereses = intereses;
        this.genero = genero;
        this.dui = dui;
        this.nit = nit;
        this.telefono = telefono;
        this.cargo = cargo;
        this.departamento = departamento;
        this.licencia = licencia;
        this.sueldofinal = sueldofinal;
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

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public double getSueldo() {
        return sueldo;
    }

    public void setSueldo(double sueldo) {
        this.sueldo = sueldo;
    }

    public String getIntereses() {
        return intereses;
    }

    public void setIntereses(String intereses) {
        this.intereses = intereses;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getDui() {
        return dui;
    }

    public void setDui(String dui) {
        this.dui = dui;
    }

    public String getNit() {
        return nit;
    }

    public void setNit(String nit) {
        this.nit = nit;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public String getDepartamento() {
        return departamento;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }

    public int getLicencia() {
        return licencia;
    }

    public void setLicencia(int licencia) {
        this.licencia = licencia;
    }
    
    public double getSueldofinal() {
        return sueldofinal;
    }

    public void setSueldofinal(double sueldofinal) {
        this.sueldofinal = sueldofinal;
    }
    public double salario() {
        
        double sf;
        
          if(this.sueldo>0 && this.sueldo<300)
        {
            sf=this.sueldo+(this.sueldo*0.10);
        }
        else if(this.sueldo>=300 && this.sueldo<600)
        {
            sf=this.sueldo+(this.sueldo*0.12);
        }
        if(this.sueldo>=600)
        {
            sf=this.sueldo+(this.sueldo*0.14);
        }
        else
        {
            sf=this.sueldo;
        }
        
        return sf;
        
        
        
        
        
        
        
        
    }
}
