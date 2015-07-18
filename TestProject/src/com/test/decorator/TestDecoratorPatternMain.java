package com.test.decorator;

public class TestDecoratorPatternMain {

	public static void main(String[] args) {
		Computer comp = new Computer();
		System.out.println(comp.description());
		comp = new Disk(comp);
		System.out.println(comp.description());
	}

}
