package br.com.caelum.apostila.cap4.banco;

public class Data {
	int dia;
	int mes;
	int ano;

	@Override
	public String toString() {
		String s = " Data: " + this.dia + "/" + this.mes + "/" + this.ano;
		return s;
	}

}
