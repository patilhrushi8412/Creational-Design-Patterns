package com.te.FactoryDesignPattern;

public class FactoryTest {

 	private Factory fact;

	public Factory getFact() {
		return fact;
	}

	public void setFact(Factory fact) {
		this.fact = fact;
	}

	void test() {
		fact.production();
	}
}
