package ejercicio4;


public class FuncionCalculadora {
	
	public void Calculadora(float num1, float num2, String operador) {
		
		float resultado = 0;
		
		switch (operador) {
			case "+":
				resultado = num1+num2;
				String sumaFormateada = String.format("%.0f", resultado);
				IO.println("El resultado es: " + sumaFormateada);
				break;
			case "-":
				resultado = num1-num2;
				String restaFormateada = String.format("%.0f", resultado);
				IO.println("El resultado es: " + restaFormateada);
				break;
			case "*":
				resultado = num1*num2;
				String multFormateada = String.format("%.0f", resultado);
				IO.println("El resultado es: " + multFormateada);
				break;
			case "/":
				resultado = num1/num2;
				IO.println("El resultado es: " + resultado);
				break;
			default:
				throw new RuntimeException("chupa marica jaja");
		}
		
	}
	
}
