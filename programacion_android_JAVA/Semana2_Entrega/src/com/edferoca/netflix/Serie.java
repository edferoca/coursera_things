package com.edferoca.netflix;

public class Serie extends Entretenimiento implements IVisualizable{
	
	// Atributos
	private int temporadas;
	
	//Constructores
	public Serie () {
		super();
		this.temporadas = 1;
	}
	public Serie(String titulo,String creador) {
		super(titulo,creador);
		this.temporadas = 1;
	}
	public Serie(String titulo,String genero,String creador,int duracion,int a�o,int temporada) {
		super(titulo,genero,creador,duracion);
		this.temporadas = temporada;
	}
	//metodos
	public int getTemporadas() {
		return temporadas;
	}
	public void setTemporadas(int temporadas) {
		this.temporadas = temporadas;
	}
	@Override
	public String toString() {
		String texto="la Serie con mas temporadas es: "+ getTitulo() + " con un total de " + getTemporadas()  + " temporadas" ;
		// TODO Auto-generated method stub
		return texto;
	}
	@Override
	public void marcarVisto() {
		boolean Yavisto= true;
		setVisto(Yavisto);
		// TODO Auto-generated method stub
		
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

}
