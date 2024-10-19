package com.edferoca.interfaces;

public class camisas extends ropa implements IDevolucion{
	
	
	
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

	@Override
	public void hacerDevolucion() {
		// TODO Auto-generated method stub
		System.out.println("vas a hacer una devolucion" );
	}

}
