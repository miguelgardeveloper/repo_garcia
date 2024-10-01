package unidad01;

import java.util.Scanner;

public class EtapaVital {

	public static void main(String[] args) {
		/**
		 * Introduciendo un año de nacimiento, el programa dirá si 
		 * bebe: 0-2 años
		 * niñ@: 3-11 años
		 * adolescente: 12-18 años.
		 * adulto; 19-65 años
		 * anciano:+65 años
		 * mostrará error si la edad es menor de 0 años 
		 * 
		 */
		Scanner scan = new Scanner(System.in);
		System.out.println("Introduce tu año de nacimiento ");
		int anioNacimiento = scan.nextInt();
		int edad = 2024 - anioNacimiento;
		
		if (edad < 0) {
			System.err.println("No se puede introducir el 0");
		}
		else if (edad >= 0 && edad <3) {
			System.out.println("Eres un bebe");
		}
		else if (edad >= 3 && edad <12) {
			System.out.println("Eres un niño");
		}
		else if (edad >= 12 && edad <19 ) {
				System.out.println("Eres un adolescente");
		}
		else if (edad >= 19 && edad <66) {
				System.out.println("Eres un adulto");
			
		} else {
			
			System.out.println("Eres un anciano ");

		}
		scan.close();
		
		
	}
	}


