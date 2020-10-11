package juego;


public class Control {
	
	
	Control(){}
	
	
	public static boolean hayGanador( int posicion, Combinaciones combinaciones, Tablero t ) 
	{
		if( esTatetiHorizontal( posicion, combinaciones, t ) 
			|| 
			esTatetiVertical( posicion, combinaciones, t )
			|| 
			esTatetiDiagonalA( posicion, combinaciones, t ) 
			|| 
			esTatetiDiagonalB( posicion, combinaciones, t ) 
			)
		
			return true;
	
		return false;
	}

	
	
	private static boolean esTatetiHorizontal( int posicion, Combinaciones combinacion, Tablero tableroActual ) 
	{
		int[] las3UbicacionesGanadoras = combinacion.getSuCombinacionGanadoraHorizontal( posicion ).clone();
		
		return verCoincidencia( tableroActual, las3UbicacionesGanadoras );
	}
	
	
	
	private static boolean esTatetiVertical( int posicion, Combinaciones combinacion, Tablero tableroActual ) 
	{
		int[] las3UbicacionesGanadoras = combinacion.getSuCombinacionGanadoraVertical( posicion ).clone();
		
		return verCoincidencia( tableroActual, las3UbicacionesGanadoras );
	}
	
	
	
	private static boolean esTatetiDiagonalA( int posicion, Combinaciones combinacion, Tablero tableroActual ) 
	{
		int[] las3UbicacionesGanadoras = combinacion.getSuCombinacionGanadoraDiagonalA( posicion ).clone();
		
		return verCoincidencia( tableroActual, las3UbicacionesGanadoras );
	}
	
	
	
	private static boolean esTatetiDiagonalB( int posicion, Combinaciones combinacion, Tablero tableroActual ) 
	{
		int[] las3UbicacionesGanadoras =  combinacion.getSuCombinacionGanadoraDiagonalB( posicion ).clone();
		
		return verCoincidencia( tableroActual, las3UbicacionesGanadoras );
	}

	 
	
	private static boolean verCoincidencia( Tablero tableroActual, int[] ubicacionesGanadoras ) {
		String[] tablero = tableroActual.verTablero();
		
		if( tablero[ ubicacionesGanadoras[0] ].equals( tablero[ ubicacionesGanadoras[1] ] ) 
				&& 
			tablero[ ubicacionesGanadoras[1] ].equals( tablero[ ubicacionesGanadoras[2] ] ) 
			)
			
			return true;
		else
			return false;
	}
	
	
}
