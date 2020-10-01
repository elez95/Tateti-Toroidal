package juego;


public class Control {
	
	 /*
	 * En esta clase estan las funciones para fijarse de que haya o no un ganador
	 * 
	 * */
	
	Control(){}
	
	/*
	 * Consulta a las 4 funciones que estan debajo, si alguna es verdadero hay tateti
	 * Consulta si en alguna de las 4 orientaciones hay tateti
	 * 
	 * */
	public static boolean hayGanador( int ubicacion, Combinaciones combinaciones, Tablero t ) 
	{
		if( esTatetiHorizontal( ubicacion, combinaciones, t ) 
			|| 
			esTatetiVertical( ubicacion, combinaciones, t )
			|| 
			esTatetiDiagonalA( ubicacion, combinaciones, t ) 
			|| 
			esTatetiDiagonalB( ubicacion, combinaciones, t ) 
			)
		
			return true;
	
		return false;
	}
	/*
	 * El hashmap es O(n) pero creo que se podría mejorar con un .clone() (fijarse despues)
	 * El resto de consultas son O(1)
	 * 
	 * A ubicacionesGanadoras le paso las 3 ubicaciones que te permiten ganar segun la ubicacion que colocaste
	 * 
	 * */
	
	private static boolean esTatetiHorizontal( int ubicacion, Combinaciones combinacion, Tablero tableroActual ) 
	{
		int[] las3UbicacionesGanadoras = combinacion.getSuCombinacionGanadoraHorizontal( ubicacion );
		
		return verCoincidencia( tableroActual, las3UbicacionesGanadoras );
	}
	
	
	
	private static boolean esTatetiVertical( int ubicacion, Combinaciones combinacion, Tablero tableroActual ) 
	{
		int[] las3UbicacionesGanadoras = combinacion.getSuCombinacionGanadoraVertical( ubicacion );
		
		return verCoincidencia( tableroActual, las3UbicacionesGanadoras );
	}
	
	
	
	private static boolean esTatetiDiagonalA( int ubicacion, Combinaciones combinacion, Tablero tableroActual ) 
	{
		int[] las3UbicacionesGanadoras = combinacion.getSuCombinacionGanadoraDiagonalA( ubicacion );
		
		return verCoincidencia( tableroActual, las3UbicacionesGanadoras );
	}
	
	
	
	private static boolean esTatetiDiagonalB( int ubicacion, Combinaciones combinacion, Tablero tableroActual ) 
	{
		int[] las3UbicacionesGanadoras = combinacion.getSuCombinacionGanadoraDiagonalB( ubicacion );
		
		return verCoincidencia( tableroActual, las3UbicacionesGanadoras );
	}


	/**
	 * Esta funcion auxiliar es utilizada por los 4 tipos de orientaciones (horizontal, vertical, diagonalA/B)
	 * 
	 * @param ubicacionesGanadoras, aca esta el arreglo con las dos ubicaciones posibles (mas la actual) que deben
	 * tener el mismo estado para que sea tateti
	 * 
	 * En el arreglo tablero se guarda el actual estado de las 9 ubicaciones.
	 * 
	 * En la condicion se evalua primero las dos ubicaciones posibles, luego la segunda con la tercera ubicacion
	 * 
	 * Ejemplo: puse una cruz en la ubicacion 5 y quiero comparar de forma vertical, entonces el arreglo 
	 * ubicacionesGanadores tiene {2, 5, 8}. Entonces para que sea tateti el tablero tiene que tener en esas
	 * ubicaciones el estado "CRUZ".
	 * 
	 * */
	 
	
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
