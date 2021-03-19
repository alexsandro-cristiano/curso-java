package br.com.caelum.apostila.cap4.fabrica;

class TestarCarro {
	public static void main(String[] args) {
		Carro meuCarro;
		meuCarro = new Carro();
		meuCarro.cor = "Verde";
		meuCarro.modelo = "Fusca";
		meuCarro.velocidadeAtual = 0;
		meuCarro.velocidadeMaxima = 80;
		Motor motor = new Motor();
		motor.potencia = 10;
		motor.tipo = "nao sei";
		
		meuCarro.motor = motor;
		
// liga o carro
		meuCarro.liga();
// acelera o carro
		meuCarro.acelera(20);
		System.out.println(meuCarro.velocidadeAtual);
	}
}