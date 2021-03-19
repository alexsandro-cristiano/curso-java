package br.com.caelum.apostila.cap4.banco;

public class Cliente {
	String nome;
	String sobrenome;
	String cpf;
	
	@Override
	public String toString() {
		String s = "Nome: " + this.nome
				+ " " + this.sobrenome
				+ "\nCPF: " +this.cpf;
		return s;
	}
}
