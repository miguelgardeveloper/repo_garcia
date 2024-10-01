package unidad01;

import java.util.Scanner;

public class ParImpar {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Introduce un numero entero. \nVeremos si es par o impar");
		int numero; 
		numero = scan.nextInt();
		String paridad;
		//Condicional 
		paridad = numero %2==0 ? "par" : "impar";
		System.out.println("el número introducido es:" + paridad);
		scan.close();

	}

}
