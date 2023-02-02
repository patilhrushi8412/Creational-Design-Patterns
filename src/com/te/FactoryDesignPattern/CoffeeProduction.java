package com.te.FactoryDesignPattern;

public class CoffeeProduction implements Factory {

	@Override
	public void production() {
		System.out.println("Coffee Production Is Going To Start");
	}

}
