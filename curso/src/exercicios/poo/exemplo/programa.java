package exercicios.poo.exemplo;

public class programa {

	public static void main(String[] args) {
		Quarto qt1 = new Quarto("1", Estado.VAGO);
		Quarto qt2 = new Quarto("2", Estado.VAGO);
		Quarto qt3 = new Quarto("3", Estado.VAGO);
		
		qt1.alugarQuarto();
		System.out.println(qt1);
		qt2.alugarQuarto();
		System.out.println(qt2);
		qt3.liberarQuarto();
		
		qt1.liberarQuarto();
		
		System.out.println(qt1);
		System.out.println(qt3);
		System.out.println(qt2);
		
	}

}
