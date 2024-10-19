package com.edferoca.interfaces;

public class fijo extends Telefono implements IDevolucion {
	

	

	public fijo(int id, String marca, Double precio,String modelo, String tipodeUso) {
		super(id, marca, precio, modelo);
		this.tipodeUso = tipodeUso;
		
		// TODO Auto-generated constructor stub
	}

	private String tipodeUso;
	

	public String getTipodeUso() {
		return tipodeUso;
	}

	public void setTipodeUso(String tipodeUso) {
		this.tipodeUso = tipodeUso;
	}

	@Override
	public void hacerDevolucion() {
		// TODO Auto-generated method stub
		System.out.println("wiiiiiiiiiii" );
	}
	
}
