package Vehiculo;

public class Camioneta extends Vehiculo {
	
	private boolean TieneTina;
	private boolean CuatroPorCuatro;
	
	
	
	public Camioneta(int NumRuedas, String Color, int CantPuertas, String NumMatricula, boolean TieneMotor, double VelocidadIni, double VelocidadMax, boolean TieneTina, boolean CuatroPorCuatro) {
		super(NumRuedas, Color, CantPuertas, NumMatricula, TieneMotor, VelocidadIni, VelocidadMax);
		this.TieneTina = TieneTina;
		this.CuatroPorCuatro = CuatroPorCuatro;
	}

	public boolean MostrarTieneTina() {
		return this.TieneTina;
	}

	public void CambiarTieneTina(boolean tieneTina) {
		this.TieneTina = tieneTina;
	}

	public boolean MostrarCuatroPorCuatro() {
		return this.CuatroPorCuatro;
	}

	public void CambiarCuatroPorCuatro(boolean cuatroPorCuatro) {
		this.CuatroPorCuatro = cuatroPorCuatro;
	}
	
	
	

}
