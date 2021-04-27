package br.edu.faeterj.aulas.av1;

import java.util.Scanner;

public class IdadeDaDonaMonica {

	public static void main(String[] argv) {
		Scanner input = new Scanner(System.in);
		
		/*
		 * Entrada respectivamente da mae, filho 1 e filho 2
		 */
		int M = input.nextInt();
		int A = input.nextInt();
		int B = input.nextInt();
		
		int filhoMaisVelho = Math.abs(((A+B)-M));
		
		System.out.println();
		
		System.out.print(filhoMaisVelho);


	}
}
