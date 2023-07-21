package com.cinnamon.packer.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="productos")
public class Producto {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	private String barcode;
	private String nombre;
	private String categoria;
	private String tipo;
	private String tallas;
	private String colores;
	private int cantidad;
	private double precio;
	private String descripcion;
	
	public Producto (){
		
	}

	

	public Producto(Integer id, String barcode, String nombre, String categoria, String tipo, String tallas,
			String colores, double precio, String descripcion) {
		super();
		this.id = id;
		this.barcode = barcode;
		this.nombre = nombre;
		this.categoria = categoria;
		this.tipo = tipo;
		this.tallas = tallas;
		this.colores = colores;
		this.precio = precio;
		this.descripcion = descripcion;
	}



	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getBarcode() {
		return barcode;
	}

	public void setBarcode(String barcode) {
		this.barcode = barcode;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getCategoria() {
		return categoria;
	}

	public void setCategoria(String categoria) {
		this.categoria = categoria;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public String getTallas() {
		return tallas;
	}

	public void setTallas(String tallas) {
		this.tallas = tallas;
	}

	public String getColores() {
		return colores;
	}

	public void setColores(String colores) {
		this.colores = colores;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public double getPrecio() {
		return precio;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
	}
	
	
}
