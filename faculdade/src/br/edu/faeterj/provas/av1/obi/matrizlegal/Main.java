package br.edu.faeterj.provas.av1.obi.matrizlegal;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		int linha,coluna;
		int cont=0;
		
		System.out.print("Entre com os numero de linha: ");
		linha = in.nextInt();
		System.out.print("Entre com os numero de coluna: ");
		coluna = in.nextInt();
		
		
		//Declarando a Matriz
		int[][] matriz = new int[linha][coluna];
		
		//Popular a matriz
		for(int i=0; i<matriz.length; i++) {
			for(int j=0; j<matriz.length; j++) {
				System.out.printf("Entre com o elemento[%d][%d]: ", i,j);
				matriz[i][j] = in.nextInt();
			}
		}
		
		//Varrendo a Matriz
		for(int i=0; i<matriz.length; i++) {
			for(int j=0; j<matriz.length; j++) {
				if((matriz[0][0] + matriz[i][j]) < (matriz[i][j] + matriz[i][1])) {
					cont++;
				}
			}
		}
		System.out.println(cont);
		
		in.close();
	}
}
