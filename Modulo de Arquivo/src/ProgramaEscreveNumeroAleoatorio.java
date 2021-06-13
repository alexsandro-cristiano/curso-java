import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Random;

public class ProgramaEscreveNumeroAleoatorio {
	public static void main(String[] args) {
		// D:\temp

		int[] numeros = new int[5];
		Random rand = new Random();

		for (int i = 0; i < numeros.length; i++) {
			numeros[i] = rand.nextInt(10001);
		}

		String path = "D:\\temp\\numeros_aleatorios.txt";

		try (BufferedWriter bw = new BufferedWriter(new FileWriter(path))) {
			for (int n : numeros) {
				bw.write(Integer.toString(n));
				bw.newLine();
			}

			for (int n : numeros) {
				System.out.println(n);
			}
		} catch (IOException e) {
			e.printStackTrace();
		}

	}
}
