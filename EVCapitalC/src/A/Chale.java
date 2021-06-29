package A;

import java.util.InputMismatchException;
import java.util.Scanner;
public class Chale {

	static double Dividendos;
	static double UEjercicio;
	static double CSocial;
	static double URetenida;
	static double VCapital;
	
	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		boolean Continuar;

		System.out.println("Ingrese los siguientes datos");
		System.out.println();
		
		do {
			try {
			 Continuar = false;
			System.out.println("Ingrese el monto en cordobas de los Dividendos por Pagar");
			System.out.println("Monto: C$   ");
			Dividendos = sc.nextDouble();
		while (Dividendos <0) {
			System.out.println("Usted no puede ingresar un numero menor a 0");
			System.out.print("Monto: C$   ");
			Dividendos = sc.nextDouble();
		}
		} catch (InputMismatchException ex) {
            System.out.println("No puede introducir caracteres y/o caracteres especiales ni numeros decimales.");
            	  sc.next();
            	  System.out.println();
            	  Continuar = true;
		}
		} while (Continuar);
		
		do {
			try {
			 Continuar = false;
			System.out.println("Ingrese el monto en cordobas de la Utilidad del Ejercicio");
			System.out.println("Monto: C$   ");
			UEjercicio = sc.nextDouble();
		while (UEjercicio <0) {
			System.out.println("Usted no puede ingresar un numero menor a 0");
			System.out.print("Monto: C$   ");
			UEjercicio = sc.nextDouble();
		}
		} catch (InputMismatchException ex) {
            System.out.println("No puede introducir caracteres y/o caracteres especiales ni numeros decimales.");
            	  sc.next();
            	  System.out.println();
            	  Continuar = true;
		}
		} while (Continuar);
		
		do {
			try {
			 Continuar = false;
			System.out.println("Ingrese el monto en cordobas de la Capital Social");
			System.out.println("Monto: C$   ");
			CSocial = sc.nextDouble();
		while (CSocial <0) {
			System.out.println("Usted no puede ingresar un numero menor a 0");
			System.out.print("Monto: C$   ");
			CSocial = sc.nextDouble();
		}
		} catch (InputMismatchException ex) {
            System.out.println("No puede introducir caracteres y/o caracteres especiales ni numeros decimales.");
            	  sc.next();
            	  System.out.println();
            	  Continuar = true;
		}
		} while (Continuar);
		
		URetenida = CSocial + UEjercicio - Dividendos;
		System.out.println("El Monto Total de las Utilidades Retenidas es " + URetenida);
		VCapital = CSocial - URetenida;
		System.out.println("El Monto de la Variacion del Capital es  " + VCapital);
	}
}