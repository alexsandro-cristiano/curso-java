import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ProgramaManipularArq {
	public static void main(String[] args) {
		String path = "D:\\\\temp\\\\numeros_aleatorios.txt";
		List<Integer> numeros = new ArrayList<>();

		try {
			BufferedReader br = new BufferedReader(new FileReader(path));
			String line = br.readLine();
			while (line != null) {
				numeros.add(Integer.parseInt(line));
				line = br.readLine();
			}

			// li tudo

			for (Integer num : numeros) {
				System.out.println(num);
			}

			Collections.sort(numeros); // ordenei
			path = "D:\\\\temp\\\\numeros_em_ordem_crescente.txt";
			BufferedWriter bw = new BufferedWriter(new FileWriter(path));
			for (int num : numeros) {
				bw.write(Integer.toString(num));
				bw.newLine();
			}

			bw.close();
			br.close();

		} catch (IOException e) {
			System.out.println("Error: " + e.getMessage());
		}

		System.out.println();
		System.out.println();
		for (Integer num : numeros) {
			System.out.println(num);
		}

		System.out.println("fim");

	}
}
