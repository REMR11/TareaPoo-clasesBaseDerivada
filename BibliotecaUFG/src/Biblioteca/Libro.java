package Biblioteca;

public class Libro {
	private String autor;
	private String titulo;

	
	/**
	 * 
	 */
	public Libro() {
		super();
	}
	/**
	 * @param autor
	 * @param titulo
	 */
	public Libro(String autor, String titulo) {
		super();
		this.autor = autor;
		this.titulo = titulo;
	}
	/**
	 * @return the autor
	 */
	public String getAutor() {
		return autor;
	}
	/**
	 * @param autor the autor to set
	 */
	public void setAutor(String autor) {
		this.autor = autor;
	}
	/**
	 * @return the titulo
	 */
	public String getTitulo() {
		return titulo;
	}
	/**
	 * @param titulo the titulo to set
	 */
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	@Override
	public String toString() {
		return "\nLibro [\nautor=" + autor + ", \ntitulo=" + titulo + "]";
	}
	
}
