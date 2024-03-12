/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.salariodescuentos;

/**
 *
 * @author UFG
 */
public class EmpleadoTiempoCompleto extends Empleado{
    private double descuento;

    public EmpleadoTiempoCompleto() {
    }

    public EmpleadoTiempoCompleto(double descuento) {
        this.descuento = descuento;
    }

    public EmpleadoTiempoCompleto(double descuento, String nombre, double salarioBase) {
        super(nombre, salarioBase);
        this.descuento = descuento;
    }

    @Override
    public double CalcularSalario(double SalarioBase) {
        double result = (super.CalcularSalario(SalarioBase)*0.2);
        return result; // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
    }
    
    
    
}
