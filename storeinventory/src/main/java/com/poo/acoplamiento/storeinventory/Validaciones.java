package com.poo.acoplamiento.storeinventory;

import java.util.InputMismatchException;
import java.util.NoSuchElementException;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Validaciones {

	/**
	 * Metodo encargado de solicitar valores string validos
	 * 
	 * @param sc      Objeto Scanner para leer la entrada
	 * @param pString Cadena de texto para mostrar como prompt
	 * @return Cadena de texto ingresada por el usuario
	 * @throws NoSuchElementException Si no se proporciona ninguna entrada
	 */
	private static String solicitarString(Scanner sc, String pString) {
		System.out.println("Ingrese " + pString + " del producto");
		try {
			return sc.next().trim();
		} catch (NoSuchElementException e) {
			System.out.println("Error: No se proporcionó un valor.");
			return "";
		}
	}

	/**
	 * Metodo que verifica si la cadena obtenida no contiene caracteres numericos
	 * 
	 * @param pTexto Texto a validar
	 * @return booleano que indica si el texto es válido
	 */
	private static boolean esStringValido(String pTexto) {
		Pattern patron = Pattern.compile("^[a-zA-Z\\s'-]+$");
		Matcher matcher = patron.matcher(pTexto);
		return matcher.matches();
	}

	/**
	 * Método para solicitar y validar cadena de caracteres para el producto
	 * 
	 * @param sc      Objeto Scanner para leer la entrada
	 * @param pString Cadena de texto para mostrar como prompt
	 * @return Cadena de texto ingresada por el usuario
	 * @throws NoSuchElementException Si no se proporciona ninguna entrada
	 */
	public static String solicitarYValidarString(Scanner sc, String pString) {
		String textoString;
		do {
			textoString = solicitarString(sc, pString);
		} while (!esStringValido(textoString));
		return textoString;
	}

	/**
	 * Metodo encargado de validar si el numero ingresado cumple como un double y no
	 * avanzara hasta obtener un numero valido
	 * 
	 * @param scanner    Objeto Scanner para leer la entrada
	 * @param pcondicion Cadena de texto para mostrar como prompt
	 * @return double número válido ingresado por el usuario
	 * @throws InputMismatchException si la entrada no es un número double válido
	 */
	public static double solicitarDoubleValido(Scanner scanner, String pcondicion) {
		double number = 0;
		boolean validInput = false;

		do {
			System.out.print("Proporciona cantidad de " + pcondicion + ":\n");
			try {
				number = scanner.nextDouble();
				if (number <= 0) {
					System.out.println("El número debe ser positivo.");
				} else {
					validInput = true;
				}
			} catch (InputMismatchException e) {
				System.out.println("Entrada no válida. Por favor ingrese un número decimal válido.");
				scanner.nextLine();
			}
		} while (!validInput);

		return number;
	}

	/**
	 * Metodo encargado de validar si el numero ingresado cumple como un float y no
	 * avanzara hasta obtener un numero valido. 24
	 * 
	 * @param scanner    Objeto Scanner para leer la entrada
	 * @param pcondicion Cadena de texto para mostrar como prompt
	 * @return float número válido ingresado por el usuario
	 * @throws InputMismatchException si la entrada no es un número float válido
	 */
	public static float solicitarFloatValido(Scanner scanner, String pcondicion) {
		Float number = 0.0f;
		boolean validInput = false;

		do {
			System.out.print("Proporciona cantidad de " + pcondicion + ":\n");
			try {
				number = scanner.nextFloat();
				if (number <= 0) {
					System.out.println("El número debe ser positivo.");
				} else {
					validInput = true;
				}
			} catch (InputMismatchException e) {
				System.out.println("Entrada no válida. Por favor ingrese un número decimal válido.");
				scanner.nextLine();
			}
		} while (!validInput);

		return number;
	}

	//
	/**
	 * Metodo encargado de validar si el numero ingresado cumple como un entero y no
	 * avanzara hasta obtener un numero valido.
	 * 
	 * @param scanner    Objeto Scanner para leer la entrada
	 * @param pcondicion Cadena de texto para mostrar como prompt
	 * @return int número válido ingresado por el usuario
	 * @throws InputMismatchException si la entrada no es un número entero válido
	 */
	public static int solicitarIntValido(Scanner scanner, String pcondicion) {
		int number = 0;
		boolean validInput = false;

		do {
			System.out.print("Proporcione cantidad de " + pcondicion + ":\n");
			try {
				number = scanner.nextInt();
				if (number <= 0) {
					System.out.println("El número debe ser positivo.");
				} else {
					validInput = true;
				}
			} catch (InputMismatchException e) {
				System.out.println("Entrada no válida. Por favor ingrese un número decimal válido.");
				scanner.nextLine();
			}
		} while (!validInput);

		return number;
	}
	
	public static int solicitarIntEnRango(Scanner scanner, String prompt, int min, int max) {
	    int number = 0;
	    boolean validInput = false;

	    do {
	        System.out.print("Proporciona la cantidad de "+prompt+ ":\n");
	        try {
	            number = scanner.nextInt();
	            if (number < min || number > max) {
	                System.out.println("El número debe estar entre " + min + " y " + max + ".");
	            } else {
	                validInput = true;
	            }
	        } catch (InputMismatchException e) {
	            System.out.println("Entrada no válida. Por favor ingrese un número entero.");
	            scanner.nextLine();
	        }
	    } while (!validInput);

	    return number;
	}
}