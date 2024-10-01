import java.util.Scanner;

public class ReglaDeTres {

	public static void main(String[] args) {
		//Aquí escribimos nuestro código de resolución de Regla de Tres.
		//System.out.println("Hola Mundo!");
		//TODO: Controlar que no se de a=0
		Scanner scan = new Scanner(System.in);
		System.out.println(""" 
				Introduzca los valores para resolver una regla de 3:
				a ----> b
				b ----> x
				""");

		//System.out.println("Para realizar una regla de 3, vamos a pedir 3 valores que serian: A, B, C");
		System.out.println("Dame valor para A");
		double a = scan.nextDouble();
		System.out.println("Dame valor para B");
		double b = scan.nextDouble();
		System.out.println("Dame valor para C");
		double c = scan.nextDouble();
		
		double x = (b*c)/a;
		
		System.out.println("Tú numero es " + x);
		scan.close();
		
		
		
	}

}
