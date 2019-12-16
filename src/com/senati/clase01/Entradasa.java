package com.senati.clase01;
import java.util.Scanner;
public class Entradasa {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		float altura1 = 0f;
		int altura2 = 0;
		String dni;
		String nombre;
		String direccion;
		byte edad = 0;
		char sexo = ' ';
		//leer desde el teclado un valor
		Scanner sc = new Scanner(System.in);// Objeto para leer informacion
		Scanner leer = new Scanner(System.in); // ambos objetos son de lectura
		
		System.out.println("Introducir nombre ");
		nombre=leer.nextLine();
		System.out.println("Introducir direccion ");
		direccion=leer.nextLine();
		System.out.print("introduce altura en metros -> ");
		altura1 = sc.nextFloat();
		System.out.print("introduce altura en centimetros -> " );
		altura2 = sc.nextInt();
		System.out.print("introduce dni -> " );
		dni = leer.nextLine();		
		System.out.print("introduce edad -> " );
		edad = sc.nextByte();		
		System.out.print("introduce sexo -> " );		
		sexo = sc.next().charAt(0);
		// resultados        
		System.out.println("nombre "+nombre);
		System.out.println("direccion "+direccion);
		System.out.println("altura en metros -> " + altura1 );
		System.out.println("altura en centimetros -> " + altura2 );
		System.out.println("dni -> " + dni );
		System.out.println("edad -> " + edad );
		System.out.println("sexo -> " + sexo );
	}

}
