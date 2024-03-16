package SalarioDescuentos.DAL;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import SalarioDescuentos.EL.EmpleadoEL;

public class EmpleadoDAL {
	Scanner sc = new Scanner(System.in);

	public ArrayList<EmpleadoEL> AddEmployee(ArrayList<EmpleadoEL> pEmpleados, EmpleadoEL pEmpleado) {
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
	private EmpleadoEL findList(ArrayList<EmpleadoEL> empleados, int id) {
		for (EmpleadoEL empleado : empleados) {
			if (empleado.getId() == id) {
				return empleado;
			}
		}
		return null;
	}

	// Método que verifica si existe algun empleado con el ID obtenido
	public boolean existEmployee(ArrayList<EmpleadoEL> empleados, int id) {
		EmpleadoEL empleado = findList(empleados, id);
		if (empleado != null) {
			System.out.println("Empleado encontrado exitosamente");
			return true;
		}
		System.out.println("Empleado no encontrado en la nómina");
		return false;
	}

	public boolean removeEmployee(ArrayList<EmpleadoEL> pEmpleados, int pId) {
		boolean empleado = existEmployee(pEmpleados, pId);
		if (empleado) {
			pEmpleados.remove(pId);
			return true;
		}
		return false;
	}

}
