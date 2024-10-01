package unidad01;
/*
 * Escribe un programa que dada una hora determinada (horas y minutos), 
 * calcule los segundos que faltan para llegar a la medianoche. 
 */
import java.util.Scanner;

public class ParaMediaNoche {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Escribe un programa que dada una hora determinada (horas y minutos), \ncalcule los segundos que faltan para llegar a la medianoche.");
		System.out.println("Introduce la hora: ");
		int hora = scan.nextInt();
		System.out.println("Introduce los minutos: ");
		int minutos = scan.nextInt();		
		int horasParaMedianoche = (23 - hora);
		int minutosParaMedianoche = (60 - minutos);
		int segParaMedianoche = (horasParaMedianoche*3600+minutosParaMedianoche);
		System.out.println("\nQuedan " +segParaMedianoche+ "segundos para medianoche.");
		scan.close();
	}

}
