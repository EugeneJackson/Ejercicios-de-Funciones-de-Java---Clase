package ejercicio22;

public class Ej22Funcion {
	
	public void SumDigits(int userInput) {
		int suma = 0;
		
		while (userInput > 0) {
			int resto = userInput % 10;
			suma = suma+resto;
			userInput = userInput / 10;
		}
		IO.println("La suma de cada número del número introducido es:  " + suma);
		
	}
	
}
