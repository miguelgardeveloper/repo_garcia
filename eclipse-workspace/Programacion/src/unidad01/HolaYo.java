package unidad01;

import java.util.Scanner;

/**
 * programa que nos saluda por el nombre pasado por teclado
 */
public class HolaYo {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Introduce tu nombre:" );
		String nombre = scan.nextLine();
		System.out.println("Introduce tu año de nacimiento: " );
		int anioNacimiento = scan.nextInt();
		int edad = 2024 - anioNacimiento;
		System.out.println("Hola " + nombre + "!. Tienes " + edad + "años.");
		scan.close();
		
		
		
		
		
		

	}

}
