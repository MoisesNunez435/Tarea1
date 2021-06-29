package Equis;

import java.util.InputMismatchException;
import java.util.Scanner;
public class SomosChavos {
	
	static int Resp1;
	static int Resp2;
	static int Resp3;
	static int Resp4;
	static int Resp5;
	static int Resp6;
	static int Resp7;
	static double TotalA;
	static double TotalP;
	static double TotalC;

	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		boolean Continuar;
		
		double ACirculante [] = new double [23];
		double AFijo [] = new double [18];
		double AIn [] = new double [18];
		double PCP [] = new double [16];
		double PLP [] = new double [7];
		double CC [] = new double [4];
		double CG [] = new double [4];
	
		String ActivosCirculantes [] = new String [23];
		ActivosCirculantes [0] = "";
		ActivosCirculantes [1] = "Caja";
		ActivosCirculantes [2] = "Banco";
		ActivosCirculantes [3] = "Fondo de Caja";
		ActivosCirculantes [4] = "Instrumentos Financieros";
		ActivosCirculantes [5] = "Inversiones Temporales";
		ActivosCirculantes [6] = "Clientes";
		ActivosCirculantes [7] = "Documentos por Cobrar a Corto Plazo";
		ActivosCirculantes [8] = "Deudores";
		ActivosCirculantes [9] = "Funcionarios y Empleados";
		ActivosCirculantes [10] = "IVA Acreditable";
		ActivosCirculantes [11] = "IVA Pendiente de Acreditar";
		ActivosCirculantes [12] = "Anticipo de Impuesto";
		ActivosCirculantes [13] = "Inventarios";
		ActivosCirculantes [14] = "Mercancia en Transito";
		ActivosCirculantes [15] = "Anticipo a Proveedores";
		ActivosCirculantes [16] = "Papeleria y Utiles";
		ActivosCirculantes [17] = "Propaganda y Publicidad";
		ActivosCirculantes [18] = "Muestra y Literatura Medica";
		ActivosCirculantes [19] = "Prima de Seguros y Fianzas";
		ActivosCirculantes [20] = "Rentas Pagadas por Anticipado";
		ActivosCirculantes [21] = "Intereses Pagados por Anticipado";
		ActivosCirculantes [22] = "Fondo de Oportunidad";
		
		String ActivosFijos [] = new String [18];
		ActivosFijos [0] = "";
		ActivosFijos [1] = "Terreno (Inversion)";
		ActivosFijos [2] = "Edificio (Inversion)";
		ActivosFijos [3] = "Depreciacion de Edificio";
		ActivosFijos [4] = "Maquinaria (Inversion)";
		ActivosFijos [5] = "Depreciacion de Maquinaria";
		ActivosFijos [6] = "Mobiliario y Equipo de Oficina (Inversion)";
		ActivosFijos [7] = "Depreciacion de Mobiliario y Equipo de Oficina";
		ActivosFijos [8] = "Muebles y Enseres (Inversion)";
		ActivosFijos [9] = "Depreciacion de Muebles y Enseres";
		ActivosFijos [10] = "Equipo de Transporte (Inversion)";
		ActivosFijos [11] = "Depreciacion de Equipo de Transporte";
		ActivosFijos [12] = "Equipo de Entrega y Reparto (Inversion)";
		ActivosFijos [13] = "Depreciacion de Equipo de Entrega y Reparto";
		ActivosFijos [14] = "Equipo de Computo (Inversion)";
		ActivosFijos [15] = "Depreciacion de Equipo de Computo";
		ActivosFijos [16] = "Depositos en Garantia (Inversion)";
		ActivosFijos [17] = "Acciones y Valores (Inversion)";
		
		String ActivosIn [] = new String [18];
		ActivosIn [0] = "";
		ActivosIn [1] = "Derechos de Autor";
		ActivosIn [2] = "Patentes";
		ActivosIn [3] = "Marcas y Nombres Comerciales";
		ActivosIn [4] = "Credito Mercantil";
		ActivosIn [5] = "Gastos de Investigaciones y Desarrollo";
		ActivosIn [6] = "Gastos Preoperativos";
		ActivosIn [7] = "Descuentos en Emision de Obligaciones";
		ActivosIn [8] = "Gastos en Colocacion de Valores";
		ActivosIn [9] = "Franquicias";
		ActivosIn [10] = "Gastos de Constitucion";
		ActivosIn [11] = "Gastos de Organizacion";
		ActivosIn [12] = "Gastos de Instalacion";
		ActivosIn [13] = "Fondos a Largo Plazo";
		ActivosIn [14] = "Fondos de Amortizacion y Obligaciones";
		ActivosIn [15] = "Cuentas por Cobrar de Largo Plazo";
		ActivosIn [16] = "Inversiones en Proceso";
		ActivosIn [17] = "Inmuebles no Utilizados";
	
		String PasivosCortoPlazo [] = new String [16];
		PasivosCortoPlazo [0] = "";
		PasivosCortoPlazo [1] = "Proveedores";
		PasivosCortoPlazo [2] = "Acreedores";
		PasivosCortoPlazo [3] = "Documentos por Pagar a Corto Plazo";
		PasivosCortoPlazo [4] = "Acreedores Bancarios";
		PasivosCortoPlazo [5] = "Anticipo de Clientes";
		PasivosCortoPlazo [6] = "Dividendos por Pagar";
		PasivosCortoPlazo [7] = "Gastos Acumulados por Pagar";
		PasivosCortoPlazo [8] = "IVA Causado";
		PasivosCortoPlazo [9] = "IVA Pendiente de Causar";
		PasivosCortoPlazo [10] = "Impuestos y Derechos por Pagar";
		PasivosCortoPlazo [11] = "Impuestos y Derechos Retenidos por Enterar";
		PasivosCortoPlazo [12] = "Impuesto sobre la Renta (ISR) por Pagar";
		PasivosCortoPlazo [13] = "Participacion de los Trabajadores en las Utilidades (PTU) por Pagar";
		PasivosCortoPlazo [14] = "Rentas Cobradas por Anticipado";
		PasivosCortoPlazo [15] = "Intereses Cobrados por Anticipado";
		
		String PasivosLargoPlazo [] = new String [7];
		PasivosLargoPlazo [0] = "";
		PasivosLargoPlazo [1] = "Acreedores Hipotecarios";
		PasivosLargoPlazo [2] = "Acreedores Bancarios";
		PasivosLargoPlazo [3] = "Documentos por Pagar a Largo Plazo";
		PasivosLargoPlazo [4] = "Obligaciones en Circulacion";
		PasivosLargoPlazo [5] = "Rentas Cobradas por Anticipo a Largo Plazo";
		PasivosLargoPlazo [6] = "Intereses Cobrados por Anticipado a Largo Plazo";
		
		String CapitalContribuido [] = new String [4];
		CapitalContribuido [0] = "";
		CapitalContribuido [0] = "Capital Social";
		CapitalContribuido [0] = "Aportaciones para Futuros Aumentos de Capital";
		CapitalContribuido [0] = "Prima en Venta de Acciones";
		
		String CapitalGanado [] = new String [4];
		CapitalGanado [0] = "";
		CapitalGanado [1] = "Utilidades Integrales Acumuladas";
		CapitalGanado [2] = "Perdidas Integrales Acumuladas";
		CapitalGanado [3] = "Reservas";
		
		System.out.println("Ingrese los siguientes datos");
		System.out.println();
		
	for (int i = 1; i < ActivosCirculantes.length; i++) {
		do {
			try {
			 Continuar = false;
			System.out.println("Ingrese el monto en cordobas de " + ActivosCirculantes[i]);
			System.out.println("Monto: C$   ");
			ACirculante[i] = sc.nextDouble();
		while (ACirculante [i] <0) {
			System.out.println("Usted no puede ingresar un numero menor a 0");
			System.out.print("Monto: C$   ");
			ACirculante[i] = sc.nextDouble();
		}
		} catch (InputMismatchException ex) {
            System.out.println("No puede introducir caracteres y/o caracteres especiales ni numeros decimales.");
            	  sc.next();
            	  System.out.println();
            	  Continuar = true;
		}
		} while (Continuar);
	}
		for (int i = 1; i < ActivosFijos.length; i++) {
			do {
				try {
				 Continuar = false;
				System.out.println("Ingrese el monto en cordobas de " + ActivosFijos[i]);
				System.out.println("Monto: C$   ");
				AFijo[i] = sc.nextDouble();
			while (AFijo [i] <0) {
				System.out.println("Usted no puede ingresar un numero menor a 0");
				System.out.print("Monto: C$   ");
				AFijo[i] = sc.nextDouble();
			}
			} catch (InputMismatchException ex) {
	            System.out.println("No puede introducir caracteres y/o caracteres especiales ni numeros decimales.");
	            	  sc.next();
	            	  System.out.println();
	            	  Continuar = true;
			}
			} while (Continuar);
		}
		
		for (int i = 1; i < ActivosIn.length; i++) {
			do {
				try {
				 Continuar = false;
				System.out.println("Ingrese el monto en cordobas de " + ActivosIn[i]);
				System.out.println("Monto: C$   ");
				AIn[i] = sc.nextDouble();
			while (AIn [i] <0) {
				System.out.println("Usted no puede ingresar un numero menor a 0");
				System.out.print("Monto: C$   ");
				AIn[i] = sc.nextDouble();
			}
			} catch (InputMismatchException ex) {
	            System.out.println("No puede introducir caracteres y/o caracteres especiales ni numeros decimales.");
	            	  sc.next();
	            	  System.out.println();
	            	  Continuar = true;
			}
			} while (Continuar);
		}
		
		for (int i = 1; i < PasivosCortoPlazo.length; i++) {
			do {
				try {
				 Continuar = false;
				System.out.println("Ingrese el monto en cordobas de " + PasivosCortoPlazo[i]);
				System.out.println("Monto: C$   ");
				PCP[i] = sc.nextDouble();
			while (PCP [i] <0) {
				System.out.println("Usted no puede ingresar un numero menor a 0");
				System.out.print("Monto: C$   ");
				PCP[i] = sc.nextDouble();
			}
			} catch (InputMismatchException ex) {
	            System.out.println("No puede introducir caracteres y/o caracteres especiales ni numeros decimales.");
	            	  sc.next();
	            	  System.out.println();
	            	  Continuar = true;
			}
			} while (Continuar);
		}
		
		for (int i = 1; i < PasivosLargoPlazo.length; i++) {
			do {
				try {
				 Continuar = false;
				System.out.println("Ingrese el monto en cordobas de " + PasivosLargoPlazo[i]);
				System.out.println("Monto: C$   ");
				PLP[i] = sc.nextDouble();
			while (PLP [i] <0) {
				System.out.println("Usted no puede ingresar un numero menor a 0");
				System.out.print("Monto: C$   ");
				PLP[i] = sc.nextDouble();
			}
			} catch (InputMismatchException ex) {
	            System.out.println("No puede introducir caracteres y/o caracteres especiales ni numeros decimales.");
	            	  sc.next();
	            	  System.out.println();
	            	  Continuar = true;
			}
			} while (Continuar);
		}
		
		for (int i = 1; i < CapitalContribuido.length; i++) {
			do {
				try {
				 Continuar = false;
				System.out.println("Ingrese el monto en cordobas de " + CapitalContribuido[i]);
				System.out.println("Monto: C$   ");
				CC[i] = sc.nextDouble();
			while (CC [i] <0) {
				System.out.println("Usted no puede ingresar un numero menor a 0");
				System.out.print("Monto: C$   ");
				CC[i] = sc.nextDouble();
			}
			} catch (InputMismatchException ex) {
	            System.out.println("No puede introducir caracteres y/o caracteres especiales ni numeros decimales.");
	            	  sc.next();
	            	  System.out.println();
	            	  Continuar = true;
			}
			} while (Continuar);
		}
		
		for (int i = 1; i < CapitalGanado.length; i++) {
			do {
				try {
				 Continuar = false;
				System.out.println("Ingrese el monto en cordobas de " + CapitalGanado[i]);
				System.out.println("Monto: C$   ");
				CG[i] = sc.nextDouble();
			while (CG [i] <0) {
				System.out.println("Usted no puede ingresar un numero menor a 0");
				System.out.print("Monto: C$   ");
				CG[i] = sc.nextDouble();
			}
			} catch (InputMismatchException ex) {
	            System.out.println("No puede introducir caracteres y/o caracteres especiales ni numeros decimales.");
	            	  sc.next();
	            	  System.out.println();
	            	  Continuar = true;
			}
			} while (Continuar);
		}
		for (int i = 1; i < ActivosCirculantes.length; i++) {
			Resp1 += ACirculante[i];
		}
	
	for (int i = 1; i < ActivosFijos.length; i++) {
		Resp2 += AFijo[i];
	}
	
	for (int i = 1; i < ActivosIn.length; i++) {
		Resp3 += AIn[i];
	}
	
	for (int i = 1; i < PasivosCortoPlazo.length; i++) {
		Resp4 += PCP[i];
	}
	
	for (int i = 1; i < PasivosLargoPlazo.length; i++) {
		Resp5 += PLP[i];
	}
	
	for (int i = 1; i < CapitalContribuido.length; i++) {
		Resp6 += CC[i];
	}
		
	for (int i = 1; i < CapitalGanado.length; i++) {
		Resp7 += CG[i];
	}
	TotalA = Resp1 + Resp2 + Resp3;
	
	TotalP = Resp4 + Resp5;
	
	TotalC = Resp6 + Resp7;
	
		System.out.println("---------------------");//NombreEmpresa+"---------------------");
		System.out.println("---------------------Balance General---------------------");
		System.out.println("																											|			1			|			2			|			3			|			4			|");
		System.out.println("Activos");
		System.out.println("Activos Circulantes");
		System.out.println("");
		System.out.println("Caja																															"+ACirculante[1]);
		System.out.println("Banco																														"+ACirculante[2]);
		System.out.println("Fondo de Caja																											"+ACirculante[3]);
		System.out.println("Instrumentos Financieros																						"+ACirculante[4]);
		System.out.println("Inversiones Temporales																							"+ACirculante[5]);
		System.out.println("Clientes																													"+ACirculante[6]);
		System.out.println("Documentos por Cobrar a Corto Plazo																	"+ACirculante[7]);
		System.out.println("Deudores																													"+ACirculante[8]);
		System.out.println("Funcionarios y Empleados																					"+ACirculante[9]);
		System.out.println("IVA Acreditable																										"+ACirculante[10]);
		System.out.println("IVA Pendiente de Acreditar																					"+ACirculante[11]);
		System.out.println("Anticipo de Impuesto																							"+ACirculante[12]);
		System.out.println("Inventarios																												"+ACirculante[13]);
		System.out.println("Mercancia en Transito																							"+ACirculante[14]);
		System.out.println("Anticipo a Proveedores																							"+ACirculante[15]);
		System.out.println("Papeleria y Utiles																									"+ACirculante[16]);
		System.out.println("Propaganda y Publicidad																						"+ACirculante[17]);
		System.out.println("Muestra y Literatura Medica																				"+ACirculante[18]);
		System.out.println("Prima de Seguros y Fianzas																					"+ACirculante[19]);
		System.out.println("Rentas Pagadas por Anticipado																			"+ACirculante[20]);
		System.out.println("Interese Pagados por Anticipado																			"+ACirculante[21]);
		System.out.println("Fondo de Oportunidad																							"+ACirculante[22]);
		System.out.println("Total Activos Circulantes																															" +Resp1);
		System.out.println("");
		System.out.println("Activos Fijos");
		System.out.println("Terreno																													"+AFijo[1]);
		System.out.println("Edificio																													"+AFijo[2]);
		System.out.println("Depreciacion de Edificio																						"+AFijo[3]);
		System.out.println("Maquinaria																												"+AFijo[4]);
		System.out.println("Depreciacion de Maquinaria																				"+AFijo[5]);
		System.out.println("Mobiliario y Equipo de Oficina																			"+AFijo[6]);
		System.out.println("Depreciacion de Mobiliario y Equipo de Oficina												"+AFijo[7]);
		System.out.println("Muebles y Enseres																									"+AFijo[8]);
		System.out.println("Depreciacion de Muebles y Enseres																		"+AFijo[9]);
		System.out.println("Equipo de Transporte																							"+AFijo[10]);
		System.out.println("Depreciacion de Equipo de Transporte																"+AFijo[11]);
		System.out.println("Equipo de Entrega y Reparto																				"+AFijo[12]);
		System.out.println("Depreciacion de Equipo de Entrega y Reparto													"+AFijo[13]);
		System.out.println("Equipo de Computo																								"+AFijo[14]);
		System.out.println("Depreciacion de Equipo de Computo																	"+AFijo[15]);
		System.out.println("Depositos en Garantia																							"+AFijo[16]);
		System.out.println("Acciones y Valores																									"+AFijo[17]);
		System.out.println("Total Activos Fijos																																		" +Resp2);
		System.out.println("");
		System.out.println("Activos Intangibles");
		System.out.println("Derechos de Autor																									" +AIn[1]);
		System.out.println("Patentes																													" +AIn[2]);
		System.out.println("Marcas y Nombres Comerciales																			" +AIn[3]);
		System.out.println("Credito Mercantil																									" +AIn[4]);
		System.out.println("Gastos de Investigacion y Desarrollo																	" +AIn[5]);
		System.out.println("Gastos Preoperativos																								" +AIn[6]);
		System.out.println("Descuentos en Emision de Obligaciones																" +AIn[7]);
		System.out.println("Gastos en Colocacion de Valores																			" +AIn[8]);
		System.out.println("Franquicias																												" +AIn[9]);
		System.out.println("Gastos de Constitución																							" +AIn[10]);
		System.out.println("Gastos de Organización																							" +AIn[11]);
		System.out.println("Gastos de Instalación																								" +AIn[12]);
		System.out.println("Fondos a Largo Plazo																								" +AIn[13]);
		System.out.println("Cuentas por Cobrar de Largo Plazo																		" +AIn[14]);
		System.out.println("Inversiones en Proceso																							" +AIn[15]);
		System.out.println("Inmuebles no Utilizados																						" +AIn[16]);
		System.out.println("Total Activos Intangibles																															" +Resp3);
		System.out.println("Total Activos																																										" +TotalA);
		System.out.println("");
		System.out.println("Pasivos");
		System.out.println("Pasivos de Corto Plazo");
		System.out.println("Proveedores																												" +PCP[1]);
		System.out.println("Acreedores																													" +PCP[2]);
		System.out.println("Documentos por Pagar a Corto Plazo																		" +PCP[3]);
		System.out.println("Acreedores Bancarios																								" +PCP[4]);
		System.out.println("Anticipo de Clientes																									" +PCP[5]);
		System.out.println("Dividendos por Pagar																								" +PCP[6]);
		System.out.println("Gastos Acumulados por Pagar																					" +PCP[7]);
		System.out.println("IVA Causado																												" +PCP[8]);
		System.out.println("IVA Pendiente de Causar																							" +PCP[9]);
		System.out.println("Impuestos y Derechos por Pagar																				" +PCP[10]);
		System.out.println("Impuestos y Derechos Retenidos por Enterar															" +PCP[11]);
		System.out.println("Impuestos sobre la Renta (ISR) por Pagar																" +PCP[12]);
		System.out.println("Participación de los Trabajadores en las Utilidades												" +PCP[13]);
		System.out.println("Rentas Cobradas por Anticipado																				" +PCP[14]);
		System.out.println("Intereses Cobrados por Anticipado																			" +PCP[15]);
		System.out.println("Total Pasivos de Corto Plazo																																" +Resp4);
		System.out.println("");
		System.out.println("Pasivos a Largo Plazo");
		System.out.println("Acreedores Hipotecarios																							" +PLP[1]);
		System.out.println("Acreedores Bancarios																								" +PLP[2]);
		System.out.println("Documentos por Pagar a Largo Plazo																		" +PLP[3]);
		System.out.println("Obligaciones en Circulación																						" +PLP[4]);
		System.out.println("Rentas Cobradas por Anticipado a Largo Plazo														" +PLP[5]);
		System.out.println("Intereses Cobrados por Anticipado a Largo Plazo													" +PLP[6]);
		System.out.println("Total Pasivos de Corto Plazo																																" +Resp5);
		System.out.println("Total Pasivos																																												" +TotalP);
		System.out.println("");
		System.out.println("Capital Contable");
		System.out.println("Capital Contribuido");
		System.out.println("Capital Social																												" +CC[1]);
		System.out.println("Aportaciones para Futuros Aumentos de Capita													" +CC[2]);
		System.out.println("Primas en Ventas de Acciones																					" +CC[3]);
		System.out.println("Total Capital Contribuido																																	" +Resp6);
		System.out.println("");
		System.out.println("Capital Ganado");
		System.out.println("Utilidades Integrales Acumuladas																			" +CG[1]);
		System.out.println("Pérdidas Integrales Acumuladas																				" +CG[2]);
		System.out.println("Reservas																														" +CG[3]);
		System.out.println("Total Capital Ganado																																			" +Resp7);
		System.out.println("Total Capital Contable																																									" +TotalC);
		
	}
}