package juego;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class TableroTest {
	
	Tablero tablero;
	
	@Before
	public void inicializacion() 
	{
		tablero = new Tablero();
	}
	
	
	@Test
	public void SeCambioElEstadoDeLaUbicacionIngresadaTest() 
	{
		tablero.cambiarEstado(5, "CIRCULO");
		assertEquals(tablero.verEstado(5) , "CIRCULO");
	}
	

	@Test ( expected = RuntimeException.class )
	public void ubicacionIngresadaEstaOcupadaTest() 
	{
		tablero.cambiarEstado(1,"CRUZ");
		tablero.cambiarEstado(1,"CIRCULO");
	}
	
	
	@Test ( expected = ArrayIndexOutOfBoundsException.class )
	public void ubicacionIngresadaNegativaTest() 
	{
		tablero.cambiarEstado(-1, "CRUZ");
	}
	
	
	@Test ( expected = ArrayIndexOutOfBoundsException.class )
	public void ubicacionIngresadaPositivaFueraDelTableroTest() 
	{
		tablero.cambiarEstado(9, "CRUZ");
	}

}
