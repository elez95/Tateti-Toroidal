package juego;


public class Tablero {
	
	/*
	 * En esta clase se maneja el estado del tablero
	 * 
	 * */
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
	
	
//	//funcion solo para usarse en el main, borrarlo despues
//	public void imprimir() 
//	{
//		for(int i = 0; i < _tablero.length; i++) {
//			if(i == 3 || i == 6 )
//				System.out.println("");
//			System.out.print(_tablero[i] + " ");
//			}
//	}

}
