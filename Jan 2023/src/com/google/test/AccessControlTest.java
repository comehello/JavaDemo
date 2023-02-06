package com.google.test;

public class AccessControlTest {
	

	public static void main(String[] args) {
		// 
		AccessControlDemo obj1= new AccessControlDemo();
		
		obj1.a=10;
		obj1.b=20;
		obj1.setC(30);
		System.out.println("Value of a:"+ obj1.a);
		System.out.println("Value of b:"+ obj1.b);
		System.out.println("Value of c:"+ obj1.getC());
		
		

	}

}
