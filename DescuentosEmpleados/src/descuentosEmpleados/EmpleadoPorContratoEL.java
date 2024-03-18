package descuentosEmpleados;

import java.util.ArrayList;
import java.util.Scanner;

public class EmpleadoPorContratoEL extends EmpleadoEL {
	private double descuento;
	private int contratoMes;
	private float tarifaHora;
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
	 * @return the contratoMes
	 */
	public int getContratoMes() {
		return contratoMes;
	}

	/**
	 * @param contratoMes the contratoMes to set
	 */
	public void setContratoMes(int contratoMes) {
		this.contratoMes = contratoMes;
	}

	/**
	 * @return the tarifaHora
	 */
	public float getTarifaHora() {
		return tarifaHora;
	}

	/**
	 * @param tarifaHora the tarifaHora to set
	 */
	public void setTarifaHora(float tarifaHora) {
		this.tarifaHora = tarifaHora;
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
	public EmpleadoPorContratoEL() {
		super();
	}

	/**
	 * @param id
	 * @param nombre
	 * @param salarioBase
	 * @param tipoIndustria
	 * @param contratoMes
	 * @param tarifaHora
	 * @param horasTrabajadas
	 */
	public EmpleadoPorContratoEL(String nombre, double salarioBase, String tipoIndustria, double descuento,
			int contratoMes, float tarifaHora, int horasTrabajadas, double salarioConRenta) {
		super(nombre, salarioBase, tipoIndustria);
		this.descuento = descuento;
		this.contratoMes = contratoMes;
		this.tarifaHora = tarifaHora;
		this.horasTrabajadas = horasTrabajadas;
		this.salarioConRenta = salarioConRenta;
	}

	@Override
	public double calcularSalario(double salarioBase) {
		// TODO Auto-generated method stub
		return super.calcularSalario(salarioBase);
	}

	// Metodo que calcula el salio base del empleado en base a las horas trabajadas
	// en la semana
	/**
	 * @param horasTrabajadas
	 * @param salarioBase
	 * @return retorna calculo de salario base
	 */
	public static double calcularSalarioBase(int horasTrabajadas, int contratomes, float tarifaHora) {
		double result = 0;
		int horasTotales = 0, diastrabajados = contratomes * 30;
		int i = 1;
		while (i <= diastrabajados) {
			horasTotales += horasTrabajadas;
			i++;
		}
		result = horasTotales * tarifaHora;
		return result;
	}

	/**
	 * @return Empleado con los datos obtenidos desde consola
	 */
	public void ObtenerDatosEmpleadoPC(Scanner sc, ArrayList<EmpleadoPorContratoEL> pEmpleados) {

		EmpleadoPorContratoEL pEmpleado = new EmpleadoPorContratoEL();
		// Creamos un metodo que valida si el nombre es valido, omitiendo espacios al
		// inicio y final del mismo
		String nombre = super.solicitarYValidarString(sc, "Nombre");
		pEmpleado.setNombre(nombre);

		// Obtenemos los dias trabajados por el empleado
		int mesesTrabajados = super.solicitarIntValido(sc, "meses trabajados");
		pEmpleado.setContratoMes(mesesTrabajados);

		// Obtenemos los horas trabajados por dia por el empleado
		int horastrabajadas = super.solicitarIntValido(sc, "de horas trabajadas");
		pEmpleado.setHorasTrabajadas(horastrabajadas);

		float tarifaHora = super.solicitarFloatValido(sc, "tarifa por hora trabajada");
		pEmpleado.setTarifaHora(tarifaHora);

		/*
		 * Calculamos el salario base del empleado segun las horas de trabajo
		 * ingresadas, luego en con la funcion calcularSalarioTC obtenemos el salario
		 * despues de aplicarle la renta
		 */
		double salariobase = calcularSalarioBase(horastrabajadas, mesesTrabajados, tarifaHora);
		System.out.println("Salario base segun horas trabajadas: \n" + salariobase);
		pEmpleado.setSalarioBase(salariobase);

		String sector = super.solicitarYValidarString(sc, "sector de trabajo");
		pEmpleado.setTipoIndustria(sector);

		// Metedo que calcula la renta y la aplica al salario
		double descuento = calcularSalario(salariobase);
		pEmpleado.setDescuento(descuento);
		double salarioConRenta = salariobase - descuento;
		pEmpleado.setSalarioConRenta(salarioConRenta);
		pEmpleados.add(pEmpleado);
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString() + "Salario con descuento: " + super.redondeaDosDecimals(descuento) + ",\n" + "Meses trabajados: " + contratoMes
				+ ",\n" + "Horas Trabajadas" + horasTrabajadas + ",\n" + "Tarifa por hora trajabada: " + tarifaHora
				+ ",\n Descuento aplicado: " + super.redondeaDosDecimals(salarioConRenta) + "]";
	}

}
