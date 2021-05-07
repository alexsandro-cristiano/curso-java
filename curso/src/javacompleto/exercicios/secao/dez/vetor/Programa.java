/*
 * A dona de um pensionato possui dez quartos para alugar para estudantes
 * sendo esses quartos identificados pelos numeros 0 a 9
 * fazer um programa que inicie com todos os dez quartos vazios, e depois
 * leia uma quantidade N representando o numero de estudantes que vao alugar o quartos
 * em seguida registre o aluguel dos n estudantes. Para cada registro
 * de aluguel informar o nome e email do estudante
 * bem como qual dos quartos ele escolheu
 * suponha que seja escolhido um quarto vago
 * ao final seu programa deve imprimir um relatorio
 * de todas ocupacoes do pensionato por ordem
 * de quarto */
package javacompleto.exercicios.secao.dez.vetor;

import java.util.Scanner;

public class Programa {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		Room[] vet = new Room[10];
		
		System.out.println("how many rooms will be rented?");
		int n = in.nextInt();
		
		for(int i=0; i< n;i++) {
			System.out.println("Rent #" + i + ":");
			System.out.println("Name: ");
			in.nextLine();
			String name = in.nextLine();
			System.out.println("E-mail: ");
			String email = in.nextLine();
			System.out.println("Room: ");
			int room = in.nextInt();
			
			vet[room]= new Room(name, email);
			
		}
		
		System.out.println("Busy Room");
		for(int i=0; i<vet.length; i++) {
			if(vet[i] != null) {
				System.out.println(i + vet[i].toString());
			}
			
		}

		in.close();
	}

}
