package Biblioteca;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * 
 */
public class Biblioteca {
	private List<Libro> libros;

	/**
	 * Crea una nueva biblioteca con la lista de libros proporcionados
	 * 
	 * @param libros
	 */
	public Biblioteca(List<Libro> libros) {
		super();
		this.libros = libros;
	}

	/**
	 * Agrega un nuevo libro con el autor y titulo obtenido
	 * 
	 * @param autor
	 * @param titulo
	 * @throws NullPointerException retornara nulo, si alguno de los parametros
	 *                              resulta ser nulo
	 */
	public void agregarLibro(Scanner sc) {
		int nuevoLibro = 1;
		do {
			
			System.out.println("Proporciona titulo de libro");
			String titulo = sc.nextLine();

			System.out.println("Proporciona autor de libro");
			String autor = sc.nextLine();
			
			if (autor == null || titulo == null) {
				throw new NullPointerException("El autor y el título no pueden ser null.");
			}
			libros.add(new Libro(autor, titulo));
			System.out.println("Quieres agregar un nuevo libro? (1)si / (2)no");
			nuevoLibro = sc.nextInt();
			sc.nextLine();
		} while (nuevoLibro == 1);

	}

	/**
	 * Busqueda de libro, por el titulo proporcionado
	 * 
	 * @param titulo
	 * @return una lista de libros que coinciden con el titulo proporcionado
	 */
	public List<Libro> buscarLibrosPorTitulo(String titulo) {
		List<Libro> librosEncontrados = new ArrayList<>();
		for (Libro libro : libros) {
			if (libro.getTitulo().equals(titulo)) {
				librosEncontrados.add(libro);
			}
		}
		return librosEncontrados;
	}

	/**
	 * Busqueda de libro, por el nombre de autor proporcionado
	 * 
	 * @param autor
	 * @return un listado de libros que coinciden con el autor proporcionado
	 */
	public List<Libro> buscarLibrosPorAutor(String autor) {
		List<Libro> librosEncontrados = new ArrayList<>();
		for (Libro libro : libros) {
			if (libro.getAutor().equals(autor)) {
				librosEncontrados.add(libro);
			}
		}
		return librosEncontrados;
	}

	/**
	 * Verifica si el listado proporcionado esta vacio
	 * @param Libros
	 * @param mensaje que se mostrara en caso de tener una lista vacia
	 */
	public void isEmptyBiblioteca(ArrayList<Libro>Libros, String mensaje) {
		if (libros.isEmpty()) {
			System.out.println(mensaje);
		} else {
			System.out.println(libros);
		}
		
	}
	
	@Override
	public String toString() {
		return "Biblioteca [libros=" + libros.toString() + "]";
	}

}
