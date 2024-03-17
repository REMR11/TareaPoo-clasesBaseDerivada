package SalarioDescuentos.DAL;

import java.util.ArrayList;
import java.util.Scanner;

import SalarioDescuentos.EL.EmpleadoMedioTiempoEL;

/*
 * Clase empleado medio tiempo
 * Creamos los metodos genericos necesarios en esta para agregar, buscar y eliminar
 * */
public class EmpleadoMTDAL extends EmpleadoDAL {

	Scanner sc = new Scanner(System.in);

	// Metodo que agrega un nuevo empleado al arreglo
	/**
	 * @param pEmpleados
	 * @param pEmpleado
	 * @return Una lista actualizada con el nuevo Empleado agregado
	 **/
	public static ArrayList<EmpleadoMedioTiempoEL> AddEmployee(ArrayList<EmpleadoMedioTiempoEL> pEmpleados,
			EmpleadoMedioTiempoEL pEmpleado) {
		if (pEmpleado == null) {
			System.out.println("El empleado no debe estar vacio");
			return pEmpleados;
		}

		// Agregamos un nuevo Empleado a la nomina
		pEmpleados.add(pEmpleado);
		System.out.println("Empleado agregado exitosamente");

		return pEmpleados;
	}

	// Método que encuentra un empleado medio tiempo en la lista
	/**
	 * @param empleados
	 * @param id
	 * @return Empleado encontrado o Null en caso de no tener coincidencias
	 */
	public static EmpleadoMedioTiempoEL findListMT(ArrayList<EmpleadoMedioTiempoEL> empleados, int id) {
		for (EmpleadoMedioTiempoEL empleado : empleados) {
			if (empleado.getId() == id) {
				return empleado;
			}
		}
		return null;
	}

	// Método que verifica si existe algun empleado con el ID obtenido
	/**
	 * @param empleados
	 * @param id
	 * @return boolean que verifica si el empleado existe
	 */
	public static boolean existEmployeeMT(ArrayList<EmpleadoMedioTiempoEL> empleados, int id) {
		EmpleadoMedioTiempoEL empleado = findListMT(empleados, id);
		if (empleado != null) {
			System.out.println("Empleado encontrado exitosamente");
			return true;
		}
		System.out.println("Empleado no encontrado en la nómina");
		return false;
	}

	// Metodo que busca y elimina al empleado senialado
	/**
	 * @param pEmpleados
	 * @param pId
	 * @return boolean que verifica si el metodo tuvo exito
	 */
	public static boolean removeEmployeeMT(ArrayList<EmpleadoMedioTiempoEL> pEmpleados, int pId) {
		boolean empleado = existEmployeeMT(pEmpleados, pId);
		if (empleado) {
			pEmpleados.remove(pId);
			return true;
		}
		return false;
	}

}
