package br.com.caelum.apostila.cap4.banco;

public class TesteConta {

	public static void main(String[] args) {

		Conta c1 = new Conta();
		Conta c2 = new Conta();

		c1.agencia = "125-88";
		c1.numero = 12358;
		c1.dtabertura.dia = 19;
		c1.dtabertura.mes = 03;
		c1.dtabertura.ano = 21;
		c1.saldo = 1000.00;
		Cliente t = new Cliente();

		t.nome = "Alexsandro";
		t.sobrenome = "Silva";
		t.cpf = "15748321-52";

		c1.titular = t;

		System.out.println(c1);

		System.out.println();
		System.out.println();

		if (c1 == c2) {
			System.out.println("iguais");
		} else {
			System.out.println("diferentes");
		}
		
		c2.agencia = "125-88";
		c2.numero = 12851;
		c2.dtabertura.dia = 18;
		c2.dtabertura.mes = 03;
		c2.dtabertura.ano = 21;
		c2.titular.nome = "Cristiano";
		c2.titular.sobrenome = "Silva";
		c2.titular.cpf = "17548321-52";
		c2.saldo = 1000.00;

		System.out.println(c2);
		c1.tranferirPara(c2, 500.00);
		System.out.println(c1);
		System.out.println(c2);

	}

}
