package com.poo.acoplamiento.storeinventory;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * La clase inventary implementa la logica necesaria para manipular todo lo
 * correspondiente a la clase producto {@link Producto}
 * 
 * @author remr1
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
	 * @return booleano que verifica el exito de la operacion, en caso de agregar un
	 *         nuevo producto devolvera true, en caso de no poder agregarlo false y
	 *         la excepcion que captura el error
	 * @throws Exception Si no es posible Agregar un nuevo producto a la lista
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
	 * @throws Exception Si no es posible actualizar un producto
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
	 * @throws IllegalArgumentException Si el valor es menor que cero
	 * @throws NumberFormatException    Si el valor proporcionado no es un numero
	 *                                  valido
	 */
	private void updateProductProperties(Producto existingProduct, Producto newProduct) {
		try {
			float precio = newProduct.getPrecio();
			if (precio < 0) {
				throw new IllegalArgumentException("El precio no puede ser menor a 0");
			}
			existingProduct.setPrecio(precio);
		} catch (NumberFormatException e) {
			System.out.println("Error: El precio no es un numero valido");
		}

		existingProduct
				.setNombre(newProduct.getNombre() != null ? newProduct.getNombre() : existingProduct.getNombre());

		int stock = newProduct.getStock();
		if (stock < 0) {
			throw new IllegalArgumentException("El stock no puede ser menor a 0");
		}
		existingProduct.setStock(stock);
	}

	/**
	 * Metodo encargado de buscar productos con estado true
	 * 
	 * @return lista de productos disponibles, en caso de no encontrar productos
	 *         disponibles retornara una lista vacia
	 * @throws Exception Si existe problemas al agregar un producto a la lista
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
	 * Metodo encargado de buscar en un producto que coincida con algun codigo en la
	 * lista
	 * 
	 * @param pProductos
	 * @param pProducto
	 * @return producto que coincide con la busqueda, en caso de no encontrar
	 *         coincidencias retornara nulo y la excepcion que captura el error
	 * @throws Exception Si el producto no es encontrado
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
	 * @param pCodigo String que es utilizado para buscar el producto
	 * @return booleano que verifica su existencia, en caso de ser encontrado
	 *         devolvera true, caso contrario devolvera false y la excepcion que
	 *         captura el error
	 * @throws Exception Si el producto no es encontrado
	 */
	public boolean containsProducto(String pCodigo) {
		try {
			return productos.contains(new Producto(null, pCodigo, 0.0f, 0));
		} catch (Exception e) {
			System.out.println("Error al verificar la existencia del producto: " + e.getMessage());
			return false;
		}
	}

	/**
	 * Metodo principal de clase inventary, verifica la exitencia del producto,
	 * muestra productos disponibles, y actualiza stock del producto
	 * 
	 * @param sc variable de escanner
	 * @throws InputMismatchException Si la entrada del usuario no es un valor
	 *                                valido
	 * @throws NullPointerException   Si el codigo proporcionado por el usuario no
	 *                                es un valor valido
	 * 
	 */
	public void productSales(String codigoProducto, int cantidad) {
		ArrayList<Producto> productoLista = getAvaibleProduct();

		System.out.println("Lista de productos disponibles");
		System.out.println(productoLista.toString());
		if (containsProducto(codigoProducto)) {
			Producto producto = new Producto(null, codigoProducto, 0.0f, cantidad);
			boolean result = (updateProduct(producto));
			System.out.println(result ? "Venta exitosa" : "Problemas al vender producto");
		} else {
			System.out.println("Producto no encontrado");
		}
	}
}