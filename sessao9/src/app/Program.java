package app;

import java.util.Scanner;

import models.entities.AccountBank;

public class Program {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String number;
		String holder;
		Double value;
		AccountBank ac1;
		System.out.print("Enter account number: ");
		number = in.nextLine();
		System.out.print("Enter account holder: ");
		holder = in.nextLine();

		System.out.print("Is there na Initial deposit (y/n): ");
		char r = in.nextLine().charAt(0);
		if (r != 'n') {
			System.out.print("Enter Initial deposit value: ");
			value = in.nextDouble();
			ac1 = new AccountBank(number, holder, value);
		} else {
			ac1 = new AccountBank(number, holder);
		}
		System.out.println(ac1);

		System.out.print("Enter a deposit value: ");
		value = in.nextDouble();
		ac1.deposit(value);
		System.out.println(ac1);

		System.out.print("Enter a withdraw value: ");
		value = in.nextDouble();
		ac1.withdraw(value);
		System.out.println(ac1);

		in.close();
	}
}
