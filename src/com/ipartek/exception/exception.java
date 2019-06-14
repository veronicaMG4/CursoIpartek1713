/*package com.ipartek.exception;

import java.util.Scanner;

public class exception {
	
	public static void main(String[] args) {
		
		System.out.println("comienza programa");
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Por favor introduce un numero del 0 al 9");
		
		try {
		
		//usar siempre mejor esto y  no nextInt nextchar
		 String sNumero=sc.nextLine();
		 int numero=Integer.parseInt(sNumero);
		 System.out.println("su numero es" + sNumero);
		 //int numero=Integer.parseInt(sNumero);
		}catch (exception e) {
			e.printStackTrace();
			System.out.println("te dije un numero que sino falla");
		}finally {
			sc.close();
		}
		
		// el try y el catch 
		 
		
		
		
	}

}*/
