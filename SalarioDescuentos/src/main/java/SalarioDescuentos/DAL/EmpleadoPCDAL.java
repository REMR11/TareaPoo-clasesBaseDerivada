package SalarioDescuentos.DAL;
import java.util.ArrayList;
import java.util.Scanner;

import SalarioDescuentos.EL.EmpleadoPorContratoEL;

/*
 * Clase Empleado Por Contrato
 * Creamos los metodos genericos necesarios en esta para agregar, buscar y eliminar
 * */
public class EmpleadoPCDAL {
	
	Scanner sc = new Scanner(System.in);
	
	//Metodo que agrega un nuevo empleado al arreglo
	/**
	 * @param pEmpleados
	 * @param pEmpleado
	 * @return Una lista actualizada con el nuevo Empleado agregado
	 * **/
	public ArrayList<EmpleadoPorContratoEL> AddEmployee(ArrayList<EmpleadoPorContratoEL> pEmpleados,
			EmpleadoPorContratoEL pEmpleado) {
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
	 * @return empleado encontrado
	 */
	private EmpleadoPorContratoEL findList(ArrayList<EmpleadoPorContratoEL> empleados, int id) {
		for (EmpleadoPorContratoEL empleado : empleados) {
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
	 * @return boolean que verifica la existencia del empleado
	 */
	public boolean existEmployeeMT(ArrayList<EmpleadoPorContratoEL> empleados, int id) {
		EmpleadoPorContratoEL empleado = findList(empleados, id);
		if (empleado != null) {
			System.out.println("Empleado encontrado exitosamente");
			return true;
		}
		System.out.println("Empleado no encontrado en la nómina");
		return false;
	}

	//Busca y elimina al empledo 
	/**
	 * @param pEmpleados
	 * @param pId
	 * @return boolean que verifica si fue exitosamente eliminado
	 */
	public boolean removeEmployeeMT(ArrayList<EmpleadoPorContratoEL> pEmpleados, int pId) {
		boolean empleado = existEmployeeMT(pEmpleados, pId);
		if (empleado) {
			pEmpleados.remove(pId);
			return true;
		}
		return false;
	}
}
