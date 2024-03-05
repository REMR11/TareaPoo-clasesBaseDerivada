package Poliformismo;

/**
 *
 * @author UFG
 */
public class Libro {
    private String titulo;
    private String autor;
    private int anioPublicacion;

    public Libro() {
    }
    
    public Libro(String titulo, String autor, int anioPublicacion) {
        this.titulo = titulo;
        this.autor = autor;
        this.anioPublicacion = anioPublicacion;
    }
    
    public String getTitulo() {
        return titulo;
    }

    public String getAutor() {
        return autor;
    }

    public int getAnioPublicacion() {
        return anioPublicacion;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public void setAnioPublicacion(int anioPublicacion) {
        this.anioPublicacion = anioPublicacion;
    }

    @Override
    public String toString() {
        return "Libro" +
                "\ntitulo=" + titulo + 
                "\nAutor=" + autor + 
                "\nAnioPublicacion=" + anioPublicacion;
    }
    
    public String Describir(){
        return "Este es un libro";
    }
    
}
