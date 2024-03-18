/**
 * 
 */
package descuentosEmpleados;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;
import descuentosEmpleados.Validaciones;

/**
 * 
 */
public class testerDescuentos {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		ArrayList<EmpleadoTiempoCompletoEL> empleadosTiempoCompleto = new ArrayList<EmpleadoTiempoCompletoEL>();
		ArrayList<EmpleadoMedioTiempoEL> empleadoMedioTiempoEL = new ArrayList<EmpleadoMedioTiempoEL>();
		ArrayList<EmpleadoPorContratoEL> empleadoPorContratoEL = new ArrayList<EmpleadoPorContratoEL>();
		Scanner sc = new Scanner(System.in);

		EmpleadoTiempoCompletoEL empleadoTC = new EmpleadoTiempoCompletoEL();
		EmpleadoMedioTiempoEL empleadoMT = new EmpleadoMedioTiempoEL();
		EmpleadoPorContratoEL empleadoPC = new EmpleadoPorContratoEL();

		boolean inputExit = false;

		do {
			System.out.println("Que tipo de empleado deseas registrar?\n1)Empleado tiempo completo\n"
					+ "2)Empleado medio Tiempo\n3)Empleado por contrato\n");
			int respuesta = validarintRango(sc, 1, 3);

			switch (respuesta) {
			case 1: {
				empleadoTC.ObtenerDatosEmpleadoTC(sc, empleadosTiempoCompleto);
				break;
			}
			case 2: {
				empleadoMT.ObtenerDatosEmpleadoMT(sc, empleadoMedioTiempoEL);
				break;
			}
			case 3: {
				empleadoPC.ObtenerDatosEmpleadoPC(sc, empleadoPorContratoEL);
				break;
			}
			default:
				throw new IllegalArgumentException("Unexpected value: " + respuesta);
			}

			System.out.println("Quieres ingresar un nuevo Empleado? (1)Si / (0) NO");
			respuesta = validarintRango(sc, 0, 1);

			if (respuesta == 0) {
				inputExit = true;
			}
		} while (!inputExit);
		
		System.out.println(empleadosTiempoCompleto.toString());
		System.out.println(empleadoMedioTiempoEL.toString());
		System.out.println(empleadoPorContratoEL.toString());

	}

	public static int validarintRango(Scanner sc, int rangoInferior, int rangoSuperior) {
		int result = 0;
		boolean validInput = false;
		do {
			try {
				result = sc.nextInt();
				if (result < rangoInferior && result > rangoSuperior) {
					System.out.println("numero fuera de rango");
				} else {
					validInput = true;
				}
			} catch (InputMismatchException e) {
				System.out.println("Entrada no válida. Por favor ingrese una respuesta válido.");
				sc.nextLine();
			}
		} while (!validInput);
		return result;
	}
}
