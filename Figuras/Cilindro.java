package Figuras;

import java.util.InputMismatchException;

public class Cilindro extends Figura{
	
	private double Radio;
	private double AreaL;
	private double AreaT;
	private double Volumen;
	
	public Cilindro(double Altura, boolean TieneLados, String Color, double Radio, double AreaL, double AreaT, double Volumen) {
		super(Altura, Radio, TieneLados, Color);
		this.Radio = Radio;
		this.AreaL = AreaL;
		this.AreaT = AreaT;
		this.Volumen = Volumen;
	}
	
	public void CalcularCilindro() {
		do {
			try {
				Continuar = false;
				
		System.out.print("Ingrese el Radio del Cilindro: ");
	    Radio = sc.nextDouble();
		while(Radio <= 0) {
			System.out.println("Usted no puede ingresar numeros negativos");
			System.out.print("Opcion: ");
			Radio = sc.nextDouble();
		}
		
	    System.out.print("Ingrese la Altura del Cilindro: ");
	    CambiarAltura(sc.nextDouble());
		while(MostrarAltura() <= 0) {
			System.out.println("Usted no puede ingresar numeros negativos");
			System.out.print("Opcion: ");
			CambiarAltura(sc.nextDouble());
		}
		
	    AreaL = Math.round(2 * Math.PI * Radio * MostrarAltura());
	    System.out.println("El Area Lateral del Cilindro es: "+AreaL);
	    AreaT = Math.round(2 * Math.PI * Radio * (MostrarAltura() + Radio));
	    System.out.println("El Area Total del Cilindro es: "+AreaT);
	    Volumen = Math.round(Math.PI * Math.pow(Radio, 2) * MostrarAltura());
	    System.out.println("El Volumen del Cilindro es: "+Volumen);
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
		System.out.println("El cilindro es de color verde");
	}
	
	public double MostrartRadio() {
		return this.Radio;
	}

	public void CambiarRadio(double radio) {
		this.Radio = radio;
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

}
