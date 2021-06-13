package vetores;

import java.util.Scanner;

public class Exercicio2 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int[] vet = new int[10]; //declarando vetor
		
		//populando vetor
		
		for(int i=0; i< vet.length; i++) {
			vet[i] = in.nextInt();
		}
		
		//For each
		for(int v : vet) {
			System.out.println(v);
		}
		
		in.close();

	}

}
