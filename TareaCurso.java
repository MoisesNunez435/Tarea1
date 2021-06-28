package xd;

import java.util.Scanner;

import javax.swing.JOptionPane;

import java.util.InputMismatchException;

public class TareaCurso {

	static Scanner sc = new Scanner(System.in);
	static boolean Continuar;
	static int Opcion, Opcion1, nElementos;
	static TareaCurso sl = new TareaCurso();
	static double MontoINSS, MontoIR, MontoSindicato, MontoAntiguedad, MontoINSSPatronal;
	static double IngresoBruto, IngresoTotal, TotalDeducciones, IngresoNeto;
	public static void main(String[] args) {
		

//		do {
			do {
			try {
				Continuar = false;
		System.out.println("Sea bienvenido, favor de ingresar la opcion de su preferencia");
		System.out.println("");
		System.out.println("Opcion 1: Ingresar al Programa de Control Financiero");
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
				System.out.println("¿Que funcion desea ejecutar?");
				System.out.println("1. Control de Compras y Ventas");
				System.out.println("2. Control de Pago de Nomina");
				System.out.println("3. Generacion de estados financieros");
				System.out.print("Opcion: ");
				Opcion1 = sc.nextInt();
				while(Opcion1 <= 0 || Opcion >= 4) {
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
					break;
				case 2:
					sl.CalcularNomina();
					break;
				case 3:
					break;
				}
			
			case 2:
				System.out.println("Gracias por preferir nuestro programa, vuelva pronto");
				break;
			}

	}
	
	public void CalcularNomina() {
		final double INSS = 7;
		final double IR = 15.6;
		final int Sindicato = 1;
		final int Antiguedad = 15;
		final double INSSPatronal = 22.5;
		
		do {
			try {
				Continuar = false;
		System.out.println("Ingrese la cantidad de empleados a calcular su sueldo a pagar: ");
		System.out.print("Cantidad: ");
		nElementos = sc.nextInt();
		while(nElementos <= 0) {
			System.out.println("Usted no puede ingresar un numero igual o menor a 0");
			System.out.print("Cantidad: ");
			nElementos = sc.nextInt();
		}
		} catch (InputMismatchException ex) {
            System.out.println("No puede introducir caracteres y/o caracteres especiales ni numeros decimales.");
            	  sc.next();
            	  System.out.println();
            	  Continuar = true;
		}
		} while (Continuar);
		
		double[] SalarioEmpleados = new double[nElementos];
		for(int i = 0; i < nElementos; i++ ) {
			do {
				try {
					Continuar = false;
			System.out.print("Ingrese el salario del empleado N°"+(i + 1) + ": C$");
			SalarioEmpleados[i] = sc.nextDouble(); 
			while(SalarioEmpleados[i] <= 0) {
				System.out.println("Usted no puede ingresar un numero igual o menor a 0");
				System.out.print("Salario bruto: C$");
				SalarioEmpleados[i] = sc.nextDouble();
			}
			} catch (InputMismatchException ex) {
	            System.out.println("No puede introducir caracteres y/o caracteres especiales.");
	            	  sc.next();
	            	  System.out.println();
	            	  Continuar = true;
			}
			} while (Continuar);
		}
		
		for(int i = 0; i < nElementos; i++ ) {
			System.out.println();
			System.out.println("-------Pago de Nomina---------");
			MontoAntiguedad = SalarioEmpleados[i] * Antiguedad/100;
			MontoSindicato = SalarioEmpleados[i] * Sindicato/100;
			IngresoTotal = SalarioEmpleados[i] + MontoAntiguedad;
			MontoINSS = IngresoTotal * INSS/100;
			MontoIR = IngresoTotal * IR/100;
			TotalDeducciones = MontoINSS + MontoIR + MontoSindicato;
			MontoINSSPatronal = Math.round(IngresoTotal * INSSPatronal/100);
			IngresoNeto = Math.round(IngresoTotal - TotalDeducciones);
			System.out.println();
			System.out.println("----Tasas----");
			System.out.println("INSS = " + INSS + "%");
			System.out.println("IR = " + IR + "%");
			System.out.println("Sindicato = " + Sindicato + "%");
			System.out.println("Antiguedad = " + Antiguedad + "%");
			System.out.println("INSS Patronal = " + INSSPatronal + "%");
			System.out.println();
			System.out.println("----Ingresos del empleado----");
			System.out.println("Ingreso bruto (básico) = C$" + SalarioEmpleados[i]);
			System.out.println("Monto por antiguedad = C$" + MontoAntiguedad);
			System.out.println("Monto del ingreso total = C$" + IngresoTotal);
			System.out.println();
			System.out.println("----Deducciones del empleado----");
			System.out.println();
			System.out.println("--Deducciones sobre el ingreso bruto--");
			System.out.println("Monto por afiliación al sindicato = C$" + MontoSindicato);
			System.out.println();
			System.out.println("--Deducciones sobre el ingreso total--");
			System.out.println("Monto del INSS = C$" + MontoINSS);
			System.out.println("Monto del IR = C$" + MontoIR);
			System.out.println("Monto del total de deducciones = C$" + TotalDeducciones);
			System.out.println();
			System.out.println("----Deducciones del empleador----");
			System.out.println("Monto del INSS Patronal = C$" + MontoINSSPatronal);
			System.out.println();
			System.out.println("----Total a pagar----");
			System.out.println("Monto del ingreso neto = C$" + IngresoNeto);
			System.out.println();
			System.out.println();
			System.out.println();
		}
	}

	public void ControlVentas_Compras(){
	
}

}
