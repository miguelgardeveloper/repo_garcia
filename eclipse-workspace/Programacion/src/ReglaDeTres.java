import java.util.Scanner;

public class ReglaDeTres {

	public static void main(String[] args) {
		//Aquí escribimos nuestro código de resolución de Regla de Tres.
		System.out.println("Hola Mundo!");
		Scanner scan = new Scanner(System.in);
		System.out.println("Para realizar una regla de 3, vamos a pedir 3 valores que serian: A, B, C");
		System.out.println("Dame valor para A");
		int a = scan.nextInt();
		System.out.println("Dame valor para B");
		int b = scan.nextInt();
		System.out.println("Dame valor para C");
		int c = scan.nextInt();
		
		double x = (b*c)/a;
		
		System.out.println("Tú numero es " + x);
		
		
		
		
		
	}

}
