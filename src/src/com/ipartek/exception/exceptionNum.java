package com.ipartek.exception;

import java.util.Scanner;

public class exceptionNum {
	
	public static void main(String[] args) {
		
		boolean repetir=false;
		
		Scanner sc=new Scanner(System.in);
		int num1=0;
		int num2=0;
		
		do {
			 System.out.println("Introduce 1º numero");
			 
			 try {
				 num1= Integer.parseInt(sc.nextLine());//de cadena a numero
				 repetir=false;
				 
			 }catch (Exception e) {
				 
				 repetir=true;
			 }
		
		
		}while (repetir);
		
		System.out.println(num1 + "+" + num2 + "=" + (num1+num2));
	}

}

