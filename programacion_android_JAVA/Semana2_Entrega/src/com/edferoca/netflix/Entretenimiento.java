package com.edferoca.netflix;

public class Entretenimiento {
	
	//metodos
	private String titulo;
	private String genero;
	private String creador;
	private int duracion;
	private boolean visto;
	
	//Constructores
	public Entretenimiento() {
		// TODO Auto-generated constructor stub
		this.titulo 	= "No definido";
		this.genero 	= "No definido";
		this.creador	= "No definido";
		this.duracion	= 0;
		this.setVisto(false);
	}
	public Entretenimiento(String titulo,String creador) {
		this.titulo 	= titulo;
		this.genero 	= "No definido";
		this.creador	= creador;
		this.duracion	= 0;
		this.setVisto(false);		
	}
	
	public Entretenimiento(String titulo,String genero,String creador,int duracion) {
		this.titulo 	= titulo;
		this.genero 	= genero;
		this.creador	= creador;
		this.duracion	= duracion;
		this.setVisto(false);
	}
	
	//metodos
	public String getTitulo() {
		return titulo;
	}
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	public String getGenero() {
		return genero;
	}
	public void setGenero(String genero) {
		this.genero = genero;
	}
	public String getCreador() {
		return creador;
	}
	public void setCreador(String creador) {
		this.creador = creador;
	}
	public int getDuracion() {
		return duracion;
	}
	public void setDuracion(int duracion) {
		this.duracion = duracion;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString();
	}
	public boolean getVisto() {
		return visto;
	}
	public void setVisto(boolean visto) {
		this.visto = visto;
	}
}
