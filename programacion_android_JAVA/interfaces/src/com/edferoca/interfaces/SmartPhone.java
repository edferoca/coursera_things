package com.edferoca.interfaces;

public class SmartPhone extends Telefono {
	private String SIM;
	
	//constructor 
	public SmartPhone(int id,String marca, double precio,String modelo,String SIM) {
		super(id,marca,precio,modelo);
		this.SIM=SIM;
	}

	public String getSIM() {
		return SIM;
	}

	public void setSIM(String sIM) {
		SIM = sIM;
	}
	
}
