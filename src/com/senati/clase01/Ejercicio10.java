package com.senati.clase01;

import java.text.DecimalFormat;

import javax.swing.JOptionPane;

public class Ejercicio10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		float total;
		float descuento;
		float total_pago;
		DecimalFormat df = new DecimalFormat("#.00");
		
		total = Float.parseFloat(JOptionPane.showInputDialog("introduce el total "));
		if (total > 1000) {
			descuento = total * 0.2f;
		}else {
			descuento= 0;
		}
		
		total_pago = total - descuento;
		
		System.out.println("Total : " + df.format(total) );
		System.out.println("Descuento : " + df.format(descuento) );
		System.out.println("Total pago : " + df.format(total_pago) );
	}

}
