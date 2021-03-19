package br.edu.faeterj.provas.av1;

public class Aviao{
	
	/*Atributos*/
	public static int frota;
	protected String prefixo;
	protected String modelo;
	protected String fabricante;
	private Boolean estarVoando = false;

	/*Construtores*/
	public Aviao() {
		System.out.println("Iniciando a Construção do Avião");
		frota++;
		System.out.println("Avião Construido com Sucesso");
	}

	public Aviao(String prefixo, String modelo, String fabricante) {
		System.out.println("Iniciando a Construção do Avião");
		frota++;
		this.prefixo = prefixo;
		this.modelo = modelo;
		this.fabricante = fabricante;
		System.out.println("Avião Construido com Sucesso");
	}

	/*Metodos Get e Set*/
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

	/*Metodos da Classe*/
	public void levantarVoo() {
		if (estarVoando == false) {
			estarVoando = true;
			System.out.println("\nVOO AUTORIZADO\nESTAMOS VOANDO...");

		} else {
			System.out.println("\nNAO E POSSIVEL INICIAR VOO");

		}
	}

	public void pousar() {
		if (estarVoando == true) {
			estarVoando = false;
			System.out.println("\nINICIANDO POUSO\nPOUSO CONCLUIDO");

		} else {
			System.out.println("\nNAO ESTAMOS VOOANDO");
		}
	}

	/*To String*/
	@Override
	public String toString() {
		return "\nAviao\n" + "Caracteristicas:\n" + "prefixo = " + prefixo + ", modelo = " + modelo + ", fabricante = "
				+ fabricante + "\nQuantidade de Aeronaveis: " + frota + "\nEstado Atual:\n" + "Voando = " + estarVoando;
	}

}