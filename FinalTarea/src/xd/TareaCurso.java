package xd;

import java.util.Scanner;
import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.InputMismatchException;

public class TareaCurso {
	
		static double ACirculante [] = new double [23];
		static double AFijo [] = new double [18];
		static double AIn [] = new double [18];
		static double PCP [] = new double [16];
		static double PLP [] = new double [7];
		static double CC [] = new double [4];
		static double CG [] = new double [4];
		static double Montos []= new double[10];
		static double Montos1 []= new double[13];
		static double Montos2 []= new double[9];
		static double Montos3 []= new double[5];
		static double Montos4 []= new double[4];
		static double Montos5 []= new double[3];
		static double Montos6 []= new double[5];
		static Scanner sc = new Scanner(System.in);
		static boolean Continuar;
		static int Opcion, Opcion1, Opcion2, Opcion3, nElementos;
		static int Respuesta, Respuesta1, opc, Respuesta2, Respuesta3;
		static TareaCurso sl = new TareaCurso();
		static double TotalA, TotalP, TotalC, TotalDepr, Compr, CapitalC;
		static double MontoINSS, MontoIR, MontoSindicato, MontoAntiguedad, MontoINSSPatronal;
		static double IngresoBruto, IngresoTotal, TotalDeducciones, IngresoNeto, auxiliar;
		static double Total1, Total2, Total3, Total4, Total5, Total6, VentasNetas;
		static double ComprasTotales, ComprasNetas, TotalMercancia, CostoVendido, UtilidadVentas;
		static double GastosO, GastosO1, GastosO2, Utilidad, Perdida, UtilidadO1, UtilidadO2;
		static double Utilidad1, Perdida1, PerdidaEjer, PerdidaEjer1, ISR, UtilidadEjer1, UtilidadEjer, ISR1;
		static double Dividendos, UEjercicio, CSocial, URetenida, VCapital, ISR2;
		static double UtilidadEjer2, UtilidadEjer3, UtilidadEjer4, Resp1, Resp2, Resp3;
		static double Resp4, Resp5, Resp6, Resp7, Resp8, ComprasT1, VentasT1;
		static String NombreEmpresa, NombreEmpresa1;
		public static void main(String[] args) {
			
			do {
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
					while(Opcion1 <= 0 || Opcion1 >= 4) {
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
						sl.ControlVentas_Compras();
						break;
					case 2:
						sl.CalcularNomina();
						break;
					case 3:
						sl.GeneracionEstadosFinancieros();
					break;
					}
				
				case 2:
					System.out.println("Gracias por preferir nuestro programa, vuelva pronto");
					break;
				}
			}while (Opcion == 1);

		}
		
		public void CalcularNomina() {
			
			File File = new File("Nómina.txt");
			if(!File.exists()) {
				try {
					File.createNewFile();
					System.out.println(File.getName() +" fue creado correctamente");
				
				}catch (IOException ex) {
					System.out.println("El "+File.getName() +"no fue encontrado");
				}		
		}else {
				try {
					PrintWriter pw = new PrintWriter(File, "utf-8");
					pw.println("Pago de Nóminas");
					pw.println("");
					pw.println("El Pago de Nóminas es una la lista conformada por el conjunto de trabajadores que permite de una manera ordenada, realizar el pago de sueldos o salarios.");
					pw.println("");
					pw.println("Así como proporcionar información contable y estadística, tanto para la empresa como para el ente encargado de regular las relaciones laborales.");
					pw.close();
				}catch (IOException ex) {	
				}
		}
		
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

		public void GeneracionEstadosFinancieros(){

			do {
				try {
					Continuar = false;
			System.out.println("¿Que estado financiero desea ejecutar?");
			System.out.println("1. Estado de Situacion Financiera o Balance General");
			System.out.println("2. Estado de Perdida y Ganancia o Estado de Resultado");
			System.out.println("3. Estado de Variacion de Capital");
			System.out.print("Opcion: ");
			Opcion2 = sc.nextInt();
			while(Opcion2 <= 0 || Opcion2 >= 4 ) {
				System.out.println("Usted ha ingresado una respuesta erronea, favor de ingresar una respuesta valida");
				System.out.print("Opcion: ");
				Opcion2 = sc.nextInt();
			}
			} catch (InputMismatchException ex) {
	            System.out.println("No puede introducir caracteres y/o caracteres especiales ni numeros decimales");
	            	  sc.next();
	            	  System.out.println();
	            	  Continuar = true;
			}
			} while (Continuar);
			
			switch(Opcion2) {
			case 1:
				sl.CalcularBalanceGeneral();
				break;
			case 2:
				sl.CalcularEstadoResultado();
				break;
			case 3:
				sl.CalcularVariacionCapital();
				break;
			}
		}

		public void CalcularBalanceGeneral() {
			File File = new File("BalanceGE.txt");
			if(!File.exists()) {
				try {
					File.createNewFile();
					System.out.println(File.getName() +" fue creado correctamente");
				
				}catch (IOException ex) {
					System.out.println("El "+File.getName() +"no fue encontrado");
				}		
		}else {
				try {
					PrintWriter pw = new PrintWriter(File, "utf-8");
					pw.println("Balance General");
					pw.println("");
					pw.println("El Balance General, también conocido como Estado de Situación Financiera, es un Estado Financiero que refleja la situación financiera del negocio en una fecha deerminada.");
					pw.println("");
					pw.println("Se divide en tres masas patrimoniales: Activo, Pasivo y Capital.");
					pw.close();
				}catch (IOException ex) {	
				}
		}
			
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
			
			System.out.println("Ingrese el nombre de su empresa");
			NombreEmpresa1 = sc.next();
			
		
		System.out.println("A continuacion se le pedira los montos de los activos circulantes");
		for (int i = 1; i < ActivosCirculantes.length; i++) {
			do {
				try {
				 Continuar = false;
				System.out.println("Ingrese el monto en cordobas de " + ActivosCirculantes[i]);
				System.out.print("Monto: C$");
				ACirculante[i] = sc.nextDouble();
			while (ACirculante [i] <0) {
				System.out.println("Usted no puede ingresar un numero menor a 0");
				System.out.print("Monto: C$");
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
		
		System.out.println("A continuacion se le pedira los montos de los activos fijos");
			for (int i = 1; i < ActivosFijos.length; i++) {
				do {
					try {
					 Continuar = false;
					System.out.println("Ingrese el monto en cordobas de " + ActivosFijos[i]);
					System.out.print("Monto: C$");
					AFijo[i] = sc.nextDouble();
				while (AFijo [i] <0) {
					System.out.println("Usted no puede ingresar un numero menor a 0");
					System.out.print("Monto: C$");
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
			
			System.out.println("A continuacion se le pedira los montos de los activos intangibles");
			for (int i = 1; i < ActivosIn.length; i++) {
				do {
					try {
					 Continuar = false;
					System.out.println("Ingrese el monto en cordobas de " + ActivosIn[i]);
					System.out.print("Monto: C$");
					AIn[i] = sc.nextDouble();
				while (AIn [i] <0) {
					System.out.println("Usted no puede ingresar un numero menor a 0");
					System.out.print("Monto: C$");
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
			
			System.out.println("A continuacion se le pedira los montos de los pasivos a corto plazo");
			for (int i = 1; i < PasivosCortoPlazo.length; i++) {
				do {
					try {
					 Continuar = false;
					System.out.println("Ingrese el monto en cordobas de " + PasivosCortoPlazo[i]);
					System.out.print("Monto: C$");
					PCP[i] = sc.nextDouble();
				while (PCP [i] <0) {
					System.out.println("Usted no puede ingresar un numero menor a 0");
					System.out.print("Monto: C$");
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
			
			System.out.println("A continuacion se le pedira los montos de los pasivos a largo plazo");
			for (int i = 1; i < PasivosLargoPlazo.length; i++) {
				do {
					try {
					 Continuar = false;
					System.out.println("Ingrese el monto en cordobas de " + PasivosLargoPlazo[i]);
					System.out.print("Monto: C$");
					PLP[i] = sc.nextDouble();
				while (PLP [i] <0) {
					System.out.println("Usted no puede ingresar un numero menor a 0");
					System.out.print("Monto: C$");
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
			
			System.out.println("A continuacion se le pedira los montos del capital contribuido");
			for (int i = 1; i < CapitalContribuido.length; i++) {
				do {
					try {
					 Continuar = false;
					System.out.println("Ingrese el monto en cordobas de " + CapitalContribuido[i]);
					System.out.print("Monto: C$");
					CC[i] = sc.nextDouble();
				while (CC [i] <0) {
					System.out.println("Usted no puede ingresar un numero menor a 0");
					System.out.print("Monto: C$");
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
			
			System.out.println("A continuacion se le pedira los montos del capital ganado");
			for (int i = 1; i < CapitalGanado.length; i++) {
				do {
					try {
					 Continuar = false;
					System.out.println("Ingrese el monto en cordobas de " + CapitalGanado[i]);
					System.out.print("Monto: C$");
					CG[i] = sc.nextDouble();
				while (CG [i] <0) {
					System.out.println("Usted no puede ingresar un numero menor a 0");
					System.out.print("Monto: C$");
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
			
			TotalDepr = AFijo[3] + AFijo[5] + AFijo[5] + AFijo[7] + AFijo[9] + AFijo[11] + AFijo[13] + AFijo[15];
			
		for (int i = 1; i < ActivosCirculantes.length; i++) {
				Resp1 += ACirculante[i];
		}
		
		for (int i = 1; i < ActivosFijos.length; i++) {
			Resp2 += AFijo[i];
		}
		Resp8 = Resp2 - TotalDepr;
		
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
		
			System.out.println("---------------------"+NombreEmpresa1+"---------------------");
			System.out.println("---------------------Balance General---------------------");
			System.out.println("                                                                           |     1     |     2     |     3     |     4     |");
			System.out.println("Activos");																							            
			System.out.println("Activos Circulantes");
			System.out.println("");
			System.out.println("Caja                                                                                    " +ACirculante[1]);
			System.out.println("Banco                                                                                   " +ACirculante[2]);
			System.out.println("Fondo de Caja                                                                           " +ACirculante[3]);
			System.out.println("Instrumentos Financieros                                                                " +ACirculante[4]);
			System.out.println("Inversiones Temporales                                                                  " +ACirculante[5]);
			System.out.println("Clientes                                                                                " +ACirculante[6]);
			System.out.println("Documentos por Cobrar a Corto Plazo                                                     " +ACirculante[7]);
			System.out.println("Deudores                                                                                " +ACirculante[8]);
			System.out.println("Funcionarios y Empleados                                                                " +ACirculante[9]);
			System.out.println("IVA Acreditable                                                                         " +ACirculante[10]);
			System.out.println("IVA Pendiente de Acreditar                                                              " +ACirculante[11]);
			System.out.println("Anticipo de Impuesto                                                                    " +ACirculante[12]);
			System.out.println("Inventarios                                                                             " +ACirculante[13]);
			System.out.println("Mercancia en Transito                                                                   " +ACirculante[14]);
			System.out.println("Anticipo a Proveedores                                                                  " +ACirculante[15]);
			System.out.println("Papeleria y Utiles                                                                      " +ACirculante[16]);
			System.out.println("Propaganda y Publicidad                                                                 " +ACirculante[17]);
			System.out.println("Muestra y Literatura Medica                                                             " +ACirculante[18]);
			System.out.println("Prima de Seguros y Fianzas                                                              " +ACirculante[19]);
			System.out.println("Rentas Pagadas por Anticipado                                                           " +ACirculante[20]);
			System.out.println("Interese Pagados por Anticipado                                                         " +ACirculante[21]);
			System.out.println("Fondo de Oportunidad                                                                    " +ACirculante[22]);
			System.out.println("Total Activos Circulantes                                                                           " +Resp1);
			System.out.println("");
			System.out.println("Activos Fijos");
			System.out.println("Terreno                                                                                 "+AFijo[1]);
			System.out.println("Edificio                                                                                "+AFijo[2]);
			System.out.println("Depreciacion de Edificio                                                                "+AFijo[3]);
			System.out.println("Maquinaria                                                                              "+AFijo[4]);
			System.out.println("Depreciacion de Maquinaria                                                              "+AFijo[5]);
			System.out.println("Mobiliario y Equipo de Oficina                                                          "+AFijo[6]);
			System.out.println("Depreciacion de Mobiliario y Equipo de Oficina                                          "+AFijo[7]);
			System.out.println("Muebles y Enseres                                                                       "+AFijo[8]);
			System.out.println("Depreciacion de Muebles y Enseres                                                       "+AFijo[9]);
			System.out.println("Equipo de Transporte                                                                    "+AFijo[10]);
			System.out.println("Depreciacion de Equipo de Transporte                                                    "+AFijo[11]);
			System.out.println("Equipo de Entrega y Reparto                                                             "+AFijo[12]);
			System.out.println("Depreciacion de Equipo de Entrega y Reparto                                             "+AFijo[13]);
			System.out.println("Equipo de Computo                                                                       "+AFijo[14]);
			System.out.println("Depreciacion de Equipo de Computo                                                       "+AFijo[15]);
			System.out.println("Depositos en Garantia                                                                   "+AFijo[16]);
			System.out.println("Acciones y Valores                                                                      "+AFijo[17]);
			System.out.println("Total Activos Fijos                                                                                 " +Resp8);
			System.out.println("");
			System.out.println("Activos Intangibles");
			System.out.println("Derechos de Autor                                                                       " +AIn[1]);
			System.out.println("Patente                                                                                 " +AIn[2]);
			System.out.println("Marcas y Nombres Comerciales                                                            " +AIn[3]);
			System.out.println("Credito Mercantil                                                                       " +AIn[4]);
			System.out.println("Gastos de Investigacion y Desarrollo                                                    " +AIn[5]);
			System.out.println("Gastos Preoperativos                                                                    " +AIn[6]);
			System.out.println("Descuentos en Emision de Obligacion                                                     " +AIn[7]);
			System.out.println("Gastos en Colocacion de Valores                                                         " +AIn[8]);
			System.out.println("Franquicias                                                                             " +AIn[9]);
			System.out.println("Gastos de Constitución                                                                  " +AIn[10]);
			System.out.println("Gastos de Organización                                                                  " +AIn[11]);
			System.out.println("Gastos de Instalación                                                                   " +AIn[12]);
			System.out.println("Fondos a Largo Plazo                                                                    " +AIn[13]);
			System.out.println("Cuentas por Cobrar de Largo Plazo                                                       " +AIn[14]);
			System.out.println("Inversiones en Proceso                                                                  " +AIn[15]);
			System.out.println("Inmuebles no Utilizados                                                                 " +AIn[16]);
			System.out.println("Total Activos Intangibles                                                                           " +Resp3);
			System.out.println("Total Activos                                                                                                   " +TotalA);
			System.out.println("");
			System.out.println("Pasivos");
			System.out.println("Pasivos de Corto Plazo");
			System.out.println("Proveedores                                                                             " +PCP[1]);
			System.out.println("Acreedores                                                                              " +PCP[2]);
			System.out.println("Documentos por Pagar a Corto Plazo                                                      " +PCP[3]);
			System.out.println("Acreedores Bancarios                                                                    " +PCP[4]);
			System.out.println("Anticipo de Clientes                                                                    " +PCP[5]);
			System.out.println("Dividendos por Pagar                                                                    " +PCP[6]);
			System.out.println("Gastos Acumulados por Pagar                                                             " +PCP[7]);
			System.out.println("IVA Causado                                                                             " +PCP[8]);
			System.out.println("IVA Pendiente de Causar                                                                 " +PCP[9]);
			System.out.println("Impuestos y Derechos por Pagar                                                          " +PCP[10]);
			System.out.println("Impuestos y Derechos Retenidos por Enterar                                              " +PCP[11]);
			System.out.println("Impuestos sobre la Renta (ISR) por Pagar                                                " +PCP[12]);
			System.out.println("Participación de los Trabajadores en las Utilidades                                     " +PCP[13]);
			System.out.println("Rentas Cobradas por Anticipado                                                          " +PCP[14]);
			System.out.println("Intereses Cobrados por Anticipado                                                       " +PCP[15]);
			System.out.println("Total Pasivos de Corto Plazo                                                                        " +Resp4);
			System.out.println("");
			System.out.println("Pasivos a Largo Plazo");
			System.out.println("Acreedores Hipotecarios                                                                 " +PLP[1]);
			System.out.println("Acreedores Bancarios                                                                    " +PLP[2]);
			System.out.println("Documentos por Pagar a Largo Plazo                                                      " +PLP[3]);
			System.out.println("Obligaciones en Circulación                                                             " +PLP[4]);
			System.out.println("Rentas Cobradas por Anticipado a Largo Plazo                                            " +PLP[5]);
			System.out.println("Intereses Cobrados por Anticipado a Largo Plazo                                         " +PLP[6]);
			System.out.println("Total Pasivos de Corto Plazo                                                                        " +Resp5);
			System.out.println("Total Pasivos                                                                                                   " +TotalP);
			System.out.println("");
			System.out.println("Capital Contable");
			System.out.println("Capital Contribuido");
			System.out.println("Capital Social                                                                          " +CC[1]);
			System.out.println("Aportaciones para Futuros Aumentos de Capital                                           " +CC[2]);
			System.out.println("Primas en Ventas de Acciones                                                            " +CC[3]);
			System.out.println("Total Capital Contribuido                                                                           " +Resp6);
			System.out.println("");
			System.out.println("Capital Ganado");
			System.out.println("Utilidades Integrales Acumuladas                                                        " +CG[1]);
			System.out.println("Pérdidas Integrales Acumuladas                                                          " +CG[2]);
			System.out.println("Reservas                                                                                " +CG[3]);
			System.out.println("Total Capital Ganado                                                                                " +Resp7);
			System.out.println("Total Capital Contable                                                                                          " +TotalC);
		
			Compr = TotalP + TotalC;
			System.out.println("-----Comprobacion-----");
			System.out.println("El total del activo " +TotalA + " debe ser igual a la suma del pasivo mas capital " +Compr);
			System.out.println();
			System.out.println();
			
			do {
				try {
				 Continuar = false;
			System.out.println("¿Desea ordenar las sub-clasificiones de las cuentas");
			System.out.println("1. Si");
			System.out.println("2. No");
			Respuesta = sc.nextInt();
			while (Respuesta <= 0|| Respuesta >= 3) {
				System.out.println("Usted ha ingresado una opcion invalida, favor de ingresar un dato valido");
				System.out.print("Monto: C$");
				Respuesta = sc.nextInt();
			}
				} catch (InputMismatchException ex) {
		            System.out.println("No puede introducir caracteres y/o caracteres especiales ni numeros decimales.");
		            	  sc.next();
		            	  System.out.println();
		            	  Continuar = true;
				}
				} while (Continuar);
			
			switch(Respuesta) {
			case 1:
				do {
					try {
					 Continuar = false;
				System.out.println("¿Que sub-clasificacion desea ordenar?");
				System.out.println("1. Activos Circulantes");
				System.out.println("2. Ativos Fijos");
				System.out.println("3. Activos Intangibles");
				System.out.println("4. Pasivos a Corto Plazo");
				System.out.println("5. Pasivos a Largo Plazo");
				System.out.println("6. Capital Contribuido");
				System.out.println("7. Capital Ganado");
				System.out.print("Opcion: ");
				Respuesta1 = sc.nextInt();
				while (Respuesta1 <= 0|| Respuesta1 >= 8) {
					System.out.println("Usted ha ingresado una opcion invalida, favor de ingresar un dato valido");
					System.out.print("Monto: C$");
					Respuesta1 = sc.nextInt();
				}
					} catch (InputMismatchException ex) {
			            System.out.println("No puede introducir caracteres y/o caracteres especiales ni numeros decimales.");
			            	  sc.next();
			            	  System.out.println();
			            	  Continuar = true;
					}
					} while (Continuar);
				switch (Respuesta1) {
				case 1:
					sl.OrdenarACirculante();
					break;
				case 2:
					sl.OrdenarAFijo();
					break;
				case 3:
					sl.OrdenarAIntangible();
					break;
				case 4:
					sl.OrdenarPCP();
					break;
				case 5:
				sl.OrdenarPLP();
				break;
				case 6:
					sl.OrdenarCC();
					break;
				case 7:
					sl.OrdenarCG();
				}
				break;
			case 2:
				break;
			}
		}
		
		public void CalcularEstadoResultado() {
			File File = new File("EstadoR.txt");
			if(!File.exists()) {
				try {
					File.createNewFile();
					System.out.println(File.getName() +" fue creado correctamente");
				
				}catch (IOException ex) {
					System.out.println("El "+File.getName() +"no fue encontrado");
				}		
		}else {
				try {
					PrintWriter pw = new PrintWriter(File, "utf-8");
					pw.println("Estado de Resultado");
					pw.println("");
					pw.println("El Estado de Pérdida y Ganacia, también conocido como Estado de Resultado, es un documento contable que muestra detallada y ordenadamente la Utilidad o Pérdida del ejercicio.");
					pw.close();
				}catch (IOException ex) {	
				}
		}
			
			String UtilidadBruta []= new String[10];
			UtilidadBruta [0] = "";
			UtilidadBruta [1] = "Ventas Totales";
			UtilidadBruta [2] = "Dev. sobre Ventas";
			UtilidadBruta [3] = "Desc. sobre Ventas";
			UtilidadBruta [4] = "Compras";
			UtilidadBruta [5] = "Gastos de Compra";
			UtilidadBruta [6] = "Dev. sobre Compras";
			UtilidadBruta [7] = "Desc. sobre Compras";
			UtilidadBruta [8] = "Inventario Inicial";
			UtilidadBruta [9] = "Inventario Final";
			
			String GastosVenta []= new String[13];
			GastosVenta [0] = "";
			GastosVenta [1] = "Sueldo de los jefes";
			GastosVenta [2] = "Sueldo de los empleados de almacen";
			GastosVenta [3] = "Sueldo de los vendedores de planta";
			GastosVenta [4] = "Sueldo de los choferes del equipo de entrega";
			GastosVenta [5] = "Comisiones de agentes y dependientes";
			GastosVenta [6] = "Seguro social del personal del Dpto. de ventas";
			GastosVenta [7] = "Propaganda";
			GastosVenta [8] = "Consumo de etiquetas, envolturas y empaques";
			GastosVenta [9] = "Fletes y acarreos de las mercancías vendidas";
			GastosVenta [10] = "Gastos de mantenimiento del equipo de reparto.";
			GastosVenta [11] = "Pago de servicios basicos del Dpto. de ventas";
			GastosVenta [12] = "Otros gastos relacionados con la operacion de venta";
			
			String GastosAdmin []= new String[9];
			GastosAdmin [0] = "";
			GastosAdmin [1] = "Sueldo del gerente";
			GastosAdmin [2] = "Sueldo del subgerente";
			GastosAdmin [3] = "Sueldo de contador";
			GastosAdmin [4] = "Sueldo de personal de oficina";
			GastosAdmin [5] = "Seguro social del Dpto. de Administracion";
			GastosAdmin [6] = "Consumo de papeleria y utiles de escritorio";
			GastosAdmin [7] = "Gastos de correo y telegrafo";
			GastosAdmin [8] = "Pago de servicios basicos del Dpto. de Administracion";
			
			String GastosFinancieros []= new String[5];
			GastosFinancieros [0] = "";
			GastosFinancieros [1] = "Intereses pagados";
			GastosFinancieros [2] = "Intereses bancarios por pagar";
			GastosFinancieros [3] = "Gastos de situacion";
			GastosFinancieros [4] = "Cambio pagado";
			
			String ProductosFinancieros []= new String[4];
			ProductosFinancieros [0] = "";
			ProductosFinancieros [1] = "Descuentos por pago anticipado";
			ProductosFinancieros [2] = "Intereses cobrados";
			ProductosFinancieros [3] = "Cambio ganado";
			
			String OtrosGastos []= new String[3];
			OtrosGastos [0] = "";
			OtrosGastos [1] = "Perdida en venta de mobiliario";
			OtrosGastos [2] = "Perdida en venta y valores";
			
			String OtrosProductos []= new String[5];
			OtrosProductos [0] = "";
			OtrosProductos [1] = "Comisiones cobradas";
			OtrosProductos [2] = "Dividendos cobrados";
			OtrosProductos [3] = "Utilidad en venta y valores de activo fijo";
			OtrosProductos [4] = "Utilidad en compraventa de acciones y valores";
			
			System.out.println("Ingrese el nombre de su empresa");
			System.out.print("Nombre: ");
			NombreEmpresa = sc.next();
			System.out.println();
			System.out.println();
			
			System.out.println("A continuacion se le pedira los montos de compra y venta");
			System.out.println();
			for(int i = 1; i < UtilidadBruta.length; i++) {
				do {
					try {
						Continuar = false;
				System.out.println("Ingrese el monto total en cordobas de " + UtilidadBruta[i]);
				System.out.print("Monto: C$");
				Montos[i] =  sc.nextDouble();
				while (Montos[i] < 0) {
					System.out.println("Usted no puede ingresar digitos menores a 0");
					System.out.print("Monto: C$");
					  Montos[i]= sc.nextDouble();
				}
					} catch (InputMismatchException ex) {
			            System.out.println("No puede introducir caracteres y/o caracteres especiales.");
			            	  sc.next();
			            	  System.out.println();
			            	  Continuar = true;
					}
					} while (Continuar);
			}
			VentasNetas = Montos[1] - (Montos[2] + Montos[3]);
			ComprasTotales = Montos[4] + Montos[5];
			ComprasNetas = ComprasTotales - (Montos[6] + Montos[7]);
			TotalMercancia = Montos[8] + ComprasNetas;
			CostoVendido = TotalMercancia + Montos[9];
			UtilidadVentas = VentasNetas - CostoVendido;
			System.out.println("El monto total de las ventas netas es: C$" +VentasNetas);
			System.out.println("El monto total de las compras totales es: C$" +ComprasTotales);
			System.out.println("El monto total de las compras netas es: C$" +ComprasNetas);
			System.out.println("El monto total del total de mercancia: C$" +TotalMercancia);
			System.out.println("El monto total del costo de lo vendido es: C$" +CostoVendido);
			System.out.println("El monto total de la utilidad en ventas o utilidad bruta es: C$" +UtilidadVentas);
			System.out.println();
			System.out.println();
			
			System.out.println("A continuacion se le pedira los montos de los gastos de venta");
			System.out.println();
			for(int i = 1; i < GastosVenta.length; i++) {
				do {
					try {
						Continuar = false;
				System.out.println("Ingrese el monto total en cordobas de " + GastosVenta[i]);
				System.out.print("Monto: C$ ");
				Montos1[i] =  sc.nextDouble();
				while (Montos1[i] < 0) {
					System.out.println("Usted no puede ingresar digitos menores a 0");
					System.out.print("Monto: C$ ");
					  Montos1[i]= sc.nextDouble();
				}
					} catch (InputMismatchException ex) {
			            System.out.println("No puede introducir caracteres y/o caracteres especiales.");
			            	  sc.next();
			            	  System.out.println();
			            	  Continuar = true;
					}
					} while (Continuar);
			}
			for(int i = 1; i < GastosVenta.length; i++) {
				Total1 += Montos1[i];
			}
			System.out.println("El total de los gastos de venta es: C$" +Total1);
			System.out.println();
			System.out.println();
			
			System.out.println("A continuacion se le pedira los montos de los gastos de administracion");
			System.out.println();
			for(int i = 1; i < GastosAdmin.length; i++) {
				do {
					try {
						Continuar = false;
				System.out.println("Ingrese el monto total en cordobas de " + GastosAdmin[i]);
				System.out.print("Monto: C$");
				Montos2[i] =  sc.nextDouble();
				while (Montos2[i] < 0) {
					System.out.println("Usted no puede ingresar digitos menores a 0");
					System.out.print("Monto: C$");
					  Montos2[i]=sc.nextDouble();
				}
					} catch (InputMismatchException ex) {
			            System.out.println("No puede introducir caracteres y/o caracteres especiales.");
			            	  sc.next();
			            	  System.out.println();
			            	  Continuar = true;
					}
					} while (Continuar);
			}
			for(int i = 1; i < GastosAdmin.length; i++) {
				Total2 += Montos2[i];
			}
			System.out.println("El total de los gastos administrativos es: C$" +Total2);
			System.out.println();
			System.out.println();
			
			System.out.println("A continuacion se le pedira los montos de los gastos financieros");
			System.out.println();
			for(int i = 1; i < GastosFinancieros.length; i++) {
				do {
					try {
						Continuar = false;
				System.out.println("Ingrese el monto total en cordobas de " + GastosFinancieros[i]);
				System.out.print("Monto: C$");
				Montos3[i] =  sc.nextDouble();
				while (Montos3[i] <= 0) {
					System.out.println("Usted no puede ingresar digitos menores a 0");
					System.out.print("Monto: C$");
					  Montos3[i]=sc.nextDouble();
				}
					} catch (InputMismatchException ex) {
			            System.out.println("No puede introducir caracteres y/o caracteres especiales.");
			            	  sc.next();
			            	  System.out.println();
			            	  Continuar = true;
					}
					} while (Continuar);
			}
			for(int i = 1; i < GastosFinancieros.length; i++) {
				Total3 += Montos3[i];
			}
			System.out.println("El total de los gastos financieros es: C$" +Total3);
			System.out.println();
			System.out.println();
			
			System.out.println("A continuacion se le pedira los montos de los productos financieros");
			System.out.println();
			for(int i = 1; i < ProductosFinancieros.length; i++) {
				do {
					try {
						Continuar = false;
				System.out.println("Ingrese el monto total en cordobas de " + ProductosFinancieros[i]);
				System.out.print("Monto: C$");
				Montos4[i] =  sc.nextDouble();
				while (Montos4[i] <= 0) {
					System.out.println("Usted no puede ingresar digitos menores a 0");
					System.out.print("Monto: C$");
					  Montos4[i]=sc.nextDouble();
				}
					} catch (InputMismatchException ex) {
			            System.out.println("No puede introducir caracteres y/o caracteres especiales.");
			            	  sc.next();
			            	  System.out.println();
			            	  Continuar = true;
					}
					} while (Continuar);
			}
			for(int i = 1; i < ProductosFinancieros.length; i++) {
				Total4 += Montos4[i];
			}
			System.out.println("El monto total de los productos financieros es: C$" +Total4);
			System.out.println();
			System.out.println();
			
			System.out.println("A continuacion se le pedira los montos de los otros gastos financieros");
			System.out.println();
			for(int i = 1; i < OtrosGastos.length; i++) {
				do {
					try {
						Continuar = false;
				System.out.println("Ingrese el monto total en cordobas de " + OtrosGastos[i]);
				System.out.print("Monto: C$");
				Montos5[i] =  sc.nextDouble();
				while (Montos5[i] <= 0) {
					System.out.println("Usted no puede ingresar digitos menores a 0");
					System.out.print("Monto: C$");
					  Montos5[i]=sc.nextDouble();
				}
					} catch (InputMismatchException ex) {
			            System.out.println("No puede introducir caracteres y/o caracteres especiales.");
			            	  sc.next();
			            	  System.out.println();
			            	  Continuar = true;
					}
					} while (Continuar);
			}
			for(int i = 1; i < OtrosGastos.length; i++) {
				Total5 += Montos5[i];
			}
			System.out.println("El total de los otros gastos financieros es: C$" +Total5);
			System.out.println();
			System.out.println();
			
			System.out.println("A continuacion se le pedira los montos de los otros productos financieros");
			System.out.println();
			for(int i = 1; i < OtrosProductos.length; i++) {
				do {
					try {
						Continuar = false;
				System.out.println("Ingrese el monto total en cordobas de " + OtrosProductos[i]);
				System.out.print("Monto: C$");
				Montos6[i] =  sc.nextDouble();
				while (Montos6[i] <= 0) {
					System.out.println("Usted no puede ingresar digitos menores a 0");
					System.out.print("Monto: C$");
					  Montos6[i]=sc.nextDouble();
				}
					} catch (InputMismatchException ex) {
			            System.out.println("No puede introducir caracteres y/o caracteres especiales.");
			            	  sc.next();
			            	  System.out.println();
			            	  Continuar = true;
					}
					} while (Continuar);
			}
			for(int i = 1; i < OtrosProductos.length; i++) {
				Total6 += Montos6[i];
			}
			System.out.println("El total de los otros productos financieros es: C$" +Total6);
			System.out.println();
			System.out.println();
			
			GastosO = Total1+ Total2;
			Utilidad = Total4 - Total3;
			Perdida = Total3 - Total4;
			Utilidad1 = Total6 - Total5;
			Perdida1 = Total5 - Total6;
			GastosO1 = GastosO - Utilidad;
			GastosO2 = GastosO + Perdida;
			System.out.println("---------------------------"+NombreEmpresa+"-----------------------------");
			System.out.println  ("-------------------------Estado de Resultado----------------------");
			System.out.println("                                                                           |     1     |     2     |     3     |     4     |");
			System.out.println("Ventas Totales                                                                                      " +Montos[1]  );
			System.out.println("Dev. sobre ventas                                                                       " +Montos[2]  );
			System.out.println("Desc. sobre ventas                                                                      " +Montos[3]+"\t    "+(Montos[2]+Montos[3]));
			System.out.println("Ventas netas                                                                                                    " +VentasNetas);
			System.out.println("Inventario inicial                                                                                  " +Montos[8]);
			System.out.println("Compras                                                                     " +Montos[4]);
			System.out.println("Gastos de compra                                                            " +Montos[5]);
			System.out.println("Compras totales                                                                         " +ComprasTotales);
			System.out.println("Dev. sobre compras                                                          " +Montos[6]);
			System.out.println("Desc. sobre compras                                                         " +Montos[7]+"\t"+(Montos[6]+Montos[7]));
			System.out.println("Compras netas                                                                                       " +ComprasNetas);
			System.out.println("Total de mercancia                                                                                  " +TotalMercancia);
			System.out.println("Inventario final                                                                                    " +Montos[9]);
			System.out.println("Costo de lo vendido                                                                                             " +CostoVendido);
			if(UtilidadVentas <= 0) {
			System.out.println("Perdida bruta                                                                                                   " +UtilidadVentas);
			} else {
			System.out.println("Utilidad bruta                                                                                                  " +UtilidadVentas);
			}
			System.out.println(   "Gastos de operacion");
			System.out.println("-----Gastos de Venta-----");
			System.out.println("Sueldo de los jefes                                                         " +Montos1[1]);
			System.out.println("Sueldo de los empleados de almacen                                          " +Montos1[2]);
			System.out.println("Sueldo de los vendedores de planta                                          " +Montos1[3]);
			System.out.println("Sueldo de los choferes del equipo de entrega                                " +Montos1[4]);
			System.out.println("Comisiones de agentes y dependientes                                        " +Montos1[5]);
			System.out.println("Seguro social del personal del Dpto. de ventas                              " +Montos1[6]);
			System.out.println("Propaganda                                                                  " +Montos1[7]);
			System.out.println("Consumo de etiquetas, envolturas y empaques                                 " +Montos1[8]);
			System.out.println("Fletes y acarreos de las mercancías vendidas                                " +Montos1[9]);
			System.out.println("Gastos de mantenimiento del equipo de reparto                               " +Montos1[10]);
			System.out.println("Pago de servicios basicos del Dpto. de ventas                               " +Montos1[11]);
			System.out.println("Otros gastos relacionados con la operacion de venta                         " +Montos1[12] +"\t        "+Total1);
			System.out.println("-----Gastos Administrativos-----");
			System.out.println("Sueldo del gerente                                                          " +Montos2[1]);
			System.out.println("Sueldo del subgerente                                                       " +Montos2[2]);
			System.out.println("Sueldo de contador                                                          " +Montos2[3]);
			System.out.println("Sueldo de personal de oficina                                               " +Montos2[4]);
			System.out.println("Seguro social del Dpto. de Administracion                                   " +Montos2[5]);
			System.out.println("Consumo de papeleria y utiles de escritorio                                 " +Montos2[6]);
			System.out.println("Gastos de correo y telegrafo                                                " +Montos2[7]);
			System.out.println("Pago de servicios basicos del Dpto. de Administracion                       " +Montos2[8] +"\t       "+Total2 +"\t     "+GastosO);
			if(Total3 < Total4) {
			System.out.println("-----Produtos Financieros-----");
			System.out.println("Descuentos por pago anticipado                                              " +Montos4[1]);
			System.out.println("Intereses cobrados                                                          " +Montos4[2]);
			System.out.println("Cambio ganado                                                               " +Montos4[3] +"\t        "+Total4);
			System.out.println("-----Gastos Financieros-----");
			System.out.println("Intereses pagados                                                           " +Montos3[1]);
			System.out.println("Intereses bancarios por pagar                                               " +Montos3[2]);
			System.out.println("Gastos de situacion                                                         " +Montos3[3]);
			System.out.println("Cambio pagado                                                               " +Montos3[4] +"\t       "+Total3 +"\t   "+Utilidad + "\t         "+GastosO1);
			if(UtilidadVentas <= 0) {
			UtilidadO1 = UtilidadVentas + GastosO1;
			if (UtilidadO1 <= 0) {
			System.out.println("Perdida Operacional                                                                                             " +UtilidadO1);
			if(Total5 < Total6) {
				System.out.println("-----Otros Productos-----");
				System.out.println("Comisiones cobradas                                                         " +Montos6[1]);
				System.out.println("Dividendos cobrados                                                         " +Montos6[2]);
				System.out.println("Utilidad en venta y valores de activo fijo                                  " +Montos6[3]);
				System.out.println("Utilidad en compraventa de acciones y valores                               " +Montos6[4] +"\t       "+Total6);
				System.out.println("-----Otros Gastos-----");
				System.out.println("Perdida en venta de mobiliario                                              " +Montos5[1]);
				System.out.println("Perdida en venta y valores                                                  " +Montos5[2] +"\t       "+Total5);
				System.out.println("Utilidad entre otros gastos y otros productos                                                                  " +Utilidad1);
				PerdidaEjer = UtilidadO1 + Utilidad1;
				if(PerdidaEjer <= 0) {
				System.out.println("Perdida del ejercicio                                                                                          " +PerdidaEjer);
				} else {
				System.out.println("Utilidad antes de impuestos                                                                                    " +PerdidaEjer);
				ISR = PerdidaEjer * 30/100;
				System.out.println("ISR 30%                                                                                            " +ISR);
				UtilidadEjer1 = PerdidaEjer - ISR;
				System.out.println("Utilidad neta del ejercicio                                                                                    " +UtilidadEjer1);
				}
				} else {
				System.out.println("-----Otros Gastos-----");
				System.out.println("Perdida en venta de mobiliario                                              " +Montos5[1]);
				System.out.println("Perdida en venta y valores                                                  " +Montos5[2] +"\t       "+Total5);
				System.out.println("-----Otros Productos-----");
				System.out.println("Comisiones cobradas                                                         " +Montos6[1]);
				System.out.println("Dividendos cobrados                                                         " +Montos6[2]);
				System.out.println("Utilidad en venta y valores de activo fijo                                  " +Montos6[3]);
				System.out.println("Utilidad en compraventa de acciones y valores                               " +Montos6[4] +"\t       "+Total6);
				System.out.println("Perdida entre otros gastos y otros productos                                                                   " +Perdida1);
				PerdidaEjer = UtilidadO1 + Perdida1;
				System.out.println("Perdida del ejercicio                                                                                          " +PerdidaEjer);
				}
			} 
			
			else {
			System.out.println("Utilidad Operacional                                                                                           " +UtilidadO1);
			if(Total5 < Total6) {
				System.out.println("-----Otros Productos-----");
				System.out.println("Comisiones cobradas                                                         " +Montos6[1]);
				System.out.println("Dividendos cobrados                                                         " +Montos6[2]);
				System.out.println("Utilidad en venta y valores de activo fijo                                  " +Montos6[3]);
				System.out.println("Utilidad en compraventa de acciones y valores                               " +Montos6[4] +"\t       "+Total6);
				System.out.println("-----Otros Gastos-----");
				System.out.println("Perdida en venta de mobiliario                                              " +Montos5[1]);
				System.out.println("Perdida en venta y valores                                                  " +Montos5[2] +"\t       "+Total5);
				System.out.println("Utilidad entre otros gastos y otros productos                                                                  " +Utilidad1);
				UtilidadEjer = UtilidadO1 + Utilidad1;
				System.out.println("Utilidad antes de impuestos                                                                                    " +UtilidadEjer);
				ISR1 = UtilidadEjer * 30/100;
				System.out.println("ISR 30%                                                                                            " +ISR1);
				UtilidadEjer2 = UtilidadEjer - ISR1;
				System.out.println("Utilidad del ejercicio                                                                                         " +UtilidadEjer2);
				} else {
				System.out.println("-----Otros Gastos-----");
				System.out.println("Perdida en venta de mobiliario                                              " +Montos5[1]);
				System.out.println("Perdida en venta y valores                                                  " +Montos5[2] +"\t       "+Total5);
				System.out.println("-----Otros Productos-----");
				System.out.println("Comisiones cobradas                                                         " +Montos6[1]);
				System.out.println("Dividendos cobrados                                                         " +Montos6[2]);
				System.out.println("Utilidad en venta y valores de activo fijo                                  " +Montos6[3]);
				System.out.println("Utilidad en compraventa de acciones y valores                               " +Montos6[4] +"\t       "+Total6);
				System.out.println("Perdida entre otros gastos y otros productos                                                                   " +Perdida1);
				UtilidadEjer3 = UtilidadO1 - Perdida1;
				if (UtilidadEjer3 <= 0) {
				System.out.println("Perdida del ejercicio                                                                                          " +UtilidadEjer3);
				} else {
				System.out.println("Utilidad antes de impuestos                                                                                    " +UtilidadEjer3);
				ISR2 = UtilidadEjer3 * 30/100;
				System.out.println("ISR 30%                                                                                            " +ISR2);
				UtilidadEjer4 = UtilidadEjer3 - ISR2;
				System.out.println("Utilidad del ejercicio                                                                                         " +UtilidadEjer4);
							}
						}  
			}
			
			} else {
			UtilidadO1 = UtilidadVentas - GastosO1;
			if (UtilidadO1 <= 0) {
			System.out.println("Perdida Operacional                                                                                             " +UtilidadO1);
			if(Total5 < Total6) {
				System.out.println("-----Otros Productos-----");
				System.out.println("Comisiones cobradas                                                         " +Montos6[1]);
				System.out.println("Dividendos cobrados                                                         " +Montos6[2]);
				System.out.println("Utilidad en venta y valores de activo fijo                                  " +Montos6[3]);
				System.out.println("Utilidad en compraventa de acciones y valores                               " +Montos6[4] +"\t       "+Total6);
				System.out.println("-----Otros Gastos-----");
				System.out.println("Perdida en venta de mobiliario                                              " +Montos5[1]);
				System.out.println("Perdida en venta y valores                                                  " +Montos5[2] +"\t       "+Total5);
				System.out.println("Utilidad entre otros gastos y otros productos                                                                  " +Utilidad1);
					PerdidaEjer = UtilidadO1 + Utilidad1;
					if(PerdidaEjer <= 0) {
				System.out.println("Perdida del ejercicio                                                                                          " +PerdidaEjer);
					} else {
				System.out.println("Utilidad antes de impuestos                                                                                    " +PerdidaEjer);
					ISR = PerdidaEjer * 30/100;
				System.out.println("ISR 30%                                                                                            " +ISR);
					UtilidadEjer1 = PerdidaEjer - ISR;
				System.out.println("Utilidad neta del ejercicio                                                                                    " +UtilidadEjer1);
					}
					} else {
				System.out.println("-----Otros Gastos-----");
				System.out.println("Perdida en venta de mobiliario                                              " +Montos5[1]);
				System.out.println("Perdida en venta y valores                                                  " +Montos5[2] +"\t       "+Total5);
				System.out.println("-----Otros Productos-----");
				System.out.println("Comisiones cobradas                                                         " +Montos6[1]);
				System.out.println("Dividendos cobrados                                                         " +Montos6[2]);
				System.out.println("Utilidad en venta y valores de activo fijo                                  " +Montos6[3]);
				System.out.println("Utilidad en compraventa de acciones y valores                               " +Montos6[4] +"\t       "+Total6);
				System.out.println("Perdida entre otros gastos y otros productos                                                                   " +Perdida1);
					PerdidaEjer = UtilidadO1 + Perdida1;
				System.out.println("Perdida del ejercicio                                                                                          " +PerdidaEjer);
					}
			} else {
			System.out.println("Utilidad Operacional                                                                                            " +UtilidadO1);
			if(Total5 < Total6) {
				System.out.println("-----Otros Productos-----");
				System.out.println("Comisiones cobradas                                                         " +Montos6[1]);
				System.out.println("Dividendos cobrados                                                         " +Montos6[2]);
				System.out.println("Utilidad en venta y valores de activo fijo                                  " +Montos6[3]);
				System.out.println("Utilidad en compraventa de acciones y valores                               " +Montos6[4] +"\t       "+Total6);
				System.out.println("-----Otros Gastos-----");
				System.out.println("Perdida en venta de mobiliario                                              " +Montos5[1]);
				System.out.println("Perdida en venta y valores                                                  " +Montos5[2] +"\t       "+Total5);
				System.out.println("Utilidad entre otros gastos y otros productos                                                                  " +Utilidad1);
				UtilidadEjer = UtilidadO1 + Utilidad1;
				System.out.println("Utilidad antes de impuestos                                                                                    " +UtilidadEjer);
				ISR1 = UtilidadEjer * 30/100;
				System.out.println("ISR 30%                                                                                            " +ISR1);
				UtilidadEjer2 = UtilidadEjer - ISR1;
				System.out.println("Utilidad del ejercicio                                                                                         " +UtilidadEjer2);
				} else {
				System.out.println("-----Otros Gastos-----");
				System.out.println("Perdida en venta de mobiliario                                              " +Montos5[1]);
				System.out.println("Perdida en venta y valores                                                  " +Montos5[2] +"\t       "+Total5);
				System.out.println("-----Otros Productos-----");
				System.out.println("Comisiones cobradas                                                         " +Montos6[1]);
				System.out.println("Dividendos cobrados                                                         " +Montos6[2]);
				System.out.println("Utilidad en venta y valores de activo fijo                                  " +Montos6[3]);
				System.out.println("Utilidad en compraventa de acciones y valores                               " +Montos6[4] +"\t       "+Total6);
				System.out.println("Perdida entre otros gastos y otros productos                                                                   " +Perdida1);
				UtilidadEjer3 = UtilidadO1 - Perdida1;
				if (UtilidadEjer3 <= 0) {
				System.out.println("Perdida del ejercicio                                                                                          " +UtilidadEjer3);
				} else {
				System.out.println("Utilidad antes de impuestos                                                                                    " +UtilidadEjer3);
				ISR2 = UtilidadEjer3 * 30/100;
				System.out.println("ISR 30%                                                                                            " +ISR2);
				UtilidadEjer4 = UtilidadEjer3 - ISR2;
				System.out.println("Utilidad del ejercicio                                                                                         " +UtilidadEjer4);
							}
						}  
			}
			}
			} else {
			System.out.println("-----Gastos Financieros-----");
			System.out.println("Intereses pagados                                                           " +Montos3[1]);
			System.out.println("Intereses bancarios por pagar                                               " +Montos3[2]);
			System.out.println("Gastos de situacion                                                         " +Montos3[3]);
			System.out.println("Cambio pagado                                                               " +Montos3[4] +"\t         "+Total3);             
			System.out.println("-----Produtos Financieros-----");
			System.out.println("Descuentos por pago anticipado                                              " +Montos4[1]);
			System.out.println("Intereses cobrados                                                          " +Montos4[2]);
			System.out.println("Cambio ganado                                                               " +Montos4[3] +"\t"+Total4 +"\t         "+Perdida + "\t         "+GastosO2);
			if(UtilidadVentas <= 0) {
				UtilidadO2 = UtilidadVentas + GastosO2;
				if (UtilidadO1 <= 0) {
			System.out.println("Perdida Operacional                                                                                             " +UtilidadO2);
			if(Total5 < Total6) {
			System.out.println("-----Otros Productos-----");
			System.out.println("Comisiones cobradas                                                         " +Montos6[1]);
			System.out.println("Dividendos cobrados                                                         " +Montos6[2]);
			System.out.println("Utilidad en venta y valores de activo fijo                                  " +Montos6[3]);
			System.out.println("Utilidad en compraventa de acciones y valores                               " +Montos6[4] +"\t       "+Total6);
			System.out.println("-----Otros Gastos-----");
			System.out.println("Perdida en venta de mobiliario                                              " +Montos5[1]);
			System.out.println("Perdida en venta y valores                                                  " +Montos5[2] +"\t       "+Total5);
			System.out.println("Utilidad entre otros gastos y otros productos                                                                  " +Utilidad1);
					PerdidaEjer = UtilidadO2 + Utilidad1;
					if(PerdidaEjer <= 0) {
			System.out.println("Perdida del ejercicio                                                                                          " +PerdidaEjer);
				} else {
			System.out.println("Utilidad antes de impuestos                                                                                    " +PerdidaEjer);
					ISR = PerdidaEjer * 30/100;
			System.out.println("ISR 30%                                                                                            " +ISR);
					UtilidadEjer1 = PerdidaEjer - ISR;
			System.out.println("Utilidad neta del ejercicio                                                                                    " +UtilidadEjer1);
					}
					} else {
			System.out.println("-----Otros Gastos-----");
			System.out.println("Perdida en venta de mobiliario                                              " +Montos5[1]);
			System.out.println("Perdida en venta y valores                                                  " +Montos5[2] +"\t       "+Total5);
			System.out.println("-----Otros Productos-----");
			System.out.println("Comisiones cobradas                                                         " +Montos6[1]);
			System.out.println("Dividendos cobrados                                                         " +Montos6[2]);
			System.out.println("Utilidad en venta y valores de activo fijo                                  " +Montos6[3]);
			System.out.println("Utilidad en compraventa de acciones y valores                               " +Montos6[4] +"\t       "+Total6);
			System.out.println("Perdida entre otros gastos y otros productos                                                                   " +Perdida1);
					PerdidaEjer = UtilidadO2 + Perdida1;
			System.out.println("Perdida del ejercicio                                                                                          " +PerdidaEjer);
					}
				} else {
			System.out.println("Utilidad Operacional                                                                                            " +UtilidadO2);
			if(Total5 < Total6) {
				System.out.println("-----Otros Productos-----");
				System.out.println("Comisiones cobradas                                                         " +Montos6[1]);
				System.out.println("Dividendos cobrados                                                         " +Montos6[2]);
				System.out.println("Utilidad en venta y valores de activo fijo                                  " +Montos6[3]);
				System.out.println("Utilidad en compraventa de acciones y valores                               " +Montos6[4] +"\t       "+Total6);
				System.out.println("-----Otros Gastos-----");
				System.out.println("Perdida en venta de mobiliario                                              " +Montos5[1]);
				System.out.println("Perdida en venta y valores                                                  " +Montos5[2] +"\t       "+Total5);
				System.out.println("Utilidad entre otros gastos y otros productos                                                                  " +Utilidad1);
				UtilidadEjer = UtilidadO2 + Utilidad1;
				System.out.println("Utilidad antes de impuestos                                                                                    " +UtilidadEjer);
				ISR1 = UtilidadEjer * 30/100;
				System.out.println("ISR 30%                                                                                            " +ISR1);
				UtilidadEjer2 = UtilidadEjer - ISR1;
				System.out.println("Utilidad del ejercicio                                                                                         " +UtilidadEjer2);
				} else {
				System.out.println("-----Otros Gastos-----");
				System.out.println("Perdida en venta de mobiliario                                              " +Montos5[1]);
				System.out.println("Perdida en venta y valores                                                  " +Montos5[2] +"\t       "+Total5);
				System.out.println("-----Otros Productos-----");
				System.out.println("Comisiones cobradas                                                         " +Montos6[1]);
				System.out.println("Dividendos cobrados                                                         " +Montos6[2]);
				System.out.println("Utilidad en venta y valores de activo fijo                                  " +Montos6[3]);
				System.out.println("Utilidad en compraventa de acciones y valores                               " +Montos6[4] +"\t       "+Total6);
				System.out.println("Perdida entre otros gastos y otros productos                                                                   " +Perdida1);
				UtilidadEjer3 = UtilidadO2 - Perdida1;
				if (UtilidadEjer3 <= 0) {
				System.out.println("Perdida del ejercicio                                                                                          " +UtilidadEjer3);
				} else {
				System.out.println("Utilidad antes de impuestos                                                                                    " +UtilidadEjer3);
				ISR2 = UtilidadEjer3 * 30/100;
				System.out.println("ISR 30%                                                                                            " +ISR2);
				UtilidadEjer4 = UtilidadEjer3 - ISR2;
				System.out.println("Utilidad del ejercicio                                                                                         " +UtilidadEjer4);
							}
						}  
				}                                                                                    
				} else {
				UtilidadO2 = UtilidadVentas - GastosO2;
				if (UtilidadO2 <= 0) {
			System.out.println("Perdida Operacional                                                                                             " +UtilidadO2);
			if(Total5 < Total6) {
			System.out.println("-----Otros Productos-----");
			System.out.println("Comisiones cobradas                                                         " +Montos6[1]);
			System.out.println("Dividendos cobrados                                                         " +Montos6[2]);
			System.out.println("Utilidad en venta y valores de activo fijo                                  " +Montos6[3]);
			System.out.println("Utilidad en compraventa de acciones y valores                               " +Montos6[4] +"\t       "+Total6);
			System.out.println("-----Otros Gastos-----");
			System.out.println("Perdida en venta de mobiliario                                              " +Montos5[1]);
			System.out.println("Perdida en venta y valores                                                  " +Montos5[2] +"\t       "+Total5);
			System.out.println("Utilidad entre otros gastos y otros productos                                                                  " +Utilidad1);
					PerdidaEjer = UtilidadO2 + Utilidad1;
					if(PerdidaEjer <= 0) {
			System.out.println("Perdida del ejercicio                                                                                          " +PerdidaEjer);
					} else {
			System.out.println("Utilidad antes de impuestos                                                                                    " +PerdidaEjer);
					ISR = PerdidaEjer * 30/100;
			System.out.println("ISR 30%                                                                                            " +ISR);
					UtilidadEjer1 = PerdidaEjer - ISR;
			System.out.println("Utilidad neta del ejercicio                                                                                    " +UtilidadEjer1);
					}
					} else {
			System.out.println("-----Otros Gastos-----");
			System.out.println("Perdida en venta de mobiliario                                              " +Montos5[1]);
			System.out.println("Perdida en venta y valores                                                  " +Montos5[2] +"\t       "+Total5);
			System.out.println("-----Otros Productos-----");
			System.out.println("Comisiones cobradas                                                         " +Montos6[1]);
			System.out.println("Dividendos cobrados                                                         " +Montos6[2]);
			System.out.println("Utilidad en venta y valores de activo fijo                                  " +Montos6[3]);
			System.out.println("Utilidad en compraventa de acciones y valores                               " +Montos6[4] +"\t       "+Total6);
			System.out.println("Perdida entre otros gastos y otros productos                                                                   " +Perdida1);
					PerdidaEjer = UtilidadO2 + Perdida1;
			System.out.println("Perdida del ejercicio                                                                                          " +PerdidaEjer);
					}
				} else {
			System.out.println("Utilidad Operacional                                                                                            " +UtilidadO2);
			if(Total5 < Total6) {
				System.out.println("-----Otros Productos-----");
				System.out.println("Comisiones cobradas                                                         " +Montos6[1]);
				System.out.println("Dividendos cobrados                                                         " +Montos6[2]);
				System.out.println("Utilidad en venta y valores de activo fijo                                  " +Montos6[3]);
				System.out.println("Utilidad en compraventa de acciones y valores                               " +Montos6[4] +"\t       "+Total6);
				System.out.println("-----Otros Gastos-----");
				System.out.println("Perdida en venta de mobiliario                                              " +Montos5[1]);
				System.out.println("Perdida en venta y valores                                                  " +Montos5[2] +"\t       "+Total5);
				System.out.println("Utilidad entre otros gastos y otros productos                                                                  " +Utilidad1);
				UtilidadEjer = UtilidadO2 + Utilidad1;
				System.out.println("Utilidad antes de impuestos                                                                                    " +UtilidadEjer);
				ISR1 = UtilidadEjer * 30/100;
				System.out.println("ISR 30%                                                                                            " +ISR1);
				UtilidadEjer2 = UtilidadEjer - ISR1;
				System.out.println("Utilidad del ejercicio                                                                                         " +UtilidadEjer2);
				} else {
				System.out.println("-----Otros Gastos-----");
				System.out.println("Perdida en venta de mobiliario                                              " +Montos5[1]);
				System.out.println("Perdida en venta y valores                                                  " +Montos5[2] +"\t       "+Total5);
				System.out.println("-----Otros Productos-----");
				System.out.println("Comisiones cobradas                                                         " +Montos6[1]);
				System.out.println("Dividendos cobrados                                                         " +Montos6[2]);
				System.out.println("Utilidad en venta y valores de activo fijo                                  " +Montos6[3]);
				System.out.println("Utilidad en compraventa de acciones y valores                               " +Montos6[4] +"\t       "+Total6);
				System.out.println("Perdida entre otros gastos y otros productos                                                                   " +Perdida1);
				UtilidadEjer3 = UtilidadO2 - Perdida1;
				if (UtilidadEjer3 <= 0) {
				System.out.println("Perdida del ejercicio                                                                                          " +UtilidadEjer3);
				} else {
				System.out.println("Utilidad antes de impuestos                                                                                    " +UtilidadEjer3);
				ISR2 = UtilidadEjer3 * 30/100;
				System.out.println("ISR 30%                                                                                            " +ISR2);
				UtilidadEjer4 = UtilidadEjer3 - ISR2;
				System.out.println("Utilidad del ejercicio                                                                                         " +UtilidadEjer4);
							}
						}  
					}
				}
			}
		
			do {
				try {
				 Continuar = false;
			System.out.println("¿Desea ordenar las cuentas correspondientes a los gastos y productos financieros?");
			System.out.println("1. Si");
			System.out.println("2. No");
			Respuesta2 = sc.nextInt();
			while (Respuesta2 <= 0|| Respuesta2 >= 3) {
				System.out.println("Usted ha ingresado una opcion invalida, favor de ingresar un dato valido");
				System.out.print("Monto: C$");
				Respuesta2 = sc.nextInt();
			}
				} catch (InputMismatchException ex) {
		            System.out.println("No puede introducir caracteres y/o caracteres especiales ni numeros decimales.");
		            	  sc.next();
		            	  System.out.println();
		            	  Continuar = true;
				}
				} while (Continuar);
			
			switch(Respuesta2) {
			case 1:
				do {
					try {
					 Continuar = false;
				System.out.println("¿Que sub-clasificacion desea ordenar?");
				System.out.println("1. Gastos de Venta");
				System.out.println("2. Gastos Administrativos");
				System.out.println("3. Gastos Financieros");
				System.out.println("4. Productos Financieros");
				System.out.println("5. Otros Gastos Financieros");
				System.out.println("6. Otros Productos Financieros");
				System.out.print("Opcion: ");
				Respuesta3 = sc.nextInt();
				while (Respuesta3 <= 0|| Respuesta3 >= 7) {
					System.out.println("Usted ha ingresado una opcion invalida, favor de ingresar un dato valido");
					System.out.print("Monto: C$");
					Respuesta3 = sc.nextInt();
				}
					} catch (InputMismatchException ex) {
			            System.out.println("No puede introducir caracteres y/o caracteres especiales ni numeros decimales.");
			            	  sc.next();
			            	  System.out.println();
			            	  Continuar = true;
					}
					} while (Continuar);
				switch (Respuesta3) {
				case 1:
					sl.OrdenarGastosVenta();
					break;
				case 2:
					sl.OrdenarGastosAdmin();
					break;
				case 3:
					sl.OrdenarGastosFin();
					break;
				case 4:
					sl.OrdenarProductosFin();
					break;
				case 5:
					sl.OrdenarOtrosGastos();
					break;
				case 6:
					sl.OrdenarOtrosProductos();
					break;
				}
				break;
			case 2:
				break;
			}
			
		}
		
		public void CalcularVariacionCapital() {
			File File = new File("VariacionC.txt");
			if(!File.exists()) {
				try {
					File.createNewFile();
					System.out.println(File.getName() +" fue creado correctamente");
				
				}catch (IOException ex) {
					System.out.println("El "+File.getName() +"no fue encontrado");
				}		
		}else {
				try {
					PrintWriter pw = new PrintWriter(File, "utf-8");
					pw.println("Variación de Capital");
					pw.println("");
					pw.println("El Estado de Variación de Capital contable muestra los cambios en la inversión de los propietarios durante el periodo.");
					pw.close();
				}catch (IOException ex) {	
				}
		}
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
		
		public void ControlVentas_Compras(){
			double Compras = 0, GCompras = 0, Devoluciones = 0, Descuentos = 0, TotalC = 0, CNetas;
			double Ventas = 0, DevolucionesV = 0, DescuentosV = 0, VNetas;
			
			do {
				try {
					Continuar = false;
			System.out.println("Ingrese el saldo de su capital contable");
			System.out.print("Monto: C$");
			CapitalC = sc.nextDouble();
			while(CapitalC <= 0) {
				System.out.println("Usted no puede ingresar un numero igual o menor a 0");
				System.out.print("Monto: C$");
				CapitalC = sc.nextDouble();
			}
			} catch (InputMismatchException ex) {
	            System.out.println("No puede introducir caracteres y/o caracteres especiales.");
	            	  sc.next();
	            	  System.out.println();
	            	  Continuar = true;
			}
			} while (Continuar);
			
			do {
				try {
					Continuar = false;
			System.out.println("¿Con que desea trabajar?");
			System.out.println("1. Control de Compras");
			System.out.println("2. Control de Ventas");
			System.out.print("Opcion: ");
			Opcion3 = sc.nextInt();
			while(Opcion3 <= 0 || Opcion3 >= 3) {
				System.out.println("Usted ha ingresado una respuesta erronea, favor de ingresar una respuesta valida");
				System.out.print("Opcion: ");
				Opcion3 = sc.nextInt();
			}
			} catch (InputMismatchException ex) {
	            System.out.println("No puede introducir caracteres y/o caracteres especiales ni numeros decimales");
	            	  sc.next();
	            	  System.out.println();
	            	  Continuar = true;
			}
			} while (Continuar);
			
			switch(Opcion3) {
			case 1:
				File File = new File("ControlC.txt");
				if(!File.exists()) {
					try {
						File.createNewFile();
						System.out.println(File.getName() +" se creo");
					
					}catch (IOException ex) {
						System.out.println("El "+File.getName() +"no fue encontrado o no existe");
					}		
			}else {
					try {
						PrintWriter pw = new PrintWriter(File, "utf-8");
						pw.println("Control de las Compras");
						pw.println("");
						pw.println("El Control de Compras, sirve como un instrumento para ahorrar y a la vez mantener la calidad de los productos o servicios que la empresa ofrece.");
						pw.println("Es decir, establece el proceso de compra en conjunto con todos los departamentos que intervienen al momento de decidir y hacer una compra.");
						pw.close();
					}catch (IOException ex) {	
					}
			}
				do {
					try {
						Continuar = false;
				System.out.println("Ingrese el monto total en cordobas de sus Compras");
				System.out.print("Monto: C$");
				Compras = sc.nextDouble();
				while(Compras > CapitalC ) {
					System.out.println("Usted no puede realizar una compra mayor al de su capital contable");
					System.out.print("Monto: C$");
					Compras = sc.nextDouble();
					while(Compras <= 0) {
						System.out.println("Usted no puede ingresar un numero igual o menor a 0");
						System.out.print("Monto: C$");
						Compras = sc.nextDouble();
				}
				}
				while(Compras <= 0) {
					System.out.println("Usted no puede ingresar un numero igual o menor a 0");
					System.out.print("Monto: C$");
					Compras = sc.nextDouble();
					if (Compras > CapitalC ) {
						System.out.println("Usted no puede realizar una compra mayor al de su capital contable");
						System.out.print("Monto: C$");
						Compras = sc.nextDouble();
					}
				}
				} catch (InputMismatchException ex) {
		            System.out.println("No puede introducir caracteres y/o caracteres especiales.");
		            	  sc.next();
		            	  System.out.println();
		            	  Continuar = true;
				}
				} while (Continuar);
				
				do {
					try {
						Continuar = false;
				System.out.println("Ingrese el monto total en cordobas de los Gastos de Compras");
				System.out.print("Monto: C$");
				GCompras = sc.nextDouble();
				while(GCompras >= Compras) {
					System.out.println("El monto de los gastos de compra no puede ser igual o mayor al de las compras");
					System.out.print("Monto: C$");
					GCompras = sc.nextDouble();
					while(GCompras < 0) {
						System.out.println("Usted no puede ingresar un numero menor a 0");
						System.out.print("Monto: C$");
						GCompras = sc.nextDouble();
					}
				}
				while(GCompras < 0) {
					System.out.println("Usted no puede ingresar un numero menor a 0");
					System.out.print("Monto: C$");
					GCompras = sc.nextDouble();
					while(GCompras >= Compras) {
						System.out.println("El monto de los gastos de compra no puede ser igual o mayor al de las compras");
						System.out.print("Monto: C$");
						GCompras = sc.nextDouble();
					}
				}
				} catch (InputMismatchException ex) {
		            System.out.println("No puede introducir caracteres y/o caracteres especiales.");
		            	  sc.next();
		            	  System.out.println();
		            	  Continuar = true;
				}
				} while (Continuar);
				
				do {
					try {
						Continuar = false;
				System.out.println("Ingrese el monto total en cordobas de las Devoluciones sobre Compras");
				System.out.print("Monto: C$   ");
				Devoluciones = sc.nextDouble();
				while(Devoluciones >= Compras) {
					System.out.println("El monto de las dev. sobre compras no puede ser igual o mayor al de las compras");
					System.out.print("Monto: C$");
					Devoluciones = sc.nextDouble();
					while(Devoluciones < 0) {
						System.out.println("Usted no puede ingresar un numero menor a 0");
						System.out.print("Monto: C$");
						Devoluciones = sc.nextDouble();
					}
				}
				while(Devoluciones < 0) {
					System.out.println("Usted no puede ingresar un numero menor a 0");
					System.out.print("Monto: C$");
					Devoluciones = sc.nextDouble();
					while(Devoluciones >= Compras) {
						System.out.println("El monto de las dev. sobre compras no puede ser igual o mayor al de las compras");
						System.out.print("Monto: C$");
						Devoluciones = sc.nextDouble();
					}
				}
				} catch (InputMismatchException ex) {
		            System.out.println("No puede introducir caracteres y/o caracteres especiales .");
		            	  sc.next();
		            	  System.out.println();
		            	  Continuar = true;
				}
				} while (Continuar);
				
				do {
					try {
						Continuar = false;
				System.out.println("Ingrese el monto total en cordobas de los Descuentos sobre Compras");
				System.out.print("Monto: C$");
				Descuentos = sc.nextDouble();
				while(Descuentos >= Compras) {
					System.out.println("El monto de los desc. sobre compras no puede ser igual o mayor al de las compras");
					System.out.print("Monto: C$");
					Descuentos = sc.nextDouble();
					while(Descuentos < 0) {
						System.out.println("Usted no puede ingresar un numero menor a 0");
						System.out.print("Monto: C$");
						Descuentos = sc.nextDouble();
					}
				}
				while(Descuentos < 0) {
					System.out.println("Usted no puede ingresar un numero menor a 0");
					System.out.print("Monto: C$");
					Descuentos = sc.nextInt();
					while(Descuentos >= Compras) {
						System.out.println("El monto de los desc. sobre compras no puede ser igual o mayor al de las compras");
						System.out.print("Monto: C$");
						Descuentos = sc.nextDouble();
					}
				}
				} catch (InputMismatchException ex) {
		            System.out.println("No puede introducir caracteres y/o caracteres especiales ni numeros decimales.");
		            	  sc.next();
		            	  System.out.println();
		            	  Continuar = true;
				}
				} while (Continuar);
				
					System.out.println();
					System.out.println("-------Control de Compras---------");
					TotalC = Compras + GCompras;
					System.out.println("Sus Compras Totales son: C$" +TotalC);
					System.out.println();
					CNetas = TotalC - Descuentos - Devoluciones;
					System.out.println("Sus Compras Netas son: C$" +CNetas);
					ComprasT1 = CapitalC - CNetas;
					System.out.println("El saldo actual de su capital contable es: C$" +ComprasT1);
				
				break;
				
			case 2:
				
				File File1 = new File("ControlV.txt");
				if(!File1.exists()) {
					try {
						File1.createNewFile();
						System.out.println(File1.getName() +" se creo");
					
					}catch (IOException ex) {
						System.out.println("El "+File1.getName() +"no fue encontrado o no existe");
					}		
			}else {
					try {
						PrintWriter pw = new PrintWriter(File1, "utf-8");
						pw.println("Control de las Ventas");
						pw.println("");
						pw.println("El Control de Ventas alinea es una herramienta que ayuda a los gerentes a monitorear el desempeño del equipo, como la cantidad de oportunidades abiertas y de cierre de tratos.");
						pw.println("También puede ser utilizado por los líderes para monitorear el desempeño del equipo frente a los objetivos establecidos, ya sean individuales o colectivos.");
						pw.close();
					}catch (IOException ex) {	
					}
			}
				do {
					try {
						Continuar = false;
				System.out.println("Ingrese el monto total en cordobas de sus Ventas");
				System.out.print("Monto: C$");
				Ventas = sc.nextDouble();
				while(Ventas <= 0) {
					System.out.println("Usted no puede ingresar un numero menor a 0");
					System.out.print("Monto: C$");
					Ventas = sc.nextDouble();
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
				System.out.println("Ingrese el monto total en cordobas de las Devoluciones sobre Ventas");
				System.out.print("Monto: C$");
				DevolucionesV = sc.nextDouble();
				while(DevolucionesV >= Ventas) {
					System.out.println("El monto de las dev. sobre ventas no puede ser igual o mayor al de las ventas.");
					System.out.print("Monto: C$");
					DevolucionesV = sc.nextDouble();
					while(DevolucionesV < 0) {
						System.out.println("Usted no puede ingresar un numero menor a 0");
						System.out.print("Monto: C$");
						DevolucionesV = sc.nextDouble();
					}
				}
				while(DevolucionesV < 0) {
					System.out.println("Usted no puede ingresar un numero menor a 0");
					System.out.print("Monto: C$");
					DevolucionesV = sc.nextDouble();
					while(DevolucionesV >= Ventas) {
						System.out.println("El monto de las dev. sobre Ventas no puede ser igual o mayor al de las ventas.");
						System.out.print("Monto: C$");
						DevolucionesV = sc.nextDouble();
					}
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
				System.out.println("Ingrese el monto total en cordobas de los Descuentos sobre Ventas");
				System.out.print("Monto: C$   ");
				DescuentosV = sc.nextInt();
				while(DescuentosV >= Ventas) {
					System.out.println("El monto de los desc. sobre ventas no puede ser igual o mayor al de las ventas.");
					System.out.print("Monto: C$");
					DescuentosV = sc.nextDouble();
					while(DescuentosV < 0) {
						System.out.println("Usted no puede ingresar un numero menor a 0");
						System.out.print("Monto: C$");
						DescuentosV = sc.nextDouble();
					}
				}
				while(DescuentosV < 0) {
					System.out.println("Usted no puede ingresar un numero menor a 0");
					System.out.print("Monto: C$");
					DescuentosV = sc.nextDouble();
					while(DescuentosV >= Ventas) {
						System.out.println("El monto de los desc. sobre Ventas no puede ser igual o mayor al de las ventas.");
						System.out.print("Monto: C$");
						DescuentosV = sc.nextDouble();
					}
				}
				} catch (InputMismatchException ex) {
		            System.out.println("No puede introducir caracteres y/o caracteres especiales ni numeros decimales.");
		            	  sc.next();
		            	  System.out.println();
		            	  Continuar = true;
				}
				} while (Continuar);
				
					System.out.println();
					System.out.println("-------Control de Ventas---------");
					VNetas = Ventas - DescuentosV - DevolucionesV;
					System.out.println("Sus Ventas Netas son: C$  " +VNetas);
					VentasT1 = CapitalC + VNetas;
					System.out.println("El total de su capital contable es de: C$" +VentasT1);
				break;
			}
		}

		public void OrdenarACirculante() {
			for (int i =0 ; i < 22 ; i++) {
				for(int j=0 ; j < 22; j++) {
					if (ACirculante[j]> ACirculante[j+1]) {
						auxiliar = ACirculante[j];
						ACirculante[j]=ACirculante[j+1];
						ACirculante[j+1] = auxiliar;
					}
				}
			}
			do {
				try {
			System.out.println("Ordenar:");
			System.out.println("1. Ascendente");
			System.out.println("2. Descendente");
			opc = sc.nextInt();
			while(opc <= 0 || opc >= 3) {
				System.out.println("Usted ha ingresado una respuesta erronea, favor de ingresar una respuesta valida");
				System.out.print("Opcion: ");
				opc = sc.nextInt();
			}
				} catch (InputMismatchException ex) {
		            System.out.println("No puede introducir caracteres y/o caracteres especiales ni numeros decimales");
		            	  sc.next();
		            	  System.out.println();
		            	  Continuar = true;
				}
				} while (Continuar);

			
			if (opc ==1 ) {
				System.out.println("Ordenada de forma ascendente \n ");
				System.out.println("No. Montos \n");
				for (int i = 0 ; i<ACirculante.length ; i++) {
					System.out.println((i+1) + ". \t"+ACirculante[i]);
				}
				
			}if (opc == 2) {
				System.out.println("Ordenada de forma descendente \n ");
				System.out.println("No.  Montos \n");
				for (int i = ACirculante.length, j=1 ; i>=0 ; i--, j++) {
					System.out.println((j) + ". \t"+ACirculante[i]);
				}
			}
		}
			
		public void OrdenarAFijo() {
			for (int i =0 ; i < 16 ; i++) {
				for(int j=0 ; j < 16; j++) {
					if (AFijo[j]> AFijo[j+1]) {
						auxiliar = AFijo[j];
						AFijo[j]=AFijo[j+1];
						AFijo[j+1] = auxiliar;
					}
				}
			}
			do {
				try {
			System.out.println("Ordenar:");
			System.out.println("1. Ascendente");
			System.out.println("2. Descendente");
			System.out.print("Opcion: ");
			opc = sc.nextInt();
			while(opc <= 0 || opc >= 3) {
				System.out.println("Usted ha ingresado una respuesta erronea, favor de ingresar una respuesta valida");
				System.out.print("Opcion: ");
				opc = sc.nextInt();
			}
				} catch (InputMismatchException ex) {
		            System.out.println("No puede introducir caracteres y/o caracteres especiales ni numeros decimales");
		            	  sc.next();
		            	  System.out.println();
		            	  Continuar = true;
				}
				} while (Continuar);

			
			if (opc ==1 ) {
				System.out.println("Ordenada de forma ascendente \n ");
				System.out.println("No.  Montos \n");
				for (int i = 0 ; i<AFijo.length ; i++) {
					System.out.println((i+1) + ". \t"+AFijo[i]);
				}
				
			}if (opc == 2) {
				System.out.println("Ordenada de forma descendente \n ");
				System.out.println("No.  Montos \n");
				for (int i = AFijo.length, j=1 ; i>=0 ; i--, j++) {
					System.out.println((j) + ". \t"+AFijo[i]);
				}
			}
		}

		public void OrdenarAIntangible() {
			for (int i =0 ; i < 16 ; i++) {
				for(int j=0 ; j < 16; j++) {
					if (AIn[j]> AIn[j+1]) {
						auxiliar = AIn[j];
						AIn[j]=AIn[j+1];
						AIn[j+1] = auxiliar;
					}
				}
			}
			do {
				try {
			System.out.println("Ordenar:");
			System.out.println("1. Ascendente");
			System.out.println("2. Descendente");
			System.out.print("Opcion: ");
			opc = sc.nextInt();
			while(opc <= 0 || opc >= 3) {
				System.out.println("Usted ha ingresado una respuesta erronea, favor de ingresar una respuesta valida");
				System.out.print("Opcion: ");
				opc = sc.nextInt();
			}
				} catch (InputMismatchException ex) {
		            System.out.println("No puede introducir caracteres y/o caracteres especiales ni numeros decimales");
		            	  sc.next();
		            	  System.out.println();
		            	  Continuar = true;
				}
				} while (Continuar);

			
			if (opc ==1 ) {
				System.out.println("Ordenada de forma ascendente \n ");
				System.out.println("No.  Montos \n");
				for (int i = 0 ; i<AIn.length ; i++) {
					System.out.println((i+1) + ". \t"+AIn[i]);
				}
				
			}if (opc == 2) {
				System.out.println("Ordenada de forma descendente \n ");
				System.out.println("No.  Montos \n");
				for (int i = AIn.length, j=1 ; i>=0 ; i--, j++) {
					System.out.println((j) + ". \t"+AIn[i]);
				}
			}
		}

		public void OrdenarPCP() {
			for (int i =0 ; i < 14 ; i++) {
				for(int j=0 ; j < 14; j++) {
					if (PCP[j]> PCP[j+1]) {
						auxiliar = PCP[j];
						PCP[j]=PCP[j+1];
						PCP[j+1] = auxiliar;
					}
				}
			}
			do {
				try {
			System.out.println("Ordenar:");
			System.out.println("1. Ascendente");
			System.out.println("2. Descendente");
			System.out.print("Opcion: ");
			opc = sc.nextInt();
			while(opc <= 0 || opc >= 3) {
				System.out.println("Usted ha ingresado una respuesta erronea, favor de ingresar una respuesta valida");
				System.out.print("Opcion: ");
				opc = sc.nextInt();
			}
				} catch (InputMismatchException ex) {
		            System.out.println("No puede introducir caracteres y/o caracteres especiales ni numeros decimales");
		            	  sc.next();
		            	  System.out.println();
		            	  Continuar = true;
				}
				} while (Continuar);

			
			if (opc ==1 ) {
				System.out.println("Ordenada de forma ascendente \n ");
				System.out.println("No.  Montos \n");
				for (int i = 0 ; i<PCP.length ; i++) {
					System.out.println((i+1) + ". \t"+PCP[i]);
				}
				
			}if (opc == 2) {
				System.out.println("Ordenada de forma descendente \n ");
				System.out.println("No.  Montos \n");
				for (int i = PCP.length, j=1 ; i>=0 ; i--, j++) {
					System.out.println((j) + ". \t"+PCP[i]);
				}
			}
		}

		public void OrdenarPLP() {
			for (int i =0 ; i < 5 ; i++) {
				for(int j=0 ; j < 5; j++) {
					if (PLP[j]> PLP[j+1]) {
						auxiliar = PLP[j];
						PLP[j]=PLP[j+1];
						PLP[j+1] = auxiliar;
					}
				}
			}
			do {
				try {
			System.out.println("Ordenar:");
			System.out.println("1. Ascendente");
			System.out.println("2. Descendente");
			System.out.print("Opcion: ");
			opc = sc.nextInt();
			while(opc <= 0 || opc >= 3) {
				System.out.println("Usted ha ingresado una respuesta erronea, favor de ingresar una respuesta valida");
				System.out.print("Opcion: ");
				opc = sc.nextInt();
			}
				} catch (InputMismatchException ex) {
		            System.out.println("No puede introducir caracteres y/o caracteres especiales ni numeros decimales");
		            	  sc.next();
		            	  System.out.println();
		            	  Continuar = true;
				}
				} while (Continuar);

			
			if (opc ==1 ) {
				System.out.println("Ordenada de forma ascendente \n ");
				System.out.println("No.  Montos \n");
				for (int i = 0 ; i<PLP.length ; i++) {
					System.out.println((i+1) + ". \t"+PLP[i]);
				}
				
			}if (opc == 2) {
				System.out.println("Ordenada de forma descendente \n ");
				System.out.println("No.  Montos \n");
				for (int i = PLP.length, j=1 ; i>=0 ; i--, j++) {
					System.out.println((j) + ". \t"+PLP[i]);
				}
			}
		}

		public void OrdenarCC() {
			for (int i =0 ; i < 2 ; i++) {
				for(int j=0 ; j < 2; j++) {
					if (CC[j]> CC[j+1]) {
						auxiliar = CC[j];
						CC[j]=CC[j+1];
						CC[j+1] = auxiliar;
					}
				}
			}
			do {
				try {
			System.out.println("Ordenar:");
			System.out.println("1. Ascendente");
			System.out.println("2. Descendente");
			System.out.print("Opcion: ");
			opc = sc.nextInt();
			while(opc <= 0 || opc >= 3) {
				System.out.println("Usted ha ingresado una respuesta erronea, favor de ingresar una respuesta valida");
				System.out.print("Opcion: ");
				opc = sc.nextInt();
			}
				} catch (InputMismatchException ex) {
		            System.out.println("No puede introducir caracteres y/o caracteres especiales ni numeros decimales");
		            	  sc.next();
		            	  System.out.println();
		            	  Continuar = true;
				}
				} while (Continuar);

			
			if (opc ==1 ) {
				System.out.println("Ordenada de forma ascendente \n ");
				System.out.println("No.  Montos \n");
				for (int i = 0 ; i<CC.length ; i++) {
					System.out.println((i+1) + ". \t"+CC[i]);
				}
				
			}if (opc == 2) {
				System.out.println("Ordenada de forma descendente \n ");
				System.out.println("No.  Montos \n");
				for (int i = CC.length, j=1 ; i>=0 ; i--, j++) {
					System.out.println((j) + ". \t"+CC[i]);
				}
			}
		}

		public void OrdenarCG() {
			for (int i =0 ; i < 2 ; i++) {
				for(int j=0 ; j < 2; j++) {
					if (CG[j]> CG[j+1]) {
						auxiliar = CG[j];
						CG[j]=CG[j+1];
						CG[j+1] = auxiliar;
					}
				}
			}
			do {
				try {
			System.out.println("Ordenar:");
			System.out.println("1. Ascendente");
			System.out.println("2. Descendente");
			System.out.print("Opcion: ");
			opc = sc.nextInt();
			while(opc <= 0 || opc >= 3) {
				System.out.println("Usted ha ingresado una respuesta erronea, favor de ingresar una respuesta valida");
				System.out.print("Opcion: ");
				opc = sc.nextInt();
			}
				} catch (InputMismatchException ex) {
		            System.out.println("No puede introducir caracteres y/o caracteres especiales ni numeros decimales");
		            	  sc.next();
		            	  System.out.println();
		            	  Continuar = true;
				}
				} while (Continuar);

			
			if (opc ==1 ) {
				System.out.println("Ordenada de forma ascendente \n ");
				System.out.println("No.  Montos \n");
				for (int i = 0 ; i<CG.length ; i++) {
					System.out.println((i+1) + ". \t"+CG[i]);
				}
				
			}if (opc == 2) {
				System.out.println("Ordenada de forma descendente \n ");
				System.out.println("No.  Montos \n");
				for (int i = CG.length, j=1 ; i>=0 ; i--, j++) {
					System.out.println((j) + ". \t"+CG[i]);
				}
			}
		}

		public void OrdenarGastosVenta() {
			for (int i =0 ; i < 11 ; i++) {
				for(int j=0 ; j < 11; j++) {
					if (Montos1[j]> Montos1[j+1]) {
						auxiliar = Montos1[j];
						Montos1[j]=Montos1[j+1];
						Montos1[j+1] = auxiliar;
					}
				}
			}
			do {
				try {
			System.out.println("Ordenar:");
			System.out.println("1. Ascendente");
			System.out.println("2. Descendente");
			System.out.print("Opcion: ");
			opc = sc.nextInt();
			while(opc <= 0 || opc >= 3) {
				System.out.println("Usted ha ingresado una respuesta erronea, favor de ingresar una respuesta valida");
				System.out.print("Opcion: ");
				opc = sc.nextInt();
			}
				} catch (InputMismatchException ex) {
		            System.out.println("No puede introducir caracteres y/o caracteres especiales ni numeros decimales");
		            	  sc.next();
		            	  System.out.println();
		            	  Continuar = true;
				}
				} while (Continuar);

			
			if (opc ==1 ) {
				System.out.println("Ordenada de forma ascendente \n ");
				System.out.println("No.  Montos \n");
				for (int i = 0 ; i<Montos1.length ; i++) {
					System.out.println((i+1) + ". \t"+Montos1[i]);
				}
				
			}if (opc == 2) {
				System.out.println("Ordenada de forma descendente \n ");
				System.out.println("No.  Montos \n");
				for (int i = Montos1.length, j=1 ; i>=0 ; i--, j++) {
					System.out.println((j) + ". \t"+Montos1[i]);
				}
			}
		}

		public void OrdenarGastosAdmin() {
			for (int i =0 ; i < 7 ; i++) {
				for(int j=0 ; j < 7; j++) {
					if (Montos2[j]> Montos2[j+1]) {
						auxiliar = Montos2[j];
						Montos2[j]=Montos2[j+1];
						Montos2[j+1] = auxiliar;
					}
				}
			}
			do {
				try {
			System.out.println("Ordenar:");
			System.out.println("1. Ascendente");
			System.out.println("2. Descendente");
			System.out.print("Opcion: ");
			opc = sc.nextInt();
			while(opc <= 0 || opc >= 3) {
				System.out.println("Usted ha ingresado una respuesta erronea, favor de ingresar una respuesta valida");
				System.out.print("Opcion: ");
				opc = sc.nextInt();
			}
				} catch (InputMismatchException ex) {
		            System.out.println("No puede introducir caracteres y/o caracteres especiales ni numeros decimales");
		            	  sc.next();
		            	  System.out.println();
		            	  Continuar = true;
				}
				} while (Continuar);

			
			if (opc ==1 ) {
				System.out.println("Ordenada de forma ascendente \n ");
				System.out.println("No.  Montos \n");
				for (int i = 0 ; i<Montos2.length ; i++) {
					System.out.println((i+1) + ". \t"+Montos2[i]);
				}
				
			}if (opc == 2) {
				System.out.println("Ordenada de forma descendente \n ");
				System.out.println("No.  Montos \n");
				for (int i = Montos2.length, j=1 ; i>=0 ; i--, j++) {
					System.out.println((j) + ". \t"+Montos2[i]);
				}
			}
		}

		public void OrdenarGastosFin() {
			for (int i =0 ; i < 3 ; i++) {
				for(int j=0 ; j < 3; j++) {
					if (Montos3[j]> Montos3[j+1]) {
						auxiliar = Montos3[j];
						Montos3[j]=Montos3[j+1];
						Montos3[j+1] = auxiliar;
					}
				}
			}
			do {
				try {
			System.out.println("Ordenar:");
			System.out.println("1. Ascendente");
			System.out.println("2. Descendente");
			System.out.print("Opcion: ");
			opc = sc.nextInt();
			while(opc <= 0 || opc >= 3) {
				System.out.println("Usted ha ingresado una respuesta erronea, favor de ingresar una respuesta valida");
				System.out.print("Opcion: ");
				opc = sc.nextInt();
			}
				} catch (InputMismatchException ex) {
		            System.out.println("No puede introducir caracteres y/o caracteres especiales ni numeros decimales");
		            	  sc.next();
		            	  System.out.println();
		            	  Continuar = true;
				}
				} while (Continuar);

			
			if (opc ==1 ) {
				System.out.println("Ordenada de forma ascendente \n ");
				System.out.println("No.  Montos \n");
				for (int i = 0 ; i<Montos3.length ; i++) {
					System.out.println((i+1) + ". \t"+Montos3[i]);
				}
				
			}if (opc == 2) {
				System.out.println("Ordenada de forma descendente \n ");
				System.out.println("No.  Montos \n");
				for (int i = Montos3.length, j=1 ; i>=0 ; i--, j++) {
					System.out.println((j) + ". \t"+Montos3[i]);
				}
			}
		}

		public void OrdenarProductosFin() {
			for (int i =0 ; i < 2 ; i++) {
				for(int j=0 ; j < 2; j++) {
					if (Montos4[j]> Montos4[j+1]) {
						auxiliar = Montos4[j];
						Montos4[j]=Montos4[j+1];
						Montos4[j+1] = auxiliar;
					}
				}
			}
			do {
				try {
			System.out.println("Ordenar:");
			System.out.println("1. Ascendente");
			System.out.println("2. Descendente");
			System.out.print("Opcion: ");
			opc = sc.nextInt();
			while(opc <= 0 || opc >= 3) {
				System.out.println("Usted ha ingresado una respuesta erronea, favor de ingresar una respuesta valida");
				System.out.print("Opcion: ");
				opc = sc.nextInt();
			}
				} catch (InputMismatchException ex) {
		            System.out.println("No puede introducir caracteres y/o caracteres especiales ni numeros decimales");
		            	  sc.next();
		            	  System.out.println();
		            	  Continuar = true;
				}
				} while (Continuar);

			
			if (opc ==1 ) {
				System.out.println("Ordenada de forma ascendente \n ");
				System.out.println("No.  Montos \n");
				for (int i = 0 ; i<Montos4.length ; i++) {
					System.out.println((i+1) + ". \t"+Montos4[i]);
				}
				
			}if (opc == 2) {
				System.out.println("Ordenada de forma descendente \n ");
				System.out.println("No.  Montos \n");
				for (int i = Montos4.length, j=1 ; i>=0 ; i--, j++) {
					System.out.println((j) + ". \t"+Montos4[i]);
				}
			}
		}

		public void OrdenarOtrosGastos() {
			for (int i =0 ; i < 1 ; i++) {
				for(int j=0 ; j < 1; j++) {
					if (Montos5[j]> Montos5[j+1]) {
						auxiliar = Montos5[j];
						Montos5[j]=Montos5[j+1];
						Montos5[j+1] = auxiliar;
					}
				}
			}
			do {
				try {
			System.out.println("Ordenar:");
			System.out.println("1. Ascendente");
			System.out.println("2. Descendente");
			System.out.print("Opcion: ");
			opc = sc.nextInt();
			while(opc <= 0 || opc >= 3) {
				System.out.println("Usted ha ingresado una respuesta erronea, favor de ingresar una respuesta valida");
				System.out.print("Opcion: ");
				opc = sc.nextInt();
			}
				} catch (InputMismatchException ex) {
		            System.out.println("No puede introducir caracteres y/o caracteres especiales ni numeros decimales");
		            	  sc.next();
		            	  System.out.println();
		            	  Continuar = true;
				}
				} while (Continuar);

			
			if (opc ==1 ) {
				System.out.println("Ordenada de forma ascendente \n ");
				System.out.println("No.  Montos \n");
				for (int i = 0 ; i<Montos5.length ; i++) {
					System.out.println((i+1) + ". \t"+Montos5[i]);
				}
				
			}if (opc == 2) {
				System.out.println("Ordenada de forma descendente \n ");
				System.out.println("No.  Montos \n");
				for (int i = Montos5.length, j=1 ; i>=0 ; i--, j++) {
					System.out.println((j) + ". \t"+Montos5[i]);
				}
			}
		}

		public void OrdenarOtrosProductos() {
			for (int i =0 ; i < 3 ; i++) {
				for(int j=0 ; j < 3; j++) {
					if (Montos6[j]> Montos6[j+1]) {
						auxiliar = Montos6[j];
						Montos6[j]=Montos6[j+1];
						Montos6[j+1] = auxiliar;
					}
				}
			}
			do {
				try {
			System.out.println("Ordenar:");
			System.out.println("1. Ascendente");
			System.out.println("2. Descendente");
			System.out.print("Opcion: ");
			opc = sc.nextInt();
			while(opc <= 0 || opc >= 3) {
				System.out.println("Usted ha ingresado una respuesta erronea, favor de ingresar una respuesta valida");
				System.out.print("Opcion: ");
				opc = sc.nextInt();
			}
				} catch (InputMismatchException ex) {
		            System.out.println("No puede introducir caracteres y/o caracteres especiales ni numeros decimales");
		            	  sc.next();
		            	  System.out.println();
		            	  Continuar = true;
				}
				} while (Continuar);

			
			if (opc ==1 ) {
				System.out.println("Ordenada de forma ascendente \n ");
				System.out.println("No.  Montos \n");
				for (int i = 0 ; i<Montos6.length ; i++) {
					System.out.println((i+1) + ". \t"+Montos6[i]);
				}
				
			}if (opc == 2) {
				System.out.println("Ordenada de forma descendente \n ");
				System.out.println("No.  Montos \n");
				for (int i = Montos6.length, j=1 ; i>=0 ; i--, j++) {
					System.out.println((j) + ". \t"+Montos6[i]);
				}
			}
		}
	}