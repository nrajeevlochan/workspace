package com.test;

public class TestMainClass {

	public static void main(String[] args) {
		System.out.println("This is Main class");
		
		//Vehicle vh = new Vehicle();
		Car car = new Car();
		car.go();
		Jet jet = new Jet();
		jet.go();
	}
}
