package Figuras;

import java.util.InputMismatchException;

public class Esfera extends Figura {
	
	private double RadioMayor, RadioN2, NumAngulo, AreaL, AreaT, Volumen, Area, AreaHusoEsferico, VolumenCuñaEsferica, AreaCasqueteEsferico, AreaZonaEsferica, VolumenCasqueteEsferico, VolumenZonaEsferica;

	public Esfera(double Altura, double Radio, boolean TieneLados, String Color, double RadioMayor, double RadioN2, double NumAngulo, double AreaL, double AreaT, double Volumen, double Area, double AreaCasqueteEsferico, double AreaZonaEsferica, double AreaHusoEsferico, double VolumenZonaEsferica, double VolumenCasqueteEsferico, double VolumenCuñaEsferica) {
		super(Altura, Radio, TieneLados, Color);
		this.AreaL = AreaL;
		this.AreaT = AreaT;
		this.Volumen = Volumen;
		this.Area = Area;
		this.RadioMayor = RadioMayor;
		this.AreaCasqueteEsferico = AreaCasqueteEsferico;
		this.AreaHusoEsferico= AreaHusoEsferico;
		this.AreaZonaEsferica = AreaZonaEsferica;
		this.RadioN2 = RadioN2;
		this.NumAngulo = NumAngulo;
		this.VolumenCasqueteEsferico = VolumenCasqueteEsferico;
		this.VolumenCuñaEsferica = VolumenCuñaEsferica;
		this.VolumenZonaEsferica = VolumenZonaEsferica;
	}
	
	public void CalcularEsfera() {
		do {
			try {
				Continuar = false;
				
		System.out.print("Ingrese el Radio de la Esfera: ");
		CambiarRadio(sc.nextDouble());
		while(MostrarRadio() <= 0) {
			System.out.println("Usted no puede ingresar numeros negativos");
			System.out.print("Opcion: ");
			CambiarRadio(sc.nextDouble());
		}
		
		System.out.print("Ingrese el Radio Mayor de la Esfera: ");
		RadioMayor = sc.nextDouble();
		while(RadioMayor <= 0) {
			System.out.println("Usted no puede ingresar numeros negativos");
			System.out.print("Opcion: ");
			RadioMayor = sc.nextDouble();
		}
		
		System.out.print("Ingrese el RadioN2 de la Esfera: ");
		RadioN2 = sc.nextDouble();
		while(RadioN2 <= 0) {
			System.out.println("Usted no puede ingresar numeros negativos");
			System.out.print("Opcion: ");
			RadioN2 = sc.nextDouble();
		}
		
		System.out.print("Ingrese la Altura de la Esfera: ");
		CambiarAltura(sc.nextDouble());
		while(MostrarAltura() <= 0) {
			System.out.println("Usted no puede ingresar numeros negativos");
			System.out.print("Opcion: ");
			CambiarAltura(sc.nextDouble());
		}
		
		System.out.print("Ingrese el Numero del Angulo del Huso Esferico: ");
		NumAngulo = sc.nextDouble();
		while(NumAngulo <= 0) {
			System.out.println("Usted no puede ingresar numeros negativos");
			System.out.print("Opcion: ");
			NumAngulo = sc.nextDouble();
		}
		
		Area = Math.round(4 * Math.PI * Math.pow(MostrarRadio(), 2));
		System.out.println("El Area de la Esfera es: "+Area);
		Volumen = Math.round(1.333333333333 * Math.PI * Math.pow(MostrarRadio(), 3));
		System.out.println("El Volumen de la Esfera es: "+Volumen);
		AreaZonaEsferica = Math.round(2 * Math.PI * RadioMayor * MostrarAltura());
		System.out.println("El Area de la Zona Esferica de la Esfera es: "+AreaZonaEsferica);
		AreaCasqueteEsferico = Math.round(2 * Math.PI * RadioMayor * MostrarAltura());
		System.out.println("El Area del Casquete Esferico de la Esfera es: "+AreaCasqueteEsferico);
		AreaHusoEsferico = Math.round(4 * Math.PI * Math.pow(MostrarRadio(), 2) * NumAngulo / 360);
		System.out.println("El Area del Huso Esferico es: "+AreaHusoEsferico);
		VolumenZonaEsferica = Math.round(Math.PI * MostrarAltura() * (MostrarAltura() * MostrarAltura() + 3 * MostrarRadio() * MostrarRadio() + 3 * RadioN2 * RadioN2) / 6);
		System.out.println("El Volumen de la Zona Esferica de la Esfera es: "+VolumenZonaEsferica);
		VolumenCasqueteEsferico = Math.round(Math.PI * Math.pow(MostrarAltura(), 2) * (3 * RadioMayor - MostrarAltura()) /3);
		System.out.println("El Volumen del Casquete Esferico de la Esfera es: "+VolumenCasqueteEsferico);
		VolumenCuñaEsferica = Math.round(1.333333333333 * Math.PI * Math.pow(MostrarRadio(), 3) * NumAngulo / 360);
		System.out.println("El volumen de la Cuña Esferica es: "+VolumenCuñaEsferica);
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
	System.out.println("La esfera es de color naranja");
}

	public double getRadioMayor() {
		return this.RadioMayor;
	}

	public void setRadioMayor(double radioMayor) {
		this.RadioMayor = radioMayor;
	}

	public double getRadioN2() {
		return this.RadioN2;
	}

	public void setRadioN2(double radioN2) {
		this.RadioN2 = radioN2;
	}

	public double getNumAngulo() {
		return this.NumAngulo;
	}

	public void setNumAngulo(double numAngulo) {
		this.NumAngulo = numAngulo;
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

	public double getAreaHusoEsferico() {
		return this.AreaHusoEsferico;
	}

	public void setAreaHusoEsferico(double areaHusoEsferico) {
		this.AreaHusoEsferico = areaHusoEsferico;
	}

	public double getVolumenCuñaEsferica() {
		return this.VolumenCuñaEsferica;
	}

	public void setVolumenCuñaEsferica(double volumenCuñaEsferica) {
		this.VolumenCuñaEsferica = volumenCuñaEsferica;
	}

	public double getAreaCasqueteEsferico() {
		return this.AreaCasqueteEsferico;
	}

	public void setAreaCasqueteEsferico(double areaCasqueteEsferico) {
		this.AreaCasqueteEsferico = areaCasqueteEsferico;
	}

	public double getAreaZonaEsferica() {
		return this.AreaZonaEsferica;
	}

	public void setAreaZonaEsferica(double areaZonaEsferica) {
		this.AreaZonaEsferica = areaZonaEsferica;
	}

	public double getVolumenCasqueteEsferico() {
		return this.VolumenCasqueteEsferico;
	}

	public void setVolumenCasqueteEsferico(double volumenCasqueteEsferico) {
		this.VolumenCasqueteEsferico = volumenCasqueteEsferico;
	}

	public double getVolumenZonaEsferica() {
		return this.VolumenZonaEsferica;
	}

	public void setVolumenZonaEsferica(double volumenZonaEsferica) {
		this.VolumenZonaEsferica = volumenZonaEsferica;
	}

	public double getArea() {
		return this.Area;
	}

	public void setArea(double area) {
		this.Area = area;
	}
	
	
	
	
			
			
}
