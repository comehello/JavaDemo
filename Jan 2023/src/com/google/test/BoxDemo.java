package com.google.test;

public class BoxDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//create object
				//Box1 b1; 
				//b1= new Box1(); //memory allocation is done
				
				//every object has a copy of the instance variable
				
				//or 
				//Box1 b1 =new Box1();
				
				//access the instance variables using dot operator
				/*b1.width =10;
				b1.height =20;
				b1.depth =30;
				*/
				double volume;
				
				//b1.setDimension(10,20,15)
				Box1 b1 =new Box1(10,20,30);
				volume=b1.volume(); //calling the method using object
				
				//volume of object b1
				//volume=b1.width*b1.depth*b1.height;
				System.out.println("Volume of box: "+volume);
				
				Box1 b2 =new Box1(11,22,33);
				/*b2.width =10;
				b2.height =60;
				b2.depth =2;
				*/
				//b2.setDimension(15, 5, 16);
				volume = b2.volume();
						
				//volume of object b2
						//volume=b2.width*b2.depth*b2.height;
						System.out.println("Volume of box: "+volume);
			
				//Box1 b3;
				//b3=b2; //bot1h b2 and b3 refer to same object
				//assignment of b2 to b3 will not allocate any memory or copy its data
			}

	}


