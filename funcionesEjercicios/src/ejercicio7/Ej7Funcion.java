package ejercicio7;

public class Ej7Funcion {
	
	public double calculadoraAreas(double userInput) {
		
		double resultado = 0;
		
		
		
		switch ((int)userInput) {
			case 1:
				double base = Double.parseDouble(IO.readln("Proporcione la base del triángulo: "));
				double altura = Double.parseDouble(IO.readln("Proporcione la altura del triángulo: "));
				resultado = (base*altura)/2;
				
				IO.println("El área de este triángulo es: " + resultado);
				break;
				
			case 2: 
				double lado = Double.parseDouble(IO.readln("Introduzca el lado del Cuadrado: "));
				resultado = lado*lado;
				IO.println("El área de este cuadrado es: " + resultado);
				break;
			case 3:
				double radio = Double.parseDouble(IO.readln("Dime el radio del círculo: "));
				resultado = (Math.pow(radio, 2))*Math.PI;
				
				IO.println("El área de este circulo es: " + resultado);
				break;
			default:
				throw new RuntimeException("Dato introducido incorrecto.");
			
		}
		
		
		
		
		return (userInput);
	}
	
}
