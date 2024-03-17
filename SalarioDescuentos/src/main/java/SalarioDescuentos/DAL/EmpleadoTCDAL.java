package SalarioDescuentos.DAL;

import java.util.ArrayList;
import java.util.Scanner;

import SalarioDescuentos.EL.EmpleadoTiempoCompletoEL;

/*
 * Clase empleado Tiempo Completo
 * Creamos los metodos genericos necesarios en esta para agregar, buscar y eliminar
 * */
public class EmpleadoTCDAL extends EmpleadoDAL {

	Scanner sc = new Scanner(System.in);

	// Metodo que agrega un nuevo empleado de tiempo completo de la listaa la lista
	/**
	 * @param pEmpleados
	 * @param pEmpleado
	 * @return Una lista actualizada con el nuevo Empleado agregado
	 **/
	public static ArrayList<EmpleadoTiempoCompletoEL> AddEmployee(ArrayList<EmpleadoTiempoCompletoEL> pEmpleados,
			EmpleadoTiempoCompletoEL pEmpleado) {
		if (pEmpleado == null) {
			System.out.println("El empleado no debe estar vacio");
			return pEmpleados;
		}

		// Agregamos un nuevo Empleado a la nomina
		pEmpleados.add(pEmpleado);
		System.out.println("Empleado agregado exitosamente");

		return pEmpleados;
	}

	// Método que encuentra un empleado de tiempo completo en la lista
	/**
	 * @param empleados
	 * @param id
	 * @return
	 */
	public static EmpleadoTiempoCompletoEL findListTC(ArrayList<EmpleadoTiempoCompletoEL> empleados, int id) {
		for (EmpleadoTiempoCompletoEL empleado : empleados) {
			if (empleado.getId() == id) {
				return empleado;
			}
		}
		return null;
	}

	// Método que verifica si existe algun empleado con el ID obtenido de empleado
	// tiempo completo
	/**
	 * @param empleados
	 * @param id
	 * @return
	 */
	public static boolean existEmployeeTC(ArrayList<EmpleadoTiempoCompletoEL> empleados, int id) {
		EmpleadoTiempoCompletoEL empleado = findListTC(empleados, id);
		if (empleado != null) {
			System.out.println("Empleado encontrado exitosamente");
			return true;
		}
		System.out.println("Empleado no encontrado en la nómina");
		return false;
	}

	// Metodo que busca y remueve empleado de tiempo completo
	/**
	 * @param pEmpleados
	 * @param pId
	 * @return boolean para verificar si el empleado fue eliminado exitosamente
	 */
	public static boolean removeEmployeeTC(ArrayList<EmpleadoTiempoCompletoEL> pEmpleados, int pId) {
		boolean empleado = existEmployeeTC(pEmpleados, pId);
		if (empleado) {
			pEmpleados.remove(pId);
			return true;
		}
		return false;
	}
	
	
}
