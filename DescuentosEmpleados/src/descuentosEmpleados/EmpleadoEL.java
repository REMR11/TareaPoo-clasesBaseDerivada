package descuentosEmpleados;

import java.text.DecimalFormat;
import java.text.ParseException;
import java.util.ArrayList;

/**
 * 
 */
public class EmpleadoEL extends Validaciones {

	private static int nextId = 1;
	private int Id;
	private String nombre;
	private double salarioBase;
	private String tipoIndustria;

	/**
	 * 
	 */
	public EmpleadoEL() {
		this.Id = getNextId();
	}

	/**
	 * @param id
	 * @param nombre
	 * @param salarioBase
	 * @param tipoIndustria
	 */
	public EmpleadoEL(String nombre, double salarioBase, String tipoIndustria) {
		super();
		this.nombre = nombre;
		this.salarioBase = salarioBase;
		this.tipoIndustria = tipoIndustria;
	}

	/**
	 * @return the id
	 */
	public int getId() {
		return Id;
	}

	/**
	 * @param id the id to set
	 */
	public void setId(int id) {
		if (id < nextId) {
			throw new IllegalArgumentException("El ID no puede ser menor al ID autoincrementable actual.");
		}
		this.Id = id;
	}

	/**
	 * @return the nombre
	 */
	public String getNombre() {
		return nombre;
	}

	/**
	 * @param nombre the nombre to set
	 */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	/**
	 * @return the salarioBase
	 */
	public double getSalarioBase() {
		return salarioBase;
	}

	/**
	 * @param salarioBase the salarioBase to set
	 */
	public void setSalarioBase(double salarioBase) {
		this.salarioBase = salarioBase;
	}

	/**
	 * @return the tipoIndustria
	 */
	public String getTipoIndustria() {
		return tipoIndustria;
	}

	/**
	 * @param tipoIndustria the tipoIndustria to set
	 */
	public void setTipoIndustria(String tipoIndustria) {
		this.tipoIndustria = tipoIndustria;
	}

	/**
	 * @return
	 */
	public static int getNextId() {
		int id = nextId;
		nextId++;
		return id;
	}

	@Override
	public String toString() {
		return "Empleado [\n" + "Id=" + Id + ",\n" + "nombre=" + nombre + ",\n" + "salarioBase=" + salarioBase + ",\n"
				+ "tipoIndustria=" + tipoIndustria + ",\n";
	}

	public double calcularSalarioBase() {
		return 0;
	}

	// Metodo encargado de calcular el salario del empleado con los impuestos sobre
	// la renta
	/**
	 * @param salarioBase
	 * @return salario con el descuento aplicado
	 */
	public double calcularSalario(double salarioBase) {
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

	// Metodo que se encarga de redondear un numero a solo dos decimales
	/**
	 * @param value
	 * @return double con dos decimales
	 */
	public static double redondeaDosDecimals(double value) {
		DecimalFormat df = new DecimalFormat("#.##");
		String formattedValue;
		double roundedValue;
		try {
			formattedValue = df.format(value);
			roundedValue = Double.parseDouble(formattedValue);
		} catch (NumberFormatException e) {
			// Handle the exception
			roundedValue = value;
		}
		return roundedValue;
	}

}
