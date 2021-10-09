package exercicio.arquivo.mercado;

public class Main {

	public static void main(String[] args) {
		Market market = new Market();
		
		market.criar();
		market.inserirProduto("Arroz", "15.60");
		market.inserirProduto("Feijão", "5.60");
		market.inserirProduto("Carne", "36.00");
		market.inserirProduto("Batata", "1.20");
		
		System.out.println("ok");
		
		System.out.print(market.buscar("1.20"));
	}

}
