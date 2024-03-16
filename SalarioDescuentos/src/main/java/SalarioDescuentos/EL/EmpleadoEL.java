package SalarioDescuentos.EL;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public abstract class EmpleadoEL {

    private int Id;
	private String nombre;
    private double salarioBase;
    private int tipoDescuento;
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
		Id = id;
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
	 * @return the tipoDescuento
	 */
	public int getTipoDescuento() {
		return tipoDescuento;
	}
	/**
	 * @param tipoDescuento the tipoDescuento to set
	 */
	public void setTipoDescuento(int tipoDescuento) {
		this.tipoDescuento = tipoDescuento;
	}
	/**
	 * @param id
	 * @param nombre
	 * @param salarioBase
	 * @param tipoDescuento
	 */
	public EmpleadoEL(int id, String nombre, double salarioBase, int tipoDescuento) {
		super();
		Id = id;
		this.nombre = nombre;
		this.salarioBase = salarioBase;
		this.tipoDescuento = tipoDescuento;
	}
	/**
	 * 
	 */
	public EmpleadoEL() {
		super();
	}  
    
    
	
}

