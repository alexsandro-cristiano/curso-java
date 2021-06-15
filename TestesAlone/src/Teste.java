import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Teste {

	public static void main(String[] args) {
		String fruit = new String("strawberries");
		
		if(fruit instanceof String) {
			System.out.println("true");
		}
		
		String str = fruit.substring(2,5);
		System.out.println(str);
	
		System.out.println("--------------------------------------------------");

		
		String[] array = {"abc","2","10","0"};
		
		List<String> list = Arrays.asList(array);
		
		Collections.sort(list);
		System.out.println(Arrays.toString(array));
	}

}
