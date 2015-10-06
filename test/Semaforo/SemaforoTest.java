package Semaforo;

import static org.junit.Assert.*;

import org.junit.Test;


import uk.co.placona.helloWorld.Semaforo;

public class SemaforoTest {
	@Test
	public void testColores(){
		Semaforo sem1 = new Semaforo();
		assertEquals("Testeo si me devuelve Rojo", "Rojo", sem1.mostrarColor());
		assertEquals("Testeo si me devuelve Rojo-Amarillo", "Rojo-Amarillo", sem1.mostrarColor());
		assertEquals("Testeo si me devuelve Verde", "Verde", sem1.mostrarColor());
		assertEquals("Testeo si me devuelve Amarillo", "Amarillo", sem1.mostrarColor());
		
	}	
		
	
	
}
