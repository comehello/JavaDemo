package com.google.test;

public class Box1 {
	
	//instance variables
	double width;
	double height;
	double depth;
	
	
	//state --identify object - DATA
	//behaviour --actions which we perform on data -- METHODS
	//data + methods = data members
	//class is a user defined data type, it is used to create object, it is a template for an object
	//use class keyword to declare a class
	
double volume()
{
//System.out.println("The volume is:");	
//System.out.println(width*height*depth);
	return width*height*depth;
}

//Constructor has same name as the class and no return type.. it is called when an object of the class is created
Box1 (double height, double width, double depth)
{
	System.out.println("Initializing instance variable");
	this.width=width;
	this.height=height;
	this.depth=depth;
	
	//this keyword refers to the instance variable (avoids name collision when the local variable and instance variable have same name
	}
//set dimensions of a box
void setDimension (double w,double h, double d) 
{
	width=w;
	height=h;
	depth=d;
	}

}
	
