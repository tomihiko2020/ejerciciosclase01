package com.senati.clase01;

public class ejercicio06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*
		 * Si se sabe que en una compa��a que renta autos el costo de alquiler de un
		 * auto por d�a es $30, adem�s, la compa��a cobra $0.40 por kil�metro recorrido
		 * s�lo si su recorrido total supera los 2000 kil�metros. Calcule el monto a
		 * pagar, si se tienen previamente los valores de n�mero de d�as alquilados y
		 * los kil�metros recorridos.
		 */
		int costo_alquiler = 30; // Costo por dia
		float costo_kr = 0.40f; // Costo por km adicional
		int nro_dias = 2; // Dias transcurridos
		int recorrido = 2002; // Recorrido final
		float monto_total = 0f; // Monto total dias * costo
		float monto_adicional = 0f; // recorrido adicional > 2000
		//JOptionpanel
		if (recorrido > 2000) { // Si el recorrido es mayor a 2000
			// Cuando es verdadero
			monto_total = nro_dias * costo_alquiler;
			monto_adicional = (recorrido - 2000)*costo_kr;
		}else {
			// Cuando no es verdadero
			monto_total = nro_dias * costo_alquiler;
			monto_adicional =0f;
		}
		System.out.println("Monto a pagar : " + (monto_total + monto_adicional));

	}

}
