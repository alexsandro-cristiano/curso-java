/*
 * Fazer um programa para ler um n�mero inteiro N e depois os dados (id, nome e salario) de
N funcion�rios. N�o deve haver repeti��o de id.
Em seguida, efetuar o aumento de X por cento no sal�rio de um determinado funcion�rio.
Para isso, o programa deve ler um id e o valor X. Se o id informado n�o existir, mostrar uma
mensagem e abortar a opera��o. Ao final, mostrar a listagem atualizada dos funcion�rios,
conforme exemplos.
Lembre-se de aplicar a t�cnica de encapsulamento para n�o permitir que o sal�rio possa
ser mudado livremente. Um sal�rio s� pode ser aumentado com base em uma opera��o de
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
