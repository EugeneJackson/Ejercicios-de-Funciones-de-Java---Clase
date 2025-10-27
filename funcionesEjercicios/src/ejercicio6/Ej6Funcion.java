package ejercicio6;

import java.util.ArrayList;
import java.util.List;

public class Ej6Funcion {
	
	public void decimalHex (int userInput) {
		List<Integer> resultado = new ArrayList<>();
		
		while (userInput > 0) {
			int res = userInput % 16;
			resultado.add(res);
			userInput = userInput/16;
		}
		
		for (int i = resultado.size() - 1; i >= 0; i--) {	
			int bit = resultado.get(i);
			IO.print(bit);
		}
	}
}
