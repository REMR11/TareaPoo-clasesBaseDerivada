package Biblioteca;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import Biblioteca.Biblioteca;

public class Tester_Biblioteca {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		ArrayList<Libro> libros = new ArrayList<Libro>();
		Biblioteca biblioteca = new Biblioteca(libros);
		Scanner sc = new Scanner(System.in);
		int respuesta = 0;

		biblioteca.agregarLibro(sc);
		do {
			System.out.println("Que deseas hacer ahora? \n(1) Ver listado de libros \n(2) Agregar nuevo libro"
					+ "\n(3) Buscar un libro \n(4) Salir");
			respuesta = sc.nextInt();
			sc.nextLine();
			switch (respuesta) {
			case 1: {
				System.out.println(biblioteca.toString());
				break;
			}
			case 2: {
				biblioteca.agregarLibro(sc);
				break;
			}
			case 3: {
				System.out.println("como buscaras tu libro? (1)Autor, (2)Titulo");
				respuesta = sc.nextInt();
				sc.nextLine();
				
				if (respuesta == 1) {
					System.out.println("Proporciona nombre del autor del libro");
					String autor = sc.nextLine();
				
					List<Libro> librosEncontrados = biblioteca.buscarLibrosPorAutor(autor);
					
					if (librosEncontrados.isEmpty()) {
						System.out.println("No se encontraron libros con ese autor.");
					} else {
						System.out.println(librosEncontrados);
					}
				} else {
					System.out.println("Proporciona titulo del libro");
					String titulo = sc.nextLine();
					
					List<Libro> librosEncontrados = biblioteca.buscarLibrosPorTitulo(titulo);
					
					if (librosEncontrados.isEmpty()) {
						System.out.println("No se encontraron libros con ese titulo.");
					} else {
						System.out.println(librosEncontrados);
					}
				}
				break;
			}
			case 4: {
				sc.close();
				System.exit(0);
			}

			default:
				throw new IllegalArgumentException("Unexpected value: " + respuesta);
			}
		} while (respuesta != 4);

	}

}
