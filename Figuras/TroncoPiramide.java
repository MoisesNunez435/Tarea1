package Figuras;

import java.util.InputMismatchException;

public class TroncoPiramide extends Figura {
	
	private double AristaMa, AristaMe, ApotemaBMa, ApotemaBMe, PerimetroBMa, PerimetroBMe, Apotema, AreaL, AreaT, Volumen, AreaBaseMayor, AreaBaseMenor;

	public TroncoPiramide(double Altura, double Radio, boolean TieneLados, String Color, double AristaMa, double AristaMe, double ApotemaBMa, double ApotemaBMe, double PerimetroBMa, double PerimetroBMe, double Apotema, double AreaL, double AreaT, double Volumen, double AreaBaseMayor, double AreaBaseMenor) {
		super(Altura, Radio, TieneLados, Color);
		this.AreaL = AreaL;
		this.AreaT = AreaT;
		this.Volumen = Volumen;
		this.Apotema = Apotema;
		this.ApotemaBMa = ApotemaBMa;
		this.AristaMe = AristaMe;
		this.AristaMa = AristaMa;
		this.ApotemaBMe = ApotemaBMe;
		this.PerimetroBMa = PerimetroBMa;
		this.PerimetroBMe = PerimetroBMe;
		this.AristaMa = AristaMa;
		this.AristaMe = AristaMe;
		this.AreaBaseMayor = AreaBaseMayor;
		this.AreaBaseMenor = AreaBaseMenor;
	}
	
	public void CalcularTroncoPiramide() {
		do {
			try {
				Continuar = false;
				
		System.out.print("Ingrese la longitud de la Arista Mayor del Tronco de la Piramide: ");
		AristaMa = sc.nextDouble();
		while(AristaMa <= 0) {
			System.out.println("Usted no puede ingresar numeros negativos");
			System.out.print("Opcion: ");
			AristaMa = sc.nextDouble();
		}
		
		System.out.print("Ingrese la longiud de la Arista Menor del Tronco de la Piramide: ");
		AristaMe = sc.nextDouble();
		while(AristaMe <= 0) {
			System.out.println("Usted no puede ingresar numeros negativos");
			System.out.print("Opcion: ");
			AristaMe = sc.nextDouble();
		}
		
		System.out.print("Ingrese la Altura del Tronco de la Piramide: ");
		CambiarAltura(sc.nextDouble());
		while(MostrarAltura() <= 0) {
			System.out.println("Usted no puede ingresar numeros negativos");
			System.out.print("Opcion: ");
			CambiarAltura(sc.nextDouble());
		}
		
		System.out.print("Ingrese el Apotema de la Base Mayor del Tronco de la Piramide: ");
		ApotemaBMa = sc.nextDouble();
		while(ApotemaBMa <= 0) {
			System.out.println("Usted no puede ingresar numeros negativos");
			System.out.print("Opcion: ");
			ApotemaBMa = sc.nextDouble();
		}
		
		System.out.print("Ingrese el Apotema de la Base Menor del Tronco de la Piramide: ");
		ApotemaBMe = sc.nextDouble();
		while(ApotemaBMe <= 0) {
			System.out.println("Usted no puede ingresar numeros negativos");
			System.out.print("Opcion: ");
			ApotemaBMe = sc.nextDouble();
		}
		
		PerimetroBMa = 4 * AristaMa;
		PerimetroBMe = 4 * AristaMe;
		Apotema = Math.sqrt(MostrarAltura() * MostrarAltura() + Math.pow(ApotemaBMa - ApotemaBMe, 2));
		AreaL = Math.round(((PerimetroBMa + PerimetroBMe) / 2) * Apotema);
		System.out.println("El Area Lateral del Tronco de la Piramide: "+AreaL);
		AreaBaseMayor = Math.pow(AristaMa, 2);
		AreaBaseMenor = Math.pow(AristaMe, 2);
		AreaT = Math.round(AreaL + AreaBaseMayor + AreaBaseMenor);
		System.out.println("El Area Total del Tronco de la Piramide es: "+AreaT);
		Volumen = Math.round(0.333333333 * MostrarAltura() * (AreaBaseMayor + AreaBaseMenor + Math.sqrt(AreaBaseMayor * AreaBaseMenor)));
		System.out.println("El volumen del Tronco de la Piramide es: "+Volumen);
			
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
	System.out.println("El tronco de la piramide es de color gris");
}
	
	public double getAristaMayor() {
		return this.AristaMa;
	}

	public void setAristaMayor(double aristaMayor) {
		this.AristaMa = aristaMayor;
	}

	public double getAristaMenor() {
		return this.AristaMe;
	}

	public void setAristaMenor(double aristaMenor) {
		this.AristaMe = aristaMenor;
	}

	public double getApotemaBaseMayor() {
		return this.ApotemaBMa;
	}

	public void setApotemaBaseMayor(double apotemaBaseMayor) {
		this.ApotemaBMa = apotemaBaseMayor;
	}

	public double getApotemaBaseMenor() {
		return this.ApotemaBMe;
	}

	public void setApotemaBaseMenor(double apotemaBaseMenor) {
		this.ApotemaBMe = apotemaBaseMenor;
	}

	public double getPerimetroBaseMayor() {
		return this.PerimetroBMa;
	}

	public void setPerimetroBaseMayor(double perimetroBaseMayor) {
		this.PerimetroBMa = perimetroBaseMayor;
	}

	public double getPerimetroBaseMenor() {
		return this.PerimetroBMe;
	}

	public void setPerimetroBaseMenor(double perimetroBaseMenor) {
		this.PerimetroBMe = perimetroBaseMenor;
	}

	public double getApotema() {
		return this.Apotema;
	}

	public void setApotema(double apotema) {
		this.Apotema = apotema;
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
