package ejercicio4;

public class Calculadora {

	public static void main(String[] args) {
		
		FuncionCalculadora calculadora = new FuncionCalculadora();
		
		float num1, num2;
		String operador;
		
		num1 = Float.parseFloat(IO.readln("Dime el número 1: "));
		num2 = Float.parseFloat(IO.readln("Dime el número 2: "));
		operador = IO.readln("Dime el operador +, -, *, /: ");
		
		calculadora.Calculadora(num1, num2, operador);
		
	}

}
