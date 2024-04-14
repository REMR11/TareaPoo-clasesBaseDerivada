package com.poo.acoplamiento.storeinventory;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

/**
 * Clase ventas implementa la logica necesaria para manipular la clase inventary
 * {@link inventary}
 * 
 * @author remr1
 * 
 * 
 */
public class Ventas {
	// Declaracion de variables globales utilizadas en la clases
	public List<String> venta;
	public inventary inventarioproducto = new inventary();

	/**
	 * Metodo encargado de capturas datos sobre las ventas de producto, cada venta
	 * es ingresada en un lista
	 * 
	 * @param sc
	 * 
	 * @throws NullPointerException   Si el valor ingresado es nulo
	 * @throws InputMismatchException si el valor ingresado no es valido
	 */
	public void salesHistory(Scanner sc) {
		int respuesta, cantidad = 0;
		String codigoProducto = "";

		Producto auxProducto = new Producto();
//		System.out.println("Deseas comprar algo? (1)SI / (0)No");
//		respuesta = sc.nextInt();
//		
//		if (respuesta == 1) {}
		try {
			System.out.println("Proporciona codigo del producto que deseas comprar");

			try {

				codigoProducto = sc.nextLine();
				inventary auxInventary = new inventary();
				auxProducto = auxInventary.searchProduct(codigoProducto);

			} catch (NullPointerException e) {

				System.out.println("Error: No se proporciono un codigo de producto");

			}

			System.out.println("Cuantas unidades deseas comprar?");

			try {

				cantidad = sc.nextInt();

			} catch (InputMismatchException e) {

				System.out.println("Error: Ingrese un numero valido");

			}
			venta.add(codigoProducto + ", " + cantidad + ", " + auxProducto.getPrecio() + "\n");
			inventarioproducto.productSales(codigoProducto, cantidad);

		} catch (InputMismatchException e) {
			System.out.println("Error: Ingrese un numero valido");

		}

	}

	public void showSales() {
		System.out.println(venta);
	}
}
