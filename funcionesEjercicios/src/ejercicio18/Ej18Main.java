package ejercicio18;

public class Ej18Main {
	
	public static void SayHello(String name) {
		IO.println("¡Hola " + name + "!");
	}
	
	public static void SayGoodbye() {
		IO.println("!Adiós!");
	}

	public static void main(String[] args) {
		
		
		SayHello("Juan");
		SayGoodbye();
	}

}
