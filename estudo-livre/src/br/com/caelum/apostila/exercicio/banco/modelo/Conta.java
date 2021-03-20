package br.com.caelum.apostila.exercicio.banco.modelo;

public class Conta {
	static int indentificador;
	private String agencia;
	private int numero = 12;
	private double saldo;
	private Cliente titular;
	private Data dtabertura;

	public Conta(Data data, String agencia) {
		Conta.indentificador++;
		this.agencia = agencia;
		this.numero +=(Conta.indentificador * numero);
		this.dtabertura = data;
		this.saldo = 0.0;
		
	}

	public Conta(Data data, String agencia, Cliente cliente) {
		Conta.indentificador++;
		this.agencia = agencia;
		this.numero +=(Conta.indentificador * numero);
		this.dtabertura = data;
		this.saldo = 0.0;
		this.titular = cliente;
		
	}

	public String getAgencia() {
		return agencia;
	}

	public int getNumero() {
		return numero;
	}

	public double getRendimento() {
		return this.saldo * 0.1;
	}

	public Cliente getTitular() {
		return titular;
	}

	public Data getDtabertura() {
		return dtabertura;
	}

	public boolean trocarDeAgencia(String novaAgencia) {
		if (this.agencia == novaAgencia) {
			return false;
		} else {
			this.agencia = novaAgencia;
			return true;
		}
	}

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
		return getRendimento();
	}
	
	public static int getIdentificado() {
		return Conta.indentificador;
	}
	
	@Override
	public String toString() {
		String saida = "==============\n" + "Agencia: " + this.agencia + "\tConta: " + this.numero
				+ "\nAbertura da Conta" + dtabertura.toString() + "\n\nInformações do Cliente\n" + titular.toString()
				+ "\nSaldo Disponivel: " + this.saldo + "\n==============\n";
		return saida;
	}
}
