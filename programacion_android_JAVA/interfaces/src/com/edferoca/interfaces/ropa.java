package com.edferoca.interfaces;

public class ropa {
	private int id;
	private double precio;
	private String marca;
	private String color;
	
	public ropa(int id ,String marca) {
		this.id = id;
		this.marca = marca;
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public double getPrecio() {
		return precio;
	}
	public void setPrecio(double precio) {
		this.precio = precio;
	}
	public String getMarca() {
		return marca;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	
	public void mostrarDatos(String nombreClase) {
		
		System.out.println("nombreClase");
		System.out.println("ID "+ id);
		System.out.println("Precio "+ precio);
		System.out.println("Marca "+ marca);
		System.out.println("Color "+ color);
		
	}

}
