package com.edferoca.interfaces;


public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		camisas 	camisa 		= new camisas(002, "ArturoCalle", "XL");
		chaquetas 	chaqueta 	= new chaquetas(002, "ToTTo", "abrigo");
		
		camisa.mostrarDatos("camisaprima");
		camisa.hacerDevolucion();
	}

}
