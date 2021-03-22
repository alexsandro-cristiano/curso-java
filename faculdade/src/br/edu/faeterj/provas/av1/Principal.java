package br.edu.faeterj.provas.av1;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		System.out.println("Cadastrar Avião:");
		System.out.print("Prefixo: ");
		String prefixo = input.nextLine();

		System.out.print("Modelo: ");
		String modelo = input.nextLine();

		System.out.print("Fabricante: ");
		String fabricante = input.nextLine();

		Aviao aviao1 = new Aviao();
		aviao1.setPrefixo("BR-");
		aviao1.setFabricante("FAETERJ");
		aviao1.setModelo("POO");

		Aviao aviao2 = new Aviao(prefixo, modelo, fabricante);

		aviao1.levantarVoo();
		aviao2.levantarVoo();

		aviao1.levantarVoo();

		aviao1.pousar();

		System.out.print("Digite uma letra para continuar: ");
		input.next();
		System.out.print(aviao1);
		System.out.println();
		System.out.print(aviao2);

		input.close();
	}
}
