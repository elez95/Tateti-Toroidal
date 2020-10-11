package juego;

public class Juego {

	Tablero tablero;
	Combinaciones combinaciones;
	private String turno;
	private int cantidadJugadas;
	private boolean elJuegoTermino;
	
	
	Juego()
	{
		tablero = new Tablero();
		combinaciones = new Combinaciones();
		
		turno = "CRUZ";
		cantidadJugadas = 0;
		elJuegoTermino = false;
	}
	
	
	public boolean cargarPosicionEnTablero( int posicion ) 
	{
		if( !seRepite( posicion ) ) 
		{
			tablero.cambiarEstado( posicion, turno );
			
			if( cantidadJugadas >= 4 ) 
			{
				if( Control.hayGanador( posicion, combinaciones, tablero ) ) 
				{
					elJuegoTermino = true;
					return true;
				}
			}
		}
		return false;
	}
	
	
	public String getTurno() 
	{
		return turno;
	}
	
	
	public void avanzarTurno() 
	{
		cambiarTurno();
		cantidadJugadas++;
	}
	
	
	public boolean verSiHayGanador() 
	{
		return elJuegoTermino;
	}
	
	
	public boolean seRepite( int posicion ) 
	{
		if( tablero.verEstado( posicion ).equals( "VACIO" ) )
			return false;
		else
			return true;
	}
	
	
	private void cambiarTurno() 
	{
		if( turno.equals( "CRUZ" ) )
			turno = "CIRCULO";
		else
			turno = "CRUZ";
	}
}
