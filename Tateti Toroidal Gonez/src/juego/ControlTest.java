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
