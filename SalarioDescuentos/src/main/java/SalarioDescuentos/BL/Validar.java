package SalarioDescuentos.BL;

import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public interface Validar {
	// Solicitamos ingresar nombre de empleado
	private static String solicitarString(Scanner sc, String pString) {
		System.out.println("Ingrese " + pString + " del empleado");
		return sc.next().trim();
	}

	// Verificamos si el nombre ingresado cumple con lo que necesitamso para
	// ingresarlo
	/**
	 * @param nombreUsuario
	 * @return
	 */
	private static boolean esStringValido(String pTexto) {
		Pattern patron = Pattern.compile("[a-z,A-Z]");
		Matcher matcher = patron.matcher(pTexto);
		return matcher.matches();
	}

	// Método para solicitar y validar cadena de caracteres para el empleado
	/**
	 * @param advertencia
	 * @return String
	 */
	public static String solicitarYValidarString(Scanner sc, String pString) {
		String textoString;
		do {
			textoString = solicitarString(sc, pString);
		} while (!esStringValido(textoString));
		return textoString;
	}

	// Metodo encargado de validar si el numero ingresado cumple como un double y no
	// avanzara hasta obtener un numero valido
	/**
	 * @param scanner
	 * @param prompt
	 * @return double numero valido
	 */
	public static double solicitarDoubleValido(Scanner scanner, String pcondicion) {
		double number = 0;
		boolean validInput = false;

		do {
			System.out.print(pcondicion);
			try {
				number = scanner.nextDouble();
				validInput = true;
			} catch (InputMismatchException e) {
				System.out.println("Numero invalido. Por favor ingrese un numero valido.");
				scanner.nextLine();
			}
		} while (!validInput);

		return number;
	}

	// Metodo encargado de validar si el numero ingresado cumple como un float y no
	// avanzara hasta obtener un numero valido.
	/**
	 * @param scanner
	 * @param prompt
	 * @return float numero valido
	 */
	public static double solicitarFloatValido(Scanner scanner, String pcondicion) {
		float number = 0;
		boolean validInput = false;

		do {
			System.out.print(pcondicion);
			try {
				number = scanner.nextFloat();
				validInput = true;
			} catch (InputMismatchException e) {
				System.out.println("Numero invalido. Por favor ingrese un numero valido.");
				scanner.nextLine();
			}
		} while (!validInput);

		return number;
	}

	// Metodo encargado de validar si el numero ingresado cumple como un entero y no
	// avanzara hasta obtener un numero valido.
	/**
	 * @param scanner
	 * @param prompt
	 * @return int numero valido
	 */
	public static double solicitarIntValido(Scanner scanner, String pcondicion) {
		int number = 0;
		boolean validInput = false;

		do {
			System.out.print(pcondicion);
			try {
				number = scanner.nextInt();
				validInput = true;
			} catch (InputMismatchException e) {
				System.out.println("Numero invalido. Por favor ingrese un numero valido.");
				scanner.nextLine();
			}
		} while (!validInput);

		return number;
	}
}
