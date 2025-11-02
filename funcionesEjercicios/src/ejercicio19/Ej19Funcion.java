package ejercicio19;


public class Ej19Funcion {
	
	public void stringCentrado(String userInput) {
		
		
		int espaciosNecesarios = (80-userInput.length())/2;
		
		for (int i = 0; i < espaciosNecesarios; i++) {
			IO.print(" ");
		}
		
		IO.print(userInput);
		
		
	}

}
