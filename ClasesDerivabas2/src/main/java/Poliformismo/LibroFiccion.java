/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Poliformismo;

/**
 *
 * @author UFG
 */
public class LibroFiccion extends Libro {

    private String genero;

    // Creamos constructores vacio y con parametros de clase
    public LibroFiccion() {
    }

    public LibroFiccion(String genero, String titulo, String autor, int anioPublicacion) {
        super(titulo, autor, anioPublicacion);
        this.genero = genero;
    }

    //Creamos metodo para obtener y proporcionar informacion de las propiedades de la clase
    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    //Sobre escribimos metodo describir y agregamos el tipo de libro
    @Override
    public String Describir() {
        return super.Describir() + " de Ficcion";  // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
    }
    
    //Sobre escribimos metodo que imprime la informacion de la clase y se agrega la propiedad de la clase actual
    @Override
    public String toString() {
        return super.toString()
                + "\nGenero = " + genero;// Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
    }

}
