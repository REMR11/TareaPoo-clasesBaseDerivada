package SalarioDescuentos.BL;

import java.util.ArrayList;
import java.util.Scanner;

import SalarioDescuentos.DAL.EmpleadoDAL;
import SalarioDescuentos.DAL.EmpleadoTCDAL;
import SalarioDescuentos.EL.EmpleadoTiempoCompletoEL;


public class EmpleadoTCBL extends EmpleadoBL {

	private Scanner sc = new Scanner(System.in);

	// Metodo encargado de calcular el salario del empleado con los impuestos sobre la renta
	/**
	 * @param salarioBase
	 * @return salario con el descuento aplicado
	 */
	public static double calcularSalarioTC(double salarioBase) {
		// Calcula el impuesto sobre la renta
		final double ISS = 0.18; // Impuesto sobre la renta (18%)
		final double AFP = 0.0435; // Aporte al sistema de pensiones (4.35%)
		final double[] excedentes = { 472.00, 895.24, 2038.57 }; // Excedentes de impuesto sobre la renta
		final double[] cuotasFijas = { 17.67, 60.00, 288.57 }; // Cuotas fijas de impuesto sobre la renta

		double salarioNeto = salarioBase - (salarioBase * ISS) - (salarioBase * AFP);

		// Aplica las cuotas fijas y los excedentes de impuesto sobre la renta
		if (salarioNeto > excedentes[0]) {
			if (salarioNeto <= excedentes[1]) {
				salarioNeto -= ((salarioNeto - excedentes[0]) * 0.1) + cuotasFijas[0];
			} else if (salarioNeto <= excedentes[2]) {
				salarioNeto -= ((salarioNeto - excedentes[1]) * 0.15) + cuotasFijas[1];
				salarioNeto -= ((salarioNeto - excedentes[0]) * 0.1) + cuotasFijas[0];
			} else {
				salarioNeto -= ((salarioNeto - excedentes[2]) * 0.2) + cuotasFijas[2];
				salarioNeto -= ((salarioNeto - excedentes[1]) * 0.15) + cuotasFijas[1];
				salarioNeto -= ((salarioNeto - excedentes[0]) * 0.1) + cuotasFijas[0];
			}
		}

		return salarioNeto;
	}

	/**
	 * @return
	 */
	public ArrayList<EmpleadoTiempoCompletoEL> ObtenerDatosEmpleadoTC() {
		ArrayList<EmpleadoTiempoCompletoEL> pEmpleados = new ArrayList<EmpleadoTiempoCompletoEL>();

		EmpleadoTiempoCompletoEL pEmpleado = new EmpleadoTiempoCompletoEL();
		// Creamos un metodo que valida si el nombre es valido, omitiendo espacios al
		// inicio y final del mismo
		String nombre = super.solicitarYValidarString(sc, "Nombre");
		pEmpleado.setNombre(nombre);

		// Creamos un metodo que valida si el salario ingresado es un double positivo
		double salario = super.solicitarDoubleValido(sc, "Proporciona salario base del empleado: \n");
		pEmpleado.setSalarioBase(calcularSalario(salario));

		String sector = super.solicitarYValidarString(sc, "sector de trabajo");
		pEmpleado.setTipoIndustria(sector);

		return EmpleadoTCDAL.AddEmployee(pEmpleados, pEmpleado);
	}
	
	/**
	 * @param empleados
	 * @param id
	 * @return
	 */
	public EmpleadoTiempoCompletoEL findListBL(ArrayList<EmpleadoTiempoCompletoEL> empleados, int id) {
		return EmpleadoTCDAL.findListTC(empleados, id);
	}

	/**
	 * @param empleados
	 * @param id
	 * @return
	 */
	public static boolean existEmployeeBL(ArrayList<EmpleadoTiempoCompletoEL> empleados, int id) {
		return EmpleadoTCDAL.existEmployeeTC(empleados, id);
	}

	/**
	 * @param pEmpleados
	 * @param pId
	 * @return
	 */
	public static boolean removeEmployeeBL(ArrayList<EmpleadoTiempoCompletoEL> pEmpleados, int pId) {
		return EmpleadoTCDAL.removeEmployeeTC(pEmpleados, pId);
	}

	

}
