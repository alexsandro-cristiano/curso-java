package vetores;

import java.util.Scanner;

public class Exercicio1 {

	public static int verificarMenor(int u, int v) {
		return (u < v) ? u : v;
	}

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		System.out.print("Informe 2 interios: ");
		int tam = in.nextInt();
		int u, v;
		int cont = 0;
		int[] lista = new int[tam];

		for (int i = 0; i < lista.length; i++) {
			System.out.print("Informe 2 interios: ");
			u = in.nextInt();
			v = in.nextInt();

			lista[i] = verificarMenor(u, v);
			cont++;
		}

		System.out.println(cont);

		for (int i = 0; i < lista.length; i++) {
			System.out.print(lista[i] + " ");
		}

		in.close();

	}

}
