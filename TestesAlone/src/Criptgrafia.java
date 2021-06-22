import java.util.Scanner;

public class Criptgrafia {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		/*
		 * Criptografar
		 * 	recebe um nome
		 * 	passa para mausculo
		 * 	troca as letras
		 * 
		 * Descriptografar*/
		
		String original = sc.nextLine();
		String copy = original.toUpperCase();
		
		char[] car = original.toUpperCase().toCharArray();
		
		System.out.print(copy);
		System.out.println();
		for(Character c : car) {
			System.out.print(c);
		}
		
		/*
		65 - A  66 - B  67 - C  68 - D  69 - E  70 - F  71 - G  72 - H
		73 - I  74 - J  75 - K  76 - L  77 - M  78 - N  79 - O  80 - P
		81 - Q  82 - R  83 - S  84 - T  85 - U  86 - V  87 - W  88 - X
		89 - Y  90 - Z*/
	
		
	}
	
}
