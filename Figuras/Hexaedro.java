package Figuras;

import java.util.InputMismatchException;

public class Hexaedro extends Figura {
	
	private double Arista, Area, Volumen, Diagonal;
	
	public Hexaedro(double Altura, double Radio, boolean TieneLados, String Color, double Arista, double Area, double Volumen, double Diagonal) {
		super(Altura, Radio, TieneLados, Color);
		this.Area = Area;
		this.Arista = Arista;
		this.Volumen = Volumen;
	}
	
	public void CalcularHexaedro() {
		do {
			try {
				Continuar = false;
				
		System.out.print("Ingrese la Longitud de una de las Aristas del Hexaedro: ");
		Arista = sc.nextDouble();
		while(Arista <= 0) {
			System.out.println("Usted no puede ingresar numeros negativos");
			System.out.print("Opcion: ");
			Arista = sc.nextDouble();
		}
			
		Area = Math.round(6 * Math.pow(Arista, 2));
		System.out.println("El Area del Hexaedro es: "+Area);
		Volumen = Math.round(Math.pow(Arista, 3));
		System.out.println("El Volumen del Hexaedro es: "+Volumen);
		Diagonal = Math.round(Arista * Math.sqrt(3));
		System.out.println("La Diagonal del Hexaedro es: "+Diagonal);
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
	System.out.println("El hexaedro es de color negro");
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

	public double getDiagonal() {
		return this.Diagonal;
	}

	public void setDiagonal(double diagonal) {
		this.Diagonal = diagonal;
	}
	
	

}
