package com.gm.mundopc;

public class Teclado extends DispositivoEntrada {

	private final int idTeclado;
	private static int contadorTeclados;

	public Teclado(String tipo, String marca) {
		super(tipo, marca);
		this.idTeclado = ++Teclado.contadorTeclados;
	}

	@Override
	public String toString() {
		return "Teclado [idTeclado=" + idTeclado + ", " + super.toString() +"]";
	}

}
