package Figuras;

import java.util.Scanner;

public class Figura {
	
	static Scanner sc = new Scanner(System.in);
	static boolean Continuar;
	
	private double Altura, Radio;
	private boolean TieneLados;
	private String Color;
	int Opcion;
	
	public void ColorFigura() {
		System.out.println("La figura es de color rojo");
	}
	
	public Figura(double Altura, double Radio, boolean TieneLados, String Color) {
		this.Altura = Altura;
		this.Radio = Radio;
		this.TieneLados = TieneLados;
		this.Color = Color;
	}
	
	public double MostrarAltura() {
		return this.Altura;
	}
	
	public void CambiarAltura(double altura) {
		Altura = altura;
	}
	
	public boolean MostrarTieneLados() {
		return this.TieneLados;
	}
	
	public void CambiarTieneLados(boolean tieneLados) {
		this.TieneLados = tieneLados;
	}
	
	public String MostrarColor() {
		return this.Color;
	}
	
	public void CambiarColor(String color) {
		this.Color = color;
	}

	public double MostrarRadio() {
		return this.Radio;
	}

	public void CambiarRadio(double radio) {
		this.Radio = radio;
	}
	
	

}
