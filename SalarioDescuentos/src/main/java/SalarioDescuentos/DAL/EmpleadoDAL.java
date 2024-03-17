package SalarioDescuentos.DAL;

import java.util.ArrayList;
import java.util.Scanner;

import SalarioDescuentos.BL.Validar;
import SalarioDescuentos.EL.EmpleadoEL;

/**
 *  Clase base Empleado 
 * Creamos los metodos genericos necesarios en esta para agregar, buscar y eliminar
 * Sobre escribiremos los metodos de esta clase en sus clases hijas
 * 
 * **/
public class EmpleadoDAL {
	Scanner sc = new Scanner(System.in);
	
	//Metodo que agrega un nuevo empleado al arreglo
	/**
	 * @param pEmpleados
	 * @param pEmpleado
	 * @return Una lista actualizada con el nuevo Empleado agregado
	 * **/
	public static ArrayList<EmpleadoEL> AddEmployee(ArrayList<EmpleadoEL> pEmpleados, EmpleadoEL pEmpleado) {
		if (pEmpleado == null) {
			System.out.println("El empleado no debe estar vacio");
			return pEmpleados;
		}

		// Agregamos un nuevo Empleado a la nomina
		pEmpleados.add(pEmpleado);
		System.out.println("Empleado agregado exitosamente");

		return pEmpleados;
	}

	// Método que encuentra un empleado en la lista
	/**
	 * @param empleados
	 * @param id
	 * @return Empleado encontrado
	 */
	public static EmpleadoEL findList(ArrayList<EmpleadoEL> empleados, int id) {
		for (EmpleadoEL empleado : empleados) {
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
	 * @return boolean que verifica si el empleado existe o no
	 */
	public static boolean existEmployee(ArrayList<EmpleadoEL> empleados, int id) {
		EmpleadoEL empleado = findList(empleados, id);
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
	 * @return boolean que indica si el metodo tuvo exito o no
	 */
	public static boolean removeEmployee(ArrayList<EmpleadoEL> pEmpleados, int pId) {
		boolean empleado = existEmployee(pEmpleados, pId);
		if (empleado) {
			pEmpleados.remove(pId);
			return true;
		}
		return false;
	}
	
	

}
