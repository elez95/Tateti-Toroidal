package juego;

import java.util.HashMap;


public class Combinaciones {
	
/*
 * Estas cuatro estructuras de datos son las que van a ser luego consultadas en las otras clases
 * 
 * */	
	private HashMap< Integer, int[] > combinacionesEnHorizontal   = new HashMap< Integer, int[] >();
	private HashMap< Integer, int[] > combinacionesEnVertical     = new HashMap< Integer, int[] >();
	private HashMap< Integer, int[] > combinacionesEnDiagonalA    = new HashMap< Integer, int[] >();
	private HashMap< Integer, int[] > combinacionesEnDiagonalB    = new HashMap< Integer, int[] >();
	
	Combinaciones()
	{
		
		combinacionesEnHorizontal.put( 0, new int[] {0,1,2} );
		combinacionesEnHorizontal.put( 1, new int[] {0,1,2} );
		combinacionesEnHorizontal.put( 2, new int[] {0,1,2} );
		combinacionesEnHorizontal.put( 3, new int[] {3,4,5} );
		combinacionesEnHorizontal.put( 4, new int[] {3,4,5} );
		combinacionesEnHorizontal.put( 5, new int[] {3,4,5} );
		combinacionesEnHorizontal.put( 6, new int[] {6,7,8} );
		combinacionesEnHorizontal.put( 7, new int[] {6,7,8} );
		combinacionesEnHorizontal.put( 8, new int[] {6,7,8} );
		
		
		combinacionesEnVertical.put( 0, new int[] {0,3,6} );
		combinacionesEnVertical.put( 1, new int[] {1,4,7} );
		combinacionesEnVertical.put( 2, new int[] {2,5,8} );
		combinacionesEnVertical.put( 3, new int[] {0,3,6} );
		combinacionesEnVertical.put( 4, new int[] {1,4,7} );
		combinacionesEnVertical.put( 5, new int[] {2,5,8} );
		combinacionesEnVertical.put( 6, new int[] {0,3,6} );
		combinacionesEnVertical.put( 7, new int[] {1,4,7} );
		combinacionesEnVertical.put( 8, new int[] {2,5,8} );
		
		
		combinacionesEnDiagonalA.put( 0, new int[] {0,4,8} );
		combinacionesEnDiagonalA.put( 1, new int[] {1,5,6} );
		combinacionesEnDiagonalA.put( 2, new int[] {2,3,7} );
		combinacionesEnDiagonalA.put( 3, new int[] {2,3,7} );
		combinacionesEnDiagonalA.put( 4, new int[] {0,4,8} );
		combinacionesEnDiagonalA.put( 5, new int[] {1,5,6} );
		combinacionesEnDiagonalA.put( 6, new int[] {1,5,6} );
		combinacionesEnDiagonalA.put( 7, new int[] {2,3,7} );
		combinacionesEnDiagonalA.put( 8, new int[] {0,4,8} );
		
		
		combinacionesEnDiagonalB.put( 0, new int [] {0,5,7} );
		combinacionesEnDiagonalB.put( 1, new int [] {1,3,8} );
		combinacionesEnDiagonalB.put( 2, new int [] {2,4,6} );
		combinacionesEnDiagonalB.put( 3, new int [] {1,3,8} );
		combinacionesEnDiagonalB.put( 4, new int [] {2,4,6} );
		combinacionesEnDiagonalB.put( 5, new int [] {0,5,7} );
		combinacionesEnDiagonalB.put( 6, new int [] {2,4,6} );
		combinacionesEnDiagonalB.put( 7, new int [] {0,5,7} );
		combinacionesEnDiagonalB.put( 8, new int [] {1,3,8} );
	}
	
	
	public int[] getSuCombinacionGanadoraHorizontal(int ubicacion) 
	{
		return combinacionesEnHorizontal.get(ubicacion);
	}
	
	
	public int[] getSuCombinacionGanadoraVertical(int ubicacion) 
	{
		return combinacionesEnVertical.get(ubicacion);
	}

	
	public int[] getSuCombinacionGanadoraDiagonalA(int ubicacion) 
	{
		return combinacionesEnDiagonalA.get(ubicacion);
	}

	
	public int[] getSuCombinacionGanadoraDiagonalB(int ubicacion) 
	{
		return combinacionesEnDiagonalB.get(ubicacion);
	}
	
}
