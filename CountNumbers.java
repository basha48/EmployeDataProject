package com.bl.stati;

import java.util.Scanner;

public class CountNumbers {
	
	
	static int count=0;//will get memory only once and retain its value  
	  
	CountNumbers(){  
	count++;//incrementing the value of static variable  
	System.out.println(count);  
	}  
	  
	public static void main(String args[]){  
		
		
		Scanner sc = new Scanner(System.in);
		String num = sc.nextLine();
		   double value = sc.nextDouble();
		  int number =  sc.nextInt();
		  System.out.println("hello");
		  System.out.println("world");
		
		System.out.println("the value is "+num);
		System.out.println("the value is "+value);
		System.out.println("the value is "+number);
		
	//creating objects  
//		COUNTNUMBERS C1=NEW COUNTNUMBERS(); 
//		COUNTNUMBERS C2=NEW COUNTNUMBERS();  
//		COUNTNUMBERS C3=NEW COUNTNUMBERS();  
	}  

}
