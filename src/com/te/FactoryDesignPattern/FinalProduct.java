package com.te.FactoryDesignPattern;

import java.util.Scanner;

public class FinalProduct {

	@SuppressWarnings("resource")
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Product :");
		String s = sc.next();
		FactoryTest test = new FactoryTest();
		if (s.equalsIgnoreCase("sugar")) {
			test.setFact(new SugarProduction());
			test.test();
		} else if (s.equalsIgnoreCase("coffee")) {
			test.setFact(new CoffeeProduction());
			test.test();
		} else if (s.equalsIgnoreCase("milk")) {
			test.setFact(new MilkProduction());
			test.test();
		} else {
			System.out.println(s+" Is Not Present");
		}

	}
}
