package com.google.test;

public class UseStatic {

	//sometimes it is required to define a class member which is independent of objects
	//both variables, blocks and methods can be static
	static int a=1;
	static int b;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		method01(5);
	}
	
	static void method01(int x)
	{
		System.out.println("Value of x"+x);
		System.out.println("Value of a"+a);
		System.out.println("Value of b"+b);
		
	}
	
	//static keyword is used for memory management
	//static members of class belongs to class itself instead of class objects
	//constructor cannot be static
	//static method can be invoked without creating an object
	//static method can access static data members (static variables) and change its variable
	
	static {
		b=a*2;
	}
	

}
