package com.te.Singleton;

public class Singleton {

	static Singleton singleton;

	private Singleton() {
	}

	public static Singleton singleton() {
		if (singleton == null) {
			singleton = new Singleton();
		}
		return singleton;
	}

	public static void main(String[] args) {
		Singleton singleton2 = Singleton.singleton();
		Singleton singleton3 = Singleton.singleton();
		Singleton singleton4 = Singleton.singleton();
		System.out.println(singleton2.hashCode() + "\n" + singleton3.hashCode() + "\n" + singleton4.hashCode());
	}
}
