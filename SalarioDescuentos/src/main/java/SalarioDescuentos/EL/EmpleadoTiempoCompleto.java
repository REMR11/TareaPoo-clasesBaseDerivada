/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package SalarioDescuentos.EL;

import SalarioDescuentos.EL.EmpleadoEL;
import lombok.AllArgsConstructor;
/**
 *
 * @author UFG
 */
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;


@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString(callSuper = true)
public class EmpleadoTiempoCompleto extends EmpleadoEL {

	private double descuento;

	
	
}
