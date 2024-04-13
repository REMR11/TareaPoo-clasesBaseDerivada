
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
	 * @return booleano que se encarga de verificar el exito del metodo, en caso de
	 *         encontrar el producto y es modificado con exito devolvera true, caso
	 *         contrario false y la excepcion que captura el error
	 */
	public boolean updateProduct(Producto pProducto) {
		try {
			Producto producto = searchProduct(pProducto);
			if (producto != null) {
				updateProductProperties(producto, pProducto);
				return true;
			}
		} catch (Exception e) {
			System.out.println("Error al actualizar el producto: " + e.getMessage());
		}
		return false;
	}

	/**
	 * Metodo encargado de verificar que ninguna propiedad del producto sea nulo, en
	 * caso de que alguna propiedad del producto que se quiere actualizar sea nulo,
	 * se dejara el valor por defecto, asegurandonos de no tener nulos en el
	 * producto
	 * 
	 * @param existingProduct
	 * @param newProduct
	 */
	private void updateProductProperties(Producto existingProduct, Producto newProduct) {
		existingProduct
				.setNombre(newProduct.getNombre() != null ? newProduct.getNombre() : existingProduct.getNombre());
		existingProduct
				.setPrecio(newProduct.getPrecio() != 0.0f ? newProduct.getPrecio() : existingProduct.getPrecio());
		existingProduct.setStock(newProduct.getStock() != 0 ? newProduct.getStock() : existingProduct.getStock());
	}

	/**
	 * Metodo encargado de buscar productos con estado true
	 * 
	 * @return lista de productos disponibles, en caso de no encontrar productos
	 *         disponibles retornara una lista vacia
	 * 
	 */
	public ArrayList<Producto> getAvaibleProduct() {
		ArrayList<Producto> avaibleProducts = new ArrayList<Producto>();
		for (Producto producto : productos) {
			try {
				if (producto.isEstado()) {
					avaibleProducts.add(producto);
				}
			} catch (Exception e) {
				System.out.println("Error al buscar productos disponibles: " + e.getMessage());
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
	 * @return booleano que verifica su existencia, en caso de ser encontrado
	 *         devolvera true, caso contrario devolvera false y la excepcion que
	 *         captura el error
	 */
	public boolean containsProducto(String pCodigo) {
		try {
			return productos.contains(new Producto(null, pCodigo, 0.0f, 0));
		} catch (Exception e) {
			System.out.println("Error al verificar la existencia del producto: " + e.getMessage());
			return false;
		}
	}

	public void productSales(Scanner sc) {
		ArrayList<Producto> productoLista = getAvaibleProduct();
		int respuesta, cantidad;
		String codigoProducto;
		System.out.println("Lista de productos disponibles");
		System.out.println(productoLista.toString());
		System.out.println("Deseas comparar algo? (1)SI / (0)No");
		respuesta = sc.nextInt();

		if (respuesta == 1) {
			System.out.println("Proporciona codigo del producto que deseas comprar");
			codigoProducto = sc.nextLine();

			if (containsProducto(codigoProducto)) {
				System.out.println("Cuantas unidades deseas comprar?");
				cantidad = sc.nextInt();

			}
		}

	}
}