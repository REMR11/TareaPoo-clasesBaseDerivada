package descuentosEmpleados;

import java.util.ArrayList;
import java.util.Scanner;

public class EmpleadoMedioTiempoEL extends EmpleadoEL {
	private double descuento;
	private int diasTrabajados;
	private int horasTrabajadas;
	private double salarioConRenta;

	
	/**
	 * @return the salarioConRenta
	 */
	public double getSalarioConRenta() {
		return salarioConRenta;
	}

	/**
	 * @param salarioConRenta the salarioConRenta to set
	 */
	public void setSalarioConRenta(double salarioConRenta) {
		this.salarioConRenta = salarioConRenta;
	}

	/**
	 * @return the descuento
	 */
	public double getDescuento() {
		return descuento;
	}

	/**
	 * @param descuento the descuento to set
	 */
	public void setDescuento(double descuento) {
		this.descuento = descuento;
	}

	/**
	 * @return the diasTrabajados
	 */
	public int getDiasTrabajados() {
		return diasTrabajados;
	}

	/**
	 * @param diasTrabajados the diasTrabajados to set
	 */
	public void setDiasTrabajados(int diasTrabajados) {
		this.diasTrabajados = diasTrabajados;
	}

	/**
	 * @return the horasTrabajadas
	 */
	public int getHorasTrabajadas() {
		return horasTrabajadas;
	}

	/**
	 * @param horasTrabajadas the horasTrabajadas to set
	 */
	public void setHorasTrabajadas(int horasTrabajadas) {
		this.horasTrabajadas = horasTrabajadas;
	}

	/**
	 * 
	 */
	public EmpleadoMedioTiempoEL() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param id
	 * @param nombre
	 * @param salarioBase
	 * @param tipoIndustria
	 * @param diasTrabajados
	 * @param horasTrabajadas
	 */
	public EmpleadoMedioTiempoEL(String nombre, double salarioBase, String tipoIndustria, double descuento,
			int diasTrabajados, int horasTrabajadas, double salarioConRenta) {
		super(nombre, salarioBase, tipoIndustria);
		this.descuento = descuento;
		this.diasTrabajados = diasTrabajados;
		this.horasTrabajadas = horasTrabajadas;
		this.salarioConRenta = salarioConRenta;
		// TODO Auto-generated constructor stub
	}

	@Override
	public double calcularSalario(double salarioBase) {
		// TODO Auto-generated method stub
		return super.calcularSalario(salarioBase);
	}

	// Metodo que se encarga de calcular el salario del empleado segun las horas y
	// dias proporcionadas
	/**
	 * @param horasTrabajadas
	 * @param diastrabajados
	 * @return double salario calculado en abse a horas y dias trabajados
	 */
	public static double calcularSalarioBase(int horasTrabajadas, int diastrabajados) {
		double result = 0;
		int horasTotales = 0;
		int i = 1;
		while (i <= diastrabajados) {
			horasTotales += horasTrabajadas;
			i++;
		}
		if (horasTotales > 44) {
			// segun el codigo de trabajo articulo 169 se paga $3.00 por cada hora extra en
			// jornada
			result = ((44 * 1.50) + ((horasTotales - 44.0f) * 3.00f)) * 4;
		} else {
			result = (horasTotales * 1.50f) * 4;
		}

		return result;
	}

	/**
	 * @return Empleado con los datos obtenidos desde consola
	 */
	public void ObtenerDatosEmpleadoMT(Scanner sc, ArrayList<EmpleadoMedioTiempoEL> pEmpleados) {
	    EmpleadoMedioTiempoEL pEmpleado = new EmpleadoMedioTiempoEL();
	    // Creamos un metodo que valida si el nombre es valido, omitiendo espacios al
	    // inicio y final del mismo
	    String nombre = super.solicitarYValidarString(sc, "Nombre");
	    pEmpleado.setNombre(nombre);

	    // Obtenemos los horas trabajados por dia por el empleado
	    int horasTrabajadas = super.solicitarIntValido(sc,"Proporciona cantidad de horas trabajadas por dia: \n");
	    pEmpleado.setHorasTrabajadas(horasTrabajadas);

	    // Obtenemos los dias trabajados por el empleado
	    int diasTrabajados = super.solicitarIntValido(sc, "Proporciona cantidad de dias trabajados:\n");
	    pEmpleado.setDiasTrabajados(diasTrabajados);

	    /*
	     * Calculamos el salario base del empleado segun las horas de trabajo
	     * ingresadas, luego en con la funcion calcularSalarioTC obtenemos el salario
	     * despues de aplicarle la renta
	     */
	    double salarioBase = calcularSalarioBase(horasTrabajadas, diasTrabajados);
	    pEmpleado.setSalarioBase(salarioBase);

	    String sector = super.solicitarYValidarString(sc, "sector de trabajo");
	    pEmpleado.setTipoIndustria(sector);

	    // Metedo que calcula la renta y la aplica al salario
	    double descuento = calcularSalario(salarioBase);
	    pEmpleado.setDescuento(descuento);
	    double salarioConRenta = salarioBase - descuento;
	    pEmpleado.setSalarioConRenta(salarioConRenta);
	    pEmpleados.add(pEmpleado);
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString() + "Salario con descuento: " + super.redondeaDosDecimals(descuento) + ",\n" + "Dias Trabajados: "
				+ diasTrabajados + ",\n" + "Horas Trabajadas" + horasTrabajadas +",\n"+ "renta aplicada:"
				+ super.redondeaDosDecimals(salarioConRenta) + "]";
	}

}
