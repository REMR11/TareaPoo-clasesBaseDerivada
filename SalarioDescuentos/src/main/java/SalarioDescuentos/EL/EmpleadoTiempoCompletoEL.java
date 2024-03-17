/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package SalarioDescuentos.EL;
/**
 *
 * @author UFG
 */


public class EmpleadoTiempoCompletoEL extends EmpleadoEL {

	private double descuento;
	private int horasTrabajadasSemana;
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
	public EmpleadoTiempoCompletoEL(int id, String nombre, double salarioBase, String tipoIndustria, double descuento, int horasTrabajadasSemana) {
		super(id, nombre, salarioBase, tipoIndustria);
		this.descuento = descuento;
		this.horasTrabajadasSemana = horasTrabajadasSemana;
		
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString()+"\nDescuentos: " + descuento + "\nHoras trabajadas en la semana: " + horasTrabajadasSemana;
	}

	
	
}
