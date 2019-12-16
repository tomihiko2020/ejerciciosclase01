package com.senati.clase01;

import javax.swing.JOptionPane;

public class ejercicio12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * Ejercicio 12 Leer un número entero o decimal y mostrar su doble, triple,
		 * cuadrado y cubo.
		 * 
		 */
		int numero=0, doble=0, triple=0, cuadrado=0, cubo=0;
		numero= Integer.parseInt(JOptionPane.showInputDialog("ingresar el numero -> "));
		doble=2*numero;
		triple=3*numero;
		cuadrado=numero*numero;
		cubo=numero*numero*numero;
		//salida
		
		System.out.println("doble: " + doble);
		System.out.println("triple: " + triple);
		System.out.println("cuadrado: " + cuadrado);
		System.out.println("cubo: " + cubo);
	}

}
