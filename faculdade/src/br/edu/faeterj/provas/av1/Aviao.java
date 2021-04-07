package br.edu.faeterj.provas.av1;

public class Aviao {

	/* Atributos */
	public static int frota; //publico
	private String prefixo; // privado
	private String modelo;
	private String fabricante;
	protected Boolean estarVoando = false; //protegido

	/* Construtores */
	public Aviao() {
		frota++;
		System.out.println("Novo Avião Construido");
	}

	public Aviao(String prefixo, String modelo, String fabricante) {
		frota++;
		this.prefixo = prefixo;
		this.modelo = modelo;
		this.fabricante = fabricante;
		System.out.println("Novo Avião Construido");
	}

	/* Metodos Get e Set */
	public static int getFrota() {
		return frota;
	}

	public String getPrefixo() {
		return prefixo;
	}

	public void setPrefixo(String prefixo) {
		this.prefixo = prefixo;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public String getFabricante() {
		return fabricante;
	}

	public void setFabricante(String fabricante) {
		this.fabricante = fabricante;
	}

	public Boolean getEstarVoando() {
		return estarVoando;
	}

	/* Metodos da Classe */
	public void levantarVoo() {
		if (estarVoando == false) {
			estarVoando = true;
			System.out.println("\nVoo Autorizado Avião " + this.modelo + "-" + this.fabricante + "\nVOANDO...");
		} else {
			System.out.println("\nNão foi possivel iniciar voo Avião " + this.modelo + "-" + this.fabricante);
		}
	}

	public void pousar() {
		if (estarVoando == true) {
			estarVoando = false;
			System.out.println("\nIniciando Sistema de pouso\nPouso Concluido");
		} else {
			System.out.println("\nAvião" + this.modelo + this.fabricante + "nao esta voando");
		}
	}

	/* To String */
	@Override
	public String toString() {
		return "\nAviao\n" + "Caracteristicas:\n" + "prefixo = " + prefixo + ", modelo = " + modelo + ", fabricante = "
				+ fabricante + "\nQuantidade de Aeronaveis: " + frota + "\nEstado Atual:\n" + "Voando = " + estarVoando;
	}

}