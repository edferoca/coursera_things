package com.edferoca.interfaces;

public class chaquetas extends ropa {
	
	public chaquetas(int id, String marca,String Tipo) {
		super(id, marca);// ala SuperClase
		this.Tipo=Tipo;
		
		// TODO Auto-generated constructor stub
	}

	private String Tipo;

	public String getTipo() {
		return Tipo;
	}

	public void setTipo(String tipo) {
		Tipo = tipo;
	}
	@Override
	public void mostrarDatos(String nombreClase) {
		// TODO Auto-generated method stub
		super.mostrarDatos(nombreClase);
		System.out.println("Tipo" + Tipo);
	}

}
