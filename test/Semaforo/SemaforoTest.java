package Semaforo;

import static org.junit.Assert.*;

import org.junit.Test;


import uk.co.placona.helloWorld.Semaforo;

public class SemaforoTest {
	@Test
	public void testColores(){
		Semaforo sem1 = new Semaforo();
		
		for (int i = 0; i < 55; i++) {
			sem1.pasoDelTiempo(i);
			
			sem1.sacarIntermitente();
			
			if(i >=0 && i <= 29){
				assertEquals("Testeo si me devuelve Rojo", "Rojo", sem1.mostrarColor());
			}
			if(i >29 && i <= 31){
				assertEquals("Testeo si me devuelve Rojo-Amarillo", "Rojo-Amarillo", sem1.mostrarColor());
			}
			if(i >31 && i <= 51){
				assertEquals("Testeo si me devuelve Verde", "Verde", sem1.mostrarColor());
			}
			if(i >51 && i < 54){
				assertEquals("Testeo si me devuelve Amarillo", "Amarillo", sem1.mostrarColor());color= "Amarillo";
			}
			
		}
		
	 
		
		
		
		
		
		
	}	
		
	
	
}
