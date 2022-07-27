package com.josh.java.Exception;

import java.util.Scanner;

public class ExceptionHandling {

	public static void main(String[] args) {
		Scanner scn=new Scanner(System.in);
		System.out.println("Enter Two Numbers");
		int firstnum=scn.nextInt();
		int secondnum=scn.nextInt();
		int temp=0;
		int[] arr=new int[4];
		
		try {
			temp=firstnum/secondnum;
			arr[7]=temp;
		}
		catch(ArrayIndexOutOfBoundsException a) {
			System.out.println("Index is more than size.");
		}
		catch( ArithmeticException e) {
			e.printStackTrace();
		}
		finally {  
			System.out.println("finally block is always executed"); 
			
		}    
		
		System.out.println("enter age to enter");
		int age=scn.nextInt();
		
		if(age<18) {
			AgenotalllowedException a=new AgenotalllowedException("you are not allowed to enter");
			throw a;
		}
		else {
			System.out.println("you are allowed to enter");
		}
		
	}
}
