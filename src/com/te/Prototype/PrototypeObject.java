package com.te.Prototype;

public class PrototypeObject {

	public static void main(String[] args) {
		PrototypeDesignPattern pattern = PrototypeDesignPattern.get();
		PrototypeDesignPattern pattern1 = PrototypeDesignPattern.get();
		PrototypeDesignPattern pattern2 = PrototypeDesignPattern.get();
		PrototypeDesignPattern pattern3 = PrototypeDesignPattern.get();
		System.out.println(pattern.hashCode() + "\n" + pattern1.hashCode() + "\n" + pattern2.hashCode() + "\n"
				+ pattern3.hashCode());
	}
}
