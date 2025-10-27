package ejercicio3;

public class FuncionEj3 {

	public void PrimosFuncion (int limit) {
		

		for (int n = 2; n <= limit; n++) {
			boolean esPrimo = true;
			
			for (int i = 2; i <= Math.sqrt(n); i++) {
				if (n % i == 0) {
					esPrimo = false;
					break;
				} 
			}
			if (esPrimo == true) {
				IO.print(n + ", ");
			}
		}  
        
	}
}
