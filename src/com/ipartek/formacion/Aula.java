package com.ipartek.formacion;

public class Aula {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// declarar array con nombre alumnos
		String[] alumnos = {
				"Mounir",
				"Andoni",
				"Asier",
				"Jon C",
				"Arkaitz", 
				"Aritz",
				"Manuel",
				"Eduardo",
				"Eder I",
				"Eder S", 
				"Gaizka",
				"Borja",
				"Verónica",
				"Jon A",
				"José Luis"};
		System.out.println();
		for (int j = 0; j < alumnos.length; j++) {

			System.out.println(alumnos[j]);

		}

		// generar numero aleatorio

		int numero = (int) (Math.random() * alumnos.length);

		for (int j = 0; j < alumnos.length; j++) {

			if (numero != j) {
				System.out.println("***" + alumnos[j]);
			} else {
				System.out.println(j + "" + alumnos[j]);
			}
		}

		// mostrar voluntario para leer

	}

}
