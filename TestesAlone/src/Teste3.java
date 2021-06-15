import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Teste3 {
	public static void main(String[] args) {

		List<String> list = new ArrayList<>();
		
		list.add("z");
		list.add("v");
		list.add("f");
		list.add("a");
		list.add("r");
		list.add("y");
		
		list.sort(Comparator.comparing(String::toString));
		//list.sort(List.DESCENDING);
		list = list.stream().sorted((s1,s2)->s1.compareTo(s2)).collect(Collectors.toList());
		Collections.sort(list);

		
		List<Boolean> lista = new ArrayList<>();
		lista.add(true);
		lista.add(Boolean.parseBoolean("FalSe"));
		lista.add(Boolean.TRUE);
		
		System.out.println(lista.size());
		System.out.println(lista.get(1) instanceof Boolean);
		
		
		
	}

}
