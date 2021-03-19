package br.edu.faeterj.aulas.exemplos;

import java.util.Scanner;

public class Media {

	public static void main(String[] args) {

		System.out.println("Digite nota 1 e nota 2");
		Scanner in = new Scanner(System.in);
		float n1 = in.nextFloat();
		float n2 = in.nextFloat();
		float media = (n1 + n2) / 2;
		System.out.println(media);
		
		in.close();

	}

}
