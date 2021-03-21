package br.com.caelum.banco.teste;

import java.util.Scanner;
import br.com.caelum.banco.model.Cliente;
import br.com.caelum.banco.model.Conta;
import br.com.caelum.banco.model.Data;

public class TesteConta {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		final String agencia = "132-78";
		String nome, sobrenome, cpf;
		int dia, mes, ano;
		System.out.println("Cadastrando Conta:");
		System.out.println("\nInformação do Cliente");
		System.out.print("Nome:");
		nome = input.nextLine();
		System.out.print("Sobrenome: ");
		sobrenome = input.nextLine();
		System.out.print("CPF: ");
		cpf = input.nextLine();

		System.out.println();

		System.out.println("\nData (dd/mm/aaaa): ");
		dia = input.nextInt();
		mes = input.nextInt();
		ano = input.nextInt();

		Cliente cl = new Cliente(nome, sobrenome, cpf);
		Data dt = new Data(dia, mes, ano);
		int numero = 34654;
		Conta c1 = new Conta(dt, agencia, numero, cl);

		System.out.println(c1);

		input.close();
	}

}
