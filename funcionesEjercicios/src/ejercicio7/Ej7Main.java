package ejercicio7;

public class Ej7Main {

	public static void main(String[] args) {
		Ej7Funcion calculador = new Ej7Funcion();
		
		double userInput;
		
		IO.println("===Calculadora Áreas===");
		IO.println("1. Triángulo.");
		IO.println("2. Cuadrado.");
		IO.println("3. Círculo.");
		userInput = Double.parseDouble(IO.readln("Elige la forma que quieres calcular el área, seleccione el número: "));
		
		calculador.calculadoraAreas(userInput);
		
		
	}

}
