package Figuras;

import java.util.InputMismatchException;

public class Prisma extends Figura {
	
	private double AreaL, AreaT, Volumen, LongitudLados, Apotema, PerimetroB, AreaBase;
	private int NumLados;
	
	public Prisma(double Altura, double Radio, boolean TieneLados, String Color, double AreaL, double AreaT, double Volumen, double LongitudLados, double Apotema, double PerimetroB, double AreaBase, int NumLados) {
		super(Altura, Radio, TieneLados, Color);
		this.AreaL = AreaL;
		this.AreaT = AreaT;
		this.Volumen = Volumen;
		this.LongitudLados = LongitudLados;
		this.Apotema = Apotema;
		this.PerimetroB = PerimetroB;
		this.AreaBase = AreaBase;
		this.NumLados = NumLados;
	}
	
	public void CalcularPrisma() {
		do {
			try {
				Continuar = false;
				
		System.out.print("Ingrese el Numero de lados del Prisma: ");
		CambiarNumLados(sc.nextInt());
		while(MostrarNumLados() <= 0) {
			System.out.println("Usted no puede ingresar numeros negativos");
			System.out.print("Opcion: ");
			CambiarNumLados(sc.nextInt());
		}
		
		System.out.print("Ingrese la Longitud de los lados del Prisma: ");
		CambiarLongitudLados(sc.nextDouble());
		while(MostrarLongitudLados() <= 0) {
			System.out.println("Usted no puede ingresar numeros negativos");
			System.out.print("Opcion: ");
			CambiarLongitudLados(sc.nextDouble());
		}
		
		System.out.print("Ingrese la Altura del Prisma: ");
		CambiarAltura(sc.nextDouble());
		while(MostrarAltura() <= 0) {
			System.out.println("Usted no puede ingresar numeros negativos");
			System.out.print("Opcion: ");
			CambiarAltura(sc.nextDouble());
		}
		
		PerimetroB = NumLados * LongitudLados;
		AreaL = Math.round(PerimetroB * MostrarAltura());
		System.out.println("El Area Lateral del prisma es: "+MostrarAreaL());
		Apotema = Math.sqrt(3 * Math.pow(LongitudLados, 2) / 4);
		AreaBase = PerimetroB * Apotema / 2;
		AreaT = Math.round(AreaL + 2 * AreaBase);
		System.out.println("El Area Total del prisma es: "+MostrarAreaT());
		Volumen = Math.round(AreaBase * MostrarAltura());
		System.out.println("El Volumen del prisma es: "+Volumen);
			} catch (InputMismatchException ex) {
	            System.out.println("No puede introducir caracteres y/o caracteres especiales ni numeros decimales");
	            	  sc.next();
	            	  System.out.println();
	            	  Continuar = true;
				}
			} while (Continuar);
		}

	@Override
	public void ColorFigura() {
	System.out.println("El Prisma es de color azul");
}
	
	public double MostrarAreaL() {
		return this.AreaL;
	}

	public void CambiarAreaL(double areaL) {
		this.AreaL = areaL;
	}

	public double MostrarAreaT() {
		return this.AreaT;
	}

	public void CambiarAreaT(double areaT) {
		this.AreaT = areaT;
	}

	public double MostrarVolumen() {
		return this.Volumen;
	}

	public void CambiarVolumen(double volumen) {
		this.Volumen = volumen;
	}

	public double MostrarLongitudLados() {
		return this.LongitudLados;
	}

	public void CambiarLongitudLados(double longitudLados) {
		this.LongitudLados = longitudLados;
	}

	public int MostrarNumLados() {
		return this.NumLados;
	}

	public void CambiarNumLados(int numLados) {
		this.NumLados = numLados;
	}

	public double MostrarPerimetroB() {
		return this.PerimetroB;
	}

	public void CambiarPerimetroB(double perimetroB) {
		this.PerimetroB = perimetroB;
	}

	public double MostrarAreaBase() {
		return this.AreaBase;
	}

	public void CambiarAreaBase(double areaBase) {
		this.AreaBase = areaBase;
	}
	
	
	
}
