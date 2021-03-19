package br.edu.faeterj.aulas.exemplos;

public class SobreString {
	public static void main(String[] args) {

		String msg = "Olá Bom Dia";

		System.out.println(msg.toUpperCase());
		System.out.println(msg.toLowerCase());
		System.out.println(msg.contains("Bom"));
		System.out.println(msg.equals("Miguel"));
		System.out.println(msg.startsWith("Olá"));
		System.out.println(msg.endsWith("teste"));

		String lista[] = msg.split(" ");

		System.out.println(lista[1]);

	}

}
