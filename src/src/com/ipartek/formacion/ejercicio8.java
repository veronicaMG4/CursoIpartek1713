package com.ipartek.formacion;

/**
 * 
 *Escribe un programa java que declare una variable A de tipo entero y asígnale un valor.
 * A continuación muestra un mensaje indicando si A es par o impar. 
 *Utiliza el operador condicional ( ? : )condicion true o false dentro del println para resolverlo.
Si por ejemplo A = 14 la salida será
14 es par
Si fuese por ejemplo A = 15 la salida será:
15 es impar
 * @author Curso
 *
 */
public class ejercicio8 {
	
	public static void main(String[] args) {
		System.out.println("ejercicio 8");
		
		final String NOMBRE_EJERCICIO ="EJERCICIO 8";//CONSTANTE
		
		System.out.println(NOMBRE_EJERCICIO);
		
		
		int a=14;
		int b=15;
		 
		System.out.println((a%2==0)?"es par" :"es impar");
		System.out.println((b%2==0)?"es par" :"es impar");
		System.out.printf("el numero %s es %s",b," Ander");
		
		/* System.out.println(a+(a%2==0)?"es par" :"es impar");
		String resultado(b%2==0)?"es par" :"es impar";
		System.out.printf("el numero %s es %s \n",b,resultado);
		
		
		*/

		float numero = 4.1425936363f;
		float numero2= (float)4.1425936363;
		float numero3= 3;
		
		//double numerodoble=4.
		
		//System.out.println( "numero con dos decimas", numero);
		 System.out.printf("numero formateado con 2 decimales %.2f", numero);
		
	}

}
