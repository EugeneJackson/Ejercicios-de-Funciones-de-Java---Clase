package ejercicio22;

public class Ej22Main {

	public static void main(String[] args) {
		Ej22Funcion Suma = new Ej22Funcion();
		
		int userInput;
		userInput = Integer.parseInt(IO.readln("Dime un número: "));
		
		Suma.SumDigits(userInput);
		
	}

}
