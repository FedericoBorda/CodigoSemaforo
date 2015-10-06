package uk.co.placona.helloWorld;

public class SemTest {
	
	public static void main(String[] args) {
		
		
		Semaforo sem1 = new Semaforo();
		
		System.out.println("el valor es: " + sem1.pasoDelTiempo(51));
		sem1.ponerEnIntermitente();
		sem1.sacarIntermitente();
		sem1.ponerEnIntermitente();
		System.out.println("color: " + sem1.mostrarColor());
		
		
		
	}

}
