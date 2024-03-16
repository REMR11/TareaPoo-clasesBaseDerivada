package SalarioDescuentos.BL;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import SalarioDescuentos.DAL.EmpleadoDAL;

public class EmpleadoBL {
	Scanner sc = new Scanner(System.in);
	// Solicitamos ingresar nombre de empleado
	private String solicitarNombre() {
		System.out.println("Ingrese nombre del empleado");
		return sc.next().trim();
	}
	
	// Verificamos si el nombre ingresado cumple con lo que necesitamso para ingresarlo
	private boolean esNombreValido(String nombreUsuario) {
		Pattern patron = Pattern.compile("[a-z,A-Z]");
		Matcher matcher = patron.matcher(nombreUsuario);
		return matcher.matches();
	}
	
    // Método para solicitar y validar el nombre de usuario
    public String solicitarYValidarNombreUsuario(String advertencia) {
        String nombreUsuario;
        do {
            nombreUsuario = solicitarNombre();
        } while (!esNombreValido(nombreUsuario));
        return nombreUsuario;
    }
    
}
