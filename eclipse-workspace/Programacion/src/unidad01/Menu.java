package unidad01;

import java.util.Scanner;

public class Menu {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Eligue una de la siguientes opcines: \n1 Comprimir archivo \n2 Eliminar archivo \n3 Copiar archivo \n4 Cerrar programa");
		int opcion = scan.nextInt();
		 if (opcion ==1) {
			System.out.println("Has elegido comprimir archivo");
		}
		else if (opcion == 2) {
			System.out.println("Eliminar archivo");
			
		}
		else if (opcion == 3) {
			System.out.println("Has elegido copiar archivo");
		}
		
		else if(opcion == 4) {
			System.out.println("Has elegido cerrar programa");
		}
		else {
				System.err.println("Error. Debes de introducir un número de la lista. ");
				
			}
		
		scan.close();
	}

}
