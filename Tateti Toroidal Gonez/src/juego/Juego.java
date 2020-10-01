package juego;

public class Juego {

	Tablero tablero;
	Combinaciones combinaciones;
	private String turno;
	private int cantidadJugadas;
	
	
	Juego()
	{
		tablero = new Tablero();
		combinaciones = new Combinaciones();
		
		turno = "CRUZ";
		cantidadJugadas = 0;
	}
	
	
	public boolean cargarPosicionEnTablero(int posicion) 
	{
		tablero.cambiarEstado(posicion, turno);
		if(cantidadJugadas >= 4) {
			if(Control.hayGanador(posicion, combinaciones, tablero)) 
			{
				System.out.println(turno);
				return true;
			}
		}
		return false;
	}
	
	
	public String getTurno() 
	{
		//return ( turno.equals("CRUZ") ? "X" : "0" );
		return turno;
	}
	
	
	public void avanzarTurno() 
	{
		cambiarTurno();
		cantidadJugadas++;
	}
	
	
	private void cambiarTurno() 
	{
		if(turno.equals("CRUZ"))
			turno = "CIRCULO";
		else
			turno = "CRUZ";
	}
}
