package com.te.Prototype;

public class PrototypeDesignPattern {

	static PrototypeDesignPattern prototype = null;

	public PrototypeDesignPattern() {
		System.out.println("Program for prototype Design Pattern");
	}

	static PrototypeDesignPattern get() {
		return new PrototypeDesignPattern();
	}

	public static void main(String[] args) {
		PrototypeDesignPattern Pattern = PrototypeDesignPattern.get();
		PrototypeDesignPattern Pattern1 = PrototypeDesignPattern.get();
		PrototypeDesignPattern Pattern2 = PrototypeDesignPattern.get();
		PrototypeDesignPattern Pattern3 = PrototypeDesignPattern.get();
		System.out.println(Pattern.hashCode() + "\n" + Pattern1.hashCode() + "\n" + Pattern2.hashCode() + "\n"
				+ Pattern3.hashCode());
	}
}
