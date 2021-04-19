package br.edu.faeterj.provas.av1.obi.idadedonamonica;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
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
