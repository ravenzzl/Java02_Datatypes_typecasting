package com.learnJava.dataTypes.typecast;

public class typecasting {
	
	public static void main(String[] args) {
		// explicit typecasting
		
		int a=123;
		byte b=(byte)a;
		System.out.println("after typecasting : "+b);
		
		int num1=128;
		byte byte1=(byte)num1;
		System.out.println("after typecasting value bigger that 127 : "+byte1);
		
		
		//implicit typecasting
		
		byte b1=12;
		int n1=b1;
		System.out.println("In implicit typecasting : "+n1);
		
	}

}
