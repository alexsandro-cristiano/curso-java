package generic1.app;

import java.util.Scanner;

import generic1.service.PrintService;

public class Program {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		PrintService<Integer> ps = new PrintService<>();

		System.out.print("How many values? ");
		int n = sc.nextInt();

		try {
			for (int i = 0; i < n; i++) {
				Integer value = sc.nextInt();
				ps.addValue(value);
			}

			ps.print();
			Integer x = ps.first();
			System.out.println("First: " + x);
		}
		catch(IllegalStateException e) {
			System.out.println("capturei\n\nErro: " + e.getMessage());
		}
		finally {
			sc.close();
		}
		
	}

}
