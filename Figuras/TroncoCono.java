package Figuras;

import java.util.InputMismatchException;

public class TroncoCono extends Figura {
	
	private double RadioMayor, AreaL, AreaT, Volumen, Generatriz, AreaBaseMayor, AreaBaseMenor;
	
	public TroncoCono(double Altura, double Radio, boolean TieneLados, String Color, double RadioMayor, double AreaL, double AreaT, double Volumen, double Generatriz, double AreaBaseMayor, double AreaBaseMenor) {
		super(Altura, Radio, TieneLados, Color);
		this.RadioMayor = RadioMayor;
		this.AreaL = AreaL;
		this.AreaT = AreaT;
		this.Volumen = Volumen;
		this.Generatriz = Generatriz;
		this.AreaBaseMayor = AreaBaseMayor;
		this.AreaBaseMenor = AreaBaseMenor;
	}
		
		public void CalcularTroncoCono() {
			do {
				try {
					Continuar = false;
					
			System.out.print("Ingrese el Radio del Tronco del Cono: ");
			CambiarRadio(sc.nextDouble());
			while(MostrarRadio() <= 0) {
				System.out.println("Usted no puede ingresar numeros negativos");
				System.out.print("Opcion: ");
				CambiarRadio(sc.nextDouble());
			}
			
			System.out.print("Ingrese el Radio Mayor del Tronco del Cono: ");
			setRadioMayor(sc.nextDouble());
			while(getRadioMayor() <= 0) {
				System.out.println("Usted no puede ingresar numeros negativos");
				System.out.print("Opcion: ");
				setRadioMayor(sc.nextDouble());
			}
			
			System.out.print("Ingrese la Altura del Tronco del Cono: ");
			CambiarAltura(sc.nextDouble());
			while(MostrarAltura() <= 0) {
				System.out.println("Usted no puede ingresar numeros negativos");
				System.out.print("Opcion: ");
				CambiarAltura(sc.nextDouble());
			}
			
			Generatriz = Math.round(Math.sqrt(MostrarAltura() * MostrarAltura() + (RadioMayor * RadioMayor - MostrarRadio() * MostrarRadio())));
			System.out.println("La Generatriz del Tronco del Cono es: "+Generatriz);
			AreaL = Math.round(Math.PI * Generatriz * (RadioMayor + MostrarRadio()));
			System.out.println("El Area Lateral del Tronco del Cono es: "+AreaL);
			AreaBaseMayor = Math.PI * Math.pow(RadioMayor, 2);
			AreaBaseMenor = Math.PI * Math.pow(MostrarRadio(), 2);
			AreaT = Math.round(AreaL + AreaBaseMayor + AreaBaseMenor);
			System.out.println("El Area Total del Tronco del Cono es: "+AreaT);
			Volumen = Math.round(0.3333333333333 * Math.PI * MostrarAltura() * (Math.pow(RadioMayor, 2) + Math.pow(MostrarRadio(), 2) + RadioMayor + MostrarRadio() ));
			System.out.println("El Volumen del Tronco del Cono es: "+Volumen);
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
		System.out.println("El tronco del cono es de color purpura");
	}
		
	public double getRadioMayor() {
		return this.RadioMayor;
	}

	public void setRadioMayor(double radioMayor) {
		this.RadioMayor = radioMayor;
	}

	public double getAreaL() {
		return this.AreaL;
	}

	public void setAreaL(double areaL) {
		this.AreaL = areaL;
	}

	public double getAreaT() {
		return this.AreaT;
	}

	public void setAreaT(double areaT) {
		this.AreaT = areaT;
	}

	public double getVolumen() {
		return this.Volumen;
	}

	public void setVolumen(double volumen) {
		this.Volumen = volumen;
	}

	public double getGeneratriz() {
		return this.Generatriz;
	}

	public void setGeneratriz(double generatriz) {
		this.Generatriz = generatriz;
	}

	public double getAreaBaseMayor() {
		return this.AreaBaseMayor;
	}

	public void setAreaBaseMayor(double areaBaseMayor) {
		this.AreaBaseMayor = areaBaseMayor;
	}

	public double getAreaBaseMenor() {
		return this.AreaBaseMenor;
	}

	public void setAreaBaseMenor(double areaBaseMenor) {
		this.AreaBaseMenor = areaBaseMenor;
	}

}
