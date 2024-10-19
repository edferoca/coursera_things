package com.edferoca.netflix;

public class Pelicula extends Entretenimiento implements IVisualizable {
	  
	
	
	// Atributos
	private int año;

	//Constructores
	public Pelicula () {
		super();
		this.año = 999;
	}
	public Pelicula(String titulo,String creador) {
		super(titulo,creador);
		this.año = 999;
	}
	public Pelicula(String titulo,String genero,String creador,int duracion,int año) {
		super(titulo,genero,creador,duracion);
		this.año = año;
	}
	//metodos
	public int getAño() {
		return año;
	}
	public void setAño(int año) {
		this.año = año;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		String texto="la Pelicula mas reciente es: "+ getTitulo() + " del año " + getAño();
		// TODO Auto-generated method stub
		return texto;
	}
	
	
	@Override
	public boolean esVisto() {
		// TODO Auto-generated method stub
		return getVisto();
	}
	@Override
	public int tiempoVisto() {
		// TODO Auto-generated method stub
		return 0;
	}
	@Override
	public void marcarVisto() {
		boolean Yavisto= true;
		setVisto(Yavisto);
		// TODO Auto-generated method stub
	}

	
	

}
