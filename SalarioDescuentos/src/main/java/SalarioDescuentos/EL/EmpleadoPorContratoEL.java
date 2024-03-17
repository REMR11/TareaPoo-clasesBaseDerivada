package SalarioDescuentos.EL;

public class EmpleadoPorContratoEL extends EmpleadoEL {
	private int contratoMes;
	private float tarifaHora;
	private int horasTrabajadas;
	
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
	public EmpleadoPorContratoEL(int id, String nombre, double salarioBase, String tipoIndustria, int contratoMes,
			float tarifaHora, int horasTrabajadas) {
		super(id, nombre, salarioBase, tipoIndustria);
		this.contratoMes = contratoMes;
		this.tarifaHora = tarifaHora;
		this.horasTrabajadas = horasTrabajadas;
	}

}
