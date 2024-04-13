package com.poo.acoplamiento.storeinventory;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class Ventas {
	public List<String> venta;

	public Ventas() {
	}

	public void historialVentas(Scanner sc) {
		int respuesta, cantidad=0;
		String codigoProducto = "";
		
		Producto auxProducto = new Producto();
		System.out.println("Deseas comprar algo? (1)SI / (0)No");
		try {
			respuesta = sc.nextInt();
			if (respuesta == 1) {
				System.out.println("Proporciona codigo del producto que deseas comprar");
				try {
					codigoProducto = sc.nextLine();
					inventary auxInventary = new inventary();
					auxProducto= auxInventary.searchProduct(new Producto(null,codigoProducto, 0.0f, 0));
				} catch (NullPointerException e) {
					System.out.println("Error: No se proporciono un codigo de producto");

				}

				System.out.println("Cuantas unidades deseas comprar?");
				try {
					cantidad = sc.nextInt();
				} catch (InputMismatchException e) {
					System.out.println("Error: Ingrese un numero valido");

				}
				venta.add(codigoProducto+", "+ cantidad+ ", " + auxProducto.getPrecio());
			}
		} catch (InputMismatchException e) {
			System.out.println("Error: Ingrese un numero valido");

		}

	}
}
