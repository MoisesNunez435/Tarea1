package Figuras;

import java.util.InputMismatchException;

public class Ortoedro extends Figura {
	
private double Arista, Area, Volumen, Ancho, Longitud, Altura, Diagonal;
	
	public Ortoedro(double Altura, double Radio, boolean TieneLados, String Color, double Arista, double Area, double Volumen, double Longitud, double Ancho, double Diagonal) {
		super(Altura, Radio, TieneLados, Color);
		this.Area = Area;
		this.Arista = Arista;
		this.Volumen = Volumen;
		this.Altura = Altura;
		this.Longitud = Longitud;
		this.Diagonal = Diagonal;
		this.Ancho = Ancho;
	}

	public void CalcularOrtoedro() {
		do {
			try {
				Continuar = false;
				
		System.out.print("Ingrese la Longitud del Ortoedro: ");
		Longitud = sc.nextDouble();
		while(Longitud <= 0) {
			System.out.println("Usted no puede ingresar numeros negativos");
			System.out.print("Opcion: ");
			Longitud = sc.nextDouble();
		}
		
		System.out.print("Ingrese el Ancho del Ortoedro: ");
		Ancho = sc.nextDouble();
		while(Ancho <= 0) {
			System.out.println("Usted no puede ingresar numeros negativos");
			System.out.print("Opcion: ");
			Ancho = sc.nextDouble();
		}
		
		System.out.print("Ingrese la Altura del Ortoedro: ");
		Altura = sc.nextDouble();
		while(Altura <= 0) {
			System.out.println("Usted no puede ingresar numeros negativos");
			System.out.print("Opcion: ");
			Altura = sc.nextDouble();
		}
		
		Area = Math.round(2 * (Longitud * Ancho + Longitud * Altura + Ancho * Altura));
		System.out.println("El Area del Ortoedro es: "+Area);
		Volumen = Math.round(Longitud * Ancho * Altura);
		System.out.println("El Volumen del Ortoedro es: "+Volumen);
		Diagonal = Math.round(Math.sqrt(Math.pow(Longitud, 2) + Math.pow(Ancho, 2) + Math.pow(Altura, 2)));
		System.out.println("La Diagonal del Ortoedro es: "+Diagonal);
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
	System.out.println("El ortoedro es de color celeste");
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

	public double getAncho() {
		return this.Ancho;
	}

	public void setAncho(double ancho) {
		this.Ancho = ancho;
	}

	public double getLongitud() {
		return this.Longitud;
	}

	public void setLongitud(double longitud) {
		this.Longitud = longitud;
	}

	public double getDiagonal() {
		return this.Diagonal;
	}

	public void setDiagonal(double diagonal) {
		this.Diagonal = diagonal;
	}
	
	

}
