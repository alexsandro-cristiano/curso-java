import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Programa2 {
	public static void main(String[] args) {

		File file = new File(
				"D:\\workspace\\curso_java\\curso\\src\\javacompleto\\exercicios\\secao\\dezessete\\arquivo\\teste.txt");
		Scanner sc = null;

		try {
			sc = new Scanner(file);
			while (sc.hasNextLine()) {
				System.out.print(sc.nextLine());
			}
		} catch (IOException e) {
			System.out.print("Error: " + e.getMessage() + "\n");
		} finally {
			if (sc != null) {
				sc.close();
			}
		}
	}

}
