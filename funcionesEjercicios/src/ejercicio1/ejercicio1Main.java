package ejercicio1;

public class ejercicio1Main {

	public static void main(String[] args) {
		Ejercicio1 bucleEco = new Ejercicio1();
		
		int num1 = Integer.parseInt(IO.readln("Dime el número de veces que quieres que se repita la palabra 'echo': "));
		
		bucleEco.ecoBucle(num1);
	}

}
