package com.test.decorator;

public class Disk extends computerDecorator{

	private Computer comp;
	
	public Disk(Computer com) {
		comp = com;
	}

	@Override
	public String description() {
		return comp.description() + "and disk";
	}
}
