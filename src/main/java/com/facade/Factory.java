package com.facade;

public class Factory {
	private Laptop dell;
	private Laptop lenovo;
	public Factory() {
		dell=new Dell();
		lenovo=new Lenovo();
	}

	public void dellPOS() {
		dell.modelNo();
		dell.price();
	}
	
	public void lenovoPOS() {
		lenovo.modelNo();
		lenovo.price();
	}
}
