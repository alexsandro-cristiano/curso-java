package exercicios.poo.exemplo;

public class Quarto {

	Estado estado;
	String numeroDoQuarto;

	public Quarto(String numero, Estado estado) {
		this.numeroDoQuarto = numero;
		this.estado = estado;
	}
	
	public Estado getEstado() {
		return estado;
	}
	public void setEstado(Estado estado) {
		this.estado = estado;
	}
	/*
	 * preciso saber se ele esta vago
	 * se sim passa para ocupado
	 * se nao retorna erro
	 */
	public void alugarQuarto() {
		if(getEstado() == Estado.VAGO) {
			setEstado(Estado.OCUPADO);
			System.out.println("Quarto Alugado com sucesso");
		}
		else {
			System.out.println("Quarto ocupado");
		}
	}

	public void liberarQuarto() {
		if(getEstado() == Estado.OCUPADO) {
			setEstado(Estado.VAGO);
			System.out.println("Quarto liberado com sucesso");
		}
		else {
			System.out.println("Quarto nao ocupado");
		}
	}

	@Override
	public String toString() {
		return "Quarto [estado=" + estado + ", numeroDoQuarto=" + numeroDoQuarto + "]";
	}
	
	
}
