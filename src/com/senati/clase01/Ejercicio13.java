package com.senati.clase01;

import javax.swing.JOptionPane;

public class Ejercicio13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * Ejercicio 13 Lea una cantidad en nuevos soles y obtenga su equivalencia en
		 * euros. Debe leer tambi�n el tipo de cambio del d�a (es decir, a cu�nto
		 * equivale un euro en nuevos soles).
		 */
		float SOLES=0f, EUROS=0f, TIPO_DE_CAMBIO=0f;
		EUROS= Float.parseFloat(JOptionPane.showInputDialog("ingresar el monto en EUROS -> "));
		TIPO_DE_CAMBIO=Float.parseFloat(JOptionPane.showInputDialog("tipo de cambio en SOLES -> "));
		SOLES=(EUROS*TIPO_DE_CAMBIO);
		//salida
		
		System.out.println("Equivalencia en soles: " + SOLES);
		
	}

}
