package com.ipartek.formacion;
/*
 * excepcion personalizada para el POJO de persona
 */

public class PersonException extends Exception {

	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	public static final String ERROR_EDAD= "La edad debe ser mayor que 0";
	
	public PersonException(String error) {
		super(error);
	}
}
