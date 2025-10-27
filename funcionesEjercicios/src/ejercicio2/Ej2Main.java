package ejercicio2;

public class Ej2Main {

	public static void main(String[] args) {
		FuncionEj2 Returner = new FuncionEj2();
		
		int num1, num2;
		
		num1 = Integer.parseInt(IO.readln("Dime el primer número: "));
		num2 = Integer.parseInt(IO.readln("Dime el segundo número: "));
		
		Returner.Intermedio(num1, num2);
	}

}
