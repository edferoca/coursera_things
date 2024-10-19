package com.Edferoca.clases;

public class Telefono {
	//atributos
	int id;
	String marca;
	String modelo;
	Double precio;

	
	public Telefono() {
		this.id=0;
		this.marca=" no def";
		this.modelo=" no def";
		this.precio=0.0;
	}
	public Telefono(int id,String marca,Double precio) {
		this.id=id;
		this.marca=marca;
		this.modelo=" no def";
		this.precio=precio;
	
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
