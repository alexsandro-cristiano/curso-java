/*
 *
 * Parte 1 - Fazer um programa para ler um número inteiro N - ok
 * Parte 1.1 - depois os dados (id, nome e salario) de N funcionários. - ok
 * 
 * Parte 2 - Não deve haver repetição de id.
 * 
 * Parte 3 - Em seguida, efetuar o aumento de X por cento no salário de um determinado funcionário.
 * 	Para isso, o programa deve ler um id e o valor X.
 * 		Se o id informado não existir,
 * 			mostrar uma mensagem e abortar a operação.
 * 
 * Ao final, mostrar a listagem atualizada dos funcionários, conforme exemplos.
 * Lembre-se de aplicar a técnica de encapsulamento para não permitir que o salário possa
 * ser mudado livremente.
 * Um salário só pode ser aumentado com base em uma operação de aumento por porcentagem dada.
*/
package javacompleto.exercicios.secao.dez.vetor.lista;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Programa {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US); // correcao: utilizar o separador . casa decimais
		Scanner input = new Scanner(System.in);

		System.out.print("How many employees will be registered? ");
		int N = input.nextInt();

		/*
		 * Correcao - 1 instancia o obj
		 *  2 add obj na lista escolhido o ArrayList por
		 * saber a quantidade de funcionarios
		 * 
		 * Se antes do Java 7 List<Employee> listEmployees = new ArrayList<Employee>();
		 */
		List<Employee> listEmployees = new ArrayList<>();

		for (int i = 0; i < N; i++) {
			System.out.println("Employee #" + (i + 1) + ":");

			 int id = lerIdValido(input, listEmployees);

			//System.out.print("Enter with the id: ");
			//int id = input.nextInt();

			System.out.print("Enter with the name: ");
			input.nextLine();
			String name = input.nextLine();
			System.out.print("Enter with the salary: ");
			double salary = input.nextDouble();
			// meu - listEmployees.add(new Employee(id,name,salary));
			/* Correcao */
			Employee emp = new Employee(id, name, salary);
			listEmployees.add(emp);
		}

		System.out.print("Enter the employee id that will have salary increase");
		int idSalary = input.nextInt();

		Integer pos = positionId(idSalary, listEmployees);
		if (pos == null) {
			System.out.println("This id does not exits");
		} else {
			System.out.print("Enter the percentage: ");
			double percent = input.nextDouble();
			listEmployees.get(pos).increaseSalary(percent);
		}

		/*
		 * Utilizando lambda Employee emp = listEmployees.stream().filter(x -> x.getId()
		 * == idSalary).findFirst().orElse(null);
		 * 
		 * if (emp == null) { System.out.println("This id does not exits"); } else {
		 * System.out.print("Enter the percentage: "); double percent =
		 * input.nextDouble(); emp.increaseSalary(percent); }
		 */

		System.out.println();
		System.out.println("List of employee:");

		for (Employee employee : listEmployees) {
			System.out.println(employee);
		}

		input.close();
	}

	public static Integer positionId(int id, List<Employee> list) {
		for (int i = 0; i < list.size(); i++) {
			if (id == list.get(i).getId()) {
				return i;
			}
		}
		return null;
	}

	private static Boolean hasId(int id, List<Employee> list) {
		for (int i = 0; i < list.size(); i++) {
			if (id == list.get(i).getId()) {
				return true;
			}
		}
		return false;
	}
	
	public static int lerIdValido(Scanner input, List<Employee> list) {
		System.out.print("Enter with id: ");
		int id = input.nextInt();
		
		if(list.isEmpty()) {
			return id;
		}
		else {
			while(hasId(id,list)) {
				System.out.print("\nId already in list\nEnter another id: ");
				id = input.nextInt();
			}
		}
		return id;
	}
}
