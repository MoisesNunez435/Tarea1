package Figuras;

import java.util.InputMismatchException;

public class Dodecaedro extends Figura {
	
private double Arista, Area, Volumen, AnguloCentral, Apotema, AreaPentagono;
	
	public Dodecaedro(double Altura, double Radio, boolean TieneLados, String Color, double Arista, double Area, double Volumen, double AnguloCentral, double Apotema, double AreaPentagono) {
		super(Altura, Radio, TieneLados, Color);
		this.Area = Area;
		this.Arista = Arista;
		this.Volumen = Volumen;
		this.AnguloCentral = AnguloCentral;
		this.Apotema = Apotema;
		this.AreaPentagono = AreaPentagono;
	}
	
	public void CalcularDodecaedro() {
		do {
			try {
				Continuar = false;
				
		System.out.print("Ingrese la longitud de una de las Aristas del Dedecaedro: ");
		Arista = sc.nextDouble();
		while(Arista <= 0) {
			System.out.println("Usted no puede ingresar numeros negativos");
			System.out.print("Opcion: ");
			Arista = sc.nextDouble();
		}
		
		System.out.print("Ingrese el Angulo Central del Dodecaedro: ");
		AnguloCentral = sc.nextDouble();
		while(AnguloCentral <= 0) {
			System.out.println("Usted no puede ingresar numeros negativos");
			System.out.print("Opcion: ");
			AnguloCentral = sc.nextDouble();
		}
		
		Area = Math.round(3 * Math.pow(Arista, 2) * Math.sqrt(25 + 10 * Math.sqrt(5)));
		System.out.println("El Area del Dodecaedro es: "+Area);
		Volumen = Math.round(0.25 * (15 + 7 * Math.sqrt(5)) * Math.pow(Arista, 3));
		System.out.println("El Volumen del Dodecaedro es: "+Volumen);
		Apotema = Arista / (2 * Math.tan(AnguloCentral /2 ));
		AreaPentagono = Math.round(2.5 * Arista * Apotema);
		System.out.println("El Area del Pentagono del Dodecaedro es: "+AreaPentagono);
	} catch (InputMismatchException ex) {
	    System.out.println("No puede introducir caracteres y/o caracteres especiales");
		  sc.next();
		  System.out.println();
		  Continuar = true;
			}
		} while (Continuar);

	}

	@Override
	public void ColorFigura() {
	System.out.println("El dodecaedro es de color rosa");
}
	
	public double getArista() {
		return this.Arista;
	}

	public void setArista(double arista) {
		this.Arista = arista;
	}

	public double getArea() {
		return this.Area;
	}

	public void setArea(double area) {
		this.Area = area;
	}

	public double getVolumen() {
		return this.Volumen;
	}

	public void setVolumen(double volumen) {
		this.Volumen = volumen;
	}

	public double getAnguloCentral() {
		return this.AnguloCentral;
	}

	public void setAnguloCentral(double anguloCentral) {
		this.AnguloCentral = anguloCentral;
	}

	public double getApotema() {
		return this.Apotema;
	}

	public void setApotema(double apotema) {
		this.Apotema = apotema;
	}

	public double getAreaPentagono() {
		return this.AreaPentagono;
	}

	public void setAreaPentagono(double areaPentagono) {
		this.AreaPentagono = areaPentagono;
	}
	
	
	

}
