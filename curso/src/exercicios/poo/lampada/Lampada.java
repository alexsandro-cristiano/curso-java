package exercicios.poo.lampada;

public class Lampada {

	// Exercicio proposto no curso de Java Basico da Loiane Groner
	private String cor;
	private String potencia;
	private Boolean lampadaLigada = false;

	public Lampada() {

	}

	public Lampada(String cor, String potencia) {
		this.cor = cor;
		this.potencia = potencia;
	}

	public String getCor() {
		return cor;
	}
	
	public String getPotencia() {
		return potencia;
	}
	
	public void ligar() {
		if (verificarEstadoLampada()) {
			this.lampadaLigada = true;
			System.out.print("Lampada Ligada\n");
		} else {
			System.out.print("Lampada já esta Ligada\n");
		}
	}

	public void desligar() {
		if (!verificarEstadoLampada()) {
			this.lampadaLigada = false;
			System.out.print("Lampada Desligada\n");
		} else {
			System.out.print("Lampada já esta Desligada\n");
		}
	}

	private Boolean verificarEstadoLampada() {
		return (lampadaLigada == false) ? true : false;
	}
}
