package com.gm.mundopc;

public class Monitor {

	private final int idMonitor; //correção id tem que ser uma constante
	private String marca;
	private Double tamano;
	private static int contadorMonitores;

	// Correção: deixar o constrututor vazio privado para somente inicializar o id
	private Monitor() {
		this.idMonitor = ++Monitor.contadorMonitores;
	}

	public Monitor(String marca, Double tamano) {
		this(); //utilizando o this para chamar o construtor sem argumentos
		this.marca = marca;
		this.tamano = tamano;
		
	}

	public int getIdMonitor() {
		return idMonitor;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public Double getTamano() {
		return tamano;
	}

	public void setTamano(Double tamano) {
		this.tamano = tamano;
	}

	public int getContadorMonitores() {
		return contadorMonitores;
	}

	@Override
	public String toString() {
		return "Monitor [idMonitor=" + idMonitor + ", marca=" + marca + ", tamano=" + tamano + "]";
	}

}
