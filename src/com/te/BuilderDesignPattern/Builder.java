package com.te.BuilderDesignPattern;

public class Builder {

	public static void main(String[] args) {
		Vehicle car = new Vehicle.VehicleBuilder("1500cc", 4).setAirbags(2).build();
		Vehicle bike = new Vehicle.VehicleBuilder("250cc", 2).build();

		System.out.println("For Car : ");
		System.out.println("Engine : "+car.getEngine());
		System.out.println("Wheel : "+car.getWheel());
		System.out.println("AirBag : "+car.getAirbags());
		
		System.out.println("\nFor Bike : ");
		System.out.println("Engine : "+bike.getEngine());
		System.out.println("Wheel : "+bike.getWheel());
		System.out.println("AirBag : "+bike.getAirbags());
	}
}
