package SalarioDescuentos.EL;

public class EmpleadoMedioTiempoEL extends EmpleadoEL {
	private int diasTrabajados;
	private int horasTrabajadas;

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
	public EmpleadoMedioTiempoEL(int id, String nombre, double salarioBase, String tipoIndustria, int diasTrabajados,
			int horasTrabajadas) {
		super(id, nombre, salarioBase, tipoIndustria);
		this.diasTrabajados = diasTrabajados;
		this.horasTrabajadas = horasTrabajadas;
		// TODO Auto-generated constructor stub
	}

}
