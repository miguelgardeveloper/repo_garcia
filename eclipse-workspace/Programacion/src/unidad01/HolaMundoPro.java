package unidad01;
/**
 * Clase para el saludo en java
 * Saluda con Hola amigo si el usuario no introduce su nombre
 * Saluda con Hola nombre si el usuario introduce su nombre
 */
import java.util.Scanner;

public class HolaMundoPro {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Introduce tu nombre ");
		String nombre = scan.nextLine();
		//Cuando el usuario no introduce ningún nombre, el valor que guarda es una cadena vacía, es decir "".
		nombre = "".equals(nombre) ? "amigo" : nombre;
		System.out.println("Hola " + nombre + "!");
		
		
		
		
		
		scan.close();
		
	}

}
