package com.edferoca.netflix;

public class Pelicula extends Entretenimiento implements IVisualizable {
	  
	
	
	// Atributos
	private int a�o;

	//Constructores
	public Pelicula () {
		super();
		this.a�o = 999;
	}
	public Pelicula(String titulo,String creador) {
		super(titulo,creador);
		this.a�o = 999;
	}
	public Pelicula(String titulo,String genero,String creador,int duracion,int a�o) {
		super(titulo,genero,creador,duracion);
		this.a�o = a�o;
	}
	//metodos
	public int getA�o() {
		return a�o;
	}
	public void setA�o(int a�o) {
		this.a�o = a�o;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		String texto="la Pelicula mas reciente es: "+ getTitulo() + " del a�o " + getA�o();
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
