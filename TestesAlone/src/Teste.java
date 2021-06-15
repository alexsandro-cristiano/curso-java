
public class Teste {

	public static void main(String[] args) {
		String fruit = new String("strawberries");
		
		if(fruit instanceof String) {
			System.out.println("true");
		}
		
		String str = fruit.substring(2,5);
		System.out.println(str);

	}

}
