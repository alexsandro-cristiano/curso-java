package matrizes;

import java.util.Scanner;

public class Exercicio1 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		System.out.print("Entre with numbers of rows and column: ");
		int rows = in.nextInt();
		int column = in.nextInt();

		int[][] mat = new int[rows][column];

		// populando a matriz
		for (int i = 0; i < rows; i++) {
			for (int j = 0; j < column; j++) {
				mat[i][j] = in.nextInt();
			}
		}

		System.out.print("Entre with number: ");
		int element = in.nextInt();

		for (int i = 0; i < rows; i++) {
			for (int j = 0; j < column; j++) {
				if (mat[i][j] == element) {
					System.out.print("Position: " + i + ";" + j + ":\n");

					if (j > 0) {
						System.out.println("Left: " + mat[i][j - 1]);
					}
					if (i > 0) {
						System.out.println("Up: " + mat[i - 1][j]);
					}
					if (j < mat[i].length - 1) {
						System.out.println("Right: " + mat[i][j + 1]);
					}
					if (i < mat.length - 1) {
						System.out.println("Down: " + mat[i + 1][j]);
					}

				}
			}
		}
		in.close();
	}

}
