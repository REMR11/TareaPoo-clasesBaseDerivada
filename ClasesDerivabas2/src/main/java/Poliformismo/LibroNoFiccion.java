/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Poliformismo;

/**
 *
 * @author UFG
 */
public class LibroNoFiccion extends Libro {

    private String temaDeLibro;

    // Creamos constructores vacio y con parametros de clase
    public LibroNoFiccion() {
    }

    public LibroNoFiccion(String temaDeLibro, String titulo, String autor, int anioPublicacion) {
        super(titulo, autor, anioPublicacion);
        this.temaDeLibro = temaDeLibro;
    }

    //Creamos metodo para obtener y proporcionar informacion de las propiedades de la clase
    public String getTemaDeLibro() {
        return temaDeLibro;
    }

    public void setTemaDeLibro(String temaDeLibro) {
        this.temaDeLibro = temaDeLibro;
    }

    //Sobre escribimos metodo describir y agregamos el tipo de libro
    @Override
    public String Describir() {
        return super.Describir() + " De no ficcion"; // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
    }

    //Sobre escribimos metodo que imprime la informacion de la clase y se agrega la propiedad de la clase actual
    @Override
    public String toString() {
        return super.toString() + "\nTema" + temaDeLibro; // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
    }

}
