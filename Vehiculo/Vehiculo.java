package Vehiculo;

public class Vehiculo {
	
	private int NumRuedas;
	private String Color;
	private int CantPuertas;
	private String NumMatricula;
	private boolean TieneMotor;
	private double VelocidadIni;
	private double VelocidadMax;
	
	public void Arrancar() {
		System.out.println("El vehiculo arranco");
	}
	
	public void Moverse() {
		System.out.println("El vehiculo se esta moviendo");
	}
	
	public void Acelerar(double VelocidadInicial, double VelocidadMax, double Tiempo) {
		System.out.println("El vehiculo ha acelerado de " + VelocidadInicial + " a " + VelocidadMax + " en " + Tiempo + " segundos ");
	}
	
	public void Detener() {
		System.out.println("El vehiculo se detuvo");
	}
	
	public Vehiculo(int NumRuedas, String Color, int CantPuertas, String NumMatricula, boolean TieneMotor, double VelocidadIni, double VelocidadMax) {
		this.NumRuedas = NumRuedas;
		this.Color = Color;
		this.CantPuertas = CantPuertas;
		this.NumMatricula = NumMatricula;
		this.TieneMotor = TieneMotor;
		this.VelocidadIni = VelocidadIni;
		this.VelocidadMax = VelocidadMax;	
	}

	public int MostrarNumRuedas() {
		return this.NumRuedas;
	}

	public void CambiarNumRuedas(int numRuedas) {
		this.NumRuedas = numRuedas;
	}

	public String MostrarColor() {
		return this.Color;
	}

	public void CambiarColor(String color) {
		this.Color = color;
	}

	public int MostrarCantPuertas() {
		return this.CantPuertas;
	}

	public void CambiarCantPuertas(int cantPuertas) {
		this.CantPuertas = cantPuertas;
	}

	public String MostrarNumMatricula() {
		return this.NumMatricula;
	}

	public void CambiarNumMatricula(String numMatricula) {
		this.NumMatricula = numMatricula;
	}

	public boolean MostrarTieneMotor() {
		return this.TieneMotor;
	}

	public void MostrarTieneMotor(boolean tieneMotor) {
		this.TieneMotor = tieneMotor;
	}
	
	public double MostrarVelocidadIni(double VelocidadIni) {
		return this.VelocidadIni;
	}

	public void CambiarVelocidadIni(double velocidadIni) {
		this.VelocidadIni= velocidadIni;
	}

	public double MostrarVelocidadMax() {
		return this.VelocidadMax;
	}

	public void CambiarVelocidadMax(double velocidadMax) {
		this.VelocidadMax = velocidadMax;
	}
	
	

}
