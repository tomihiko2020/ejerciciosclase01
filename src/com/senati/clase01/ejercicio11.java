package com.senati.clase01;

import javax.swing.JOptionPane;

public class ejercicio11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*
		 * Ejercicio 11 Calcular el nuevo salario neto de un obrero si obtuvo un
		 * incremento del 25% sobre su salario anterior y debe pagar al seguro social 5%
		 * de su nuevo sueldo.
		 */ 
		float sueldo_ant=0f, sueldo_nuev=0f, salario_neto=0f;
		sueldo_ant = Float.parseFloat(JOptionPane.showInputDialog("Sueldo anterior -> "));	
		sueldo_nuev=(sueldo_ant*1.25f);
		salario_neto=(sueldo_nuev) - (sueldo_nuev*0.05f);
		//salida
		System.out.println("el nuevo salario neto -> " + salario_neto);
		
		
		
		
	}

}
