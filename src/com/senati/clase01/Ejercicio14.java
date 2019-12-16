package com.senati.clase01;

import javax.swing.JOptionPane;

public class Ejercicio14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * Ejercicio 14 En un taller se hace un 30% de descuento a los clientes cuya
		 * compra supere los $3000, y 20% si es menor. ¿Cuál será la cantidad que pagará
		 * una persona cualquiera por su compra?
		 * 
		 */
		float compra=0, monto_a_pagar=0;
		compra= Float.parseFloat(JOptionPane.showInputDialog("ingresar el monto de compra -> "));
		if(compra>3000) {
			monto_a_pagar=compra - (compra*0.30f);			
		}
		else {
			monto_a_pagar=compra - (compra*0.20f);			
		}
		System.out.println("El monto a pagar sera: " + monto_a_pagar);
	}

}
