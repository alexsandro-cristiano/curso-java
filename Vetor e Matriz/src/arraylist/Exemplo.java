package arraylist;

import java.util.ArrayList;
import java.util.List;

public class Exemplo {
	public static void main(String[] args) {
		List<String> list = new ArrayList<>();

		list.add("Beatriz");
		list.add("Alex");
		list.add("Leonardo");

		// exibindo
		for (String nome : list) {
			System.out.print(nome);
		}

		// adicionando elemento
		list.add(2, "Marco");

		// tamaho da lista
		list.size();

		// removendo
		list.remove(2); // remove quem esta no indice 2
	}
}
