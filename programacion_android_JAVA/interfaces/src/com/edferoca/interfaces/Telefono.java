package com.edferoca.interfaces;

public class Telefono {
	//atributos
	
	// private funciona como un mod de acceso
	private int id;
	private  String marca;
	private String modelo;
	private double precio;

	
	public Telefono() {
		this.id=0;
		this.marca=" no def";
		this.modelo=" no def";
		this.precio=0.0;
	}
	public Telefono(int id,String marca,double precio,String modelo) {
		this.id=id;
		this.marca=marca;
		this.modelo=modelo;
		this.precio=precio;
	}
	
	// metodos de get y seet
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getMarca() {
		return marca;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}
	public String getModelo() {
		return modelo;
	}
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	public Double getPrecio() {
		return precio;
	}
	public void setPrecio(Double precio) {
		if (precio > 12) {
			this.precio = precio;
		}else {
			this.precio = 15.30;
			//System.out.println("este valor no es valido");
		}
		
	}
	
	
	//comportamientos y metodos
	public void mostrardatos() {
		// TODO Auto-generated method stub
		System.out.println("Mostrar datos");
		System.out.println("ID "+ id);
		System.out.println("Marca "+ marca);
		System.out.println("Modelo "+ modelo);
		System.out.println("Precio "+ precio);
	}

}
