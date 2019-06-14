package com.ipartek.formacionutilidades;

import static org.junit.Assert.*;

import org.junit.Test;

public class CalculadoraDevolucionTest {

	@Test(expected=Exception.class)
	public void entregadoMenorImporteException() throws Exception {
		//fail("Not yet implemented");
		CalculadoraDevolucion.vueltas(100,2);//vueltas(importe,entregado)
	}
	
	@Test(expected=Exception.class)
	public void importeNegativoException() throws Exception {
		//fail("Not yet implemented");
		CalculadoraDevolucion.vueltas(-100,2);//si el importe es negativo
	}
	
	@Test(expected=Exception.class)
	public void entregadoNegativoException() throws Exception {
		//fail("Not yet implemented");
		CalculadoraDevolucion.vueltas(100,-2);//si lo entregado es menor que el importe
	}
	
	@Test
	public void importeExacto()throws Exception{
		int[]vueltas=CalculadoraDevolucion.vueltas(500,501);
		
	}
	
	@Test
	public void importeNoExacto()throws Exception{
		int[]vueltas=CalculadoraDevolucion.vueltas(500,501);
		
		assertEquals("500",0,vueltas[0]);
		assertEquals("200",0,vueltas[1]);
		assertEquals("100",0,vueltas[2]);
		assertEquals("50",0,vueltas[3]);
		assertEquals("20",0,vueltas[4]);
		assertEquals("10",0,vueltas[5]);
		assertEquals("5",0,vueltas[6]);
		assertEquals("2",0,vueltas[7]);
		assertEquals("1",0,vueltas[8]);
		assertEquals("50 cents",0,vueltas[9]);
		assertEquals("20 cents",0,vueltas[10]);
		assertEquals("10 cents",0,vueltas[11]);
		assertEquals("0.5 cents",0,vueltas[12]);
		assertEquals("0.2 cents",0,vueltas[13]);
		assertEquals("10 cents",0,vueltas[14]);
		
		
		
	}
	

}
