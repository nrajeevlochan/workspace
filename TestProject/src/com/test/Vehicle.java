package com.test;

public class Vehicle {
	private ChangingCode mCc;
	public Vehicle() {
		
	}
	
	public void SetgoMethod(ChangingCode cc) {
		this.mCc = cc;
	}
	
	public void go() {
		mCc.go();
	}
}
