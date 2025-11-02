package ejercicio19;

public class Ej19Main {

	public static void main(String[] args) {
		Ej19Funcion centrado = new Ej19Funcion();
		
		String userInput = IO.readln("Dime una frase: ");
		
		centrado.stringCentrado(userInput);
		
		
	}

}
