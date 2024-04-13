
package com.poo.acoplamiento.storeinventory;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * La clase inventary implementa la logica necesaria para manipular todo lo
 * correspondiente a la clase producto {@link Producto}
 * 
 * @author remr1e
 */
public class inventary {
	private ArrayList<Producto> productos;

	public inventary() {
		super();
		this.productos = new ArrayList<Producto>();
	}

	/**
	 * Metodo Encargado de agrega un nuevo producto a la lista
	 * 
	 * @param pProducto
	 * @return booleano que verifica el exito de la operacion, en caso de agregar un
	 *         nuevo producto devolvera true, en caso de no poder agregarlo false y
	 *         la excepcion que captura el error
	 */
	public boolean addproduct(Producto pProducto) {
		try {
			if (containsProducto(pProducto.getCodigo())) {
				this.productos.add(pProducto);
				return true;
			}
		} catch (Exception e) {
			System.out.println("Error al agregar el producto: " + e.getMessage());
		}
		return false;
	}

	/**
	 * Metodo encargado de actualizar los registros de un producto ya creado
	 * 
	 * @param pProducto
	 * @return booleano que se encarga de verificar el exito del metodo
	 */
	public boolean updateProduct(Producto pProducto) {
		Producto producto = searchProduct(pProducto);
		if (producto != null) {

			int productoIndex = productos.indexOf(producto);

			producto.setNombre(pProducto.getNombre());
			producto.setPrecio(pProducto.getPrecio());
			producto.setStock(pProducto.getStock());
			this.productos.set(productoIndex, producto);

			return true;
		} else {
			return false;
		}
	}

	/**
	 * Metodo encargado de buscar productos con estado true
	 * 
	 * @return lista de productos disponibles
	 */
	public ArrayList<Producto> getAvaibleProduct() {
		ArrayList<Producto> avaibleProducts = new ArrayList<Producto>();
		for (Producto producto : productos) {
			if (producto.isEstado()) {
				avaibleProducts.add(producto);
			}
		}
		return avaibleProducts;
	}

	/**
	 * Metodo encargado de buscar en unproducto que coincida con algun codigo en la
	 * lista
	 * 
	 * @param pProductos
	 * @param pProducto
	 * @return producto que coincide con la busqueda, en caso de no encontrar
	 *         coincidencias retornara nulo y la excepcion que captura el error
	 */
	public Producto searchProduct(Producto pProducto) {
		try {
			for (Producto producto : productos) {
				if (producto.getCodigo().equals(pProducto.getCodigo())) {
					return producto;
				}
			}
		} catch (Exception e) {
			System.out.println("Error al buscar el producto: " + e.getMessage());
		}
		return null;
	}

	/**
	 * Metodo que se encarga de verifiacar si el codigo de producto ingresado exista
	 * 
	 * @param pCodigo
	 * @return booleano que verifica su existencia
	 */
	public boolean containsProducto(String pCodigo) {
		return productos.contains(new Producto(null, pCodigo, 0.0f, 0));
	}
}
