/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.clasesderivabas2;

/**
 *
 * @author UFG
 */
public class EstudiantePrimaria extends Estudiante {

    private int grado;

    public EstudiantePrimaria(String nombre, int edad) {
        super(nombre, edad);
    }

    public EstudiantePrimaria(int grado, String nombre, int edad) {
        super(nombre, edad);
        this.grado = grado;
    }

    public int getGrado() {
        return grado;
    }

    public void setGrado(int grado) {
        this.grado = grado;
    }

    @Override
    public String toString() {
        return super.toString() + "\nGrado= " + grado;// Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
    }

    @Override
    public void describir() {
         System.out.println("Este es un estudiante de primaria."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
    }
}
