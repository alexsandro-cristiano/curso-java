package exercicios;

import java.util.Scanner;

public class Ola {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("escreva seu nome:");
		String nome = input.nextLine();
		
		System.out.print("Oi "+nome);
		
		input.close();

	}

}
