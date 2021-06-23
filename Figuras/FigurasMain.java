package Figuras;

import java.util.Scanner;

import java.util.InputMismatchException;

public class FigurasMain {
	
	static boolean Continuar;
	static int Opcion, Opcion1;
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		
		do {
			do {
			try {
				Continuar = false;
		System.out.println("Sea bienvenido, favor de ingresar la opcion de su preferencia");
		System.out.println("");
		System.out.println("Opcion 1: Ingresar al Programa de Figuras Geometricas");
		System.out.println("Opcion 2: Salir del programa");
		System.out.print("Opcion : ");
		Opcion = sc.nextInt();
		while(Opcion <= 0 || Opcion >= 3) {
			System.out.println("Usted ha ingresado una respuesta erronea, favor de ingresar una respuesta valida");
			System.out.print("Opcion: ");
			Opcion = sc.nextInt();
		}
		} catch (InputMismatchException ex) {
            System.out.println("No puede introducir caracteres y/o caracteres especiales ni numeros decimales");
            	  sc.next();
            	  System.out.println();
            	  Continuar = true;
		}
		} while (Continuar);

		switch(Opcion) {
		case 1:
			do {
			try {
				Continuar = false;
			String Figuras[] = new String[13];
			Figuras[0] = "1. Prisma";
			Figuras[1] = "2. Cilindro";
			Figuras[2] = "3. Piramide";
			Figuras[3] = "4. Cono";
			Figuras[4] = "5. Esfera";
			Figuras[5] = "6. Tronco del Cono";
			Figuras[6] = "7. Tronco de la Piramide";
			Figuras[7] = "8. Tetraedro";
			Figuras[8] = "9. Hexaedro";
			Figuras[9] = "10. Octaedro";
			Figuras[10] = "11. Dodecaedro";
			Figuras[11] = "12. Icosaedro";
			Figuras[12] = "13. Ortoedro";
			System.out.println("Elija la figura geometrica con la que desea trabjar");
			for(int i = 0 ; i < Figuras.length ; i++) {
				System.out.println(Figuras[i]);	
				}
			System.out.print("Opcion : ");
			Opcion1 = sc.nextInt();
			while(Opcion1 <= 0 || Opcion1 >= 14) {
				System.out.println("Usted ha ingresado una respuesta erronea, favor de ingresar una respuesta valida");
				System.out.print("Opcion: ");
				Opcion1 = sc.nextInt();
			}
			} catch (InputMismatchException ex) {
	            System.out.println("No puede introducir caracteres y/o caracteres especiales ni numeros decimales");
	            	  sc.next();
	            	  System.out.println();
	            	  Continuar = true;
			}
			} while (Continuar);
			
			switch(Opcion1) {
			case 1:
				Prisma prisma = new Prisma(0.0, 0.0, true, "Azul", 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0 );
				prisma.CalcularPrisma();
				prisma.ColorFigura();
				break;
				
			case 2:
				Cilindro cilindro = new Cilindro(0.0, false, "Verde", 0.0, 0.0, 0.0, 0.0);
				cilindro.CalcularCilindro();
				cilindro.ColorFigura();
				break;
				
			case 3:
				Piramide piramide = new Piramide(0.0, 0.0, true, "Rojo", 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0);
				piramide.CalcularPiramide();
				piramide.ColorFigura();
				break;
			
			case 4:
				Cono cono = new Cono(0.0, 0.0, false, "Amarillo", 0.0, 0.0, 0.0 , 0.0);
				cono.CalcularCono();
				cono.ColorFigura();
				break;
				
			case 5:
				Esfera esfera = new Esfera( 0.0, 0.0, false, "Naranja", 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0);
				esfera.CalcularEsfera();
				esfera.ColorFigura();
				break;
				
			case 6:
				TroncoCono troncono = new TroncoCono(0.0, 0.0, false, "Purpura", 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0);
				troncono.CalcularTroncoCono();
				troncono.ColorFigura();
				break;
				
			case 7:
				TroncoPiramide troncopiramide = new TroncoPiramide(0.0, 0.0, false, "Gris", 0.0, 0.0, 0.0, 0.0 ,0.0 ,0.0 ,0.0, 0.0, 0.0, 0.0, 0.0, 0.0);
				troncopiramide.CalcularTroncoPiramide();
				troncopiramide.ColorFigura();
				break;
				
			case 8:
				Tetraedro tetraedro = new Tetraedro(0.0, 0.0, false, "Blanco", 0.0, 0.0, 0.0);
				tetraedro.CalcularTetraedro();
				tetraedro.ColorFigura();
				break;
				
			case 9:
				Hexaedro hexaedro = new Hexaedro(0.0, 0.0, false, "Negro", 0.0, 0.0, 0.0, 0.0);
				hexaedro.CalcularHexaedro();
				hexaedro.ColorFigura();
				break;
				
			case 10:
				Octaedro octaedro = new Octaedro(0.0, 0.0, false, "Dorado", 0.0, 0.0, 0.0);
				octaedro.CalcularOctaedro();
				octaedro.ColorFigura();
				break;
				
			case 11:
				Dodecaedro dodecaedro = new Dodecaedro(0.0, 0.0, false, "Rosa", 0.0, 0.0, 0.0, 0.0, 0.0, 0.0);
				dodecaedro.CalcularDodecaedro();
				dodecaedro.ColorFigura();
				break;
				
			case 12:
				Icosaedro icosaedro = new Icosaedro(0.0, 0.0, false, "Plateado", 0.0, 0.0, 0.0);
				icosaedro.CalcularIcosaedro();
				icosaedro.ColorFigura();
				break;
				
			case 13:
				Ortoedro ortoedro = new Ortoedro(0.0, 0.0, false, "Celeste", 0.0, 0.0, 0.0, 0.0, 0.0, 0.0);
				ortoedro.CalcularOrtoedro();
				ortoedro.ColorFigura();
				break;
			}
			
		case 2:
			System.out.println("Gracias por utilizar nuestro programa, vuelva pronto");
			break;
		}
	}while(Opcion == 1);
}
}
