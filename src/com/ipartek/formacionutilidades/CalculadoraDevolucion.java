package com.ipartek.formacionutilidades;

import java.util.Scanner;

public class CalculadoraDevolucion {
	
	
	
	public static final float[] BILLETES_MONEDAS= {
			//billetes
			500,
			200,
			100,
			50,
			20,
			10,
			5,
			//monedas
			2,
			1,
			0.50f,
			0.20f,
			0.10f,
			0.05f,
			0.02f,
			0.01f,};
	
	/**
	 * calcula las vueltas optimas para retornar el menor numero de billetes y monedas
	 * importe float coast del articulo a comprar
	 * entregado float dinero entrega para comprar
	 * @return int[] cantidad de billetes y monedas retornadas
	 * @see public static final float [] BILLETES_MONEDAS
	 * @Throws Exception importe> entregado o si importe
	 */
	
			
	
	
	public static int[] vueltas (float importe,float entregado) throws Exception{
		
		//todo vuestro marron para que penseis
		
		if (importe>entregado) {
			throw new Exception("falta dinero");//lanzamos excepción test linea 9
		}
		
		if (entregado<0) {
			throw new Exception("entregado en  negativo");
		}
		
		
		if (importe<0) {
			throw new Exception("importe en negativo");
		}
		
		return null;
		
	}
	

	/*
	 * las vueltas son importe del producto - dinero entregado= dinero a devolver
	 */
	public static void main(String[] args) {
		//IMPORTE: meto el importe por teclado y lo printo
		System.out.println("introduzca el importe");
		Scanner sc= new Scanner(System.in);
		//int precio_producto;
		double importe=0;
		importe= sc.nextInt();
		
		//DINERO ENTREGADO
		System.out.println("Introduzca el  dinero entregado ");
		double d_entregado;
		d_entregado=sc.nextInt();
		System.out.println("Dinero entregado " + d_entregado);
		System.out.println("importe"+ importe);
		
		//VUELTAS
		
		double d_vueltas=0;
		d_vueltas=d_entregado-importe;
		System.out.println("las vueltas son " + d_vueltas);
		
	
	
		
		 // Indicamos todas las monedas posibles
        double [] monedas={500, 200, 100, 50, 20, 10, 5, 2, 1, 0.5, 0.20, 0.10, 0.05, 0.02, 0.01};
 
        // Creamos un array con 0 de longitud igual a la cantidad de monedas
        // Este array contendra las monedas a devolver
        double [] devolver={0,0,0,0,0,0,0,0,0,0,0,0,0,0,0};
 
        // Recorremos todas las monedas
        for(int i=0;i<monedas.length;i++)
        {
            // Si el importe actual, es superior a la moneda
            if(d_vueltas>=monedas[i])
            {
                // obtenemos cantidad de monedas
                devolver[i]=Math.floor(d_vueltas/monedas[i]);
 
                // actualizamos el valor del importe que nos queda por didivir
                d_vueltas=d_vueltas-(devolver[i]*monedas[i]);
            }
        }
 
        // Bucle para mostrar el resultado
        for(int i=0;i<monedas.length;i++)
        {
            if(devolver[i]>0)
            {
                if(monedas[i]>2)
                {
                    // Indicamos que es un billete
                    System.out.println("Hay "+devolver[i]+" billetes de: "+monedas[i]+" Euros");
                }else{
                    // Indicamos que es una moneda
                    System.out.println("Hay "+devolver[i]+" monedas de: "+monedas[i]+" Euros");
                }
            }
        }
    }
		
		
	}

