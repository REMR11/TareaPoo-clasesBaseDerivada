/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.clasesderivabas2;

/**
 *
 * @author UFG
 */
public class EstudianteSecundaria extends Estudiante {

    private String curso;

    public EstudianteSecundaria(String curso, String nombre, int edad) {
        super(nombre, edad);
        this.curso = curso;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    @Override
    public String toString() {
        return super.toString() + "\nCurso = " + curso;
    }

    @Override
    public void describir() {
        System.out.println("Este es un estudiante de primaria.");
    }

}
