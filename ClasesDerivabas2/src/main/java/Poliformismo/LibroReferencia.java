/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Poliformismo;

/**
 *
 * @author UFG
 */
public class LibroReferencia extends Libro {
    private String tipo;

    // Creamos constructores vacio y con parametros de clase
    public LibroReferencia() {
    }

    public LibroReferencia(String tipo, String titulo, String autor, int anioPublicacion) {
        super(titulo, autor, anioPublicacion);
        this.tipo = tipo;
    }
//Creamos metodo para obtener y proporcionar informacion de las propiedades de la clase
    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    //Sobre escribimos metodo describir y agregamos el tipo de libro
    @Override
    public String Describir() {
        return super.Describir()+ "de Referencia"; // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
    }
//Sobre escribimos metodo que imprime la informacion de la clase y se agrega la propiedad de la clase actual
    @Override
    public String toString() {
        return super.toString()+ "\nTipo" + tipo; // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
    }
}
