/*
 * Fazer um programa para ler um número inteiro N e depois os dados (id, nome e salario) de
N funcionários. Não deve haver repetição de id.
Em seguida, efetuar o aumento de X por cento no salário de um determinado funcionário.
Para isso, o programa deve ler um id e o valor X. Se o id informado não existir, mostrar uma
mensagem e abortar a operação. Ao final, mostrar a listagem atualizada dos funcionários,
conforme exemplos.
Lembre-se de aplicar a técnica de encapsulamento para não permitir que o salário possa
ser mudado livremente. Um salário só pode ser aumentado com base em uma operação de
aumento por porcentagem dada.
*/
package javacompleto.exercicios.secao.dez.vetor.lista;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Programa {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("How many employees will be registered? ");
		int N = input.nextInt();
		
		int id;
		String name;
		double salary;
		/*
		 * escolhido o ArrayList por saber a quantidade de funcionarios
		 */
		List<Employee> listEmployees = new ArrayList<>();
		
		for(int i=0; i<N; i++) {
			System.out.println("Employee # " + (i+1));
			System.out.print("Enter with id: ");
			id = input.nextInt();
			System.out.print("Enter with the name: ");
			input.nextLine();
			name = input.nextLine();
			System.out.print("Enter with the salary: ");
			salary = input.nextDouble();
			listEmployees.add(new Employee(id,name,salary));
		}
		
		for (Employee employee : listEmployees) {
			System.out.println(employee);
		}
		
		input.close();
	}
	
}
