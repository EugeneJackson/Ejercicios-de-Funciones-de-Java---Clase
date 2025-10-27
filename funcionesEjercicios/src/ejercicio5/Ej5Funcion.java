package ejercicio5;

import java.util.List;
import java.util.ArrayList;

public class Ej5Funcion {
	
	public void decimalOctal(int userInput) {
		List<Integer> resultado = new ArrayList<>();
		
		while (userInput > 0) {
			int res = userInput % 8;
			resultado.add(res);
			userInput = userInput/8;
		}
		
		for (int i = resultado.size() - 1; i >= 0; i--) {	
			int bit = resultado.get(i);
			IO.print(bit);
		}
	}
	
	
	
}
