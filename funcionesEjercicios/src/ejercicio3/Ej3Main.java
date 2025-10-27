package ejercicio3;

public class Ej3Main {

	public static void main(String[] args) {
		FuncionEj3 Primos = new FuncionEj3();
		
		int limit;
		 
		limit = Integer.parseInt(IO.readln("Dime un número: "));
		
		Primos.PrimosFuncion(limit);
	}

}
