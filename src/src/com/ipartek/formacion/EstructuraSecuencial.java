package com.ipartek.formacion;

import java.util.Scanner;

public class EstructuraSecuencial {
	private static final int PI = 0;

	public static void main(String[] args) {
		
		//EJERCICIO INTRODUCIR NUMEROS
		/*
		int num1;
		int num2;
		Scanner sc = new Scanner(System.in);
		System.out.println("introduce un numero entero");
		num1=sc.nextInt();
		System.out.println("introduce otro numero");
		num2=sc.nextInt();
		
		System.out.println("Has introducido " + num1 +" y " + num2);
		*/
		
		//EJERCICIO MOSTRAR NOMBRE
		/*
		String nom1;
		Scanner sc = new Scanner(System.in);
		nom1=sc.next();
		System.out.println("Buenos dias " + nom1  );
		*/
		
		//DOBLAR O TRIPLICAR UN NUMERO
		
		/*
		
		Scanner sc = new Scanner(System.in);
		int num3;
		num3=sc.nextInt();
		System.out.println("numero introducido " + num3);
		System.out.println("El doble de " + num3 +" es " + 2*num3);
		System.out.println("El doble de " + num3 +" es " + 3*num3);
		
		*/
		
		// DE GRADOS CENTRIGRADOS A GRADOS FAHRENHEIT.
		//FORMULA- F = 32 + ( 9 * C / 5)
		/*
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Introduce grados centrigrados");
		
		int gradosC;
		gradosC=sc.nextInt();
		
		System.out.println("los grados ºCson " + gradosC);
		
		int gradosF=32 + ( 9 * gradosC / 5);
				System.out.println("Los grados Farenheit son" + gradosF);
				*/
		
		//CIRCUNFERENCIA (RADIO, LONGITUD, AREA)
		//Longitud de la circunferencia = 2*PI*Radio,
		//Area de la circunferencia = PI*Radio^2
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Introduzca el radio: ");
		int radio;
		radio=sc.nextInt();
		 
		 System.out.println("El radio es " + radio);
		  int longitud=2*PI*radio;
		  int area=PI*radio^2;
		  
		
		
		//System.out.println("Hola");
		
		
		
		
		
		
		
	}

}
