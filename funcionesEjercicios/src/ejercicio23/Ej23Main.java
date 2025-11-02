package ejercicio23;

public class Ej23Main {

	public static void main(String[] args) {
		Ej23Funcion rectangle = new Ej23Funcion();
		
		int ancho = Integer.parseInt(IO.readln("Dime el ancho: "));
		int alto = Integer.parseInt(IO.readln("Dime el alto: "));
		
		
		rectangle.writeRectangle(ancho, alto);
		
		
	}

}
