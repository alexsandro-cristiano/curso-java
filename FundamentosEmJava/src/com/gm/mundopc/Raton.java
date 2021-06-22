package com.gm.mundopc;

public class Raton extends DispositivoEntrada {

	private final int idRaton; //corre��o variavel tem que ser final
	private static int contadorRatones; //corre��o variavel tem que ser estatica

	public Raton(String tipo, String marca) {
		super(tipo, marca); //corre��o nao mandou os atributos para mae
		Raton.contadorRatones++;
		this.idRaton = Raton.contadorRatones;
	}

	@Override
	public String toString() {
		return "Raton [idRaton=" + idRaton + ", " + super.toString() +  "]";
	}

}
