package Figuras;

import java.util.InputMismatchException;

public class Cono extends Figura {
	
	private double Generatriz, AreaL, AreaT, Volumen;
	
	public Cono(double Altura, double Radio, boolean TieneLados, String Color, double Generatriz, double AreaL, double AreaT, double Volumen ) {
		super(Altura, Radio, TieneLados, Color);
		this.Generatriz = Generatriz;
		this.AreaL = AreaL;
		this.AreaT = AreaT;
		this.Volumen = Volumen;
	}
	
	public void CalcularCono() {
		do {
			try {
				Continuar = false;
				
		System.out.print("Ingrese el Radio del Cono: ");
		CambiarRadio(sc.nextDouble());
		while(MostrarRadio() <= 0) {
			System.out.println("Usted no puede ingresar numeros negativos");
			System.out.print("Opcion: ");
			CambiarRadio(sc.nextDouble());
		}
		
		System.out.print("Ingrese la Altura del Cono: ");
		CambiarAltura(sc.nextDouble());
		while(MostrarAltura() <= 0) {
			System.out.println("Usted no puede ingresar numeros negativos");
			System.out.print("Opcion: ");
			CambiarAltura(sc.nextDouble());
		}
		
		Generatriz = Math.sqrt(Math.pow(MostrarAltura(), 2) + Math.pow(MostrarRadio(), 2));
		AreaL = Math.round(Math.PI * MostrarRadio() * Generatriz);
		System.out.println("El Area Lateral del Cono es: "+AreaL);
		AreaT = Math.round(Math.PI * MostrarRadio() * (Generatriz + MostrarRadio()));
		System.out.println("El Area Total del Cono es: "+AreaT);
		Volumen = Math.round(Math.PI * Math.pow(MostrarRadio(), 2) * MostrarAltura() / 3);
		System.out.println("El Volumen del Cono es: "+Volumen);
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
	System.out.println("El cono es de color amarillo");
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

	public double MostrarGeneratriz() {
		return this.Generatriz;
	}

	public void CambiarGeneratriz(double generatriz) {
		this.Generatriz = generatriz;
	}
	
	
	
}

