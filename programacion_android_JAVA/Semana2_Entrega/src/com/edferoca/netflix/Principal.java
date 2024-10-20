package com.edferoca.netflix;

import java.util.ArrayList;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Pelicula> Peliculas=new ArrayList<Pelicula>();
		ArrayList<Serie> Series=new ArrayList<Serie>();
		
		
		//llenando los arreglos de Peliculas y Series
		
		Peliculas.add(new Pelicula("el dia despues de ma�ana", "este se�or que no se como se llama"));
		Peliculas.add(new Pelicula("soy Leyenda","Drama","jhon mulik",120,2008));
		Peliculas.add(new Pelicula("TiTanic", "un director"));
		Peliculas.add(new Pelicula("AVATAR","wiii","otro director",220,2010));
		Peliculas.add(new Pelicula("jumanji", "paco"));
		
		Series.add(new Serie("Lie To me", "este se�or que no se como se llama"));
		Series.add(new Serie("The Oficce","Comedia","jhon mulik",120,2008,8));
		Series.add(new Serie("supermarket", "un director"));
		Series.add(new Serie("Boba Feet","wiii","otro director",220,2010,1));
		Series.add(new Serie("Betty la fea", "sigifredo"));
		
		
		//marcando series y peliculas como vistas
		try {
			Series.get(1).marcarVisto();
			Series.get(2).marcarVisto();
			Series.get(4).marcarVisto();
			Peliculas.get(1).marcarVisto();
			Peliculas.get(3).marcarVisto();
			//Peliculas.get(5).marcarVisto();
		}catch(IndexOutOfBoundsException arrayE) {
			System.out.println("Error en la cantidad de datos introducidos");
		}finally {
			//muestro la lista de peliculas vistas
			System.out.println("peliculas ya vistas ");
			for(int i=0; i<Peliculas.size() ;i++) {
				if(Peliculas.get(i).esVisto()==true){
					System.out.println("*"+Peliculas.get(i).getTitulo()+ "* del director " + Peliculas.get(i).getCreador());
				}
			}
			System.out.println("Series ya vistas ");
			for(int i=0; i<Series.size() ;i++) {
				if(Series.get(i).esVisto()==true){
					System.out.println("*"+Series.get(i).getTitulo()+ "* del director " + Series.get(i).getCreador());
				}
			}
		}
		//muestro la serie con mas temporadas
		int SerieMasTemporadas=0;
		int NumTemporadas=0;
		for(int i=0; i<=4 ;i++) {
			if(Series.get(i).getTemporadas()>NumTemporadas){
				SerieMasTemporadas=i;
				NumTemporadas=Series.get(i).getTemporadas();
			}
		}
		System.out.println(Series.get(SerieMasTemporadas).toString());
		//muestro la Pelicula mas reciente
		int peliculaMasReciente=0;
		int A�oReciente=0;
		for(int i=0; i<=4 ;i++) {
			if(Peliculas.get(i).getA�o() >A�oReciente){
				peliculaMasReciente=i;
				A�oReciente=Peliculas.get(i).getA�o();
			}
		}
		System.out.println(Peliculas.get(peliculaMasReciente).toString());
	}

}
