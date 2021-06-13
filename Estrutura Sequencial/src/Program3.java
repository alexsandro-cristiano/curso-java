import java.util.Scanner;

public class Program3 {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		
		int numero = in.nextInt();
		
		if(ePar(numero)) {
			System.out.println("Numero Digitado: " + numero + " é par!");
		}
		else {
			System.out.println("Numero Digitado: " + numero + " é impar!");
		}

		in.close();
	}
	
	public static boolean ePar(int numero) {
		return (numero % 2 == 0) ? true : false;
	}

}
