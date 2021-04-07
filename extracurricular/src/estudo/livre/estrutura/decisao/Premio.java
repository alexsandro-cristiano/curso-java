package estudo.livre.estrutura.decisao;
/*
 * A empresa XKW Ltda. concedeu um bonus de 20 por cento
 * do valor do salario a todos os funcionarios com tempo
 * de trabalho na empresa igual ou superior a cinco anos 
 * e de dez por cento aos demais. Calcule e exibir o valor do bonus
 * EXEMPLO 5.5 - Livro: Logica de Programação e Estrutura de Dados - Sandra Puga e Gerson Rissetti
 * */

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Premio {

	public static void main(String[] args) {

		BufferedReader input;
		/*Outra forma:
		 * Scanner input = new Scanner(System.in); //do java.util.Scanner*/
		input = new BufferedReader (new InputStreamReader(System.in));
		float salario, bonus;
		int tempo;
		
		try {
			System.out.print("Qual seu salario: ");
			salario = Float.parseFloat(input.readLine());
			
			System.out.print("Quanto tempo está na empresa: ");
			tempo = Integer.parseInt(input.readLine());
			if(tempo >= 5) {
				//ganha 20 por cento
				bonus = salario * 0.2f;
			}
			else {
				bonus = salario * 0.1f;
			}
			System.out.println("O valor do bônus é: " + bonus);
		}
		catch(Exception e) {
			System.out.println("Ocorreu um erro na leitura");
		}
	}
}
