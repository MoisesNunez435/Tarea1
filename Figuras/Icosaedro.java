package Figuras;

import java.util.InputMismatchException;

public class Icosaedro extends Figura {

private double Arista, Area, Volumen;
	
	public Icosaedro(double Altura, double Radio, boolean TieneLados, String Color, double Arista, double Area, double Volumen) {
		super(Altura, Radio, TieneLados, Color);
		this.Area = Area;
		this.Arista = Arista;
		this.Volumen = Volumen;
	}
	
	public void CalcularIcosaedro() {
		do {
			try {
				Continuar = false;
				
		System.out.print("Ingrese la Longitud de una de las Aristas del Icosaedro: ");
		Arista = sc.nextDouble();
		while(Arista <= 0) {
			System.out.println("Usted no puede ingresar numeros negativos");
			System.out.print("Opcion: ");
			Arista = sc.nextDouble();
		}
		
		Area = Math.round(5 * Math.pow(Arista, 2) * Math.sqrt(3));
		System.out.println("El Area del Icosaedro es: "+Area);
		Volumen = Math.round(0.41666666667 * (3 + Math.sqrt(5) * Math.pow(Arista, 3)));
		System.out.println("El Volumen del Icosaedro es: "+Volumen);
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
	System.out.println("El icosaedro es de color plateado");
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
	
	
	
}
