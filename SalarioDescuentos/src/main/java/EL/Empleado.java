/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.salariodescuentos;

//Calculadora de prestaciones
/*https://www.toptrabajos.com/blog/sv/calculadora-de-prestaciones-y-retenciones/*/

/**
 *
 * @author UFG
 */
public class Empleado {
    private String nombre;
    private double salarioBase;
    private String tipoDescuento;
    public Empleado() {
    }

    
    public Empleado(String nombre, double salarioBase, String tipoDescuento) {
        this.nombre = nombre;
        this.salarioBase = salarioBase;
        this.tipoDescuento = tipoDescuento;
    }

    public String getNombre() {
        return nombre;
    }

    public double getSalarioBase() {
        return salarioBase;
    }

    public String gettipoDescuento() {
        return tipoDescuento;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setSalarioBase(double salarioBase) {
        this.salarioBase = salarioBase;
    }

    public void settipoDescuento(String tipoDescuento) {
        this.tipoDescuento = tipoDescuento;
    }
       
    public double CalcularSalario(double SalarioBase, String rubro){
       return this.salarioBase;
    }
    
}
