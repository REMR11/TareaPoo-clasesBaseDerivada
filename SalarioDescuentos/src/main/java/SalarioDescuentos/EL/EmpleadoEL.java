package SalarioDescuentos.EL;

/**
 * 
 */
public class EmpleadoEL {

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
	public EmpleadoEL(int id, String nombre, double salarioBase, String tipoIndustria) {
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
		return "EmpleadoEL [Id=" + Id + ", nombre=" + nombre + ", salarioBase=" + salarioBase + ", tipoIndustria="
				+ tipoIndustria + "]";
	}

	
	

}
