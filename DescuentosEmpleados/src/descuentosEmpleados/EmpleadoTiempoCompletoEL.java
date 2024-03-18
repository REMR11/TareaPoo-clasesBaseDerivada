/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package descuentosEmpleados;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author UFG
 */

public class EmpleadoTiempoCompletoEL extends EmpleadoEL {

	private double descuento;
	private int horasTrabajadasSemana;
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
	 * @return the horasTrabajadasSemana
	 */
	public int getHorasTrabajadasSemana() {
		return horasTrabajadasSemana;
	}

	/**
	 * @param horasTrabajadasSemana the horasTrabajadasSemana to set
	 */
	public void setHorasTrabajadasSemana(int horasTrabajadasSemana) {
		this.horasTrabajadasSemana = horasTrabajadasSemana;
	}

	/**
	 * 
	 */
	public EmpleadoTiempoCompletoEL() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param id
	 * @param nombre
	 * @param salarioBase
	 * @param tipoIndustria
	 * @param descuento
	 * @param horasTrabajadasSemana
	 */
	public EmpleadoTiempoCompletoEL(String nombre, double salarioBase, String tipoIndustria, double descuento,
			int horasTrabajadasSemana, double salarioConRenta) {
		super(nombre, salarioBase, tipoIndustria);
		this.descuento = descuento;
		this.horasTrabajadasSemana = horasTrabajadasSemana;
		this.salarioConRenta = salarioConRenta;

		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString() + "Salario con descuentos: " + super.redondeaDosDecimals(descuento) + ",\n"
				+ "Horas trabajadas en la semana: " + getHorasTrabajadasSemana() +",\n"+ "Descuento aplicado: "+super.redondeaDosDecimals(salarioConRenta)+"]";
	}

	@Override
	public double calcularSalario(double salarioBase) {
		// TODO Auto-generated method stub
		return super.calcularSalario(salarioBase);
	}

	// Metodo que se encarga de calcular el salario segun las horas ingresadas por
	// el usuario
	/**
	 * @param horasTrabajadas
	 * @return double salario calculado segun horas trabajadas
	 */
	public static double calcularSalarioBase(int horasTrabajadas) {
		double result;
		if (horasTrabajadas > 44) {
			// segun el codigo de trabajo articulo 169 se paga $3.00 por cada hora extra en
			// jornada
			result = ((44.0 * 1.50) + ((horasTrabajadas - 44.0) * 3.00)) * 4;
		} else {
			result = (horasTrabajadas * 1.50) * 4;
		}
		return result;
	}

	/**
	 * @return Empleado con los datos obtenidos desde consola
	 */
	public void ObtenerDatosEmpleadoTC(Scanner sc, ArrayList<EmpleadoTiempoCompletoEL> pEmpleados) {

		// Creamos un metodo que valida si el nombre es valido, omitiendo espacios al
		// inicio y final del mismo
		String nombre = super.solicitarYValidarString(sc, "Nombre");
		// pEmpleado.setNombre(nombre);

		int horasTrabajadas = super.solicitarIntValido(sc, "Proporciona cantidad de horas trabajadas en la semana: \n");
		// pEmpleado.setHorasTrabajadasSemana(horasTrabajadas);

		/*
		 * Calculamos el salario base del empleado segun las horas de trabajo
		 * ingresadas, luego en con la funcion calcularSalarioTC obtenemos el salario
		 * despues de aplicarle la renta
		 */
		double salarioBase = calcularSalarioBase(horasTrabajadas);
		// pEmpleado.setSalarioBase(calcularSalarioTC(calcularSalarioBase(horasTrabajadas)));

		String sector = super.solicitarYValidarString(sc, "sector de trabajo");
		// pEmpleado.setTipoIndustria(sector);

		// Metedo que calcula la renta y la aplica al salario
		double descuento = calcularSalario(salarioBase);
		// pEmpleado.setDescuento(descuento);
		double salarioConRenta = salarioBase - descuento;

		EmpleadoTiempoCompletoEL pEmpleado = new EmpleadoTiempoCompletoEL(nombre, salarioBase, sector, descuento,
				horasTrabajadas, salarioConRenta);
		pEmpleados.add(pEmpleado);
	}

}
