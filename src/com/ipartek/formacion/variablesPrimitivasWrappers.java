package com.ipartek.formacion;

import java.util.Scanner;

/**
 * @see: http://www.campus.formacion.ipartek.com/moodle/mod/page/view.php?id=882
 * @author Curso
 *
 */
public class variablesPrimitivasWrappers {
	
	public static void main(String args[]) {

		// declarar todas las posibles tipos de variables primitivas

		// numeros enteros

		byte b = 5;
		short s = 4;
		int i = 0;
		long l = 8;

		// numeros reales

		float f = 2.34f;
		double d = 4.56;

		char c = 'a'; // comillas simples

		boolean b1 = true; // or false

		// Wrappers

		int numeroParseado = Integer.parseInt("3");

		System.out.printf("el rando deun int %d %d \n\n\n", Integer.MIN_VALUE, Integer.MAX_VALUE);

		// character.isup

		// indicar si el caracter introducido por pantalla es
		// mayuscula o minusculas
		// letra o numero

		System.out.println("Por favor introduce un caracter");

		Scanner sc = new Scanner(System.in);

		char caracter = sc.next().charAt(0);

		System.out.println("has escrito " + caracter);
		
		/*
		
		
		if(Character.isLetter(caracter)) 
		{
			System.out.println("es una letra");
		}
			if(Character.isUpperCase(caracter)) 
			{
				System.out.println(" mayuscula");
			}
				else
					{
					System.out.println("minuscula");
					}
		else		
			{System.out.println("es un digito");}
			
			*/
		
		
		
		
		/*if(Character.isDigit(caracter))
		{
			System.out.println("es un numero");
		}
		else {
			System.out.println("es una letra");
		
		}
		
		*/
		/*if (Character.isUpperCase(caracter)) {
			System.out.println("mayuscula");}
			else {
				System.out.println("minuscula");
		}
*/
		sc.close();

		/*
		 * Scanner teclado = new Scanner(System.in);      System.out.print
		 * ("Ingrese un caracter: ");      char letra = teclado.nextLine().charAt(0);  
		 *    if(Character.isUpperCase(letra)){                   
		 * System.out.println("Mayuscula");              }else{                        
		 *     System.out.println("Minuscula");   
		 * 
		 * Ver más en Brainly.lat - https://brainly.lat/tarea/7075675#readmore
		 */

	}

}
