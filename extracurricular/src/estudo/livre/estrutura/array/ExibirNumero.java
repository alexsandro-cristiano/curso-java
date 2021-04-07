package estudo.livre.estrutura.array;

public class ExibirNumero {

	public static void main(String[] args) {
		
		int tamanho = 10;
		//Formas de se declarar e atribuir tamanho no vetor
		int [] vet = new int[10]; //passando o numero
		int vet2 [] = new int[vet.length]; // usando a propriedade length
		int [] vetor3 = new int [tamanho]; // utilizando uma variavel
		
		for(int i=0 ; i < vet.length ; i++) {
			vet[i] = 2;
			vet2[i] = vet[i]*2;
			vetor3[i] = vet[i] + vet2[i];
		}
		
		//utilizando foreach
		System.out.println("Valores do vetor 1");
		for(int element : vet) {
			System.out.println(element);
		}
		
		System.out.println("Valores do vetor 2");
		for(int element : vet2) {
			System.out.println(element);
		}
		
		System.out.println("Valores do vetor 3");
		for(int element : vetor3) {
			System.out.println(element);
		}

	}

}
