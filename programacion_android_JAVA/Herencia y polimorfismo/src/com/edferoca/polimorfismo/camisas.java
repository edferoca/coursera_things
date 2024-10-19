package com.edferoca.polimorfismo;

public class camisas extends ropa{
	
	
	
	public camisas(int id, String marca,String talla) {
		super(id, marca);
		this.talla=talla;
		// TODO Auto-generated constructor stub
	}

	private String talla;

	public String getTalla() {
		return talla;
	}

	public void setTalla(String talla) {
		this.talla = talla;
	}
	@Override
	public void mostrarDatos(String nombreClase) {
		// TODO Auto-generated method stub
		super.mostrarDatos(nombreClase);
		System.out.println("Talla" + talla);
	}

}
