package TutorialTrentaSette;
import java.util.InputMismatchException;
import java.util.Scanner;


// Java 37 

// esempi con Arithmetic Exception ---------------------------> per errori di calcolo tipo 5/0
// InputMismatchException ---------------------------> per errori di battitura che non sono numeri
// Exception ---------------------------> eccezione generale

// try catch finally


public class Exception {
	public static void main(String[]args) {
		

		Scanner scanner = new Scanner(System.in);

		try {
		System.out.print("Inserisci un numero");
		int x = scanner.nextInt();
		
		System.out.print("Inserisci secondo numero");
		int y = scanner.nextInt();
		
		int result = x/y;
		System.out.print("Il risultato è : " + result);
		
		}catch(ArithmeticException e){ 
			
			System.out.print("Non puoi dividere per questo numero");
			
		}catch(InputMismatchException e) {
			
			System.out.print("Non puoi dividere un numero per una stringa");
		}catch(Exception e) {
			System.out.print("C'è stato un problema");
		}finally {
			scanner.close();
		}
}

}
