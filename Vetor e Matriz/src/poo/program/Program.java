package poo.program;

import java.util.Scanner;

import poo.entities.Room;

public class Program {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		Room[] vet = new Room[10];

		System.out.println("how many rooms will be rented?");
		int n = in.nextInt();

		for (int i = 0; i < n; i++) {
			System.out.println("Rent #" + i + ":");
			System.out.println("Name: ");
			in.nextLine();
			String name = in.nextLine();
			System.out.println("E-mail: ");
			String email = in.nextLine();
			System.out.println("Room: ");
			int room = in.nextInt();

			vet[room] = new Room(name, email);

		}

		System.out.println("Busy Room");
		for (int i = 0; i < vet.length; i++) {
			if (vet[i] != null) {
				System.out.println(i + vet[i].toString());
			}

		}

		in.close();
	}

}
