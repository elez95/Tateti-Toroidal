package juego;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class ControlTest {
	
	Combinaciones combinaciones;
	Tablero tablero;
	
	@Before
	public void inicializar() 
	{
		combinaciones = new Combinaciones();
		tablero = new Tablero();
	}
	
	//Pruebas con la cruz--------------------------------------------------------------------------------------
	
	@Test
	public void TATETIHorizontalCruzTest()
	{
		tablero.cambiarEstado(5, "CRUZ");
		tablero.cambiarEstado(6, "CIRCULO");
		tablero.cambiarEstado(4, "CRUZ");
		tablero.cambiarEstado(0, "CIRCULO");
		tablero.cambiarEstado(3, "CRUZ");
		
		boolean hayGanador = Control.hayGanador(3, combinaciones, tablero);
		
		assertTrue(hayGanador);
	}
	
	@Test
	public void TATETIVerticalCruzTest()
	{
		tablero.cambiarEstado(8, "CRUZ");
		tablero.cambiarEstado(2, "CUADRADO");
		tablero.cambiarEstado(6, "CRUZ");
		tablero.cambiarEstado(3, "CUADRADO");
		tablero.cambiarEstado(7, "CRUZ");
		
		boolean hayGanador = Control.hayGanador(7, combinaciones, tablero);
		
		assertTrue(hayGanador);
	}
	
	@Test
	public void TATETIDiagonalACruzTest() 
	{
		tablero.cambiarEstado(2, "CRUZ");
		tablero.cambiarEstado(6, "CIRCULO");
		tablero.cambiarEstado(3, "CRUZ");
		tablero.cambiarEstado(0, "CIRCULO");
		tablero.cambiarEstado(7, "CRUZ");
		
		boolean hayGanador = Control.hayGanador(7, combinaciones, tablero);
		
		assertTrue(hayGanador);
	}
	
	@Test
	public void TATETIDiagonalBCruzTest() 
	{
		tablero.cambiarEstado(2, "CRUZ");
		tablero.cambiarEstado(5, "CIRCULO");
		tablero.cambiarEstado(4, "CRUZ");
		tablero.cambiarEstado(7, "CIRCULO");
		tablero.cambiarEstado(6, "CRUZ");
		
		boolean hayGanador = Control.hayGanador(6, combinaciones, tablero);
		
		assertTrue(hayGanador);
	}
	
	//---------------------------------------------------------------------------------------------------------
	
	//Pruebas con el circulo-----------------------------------------------------------------------------------
	
	@Test
	public void TATETIHorizontalCirculoTest()
	{
		tablero.cambiarEstado(4, "CRUZ");
		tablero.cambiarEstado(7, "CIRCULO");
		tablero.cambiarEstado(2, "CRUZ");
		tablero.cambiarEstado(6, "CIRCULO");
		tablero.cambiarEstado(5, "CRUZ");
		tablero.cambiarEstado(8, "CIRCULO");
		
		boolean hayGanador = Control.hayGanador(8, combinaciones, tablero);
		
		assertTrue(hayGanador); 
	}
	
	@Test
	public void TATETIVerticalCirculoTest()
	{
		tablero.cambiarEstado(1, "CRUZ");
		tablero.cambiarEstado(0, "CUADRADO");
		tablero.cambiarEstado(4, "CRUZ");
		tablero.cambiarEstado(3, "CUADRADO");
		tablero.cambiarEstado(2, "CRUZ");
		tablero.cambiarEstado(6, "CUADRADO");
		
		boolean hayGanador = Control.hayGanador(6, combinaciones, tablero);
		
		assertTrue(hayGanador);
	}
	
	@Test
	public void TATETIDiagonalACirculoTest() 
	{
		tablero.cambiarEstado(0, "CRUZ");
		tablero.cambiarEstado(1, "CIRCULO");
		tablero.cambiarEstado(3, "CRUZ");
		tablero.cambiarEstado(5, "CIRCULO");
		tablero.cambiarEstado(2, "CRUZ");
		tablero.cambiarEstado(6, "CIRCULO");
		
		boolean hayGanador = Control.hayGanador(6, combinaciones, tablero);
		
		assertTrue(hayGanador);
	}
	
	@Test
	public void TATETIDiagonalBCirculoTest() 
	{
		tablero.cambiarEstado(1, "CRUZ");
		tablero.cambiarEstado(0, "CIRCULO");
		tablero.cambiarEstado(2, "CRUZ");
		tablero.cambiarEstado(5, "CIRCULO");
		tablero.cambiarEstado(8, "CRUZ");
		tablero.cambiarEstado(7, "CIRCULO");
		
		boolean hayGanador = Control.hayGanador(7, combinaciones, tablero);
		
		assertTrue(hayGanador);
	}
	
	//---------------------------------------------------------------------------------------------------------
	//Pruebas con ambos----------------------------------------------------------------------------------------
	
	@Test
	public void noHayTATETIHorizontalTest() 
	{
		tablero.cambiarEstado(5, "CRUZ");
		tablero.cambiarEstado(6, "CIRCULO");
		tablero.cambiarEstado(4, "CRUZ");
		tablero.cambiarEstado(0, "CIRCULO");
		tablero.cambiarEstado(1, "CRUZ");
		
		boolean hayGanador = Control.hayGanador(1, combinaciones, tablero);
		
		assertFalse(hayGanador);
	}

}
