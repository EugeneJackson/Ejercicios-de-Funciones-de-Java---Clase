package ejercicio5;

public class Ej5Main {

	public static void main(String[] args) {
		Ej5Funcion convertorOctal = new Ej5Funcion();
		
		int userInput;
		
		userInput = Integer.parseInt(IO.readln("Dime un número entero para pasarlo a Octal: "));
		
		convertorOctal.decimalOctal(userInput);
	}

}
