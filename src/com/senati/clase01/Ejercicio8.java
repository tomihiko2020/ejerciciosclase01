package com.senati.clase01;

import javax.swing.JOptionPane;

public class Ejercicio8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*Se ingresa el lado L de un cuadrado. Calcular su perímetro y su área. 
		Se sabe que Perímetro=4L y Área=L2.*/
		
		float lado=0, perimetro=0, area=0;
		//ingresar dato lado del cuadrado
		
		lado = Float.parseFloat(JOptionPane.showInputDialog("introduce el lado del cuadrado -> "));			
		
		perimetro=4*lado;
		area=lado*lado;
		
		// salida
		
		System.out.println("el perimetro del cuadrado -> " + perimetro);
		System.out.println("El area del cuadrado -> " + area);
		
		
		
		
	}

}
