/**
 * 
 */
package com.poo.acoplamiento.storeinventory;

/**
 * 
 */
/**
 * 
 */
public class Producto {
	private String nombre;
	private String codigo;
	private float precio;
	private int stock;
	private boolean estado;

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
	 * @return the codigo
	 */
	public String getCodigo() {
		return codigo;
	}

	/**
	 * @param codigo the codigo to set
	 */
	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}

	/**
	 * @return the precio
	 */
	public float getPrecio() {
		return precio;
	}

	/**
	 * @param precio the precio to set
	 */
	public void setPrecio(float precio) {
		this.precio = precio;
	}

	/**
	 * @return the stock
	 */
	public int getStock() {
		return stock;
	}

	/**
	 * @param stock the stock to set
	 */
	public void setStock(int stock) {
		this.stock = stock;
	}

	/**
	 * @return the estado
	 */
	public boolean isEstado() {
		return estado;
	}

	/**
	 * @param estado the estado to set
	 */
	public void setEstado() {
		if (stock > 0) {
			this.estado = true;
		} else {
			this.estado = false;
		}
	}

	public Producto() {
		super();
	}

	public Producto(String nombre, String codigo, float precio, int stock) {
		super();
		this.nombre = nombre;
		this.codigo = codigo;
		this.precio = precio;
		this.stock = stock;
	}

	/**
	 * ToString personalizado, en caso de ingresar un valor nulo este no sera
	 * mostrado
	 */
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Producto [");
		if (nombre != null) {
			builder.append("nombre=");
			builder.append(nombre);
			builder.append(", ");
		}
		if (codigo != null) {
			builder.append("codigo=");
			builder.append(codigo);
			builder.append(", ");
		}
		builder.append("precio=");
		builder.append(precio);
		builder.append(", stock=");
		builder.append(stock);
		builder.append(", estado=");
		builder.append(estado);
		builder.append("]\n");
		return builder.toString();
	}

}
