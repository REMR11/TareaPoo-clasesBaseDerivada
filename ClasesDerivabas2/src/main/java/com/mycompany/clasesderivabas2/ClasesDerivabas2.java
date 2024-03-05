/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.clasesderivabas2;

import java.util.Scanner;

/**
 *
 * @author UFG
 */
public class ClasesDerivabas2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean nuevoEstudiante;
        
        System.out.println("Quieres ingresar estudiante: true, false");
        nuevoEstudiante = sc.nextBoolean();
        
        //Registramos los datos de estudiantes
        while (nuevoEstudiante) {            
            int tipoEstudiante;
            //Definimos el tipo de estudiante a registrar
            System.out.println("Ingresa el numero del tipo de estudiante es? "
                    + "\n1) Estudiante Primaria"
                    + "\n2) Estudiante Secundaria");
            tipoEstudiante = sc.nextInt();
            
            if (tipoEstudiante == 1) {
                
                
               // EstudiantePrimaria estudiantePrimaria = new EstudiantePrimaria(nombre, tipoEstudiante);
            }
            
            nuevoEstudiante = false;
        }
        
    }
}
