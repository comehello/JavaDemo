package com.google.test;

public class ArraysDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int month_days[]; //type name_arr[] ==declaring an array
		month_days= new int[5]; //name_arr=new type[size] --allocating memory to array using the new keyword
		month_days[0]= 10;
		month_days[1]= 20;
		month_days[2]= 30;
		month_days[3]= 40;
		month_days[4]= 50;
		System.out.println(month_days[0]);
		System.out.println(month_days[1]);
		System.out.println(month_days[2]);
		System.out.println(month_days[3]);
		System.out.println(month_days[4]);
		//or
		int month1_days[]= {10,20,30,40,50,60};
		for (int i=0; i<=month1_days.length; i=i+1)
			System.out.println(month1_days[i]);
		}

}
