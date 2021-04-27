package br.edu.faeterj.aulas.exemplos;

import java.util.Scanner;

public class ConversaoBases {
	public static void main(String[] args) {

		System.out.println("Digitar um número");
		Scanner in = new Scanner(System.in);
		Integer num = in.nextInt();

		System.out.println(Integer.toBinaryString(num));
		System.out.println(Integer.toHexString(num).toUpperCase());
		System.out.println(Integer.toOctalString(num));
		
		in.close();

	}

}
