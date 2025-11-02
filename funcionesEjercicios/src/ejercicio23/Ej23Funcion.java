package ejercicio23;

public class Ej23Funcion {

	
	public void writeRectangle(int ancho, int alto) {
		
		char rectangleChar = '+';
		
		for (int altoCont = 0; altoCont < alto; altoCont++) {
			for (int anchoCont = 0; anchoCont<ancho; anchoCont++) {
				IO.print(rectangleChar);
			}
			IO.println();
		}
		
	}
 	
}
