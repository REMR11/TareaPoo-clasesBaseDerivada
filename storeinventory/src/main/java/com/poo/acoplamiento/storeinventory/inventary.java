/**
 * 
 */
package com.poo.acoplamiento.storeinventory;

import java.util.ArrayList;

/**
 * 
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
	 * @return booleano que verifica el exito de la operacion
	 */
	public boolean addproduct(Producto pProducto) {
		if (containsProducto(pProducto.getCodigo())) {
			this.productos.add(pProducto);
			return true;
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
	 * @return producto que coincide con la busqueda
	 */
	public Producto searchProduct(Producto pProducto) {
		for (Producto producto : productos) {
			if (producto.getCodigo().equals(pProducto.getCodigo())) {
				return producto;
			}
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
