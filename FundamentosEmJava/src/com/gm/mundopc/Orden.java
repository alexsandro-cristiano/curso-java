package com.gm.mundopc;

/**
 * @author acgal
 *
 */
public class Orden {

	private int idOrden;
	private Computadora[] computadora;
	private int contadorOrdenes;
	private int contadorComputadoras;
	private int maxComputadoras;

	public Orden() {
	}

	public int getIdOrden() {
		return idOrden;
	}

	public Computadora[] getComputadora() {
		return computadora;
	}

	public int getContadorOrdenes() {
		return contadorOrdenes;
	}

	public int getContadorComputadoras() {
		return contadorComputadoras;
	}

	public int getMaxComputadoras() {
		return maxComputadoras;
	}

	public void agregarComputadora(Computadora computadora) {
		if (getMaxComputadoras() != 0) {
			this.computadora[maxComputadoras] = computadora;
			maxComputadoras++;
		} else {
			this.computadora[maxComputadoras] = computadora;
			maxComputadoras++;
		}
	}

	public void mostrarOrden() {

	}

}
