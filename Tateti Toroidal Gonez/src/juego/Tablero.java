package juego;


public class Tablero {
	
	
	private String[] _tablero = { "VACIO", "VACIO", "VACIO", 
								  "VACIO", "VACIO", "VACIO", 
								  "VACIO", "VACIO", "VACIO" };
	
	
	public void cambiarEstado(int indice, String turno)
	{
		verificarExcepciones(indice, turno);
		
		if(turno.equals("CRUZ"))
			_tablero[indice] = "CRUZ";
		
		if(turno.equals("CIRCULO"))
			_tablero[indice] = "CIRCULO";
	}
	
	
	public String verEstado(int indice) 
	{
		return _tablero[indice];
	}
	
	
	public String[] verTablero() 
	{
		return _tablero;
	}
	
	
	private void verificarExcepciones(int indice, String turno) 
	{
		if(! _tablero[indice].equals("VACIO")) 
		
			throw new RuntimeException("Se esta usando una posicion ocupada");
		
		if(indice < 0 || indice > 9)
			throw new ArrayIndexOutOfBoundsException("Numero fuera del rango (del 0 al 8)");
	}

}
