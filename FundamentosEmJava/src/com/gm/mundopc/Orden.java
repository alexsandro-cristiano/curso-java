package com.gm.mundopc;

/**
 * @author acgal
 *
 */
public class Orden {

	private final int idOrden;
	private Computadora[] computadora;
	private static int contadorOrdenes;
	private int contadorComputadoras;
	private final static int MAX_COMPUTADORAS = 10;

	/*
	 * Aqui cada objeto do Orden tera seu proprio vetor de computadoras Caso voce
	 * esqueça lembre-se de uma nota fiscal. Na qual demos varias notas fiscais e
	 * cada uma pode tem varios itens
	 */
	public Orden() {
		this.idOrden = ++Orden.contadorOrdenes;
		this.computadora = new Computadora[Orden.MAX_COMPUTADORAS]; // iniciando o array
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

	public void agregarComputadora(Computadora computadora) {
		if (this.contadorComputadoras < Orden.MAX_COMPUTADORAS) {
			this.computadora[this.contadorComputadoras++] = computadora;
			/*
			 * O codigo a cima é equivalente a escrever:
			 * this.computadora[this.contadorComputadoras] = computadora;
			 * this.contadorComputadoras++
			 */
		}
		else { 
			System.out.print("Has superado el limite\nLimite es " + Orden.MAX_COMPUTADORAS);
		}
	}

	public void mostrarOrden() {
		System.out.println("Orden #" + idOrden);
		System.out.println("Computadoras de la orden #" + this.idOrden);
		for(int i=0; i< this.computadora.length; i++) {
			System.out.println(this.computadora[i]);
		}

	}

}
