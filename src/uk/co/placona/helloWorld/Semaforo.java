package uk.co.placona.helloWorld;

public class Semaforo {

	
	private String color;
	private int contador=0;
		
	
	public String mostrarColor(){
		
		return color;
		
	}
	
	public void ponerEnIntermitente(){
		
		if (contador % 2 == 0){
			color = "Amarillo";
		}
		if (contador % 2 != 0){
			color =  "Apagado";
		}
		
		
		
	}
	
	public void sacarIntermitente(){
		
		contador= contador % 54;
		
		if(contador >=0 && contador <= 29){
			color= "Rojo";
		}
		if(contador >29 && contador <= 31){
			color= "Rojo-Amarillo";
		}
		if(contador >31 && contador <= 51){
			color= "Verde";
		}
		if(contador >51 && contador < 54){
			color= "Amarillo";
		}
		
		

	}
	
	
	public int pasoDelTiempo(int segundos){
		
		contador = segundos;
			
		return contador;
			
	}
	
	
	

}
