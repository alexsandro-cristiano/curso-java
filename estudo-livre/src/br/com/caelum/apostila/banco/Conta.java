package br.com.caelum.apostila.banco;

public class Conta {
	String agencia;
	int numero;
	double saldo;
	double limite;
	double rendimento;
	Cliente titular = new Cliente();
	Data dtabertura = new Data();

	public boolean sacar(double valor) {
		if (this.saldo < valor) {
			return false;
		} else {
			this.saldo -= valor;
			return true;
		}
	}

	public void depositar(double valor) {
		this.saldo += valor;
	}

	public boolean tranferirPara(Conta destino, Double valor) {
		boolean transacao = this.sacar(valor);
		if (transacao == false) {
			return false; // nao fez a transferencia
		} else {
			destino.depositar(valor);
			return true;
		}
	}

	public Double calcRendimento() {
		return this.saldo * 0.1;
	}

	@Override
	public String toString() {
		String saida = "==============\n"
				+ "Agencia: " + this.agencia
				+ "\tConta: " + this.numero
				+"\nAbertura da Conta"
				+ dtabertura.toString()
				+"\n\nInformações do Cliente\n" + titular.toString()
				+"\nSaldo Disponivel: " + this.saldo
				+"\n==============\n";
		return saida;
	}
}