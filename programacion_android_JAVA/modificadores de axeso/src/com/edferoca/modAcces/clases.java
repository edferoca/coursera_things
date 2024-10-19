package com.edferoca.modAcces;

public class clases {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Telefono miTelefono = new Telefono();
		//miTelefono.mostrardatos();
		
		Telefono tuTelefono = new Telefono(001, "telcel", 33.3);
		
		tuTelefono.mostrardatos();
		
		
		tuTelefono.setModelo("apple");
		tuTelefono.setPrecio(3.99);
		tuTelefono.mostrardatos();

	}

}
