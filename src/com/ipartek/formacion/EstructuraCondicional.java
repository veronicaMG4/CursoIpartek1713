package com.ipartek.formacion;

import java.util.Scanner;

public class EstructuraCondicional {
	public static void main(String[] args) {
		
		 //Scanner sc = new Scanner(System.in);	
		//int num;
		//num = sc.nextInt(); 
		//antes no porque sino escribo el numero antes de la frase
		System.out.println("Por favor, Introduzca un numero");
		Scanner sc = new Scanner(System.in);//introduccion de numeros
		int num;//variable
		num = sc.nextInt();//guardo el numero introducido por teclado en la variable
		System.out.println("El numero es " + num);
		
		
		 if ( num % 2 == 0 )
	        {
	            System.out.printf( "ES PAR" );
	        }
	        else
	        {
	            System.out.printf( "ES IMPAR" );
	        }
	        
		/*
		if (num% 2== 0 )
		{
			System.out.printf("es par");
		}
		else {
			System.out.printf("es impar");
			}*/

	}
}

