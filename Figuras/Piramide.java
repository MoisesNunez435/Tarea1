package Figuras;

import java.util.InputMismatchException;

public class Piramide extends Figura {

	private double LongitudBase, AreaL, AreaT, Volumen, PerimetroB, ApotemaB, Apotema, AreaBase;
	private int NumLados;
	
	public Piramide(double Altura, double Radio, boolean TieneLados, String Color, double LongitudBase, double AreaL, double AreaT, double Volumen, double PerimetroB, double ApotemaB, double Apotema, double AreaBase, int NumLados ) {
		super(Altura, Radio, TieneLados, Color);
		this.LongitudBase = LongitudBase;
		this.AreaL = AreaL;
		this.AreaT = AreaT;
		this.Volumen = Volumen;
		this.PerimetroB = PerimetroB;
		this.ApotemaB = ApotemaB;
		this.Apotema = Apotema;
		this.AreaBase = AreaBase;
		this.NumLados = NumLados;
	}
	
	public void CalcularPiramide() {
		do {
			try {
				Continuar = false;
				
		System.out.print("Ingrese el Numero de lados de la Piramide: ");
		NumLados = sc.nextInt();
		while(NumLados <= 0) {
			System.out.println("Usted no puede ingresar numeros negativos");
			System.out.print("Opcion: ");
			NumLados = sc.nextInt();
		}
		
		System.out.print("Ingrese la Longitud de la base de la Piramide: ");
		LongitudBase = sc.nextDouble();
		while(LongitudBase <= 0) {
			System.out.println("Usted no puede ingresar numeros negativos");
			System.out.print("Opcion: ");
			LongitudBase = sc.nextDouble();
		}
		
		System.out.print("Ingrese la Altura de la Piramide: ");
		CambiarAltura(sc.nextDouble());
		while(MostrarAltura() <= 0) {
			System.out.println("Usted no puede ingresar numeros negativos");
			System.out.print("Opcion: ");
			CambiarAltura(sc.nextDouble());
		}
		
		PerimetroB = LongitudBase * NumLados;
		ApotemaB = NumLados / 2;
		Apotema = MostrarAltura() * MostrarAltura() + ApotemaB * ApotemaB;
		AreaL = Math.round(PerimetroB * Apotema / 2);
		System.out.println("El Area Lateral de la Piramide es: "+AreaL);
		AreaBase = NumLados * LongitudBase * ApotemaB / 2;
		AreaT = Math.round(AreaL + AreaBase);
		System.out.println("El Area Total de la Piramide es: "+AreaT);
		Volumen = Math.round(AreaBase * MostrarAltura() / 3);
		System.out.println("El Volumen de la Piramide es: "+Volumen);
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
	System.out.println("La piramide es de color rojo");
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

	public double getLongitudBase() {
		return this.LongitudBase;
	}

	public void setLongitudBase(double longitudBase) {
		this.LongitudBase = longitudBase;
	}

	public double getPerimetroB() {
		return this.PerimetroB;
	}

	public void setPerimetroB(double perimetroB) {
		this.PerimetroB = perimetroB;
	}

	public double getApotemaB() {
		return this.ApotemaB;
	}

	public void setApotemaB(double apotemaB) {
		this.ApotemaB = apotemaB;
	}

	public double getApotema() {
		return this.Apotema;
	}

	public void setApotema(double apotema) {
		this.Apotema = apotema;
	}

	public int getNumLados() {
		return this.NumLados;
	}

	public void setNumLados(int numLados) {
		this.NumLados = numLados;
	}

	public double getAreaBase() {
		return AreaBase;
	}

	public void setAreaBase(double areaBase) {
		AreaBase = areaBase;
	}
	
	
	
}
