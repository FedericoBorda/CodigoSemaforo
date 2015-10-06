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
		
		if(contador >0 && contador <= 30){
			color= "Rojo";
		}
		if(contador >30 && contador <= 32){
			color= "Rojo-Amarillo";
		}
		if(contador >32 && contador <= 52){
			color= "Verde";
		}
		if(contador >52 && contador < 54){
			color= "Amarillo";
		}

	}
	
	
	public int pasoDelTiempo(int segundos){
		
		contador += contador + segundos;
			
		return contador;
			
	}
	
	
	

}
