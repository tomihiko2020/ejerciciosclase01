package com.senati.clase01;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import javax.swing.JOptionPane;

public class Ejercicio7 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		int n = 0,mayor = 0,menor = 20;
		int suma=0;
		float promedio;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
 
        for (int i = 0; i < 4; i++) {
            //System.out.println("Ingresa un numero");
            n = Integer.parseInt(JOptionPane.showInputDialog("introduce nota de alumno "));
            //n = Integer.parseInt(br.readLine());
            suma = suma + n;
            if(n < menor){
                menor = n;
            }
        }
        promedio = (suma - menor)/3;
        System.out.println("El promedio es  :" + promedio);        
	}

}
