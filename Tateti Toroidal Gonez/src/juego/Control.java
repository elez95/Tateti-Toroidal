package juego;

//import juego.Tablero;
//import juego.Combinaciones;

public class Control {
	
	 /*
	 * En esta clase estan las funciones para fijarse de que haya o no un ganador
	 * 
	 * */
	
	Control(){}
	
	/*
	 * Consulta a las 4 funciones que estan debajo, si alguna es verdadero hay tateti
	 * 
	 * */
	public static boolean hayGanador(int ubicacion, Combinaciones combinaciones, Tablero t) 
	{
		if(tatetiHorizontal(ubicacion, combinaciones, t) || tatetiVertical(ubicacion, combinaciones, t)
			|| tatetiDiagonalA(ubicacion, combinaciones, t) || tatetiDiagonalB(ubicacion, combinaciones, t))
		
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
	
	private static boolean tatetiHorizontal(int ubicacion, Combinaciones variante, Tablero t) 
	{
		int[] ubicacionesGanadoras = variante.getHorizontales(ubicacion);
		
		return verCoincidencia(t, ubicacionesGanadoras);
	}
	
	
	
	private static boolean tatetiVertical(int ubicacion, Combinaciones variante, Tablero t) 
	{
		int[] ubicacionesGanadoras = variante.getVerticales(ubicacion);
		return verCoincidencia(t, ubicacionesGanadoras);
	}
	
	
	
	private static boolean tatetiDiagonalA(int ubicacion, Combinaciones variante, Tablero t) 
	{
		int[] ubicacionesGanadoras = variante.getDiagonalesA(ubicacion);
		
		return verCoincidencia(t, ubicacionesGanadoras);
	}
	
	
	
	private static boolean tatetiDiagonalB(int ubicacion, Combinaciones variante, Tablero t) 
	{
		int[] ubicacionesGanadoras = variante.getDiagonalesB(ubicacion);
		
		return verCoincidencia(t, ubicacionesGanadoras);
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
	 
	
	private static boolean verCoincidencia(Tablero t, int[] ubicacionesGanadoras) {
		String[] tablero = t.verTablero();
		
		if(tablero[ubicacionesGanadoras[0]].equals(tablero[ubicacionesGanadoras[1]]) 
				&& tablero[ubicacionesGanadoras[1]].equals(tablero[ubicacionesGanadoras[2]]))
			return true;
		else
			return false;
	}
	
	
}
