package br.edu.faeterj.aulas.exemplos;

import java.util.Scanner;

public class AvioesDePapel {
	public static void main(String[] args) {

		int cand;
		int folhasCand;
		int totalFolhas;
		System.out.println("Digite o número de candidatos, o total folhas por candidato e o total geral de folhas");
		Scanner in = new Scanner(System.in);
		cand = in.nextInt();
		folhasCand = in.nextInt();
		totalFolhas = in.nextInt();

		if (cand * folhasCand <= totalFolhas) {
			System.out.println("ok");
		} else {
			System.out.println("não");
		}
		in.close();
	}

}
