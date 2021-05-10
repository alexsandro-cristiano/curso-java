package br.edu.faeterj.aula;

import java.util.LinkedList;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		LinkedList<Aluno> list = new LinkedList<>();
		
		list.add(new Aluno("Bene", 10.0));
		list.add(new Aluno("Maria", 5.5));
		list.add(new Aluno("Zuleide", 8.0));
		list.add(new Aluno("Afonso", 7.9));
		list.add(new Aluno("Gustavo", 2.3));
		
		double media = 0;
		double notas=0;
		for (Aluno aluno : list) {
			notas += aluno.getNota();
		}
		media = notas / list.size();
		
		System.out.printf("\n\nMedia = %.2f",media);
		
		sc.close();
	}
}
